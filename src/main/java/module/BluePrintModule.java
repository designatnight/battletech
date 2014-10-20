package module;

import java.util.Map;

import com.google.common.collect.Maps;
import com.google.inject.Provides;

import enums.ComponentType;
import enums.MechClass;

import service.ArmorService.ComponentTypeArmorKey;



public class BluePrintModule extends ModuleBase{

	@Override
	protected void configure() {
		
	}
	
	@Provides
	public Map<ComponentTypeArmorKey, Integer> createInternalArmorStructures(){
		Map<ComponentTypeArmorKey, Integer> internalArmorMap = Maps.newHashMap();
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.CENTER_TORSO), 16);
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.LEFT_TORSO), 12);
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.RIGHT_TORSO), 12);
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.LEFT_LEG), 12);
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.RIGHT_LEG), 12);
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.LEFT_ARM), 6);
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.RIGHT_ARM), 6);
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.HEAD), 3);
		return internalArmorMap;
	}
}
