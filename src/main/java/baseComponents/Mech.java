package baseComponents;

import enums.MechClass;


public interface Mech {
	
	
	public String getName();
	public void setName(String name);
	public String getModel();
	public void setModel(String model); 
	public Integer getMaxWeight(); 
	public Double getWeight(); 
	public MechClass getMechClass(); 
	public Head getHead(); 
	public CenterTorso getCenterTorso();
	public Torso getLeftTorso();
	public Torso getRightTorso(); 
	public Leg getLeftLeg();
	public Leg getRightLeg();
	public Arm getLeftArm();
	public Arm getRightArm();
	
	
}
