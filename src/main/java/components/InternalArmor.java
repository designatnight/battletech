package components;

import enums.BodyComponents;
import enums.MechClass;
import baseComponents.Armor;
import baseComponents.InternalStructure;

public abstract class InternalArmor implements Armor, InternalStructure{

	public Integer armor;
	
	public InternalArmor(MechClass mechClass, BodyComponents bodyComponents ){
		
	}
	
	@Override
	public Integer getArmorPoints() {
		// TODO Auto-generated method stub
		return armor;
	}

	@Override
	public Integer setArmorPoints() {
		// TODO Auto-generated method stub
		return null;
	}

}
