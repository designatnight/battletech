package enums;

public enum ChassisComponent {

	HEAD(6),
	CENTER_TORSO(12),
	TORSO(12),
	LEG(6),
	ARM(12);
	
	private final Integer criticalSlots;
	
	private ChassisComponent(Integer criticalSlots){
		this.criticalSlots = criticalSlots;
	}
	
	public Integer getCriticalSlots(){
		return criticalSlots;
	}
}
