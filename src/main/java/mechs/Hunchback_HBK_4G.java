package mechs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import baseComponents.Arm;
import baseComponents.CenterTorso;
import baseComponents.Head;
import baseComponents.Leg;
import baseComponents.Torso;
import bluePrint.MechBluePrint;

import com.google.inject.Inject;

import enums.ChassisType;
import enums.ChassisComponent;
import enums.ComponentType;
import enums.HardPointType;
import enums.MechClass;


public class Hunchback_HBK_4G {
	
	public static Map<ComponentType, List<HardPointType>> hardPointMap;
	
	@Inject
	public Hunchback_HBK_4G(Head head, CenterTorso centerTorso, Torso leftTorso, Torso rightTorso, Arm leftArm, Arm rightArm, Leg leftLeg, Leg rightLeg) {
		
		
	}
	
	public static MechBluePrint generateBluePrint(){
		
		MechClass mechClass = MechClass.MEDIUM;
		ChassisType chassisType = ChassisType.BIPEDAL;
		
		LinkedHashMap<ChassisComponent, List<HardPointType>> schematic = new LinkedHashMap<>();
		
		List<HardPointType> head = new ArrayList<>();
		head.add(HardPointType.LIFESUPPORT);
		head.add(HardPointType.COCKPIT);
		head.add(HardPointType.SENSOR);
		head.add(HardPointType.LASER);
		schematic.put(ChassisComponent.HEAD, head);
		
		List<HardPointType> centerTorso = new ArrayList<>();
		centerTorso.add(HardPointType.ENGINE);
		centerTorso.add(HardPointType.GYRO);
		schematic.put(ChassisComponent.CENTER_TORSO, centerTorso);
		
		List<HardPointType> rightTorso = new ArrayList<>();
		rightTorso.add(HardPointType.BALISTIC);
		schematic.put(ChassisComponent.TORSO, rightTorso);
		
		List<HardPointType> leftTorso = new ArrayList<>();
		schematic.put(ChassisComponent.TORSO, leftTorso);
		
		List<HardPointType> rightArm = new ArrayList<>();
		rightArm.add(HardPointType.LASER);
		rightArm.add(HardPointType.SHOULDER);
		rightArm.add(HardPointType.UPPER_ARM_ACTUATOR);
		rightArm.add(HardPointType.LOWER_ARM_ACTUATOR);
		rightArm.add(HardPointType.HAND_ACTUATOR);
		schematic.put(ChassisComponent.ARM, rightArm);
		
		List<HardPointType> leftArm = new ArrayList<>();
		leftArm.add(HardPointType.LASER);
		leftArm.add(HardPointType.SHOULDER);
		leftArm.add(HardPointType.UPPER_ARM_ACTUATOR);
		leftArm.add(HardPointType.LOWER_ARM_ACTUATOR);
		leftArm.add(HardPointType.HAND_ACTUATOR);
		schematic.put(ChassisComponent.ARM, leftArm);
		
		List<HardPointType> rightLeg = new ArrayList<>();
		rightLeg.add(HardPointType.HIP);
		rightLeg.add(HardPointType.UPPER_LEG_ACTUATOR);
		rightLeg.add(HardPointType.LOWER_LEG_ACTUATOR);
		rightLeg.add(HardPointType.FOOT_ACTUATOR);
		schematic.put(ChassisComponent.LEG, rightLeg);
		
		List<HardPointType> leftLeg = new ArrayList<>();
		leftLeg.add(HardPointType.HIP);
		leftLeg.add(HardPointType.UPPER_LEG_ACTUATOR);
		leftLeg.add(HardPointType.LOWER_LEG_ACTUATOR);
		leftLeg.add(HardPointType.FOOT_ACTUATOR);
		schematic.put(ChassisComponent.LEG, leftLeg);
		
		return new MechBluePrint(chassisType, mechClass, schematic);
	}
	
}
