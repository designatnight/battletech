package baseComponents;

import enums.MechClass;

public interface OmniMech {

	public String getName();
	public void setName(String name);
	public String getModel();
	public void setModel(String model); 
	public Integer getMaxWeight();
	public void setMaxWeight(Integer maxWeight); 
	public Double getWeight();
	public void setWeight(Double weight); 
	public MechClass getMechClass();
	public void setMechClass(MechClass mechClass); 
	public Head getHead();
	public void setHead(Head head); 
	public CenterTorso getCenterTorso();
	public void setCenterTorso(CenterTorso centerTorso);
	public Torso getLeftTorso();
	public void setLeftTorso(Torso leftTorso);
	public Torso getRightTorso();
	public void setRightTorso(Torso rightTorso); 
	public Leg getLeftLeg();
	public void setLeftLeg(Leg leftLeg);
	public Leg getRightLeg();
	public void setRightLeg(Leg rightLeg);
}
