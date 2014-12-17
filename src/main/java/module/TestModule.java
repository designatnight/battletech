package module;

import java.util.Map;

import javax.inject.Named;

import service.ArmorService.ChassisComponentArmorKey;

import com.google.common.collect.Maps;
import com.google.inject.Provides;

import enums.ChassisComponent;
import enums.ComponentType;
import enums.MechClass;

public class TestModule extends ModuleBase{

	@Provides
	public Map<ChassisComponentArmorKey, Integer> createInternalArmorStructures(){
		Map<ChassisComponentArmorKey, Integer> internalArmorMap = Maps.newHashMap();
		internalArmorMap.put(new ChassisComponentArmorKey(MechClass.MEDIUM, ChassisComponent.CENTER_TORSO), 16);
		internalArmorMap.put(new ChassisComponentArmorKey(MechClass.MEDIUM, ChassisComponent.TORSO), 12);
		internalArmorMap.put(new ChassisComponentArmorKey(MechClass.MEDIUM, ChassisComponent.LEG), 12);
		internalArmorMap.put(new ChassisComponentArmorKey(MechClass.MEDIUM, ChassisComponent.ARM), 6);
		internalArmorMap.put(new ChassisComponentArmorKey(MechClass.MEDIUM, ChassisComponent.HEAD), 3);
		return internalArmorMap;
	}

	
}
