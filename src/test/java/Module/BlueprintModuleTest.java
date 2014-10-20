package Module;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import com.google.common.collect.Maps;

import enums.ComponentType;
import enums.MechClass;
import service.ArmorService;
import service.ArmorService.ComponentTypeArmorKey;
import module.BluePrintModule;

public class BlueprintModuleTest {

	
	@Test
	public void canGenerateArmorForMediumCenterTorsoInternalStructure(){
		
		Map<ComponentTypeArmorKey, Integer> internalArmorMap = Maps.newHashMap();
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.CENTER_TORSO), 16);
		ArmorService die = new ArmorService(internalArmorMap);
		
		assertEquals(new Integer(16), die.getInternalArmorforTemplate(MechClass.MEDIUM, ComponentType.CENTER_TORSO));
	}
	
	@Test
	public void canGenerateArmorForMediumSideTorsoInternalStructure(){
		
		Map<ComponentTypeArmorKey, Integer> internalArmorMap = Maps.newHashMap();
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.LEFT_TORSO), 12);
		ArmorService die = new ArmorService(internalArmorMap);
		
		assertEquals(new Integer(12), die.getInternalArmorforTemplate(MechClass.MEDIUM, ComponentType.LEFT_TORSO));
	}
	
	@Test
	public void canGenerateArmorForMediumArmInternalStructure(){
		
		Map<ComponentTypeArmorKey, Integer> internalArmorMap = Maps.newHashMap();
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.LEFT_ARM), 8);
		ArmorService die = new ArmorService(internalArmorMap);
		
		assertEquals(new Integer(8), die.getInternalArmorforTemplate(MechClass.MEDIUM, ComponentType.LEFT_ARM));
	}
	
	@Test
	public void canGenerateArmorForMediumHeadInternalStructure(){
		
		Map<ComponentTypeArmorKey, Integer> internalArmorMap = Maps.newHashMap();
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.HEAD), 3);
		ArmorService die = new ArmorService(internalArmorMap);
		
		assertEquals(new Integer(3), die.getInternalArmorforTemplate(MechClass.MEDIUM, ComponentType.HEAD));
	}
	
	@Test
	public void canGenerateArmorForMediumLegInternalStructure(){
		
		Map<ComponentTypeArmorKey, Integer> internalArmorMap = Maps.newHashMap();
		internalArmorMap.put(new ComponentTypeArmorKey(MechClass.MEDIUM, ComponentType.LEFT_LEG), 12);
		ArmorService die = new ArmorService(internalArmorMap);
		
		assertEquals(new Integer(12), die.getInternalArmorforTemplate(MechClass.MEDIUM, ComponentType.LEFT_LEG));
	}
}
