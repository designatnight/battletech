package baseComponents;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import components.InternalArmor;

import enums.ChassisComponent;
import enums.HardPointType;


public class ChassisPart {
	
	private ChassisComponent bodyComponent;
	private InternalArmor internalArmor;
	private Integer maxCritSlots;
	private final List<HardPointType> hardPoints;
	private Map<String, Equipment> equipmentMap;
	
//I don't like passing the componentType in here but idk well see.
	public ChassisPart(List<HardPointType> hardPoints, InternalArmor internalArmor, ChassisComponent component){
		this.hardPoints = new ArrayList<HardPointType>(hardPoints);
		this.internalArmor = internalArmor;
		this.equipmentMap = new HashMap<>();
		this.maxCritSlots = component.getCriticalSlots();
		generateHardPointMap(hardPoints);
	}
	
	private void generateHardPointMap(List<HardPointType> hardPoints){
		int laser = 0;
		int balistic = 0;
		int missle = 0;
		
		for(HardPointType hardPoint : hardPoints){
			if(hardPoint == HardPointType.LASER){
				laser++;
				equipmentMap.put(hardPoint.toString()+laser, null);
			}
			if(hardPoint == HardPointType.BALISTIC){
				balistic++;
				equipmentMap.put(hardPoint.toString()+balistic, null);
			}
			if(hardPoint == HardPointType.MISSILE){
				missle++;
				equipmentMap.put(hardPoint.toString()+missle, null);
			}			
		}		
	}
	
	public Armor getInternalArmor() {
		return internalArmor;
	}
		
	public List<HardPointType> getHardPoints() {
		return hardPoints;
	}
	
	public ChassisComponent getComponentType(){
		return bodyComponent;
	}
	
	public Integer getCurrentCriticalSlotUsage() {
		Integer critSlotUsage = 0;
		for(Equipment component : getEquipment().values()){
			critSlotUsage = critSlotUsage + component.getSize();
		}
		return critSlotUsage;
	}
	
	public Integer getMaximumCritSlotCapacity() {
		return maxCritSlots;
	}

	public boolean supportsHardPoint(HardPointType hardPointType) {
		return hardPoints.contains(hardPointType);
	}
	
	public Map<String, Equipment> getEquipment(){
		return equipmentMap;
	}
	
}
