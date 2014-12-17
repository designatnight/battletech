package bluePrint;

import java.util.Map;

import enums.HardPointType;

public class WeaponSchematic {

	public final HardPointType hardPointType;
	public final Map<String, Double> weaponSchematic;

	public WeaponSchematic (HardPointType hardPointType, Map<String, Double> weaponSchematic){
		this.hardPointType = hardPointType;
		this.weaponSchematic = weaponSchematic;
	}

	public HardPointType getHardPointType() {
		return hardPointType;
	}

	public Map<String, Double> getWeaponSchematic() {
		return weaponSchematic;
	}
	
}
