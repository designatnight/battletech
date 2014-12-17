package baseComponents;

import java.util.List;
import java.util.Map;

import enums.ComponentType;
import enums.MechClass;


public class Mech {
		
	private String name;
	private String model;
	private Integer maxWeight;
	private MechClass mechClass;
	private Map<ComponentType, ChassisPart> mechChassisMap;
	
	public Mech(Map<ComponentType, ChassisPart> mechChassisMap){
		this.mechChassisMap = mechChassisMap;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
	}
	public String getModle() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	} 
	public Integer getMaxWeight() {
		return null;
	} 
	public Double getWeight() {
		return null;
	} 
	public MechClass getMechClass() {
		return null;
	} 
	public ChassisPart getHead() {
		return mechChassisMap.get(ComponentType.HEAD);
	} 
	public ChassisPart getCenterTorso() {
		return mechChassisMap.get(ComponentType.CENTER_TORSO);
	}
	public ChassisPart getLeftTorso() {
		return mechChassisMap.get(ComponentType.LEFT_TORSO);
	}
	public ChassisPart getRightTorso() {
		return mechChassisMap.get(ComponentType.RIGHT_TORSO);
	} 
	public ChassisPart getLeftLeg() {
		return mechChassisMap.get(ComponentType.LEFT_LEG);
	}
	public ChassisPart getRightLeg() {
		return mechChassisMap.get(ComponentType.RIGHT_LEG);
	}
	public ChassisPart getLeftArm() {
		return mechChassisMap.get(ComponentType.LEFT_ARM);
	}
	public ChassisPart getRightArm() {
		return mechChassisMap.get(ComponentType.RIGHT_ARM);
	}
	
	
}
