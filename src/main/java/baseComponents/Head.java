package baseComponents;



import java.util.List;

import components.CockPit;
import components.InternalArmor;
import components.LifeSupport;
import components.Sensor;
import enums.ChassisComponent;
import enums.HardPointType;

public class Head extends ChassisPart{
	
	public Sensor sensor;
	public LifeSupport lifeSupport;
	public CockPit cockPit;
	
	public Head(List<HardPointType> hardPoints, InternalArmor internalArmor) {
		super(hardPoints, internalArmor, ChassisComponent.HEAD);
		sensor = new Sensor();
		lifeSupport = new LifeSupport();		
	}
	
	public Sensor getSensor(){
		return sensor;
	}
	public LifeSupport getLifeSupport(){
		return lifeSupport;
	}
	public CockPit getCockpit(){
		return cockPit;
	}
		
}
