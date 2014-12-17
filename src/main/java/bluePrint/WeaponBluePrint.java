package bluePrint;

import java.util.HashMap;
import java.util.Map;

import com.google.inject.Singleton;

import enums.HardPointType;

@Singleton
public class WeaponBluePrint {

	private static final String HEAT = "heat";
	private static final String DAMAGE = "damage";
	private static final String MINIMUM_RANGE = "minimumRange";
	private static final String SHORT_RANGE = "shortRange";
	private static final String MEDIUM_RANGE = "mediumRange";
	private static final String LONG_RANGE = "longRange";
	private static final String EXTREME_RANGE = "extremeRange";
	private static final String WEIGHT = "weight";
	private static final String SIZE = "size";
	
		
	public static WeaponSchematic getInnerSphereMediumLaser(){
		Map<String, Double> schematic = new HashMap<String, Double>();
			schematic.put(HEAT, new Double(3));
			schematic.put(DAMAGE, new Double(5));
			schematic.put(MINIMUM_RANGE, new Double(0));
			schematic.put(SHORT_RANGE, new Double(3));
			schematic.put(MEDIUM_RANGE, new Double(6));
			schematic.put(LONG_RANGE, new Double(9));
			schematic.put(EXTREME_RANGE, new Double(0));
			schematic.put(WEIGHT, new Double(1));
			schematic.put(SIZE, new Double(1));
			return new WeaponSchematic(HardPointType.LASER, schematic);
	}
	
}
