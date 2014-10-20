package mechs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import baseComponents.Arm;
import baseComponents.CenterTorso;
import baseComponents.Head;
import baseComponents.Leg;
import baseComponents.Torso;

import com.google.inject.Inject;

import enums.ComponentType;
import enums.HardPointType;
import enums.MechClass;


public class Hunchback_HBK_4G {
	
	public static Map<ComponentType, List<HardPointType>> hardPointMap;
	
	@Inject
	public Hunchback_HBK_4G(Head head, CenterTorso centerTorso,	Torso leftTorso, Torso rightTorso, Arm leftArm, Arm rightArm, Leg leftLeg, Leg rightLeg) {
		
		
	}
	
	public static Map<ComponentType, List<HardPointType>> getHardPointMap(){
		hardPointMap = new HashMap<>();
		hardPointMap.put(ComponentType.HEAD, Arrays.asList(HardPointType.LASER));
		hardPointMap.put(ComponentType.RIGHT_TORSO, Arrays.asList(HardPointType.BALISTIC));
		hardPointMap.put(ComponentType.RIGHT_ARM, Arrays.asList(HardPointType.LASER));
		hardPointMap.put(ComponentType.LEFT_ARM, Arrays.asList(HardPointType.LASER));
		return hardPointMap;
	}
	
	public static MechClass getMechClassification(){
		return MechClass.MEDIUM;
	}
	
}
