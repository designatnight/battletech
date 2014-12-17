package baseComponents;

import java.util.List;

import components.CriticalSlot;
import components.Engine;
import components.Gyro;
import components.InternalArmor;
import enums.ChassisComponent;
import enums.HardPointType;

public class CenterTorso extends ChassisPart {

	public Engine engine;
	public Gyro gyro;
	
	public CenterTorso(List<HardPointType> hardPoints, InternalArmor internalArmor) {
		super(hardPoints, internalArmor, ChassisComponent.CENTER_TORSO);
	}
	

	public Engine getEngine(){
		return engine;
	}
	public Gyro getGyro(){
		return gyro;
	}
	
}
