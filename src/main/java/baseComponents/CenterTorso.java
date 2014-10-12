package baseComponents;

import java.util.List;

import components.CriticalSlot;
import components.Engine;
import components.Gyro;

public interface CenterTorso {

	public Engine getEngine();
	public Gyro getGyro();
	public List<CriticalSlot> getCriticalSlots();
	
	public void setCriticalSlots(List<CriticalSlot> criticalSlots);
	
	
}
