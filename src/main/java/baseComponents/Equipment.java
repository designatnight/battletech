package baseComponents;

import java.util.List;

import components.CriticalSlot;

public interface Equipment {

	
	public void equipmentDamaged();
	public Integer getSize();
	public List<CriticalSlot> getCriticalSlots();
	public Double getWeight();
	public void setSize(Integer size);
	public void setCriticalSlots(List<CriticalSlot> criticalSlots);
	public void setWeight(Integer weight);
	
	
	
}
