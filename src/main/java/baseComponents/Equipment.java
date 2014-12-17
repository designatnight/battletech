package baseComponents;

import java.util.List;

import components.CriticalSlot;
import enums.HardPointType;

public interface Equipment {

	
	
	public void equipmentDamaged();
	public Integer getSize();
	public List<CriticalSlot> getCriticalSlots();
	public Double getWeight();
	public void setCriticalSlots(List<CriticalSlot> criticalSlots);
	public HardPointType getHardPointType();
	
	
	
}
