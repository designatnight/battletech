package factory;

import java.util.List;
import java.util.Map;

import mechs.Hunchback_HBK_4G;
import baseComponentImpl.MediumMech;
import baseComponents.Mech;

import com.google.inject.Singleton;

import enums.BodyComponents;
import enums.HardPoint;
import enums.MechClass;

@Singleton
public class MechFactory {

	
	public Mech createMech(Map<BodyComponents, List<HardPoint>> hardPointsMap, MechClass mechClass){
		
		
		return new MediumMech(null, null, null, null, null, null, null, null);
	}
	
}
