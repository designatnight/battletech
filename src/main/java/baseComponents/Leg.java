package baseComponents;

import java.util.List;

import components.InternalArmor;
import enums.ChassisComponent;
import enums.HardPointType;

public class Leg extends ChassisPart {

		public Leg(List<HardPointType> hardPoints, InternalArmor internalArmor) {
		super(hardPoints, internalArmor, ChassisComponent.LEG);
	}
}
