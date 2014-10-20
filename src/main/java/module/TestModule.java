package module;

import java.util.Map;

import javax.inject.Named;

import service.ArmorService.ComponentTypeArmorKey;

import com.google.common.collect.Maps;
import com.google.inject.Provides;

import enums.ComponentType;
import enums.MechClass;

public class TestModule extends ModuleBase{

	@Provides
	public Map<ComponentTypeArmorKey, Integer> createInternalArmorStructures(){
		Map<ComponentTypeArmorKey, Integer> internalArmorMap = Maps.newHashMap();
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.CENTER_TORSO), 0);
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.LEFT_TORSO), 0);
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.RIGHT_TORSO), 0);
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.LEFT_LEG), 0);
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.RIGHT_LEG), 0);
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.LEFT_ARM), 0);
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.RIGHT_ARM), 0);
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.HEAD), 0);
		return internalArmorMap;
	}

	
}
