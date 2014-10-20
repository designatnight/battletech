package enums;

public enum ComponentType {

	HEAD(10),
	CENTER_TORSO(10),
	LEFT_TORSO(10),
	RIGHT_TORSO(10),
	LEFT_LEG(10),
	RIGHT_LEG(10),
	RIGHT_ARM(10),
	LEFT_ARM(10);
	
	private final Integer critSlotUsage;
	
	private ComponentType(Integer critSlotUsage){
		this.critSlotUsage = critSlotUsage;
	}

	public Integer getCritSlotUsage() {
		return critSlotUsage;
	}
}
 