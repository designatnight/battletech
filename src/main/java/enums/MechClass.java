package enums;

public enum MechClass {
	
	LIGHT (30, 6, 10, 10, 12, 3),
	MEDIUM (55, 8, 12, 12, 16, 3),
	HEAVY (75, 10, 14, 14, 20, 3),
	ASSULT (100, 12, 16, 16, 24, 3);
	
	private Integer maxWeight;
	private Integer internalArmorArm;
	private Integer internalArmorTorso;
	private Integer internalArmorCenter;
	private Integer internalArmorLeg;
	private int internalArmorHead;
	 
	
	private MechClass (int maxWeight, int internalArmorArm, int internalArmorTorso, int internalArmorCenter, int internalArmorLeg, int internalArmorHead){
		this.maxWeight = maxWeight;
		this.internalArmorArm = internalArmorArm;
		this.internalArmorTorso = internalArmorTorso;
		this.internalArmorCenter = internalArmorCenter;
		this.internalArmorLeg = internalArmorLeg;
		this.internalArmorHead = internalArmorHead;
	}


	public Integer getMaxWeight() {
		return maxWeight;
	}


	public Integer getInternalArmorArm() {
		return internalArmorArm;
	}
	public Integer getInternalArmorTorso() {
		return internalArmorTorso;
	}
	public Integer getInternalArmorCenter() {
		return internalArmorCenter;
	}
	public Integer getInternalArmorLeg() {
		return internalArmorLeg;
	}
	public Integer getInternalArmorHead() {
		return internalArmorHead;
	}
	
}
