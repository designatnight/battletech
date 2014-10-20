package module;
import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

import factory.MechFactory;


/** 
*  
*      <p>The reasoning behind the extra methods is to act as configurables for the base module
*      you do not have to use them, but the game component factory internally used cannot
*      be extended with generic return values, so instead of forcing the client to extend
*      the GameManager.connect() base method (or methods like it), they can provide implementations
*      of the default game components.</p>
*      <p>
*      	ie: Player, Game, EventModifier, Event, EventCallback
*      	and not worry about thier construction.
*      </p>
*      <p>
*      if a new constructor is needed throughout the application,
*      all you need to do is extend MechFactory
*      and return it in the configureWithNewMechFactory() configure method
*            
*      This allows you to utilise this base module without the need to configure the entire
*      engine.
*      </p>
*      
*      <pre>
*      These methods allow the client to do the following: 
*      
*      	Code Example:
*      
*      	MyVideoGamePlayer player1 = gameManager.connect(Credentials)
*      	Player player2 = gameManager.connect(Credentials);
*      
*      	MyVideoGame game = player1.createGame();
*      	Game game = player2.CreateGame();
*      </pre>
*      <p>The connect method seems easy enough to write:</p>
*      <pre>
*      
*      public <P extends Player> P connect(Credentials credentials){
*      	Player player = getMechFactory().createPlayer(PlayerID);
*      	return (P)player; 
*      }
*      
*      </pre>
*      <p>
*      however since you cannot return generics from the factory, how can you garentee the cast works?
*      <br />
*      by extending this module and configuring the factory module builder provided by Guice like so:
*      </p>
*      <pre>
*  		@Override
*		public void configureFactoryModuleBuilder(FactoryModuleBuilder builder){
*			builder.implement(Player.class, MyVideoGamePlayer.class);
*			builder.implement(Game.class, MyVideoGame.class);
*		}
*		</pre>
*		<p>
*		this tells my internal configuration to return your components instead of mine
* 	    </p>
* 		
* 		<p>	
* 		I figure a default configurable module was better than having all game modules
*		have too much boilerplate.
*		A big challenge I faced was to get the builder to build supertypes without using
*		generics. See my example implementation in the DrugwarsModule class in the drugwars project.  
*	
*	
* 
*/
public class ModuleBase extends AbstractModule{
	
	/**
	 * this is where the guice magic happens, to use my default setup, override this and call super.
	 * modify the base types at your leasure. see example implementation in the drugwars project.
	 */
	@Override
	protected void configure() {
		
		
		
		FactoryModuleBuilder builder = new FactoryModuleBuilder();
		configureFactoryModuleBuilder(builder);
		
		Class<?> MechFactoryClass = configureWithNewMechFactory();
		
		if(MechFactoryClass == null){
			//default factory
			MechFactoryClass = MechFactory.class;
		}
		
		install(builder.build(MechFactoryClass));
		
		
	}
	
	/**
	 * only override this method if you need a different game component factory.
	 * use of the configureFactory method is probably a better choice, but I figured id provide it
	 * here
	 * @return the game component factory the module creator wants us to use.
	 */
	protected <GCF extends MechFactory> Class<GCF> configureWithNewMechFactory(){
		return null;
	}
	
	/**
	 * <p>
	 * Override this if you want to add implementations to your factory.
	 * </p>
	 * <p>
	 * this gives you access to the factory module builder I configure in my base implemenation.
	 * it allows you to use my internal game manager to create your subtypes <br />
	 * </p>
	 * <pre>
	 * Example: MyGameCharacter extends GameCharacter
	 * MechFactoryBuilder.implement(GameCharacter, MyGameCharacter);	 * 
	 * </pre>
	 * <p>
	 * see implementation in the DrugwarsProject
	 * </p>
	 * @param factoryModuleBuilder
	 *  
	 **/
	public void configureFactoryModuleBuilder(FactoryModuleBuilder MechFactoryBuilder){

	}
	
}
