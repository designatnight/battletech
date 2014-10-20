package baseComponents;

import java.util.List;

import com.google.common.collect.Lists;

import components.GenericHardPoint;
import components.HardPoint;

import enums.ComponentType;
import enums.HardPointType;
import enums.ItemType;


public class BodyPart {
	
	private ComponentType bodyComponent;
	private Armor internalArmor;
	private GenericHardPoint genericHardPoint;
	private Integer maxCritSlots;
	private final List<HardPoint> hardPoints;
	
	public BodyPart(ComponentType part, Armor internalArmor, Integer maxCritSlots, List<HardPoint> hardPoints) {
		this.bodyComponent = part;
		this.internalArmor = internalArmor;
		this.genericHardPoint = new GenericHardPoint(this);
		this.maxCritSlots = maxCritSlots;
		this.hardPoints = hardPoints;
	}
	
	public BodyPart(ComponentType part, Armor internalArmor, Integer maxCritSlots) {
		this.bodyComponent = part;
		this.internalArmor = internalArmor;
		this.genericHardPoint = new GenericHardPoint(this);
		this.maxCritSlots = maxCritSlots;
		this.hardPoints = Lists.newArrayList();
	}
	public Armor getInternalArmor() {
		return internalArmor;
	}
	public List<Equipment> getEquipment() {
		return null;
	}
	public Integer maxEquipmentSlots() {
		return null;
	}
	public List<HardPoint> getHardPoints() {
		return hardPoints;
	}
	public ComponentType getComponentType(){
		return bodyComponent;
	}
	public boolean supportsItemType(ItemType itemType) {
		return ItemType.getItemTypesByComponentType(getComponentType()).contains(itemType);
	}
	public Integer getCurrentCriticalSlotUsage() {
		Integer critSlotUsage = 0;
		for(Component component : getComponents()){
			critSlotUsage = critSlotUsage + component.getCritSlotUsage();
		}
		return critSlotUsage;
	}
	public GenericHardPoint getGenericHardPoint() {
		return genericHardPoint;
	}
	
	public void addGenericItem(Component component){
		getGenericHardPoint().addComponent(component);
	}
	
	public List<Component> getComponents(){
		List<Component> components = Lists.newArrayList();
		
		for(HardPoint hardPoint : getHardPoints()){
			Component component = hardPoint.getComponent();
			if(component != null){
				components.add(component);
			}
		}
		
		components.addAll(getGenericHardPoint().getComponents());
		
		return components;
	}

	public int getMaximumCritSlotCapacity() {
		return maxCritSlots;
	}
	
}
