package baseComponents;



import java.util.List;

import components.CockPit;
import components.CriticalSlot;
import components.LifeSupport;
import components.Sensor;

public interface Head {
	
	public Sensor getSensor();
	public LifeSupport getLifeSupport();
	public CockPit getCockpit();
	public CriticalSlot getSlot();
	public void setCriticalSlot(List<CriticalSlot> criticalSlots);
	
}
