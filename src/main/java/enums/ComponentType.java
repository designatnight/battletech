package enums;

public enum ComponentType {

	HEAD(ChassisComponent.HEAD),
	CENTER_TORSO(ChassisComponent.CENTER_TORSO),
	LEFT_TORSO(ChassisComponent.TORSO),
	RIGHT_TORSO(ChassisComponent.TORSO),
	LEFT_LEG(ChassisComponent.LEG),
	RIGHT_LEG(ChassisComponent.LEG),
	RIGHT_ARM( ChassisComponent.ARM),
	LEFT_ARM(ChassisComponent.ARM);
	

	private final ChassisComponent chassieComponentType;
	
	private ComponentType(ChassisComponent chassieComponent){
		this.chassieComponentType = chassieComponent;
	}
	
	public ChassisComponent getChassieComponentType(){
		return chassieComponentType;
	}
}
 