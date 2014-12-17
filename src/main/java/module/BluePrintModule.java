package module;

import java.util.Map;

import bluePrint.MechBluePrint;

import com.google.common.collect.Maps;
import com.google.inject.Provides;

import enums.ChassisComponent;
import enums.ComponentType;
import enums.MechClass;
import service.ArmorService.ChassisComponentArmorKey;



public class BluePrintModule extends ModuleBase{

	@Override
	protected void configure() {
		
	}
	
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

	public MechBluePrint getMechBluePrint(String string) {
		
		return null;
	}
	
	
}
