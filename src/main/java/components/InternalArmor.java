package components;

import enums.ComponentType;
import enums.MechClass;
import baseComponents.Armor;
import baseComponents.InternalStructure;

public class InternalArmor implements Armor, InternalStructure{

	public Integer armor;
	
	public InternalArmor(Integer internalArmor){
		this.armor = internalArmor;
	}
	
	@Override
	public Integer getArmorPoints() {
		return armor;
	}

	@Override
	public Armor getArmor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void internalStructureDestroyed() {
		// TODO Auto-generated method stub
		
	}

	

}
