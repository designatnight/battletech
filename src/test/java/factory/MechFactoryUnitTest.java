package factory;

import static org.junit.Assert.assertNotNull;
import mechs.Hunchback_HBK_4G;
import mockit.Expectations;
import mockit.Mocked;

import org.junit.Before;
import org.junit.Test;

import service.ArmorService;
import assemblyLIne.ChassisAssemblyLine;
import baseComponents.Mech;




public class MechFactoryUnitTest {
	
	private MechFactory factory;
	@Mocked
	private ChassisAssemblyLine chassieLine;
	@Mocked
	private ArmorService armorService;
	
	@Before
	public void doSetup(){
		factory = new MechFactory();
	}
	
	@Test
	public void CanBuildHunchback4GBasicBody(){
		
		new Expectations(){
			
		}
		
		Mech hunchback = factory.assemble(Hunchback_HBK_4G.generateBluePrint());
		
		assertNotNull(hunchback.getHead());
		assertNotNull(hunchback.getCenterTorso());
		assertNotNull(hunchback.getLeftArm());
		assertNotNull(hunchback.getLeftLeg());
		assertNotNull(hunchback.getLeftTorso());
		assertNotNull(hunchback.getRightArm());
		assertNotNull(hunchback.getRightLeg());
		assertNotNull(hunchback.getRightTorso());
		
	}
	
}
