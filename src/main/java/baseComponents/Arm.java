package baseComponents;

import java.util.List;

import components.InternalArmor;
import enums.ChassisComponent;
import enums.HardPointType;

public class Arm extends ChassisPart{

	public Arm(List<HardPointType> hardPoints, InternalArmor internalArmor) {
		super(hardPoints, internalArmor, ChassisComponent.ARM);
	}
	
}

