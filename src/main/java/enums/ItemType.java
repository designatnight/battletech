package enums;

import java.util.List;

import com.google.common.collect.Lists;

public enum ItemType {
	
	ENGINE(ComponentType.CENTER_TORSO),
	GYRO(ComponentType.CENTER_TORSO), 
	SENSOR(ComponentType.HEAD), 
	UPPER_ARM_ACTUATOR_LEFT(ComponentType.LEFT_ARM), 
	SHOULDER_LEFT(ComponentType.LEFT_ARM),
	UPPER_ARM_ACTUATOR_RIGHT(ComponentType.RIGHT_ARM), 
	SHOULDER_RIGHT(ComponentType.RIGHT_ARM);
	
	private ComponentType componentType;
	
	private ItemType(ComponentType componentType){
		this.componentType = componentType;
	}
	
	public static List<ItemType> getItemTypesByComponentType(ComponentType componentType){
		List<ItemType> itemTypes = Lists.newArrayList();
		
		for(ItemType itemType : ItemType.values()){
			if(itemType.getComponentType() == componentType){
				itemTypes.add(itemType);
			}
		}
		
		return itemTypes;
	}

	public ComponentType getComponentType() {
		return componentType;
	}
}
