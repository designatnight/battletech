package baseComponentImpl;

import java.util.List;
import java.util.Map;

import baseComponents.Arm;
import baseComponents.CenterTorso;
import baseComponents.Head;
import baseComponents.Leg;
import baseComponents.Mech;
import baseComponents.Torso;
import enums.BodyComponents;
import enums.HardPoint;
import enums.MechClass;

public abstract class HeavyMech implements Mech {
	
	private String name;
	private Leg rightLeg;
	private Leg leftLeg;
	private Torso rightTorso;
	private Torso leftTorso;
	private CenterTorso centerTorso;
	private Head head;
	private MechClass mechClass;
	private Double weight;
	private Integer maxWeight;
	private String model;
	private Arm rightArm;
	private Arm leftArm;
	
	public HeavyMech(Head head, CenterTorso centerTorso, Torso leftTorso, Torso rightTorso, Arm leftArm, Arm rightArm, Leg leftLeg, Leg rightLeg){
		this.mechClass = MechClass.HEAVY;
		this.maxWeight = mechClass.getMaxWeight();
		this.centerTorso = centerTorso;
		this.head = head;
		this.leftLeg = leftLeg;
		this.rightLeg = rightLeg;
		this.leftTorso = leftTorso;
		this.rightTorso = rightTorso;
		this.rightArm = rightArm;
		this.leftArm = leftArm;
	}
	
	public abstract Map<BodyComponents,List<HardPoint>> getHardPoints();
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getModel() {
		return model;
	}
	@Override
	public void setModel(String model) {
		this.model = model;		
	}
	@Override
	public Integer getMaxWeight() {
		return maxWeight;
	}
	@Override
	public Double getWeight() {
		return weight;
	}

	@Override
	public MechClass getMechClass() {
		return mechClass;
	}
	@Override
	public Head getHead() {
		return head;
	}
	@Override
	public CenterTorso getCenterTorso() {
		return centerTorso;
	}
	@Override
	public Torso getLeftTorso() {
		return leftTorso;
	}
	@Override
	public Torso getRightTorso() {
		return rightTorso;
	}
	@Override
	public Leg getLeftLeg() {
		return leftLeg;
	}
	@Override
	public Leg getRightLeg() {
		return rightLeg;
	}
	@Override
	public Arm getLeftArm(){
		return leftArm;
	}
	@Override
	public Arm getRightArm(){
		return rightArm;
	}
}
