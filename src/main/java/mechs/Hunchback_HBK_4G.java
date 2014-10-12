package mechs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.inject.Inject;

import enums.BodyComponents;
import enums.HardPoint;
import enums.MechClass;
import baseComponentImpl.MediumMech;
import baseComponents.Arm;
import baseComponents.CenterTorso;
import baseComponents.Head;
import baseComponents.Leg;
import baseComponents.Torso;


public class Hunchback_HBK_4G {
	
	public static Map<BodyComponents, List<HardPoint>> hardPointMap;
	
	@Inject
	public Hunchback_HBK_4G(Head head, CenterTorso centerTorso,	Torso leftTorso, Torso rightTorso, Arm leftArm, Arm rightArm, Leg leftLeg, Leg rightLeg) {
		
		
	}
	
	public static Map<BodyComponents, List<HardPoint>> getHardPointMap(){
		hardPointMap = new HashMap<>();
		hardPointMap.put(BodyComponents.HEAD, Arrays.asList(HardPoint.LASER));
		hardPointMap.put(BodyComponents.RIGHT_TORSO, Arrays.asList(HardPoint.BALISTIC));
		hardPointMap.put(BodyComponents.RIGHT_ARM, Arrays.asList(HardPoint.LASER));
		hardPointMap.put(BodyComponents.LEFT_ARM, Arrays.asList(HardPoint.LASER));
		return hardPointMap;
	}
	
	public static MechClass getMechClassification(){
		return MechClass.MEDIUM;
	}
	
}
