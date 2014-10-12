package baseComponents;

import java.util.List;

import components.CriticalSlot;

public interface Leg {

	public List<CriticalSlot> getCriticalSlots();
	
	public void setCriticalSlots(List<CriticalSlot> criticalSlots);
}
