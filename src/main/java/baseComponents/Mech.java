package baseComponents;

import java.util.Map;

import enums.ComponentType;
import enums.MechClass;


public class Mech {
		
	private String name;
	private String model;
	private Integer maxWeight;
	private MechClass mechClass;
	
	private Map<ComponentType, BodyPart> bodyMap;
	
	public Mech(Map<ComponentType, BodyPart> bodyMap){
		this.bodyMap = bodyMap;
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
	public BodyPart getHead() {
		return bodyMap.get(ComponentType.HEAD);
	} 
	public BodyPart getCenterTorso() {
		return bodyMap.get(ComponentType.CENTER_TORSO);
	}
	public BodyPart getLeftTorso() {
		return bodyMap.get(ComponentType.LEFT_TORSO);
	}
	public BodyPart getRightTorso() {
		return bodyMap.get(ComponentType.RIGHT_TORSO);
	} 
	public BodyPart getLeftLeg() {
		return bodyMap.get(ComponentType.LEFT_LEG);
	}
	public BodyPart getRightLeg() {
		return bodyMap.get(ComponentType.RIGHT_LEG);
	}
	public BodyPart getLeftArm() {
		return bodyMap.get(ComponentType.LEFT_ARM);
	}
	public BodyPart getRightArm() {
		return bodyMap.get(ComponentType.RIGHT_ARM);
	}
	
	
}
