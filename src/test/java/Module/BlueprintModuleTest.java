package Module;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

import service.ArmorService;
import service.ArmorService.ChassisComponentArmorKey;

import com.google.common.collect.Maps;

import enums.ChassisComponent;
import enums.MechClass;

public class BlueprintModuleTest {

	
	@Test
	public void canGenerateArmorForMediumCenterTorsoInternalStructure(){
		
		Map<ChassisComponentArmorKey, Integer> internalArmorMap = Maps.newHashMap();
		internalArmorMap.put(new ChassisComponentArmorKey(MechClass.MEDIUM, ChassisComponent.CENTER_TORSO), 16);
		ArmorService die = new ArmorService(internalArmorMap);
		
		assertEquals(new Integer(16), die.getInternalArmorforTemplate(MechClass.MEDIUM, ChassisComponent.CENTER_TORSO));
		
	}
	
	@Test
	public void canGenerateArmorForMediumSideTorsoInternalStructure(){
		
		Map<ChassisComponentArmorKey, Integer> internalArmorMap = Maps.newHashMap();
		internalArmorMap.put(new ChassisComponentArmorKey(MechClass.MEDIUM, ChassisComponent.TORSO), 12);
		ArmorService die = new ArmorService(internalArmorMap);
		
		assertEquals(new Integer(12), die.getInternalArmorforTemplate(MechClass.MEDIUM, ChassisComponent.TORSO));
	}
	
	@Test
	public void canGenerateArmorForMediumArmInternalStructure(){
		
		Map<ChassisComponentArmorKey, Integer> internalArmorMap = Maps.newHashMap();
		internalArmorMap.put(new ChassisComponentArmorKey(MechClass.MEDIUM, ChassisComponent.ARM), 8);
		ArmorService die = new ArmorService(internalArmorMap);
		
		assertEquals(new Integer(8), die.getInternalArmorforTemplate(MechClass.MEDIUM, ChassisComponent.ARM));
	}
	
	@Test
	public void canGenerateArmorForMediumHeadInternalStructure(){
		
		Map<ChassisComponentArmorKey, Integer> internalArmorMap = Maps.newHashMap();
		internalArmorMap.put(new ChassisComponentArmorKey(MechClass.MEDIUM, ChassisComponent.HEAD), 3);
		ArmorService die = new ArmorService(internalArmorMap);
		
		assertEquals(new Integer(3), die.getInternalArmorforTemplate(MechClass.MEDIUM, ChassisComponent.HEAD));
	}
	
	@Test
	public void canGenerateArmorForMediumLegInternalStructure(){
		
		Map<ChassisComponentArmorKey, Integer> internalArmorMap = Maps.newHashMap();
		internalArmorMap.put(new ChassisComponentArmorKey(MechClass.MEDIUM, ChassisComponent.LEG), 12);
		ArmorService die = new ArmorService(internalArmorMap);
		
		assertEquals(new Integer(12), die.getInternalArmorforTemplate(MechClass.MEDIUM, ChassisComponent.LEG));
	}
}
