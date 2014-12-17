package baseComponents;

import bluePrint.MechBluePrint;

public abstract class Weapon implements Equipment{

	private int heat;
	private int damage;
	private int minimumRange;
	private int shortRange;
	private int mediumRange;
	private int longRange;
	private int extremeRange;
	
	
	public int getHeat() {
		return heat;
	}
	public int getDamage() {
		return damage;
	}
	public int getMinimumRange() {
		return minimumRange;
	}
	public int getShortRange() {
		return shortRange;
	}
	public int getMediumRange() {
		return mediumRange;
	}
	public int getLongRange() {
		return longRange;
	}
	public int getExtremeRange() {
		return extremeRange;
	}	
}
