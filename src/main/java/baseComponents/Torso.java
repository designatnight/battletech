package baseComponents;

import java.util.List;

import components.CriticalSlot;
import components.InternalArmor;
import enums.ChassisComponent;
import enums.HardPointType;

public class Torso extends ChassisPart{

	public Torso(List<HardPointType> hardPoints, InternalArmor internalArmor) {
		super(hardPoints, internalArmor, ChassisComponent.TORSO);
	}	
}
