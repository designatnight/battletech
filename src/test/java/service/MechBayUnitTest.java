package service;

import static org.junit.Assert.*;
import mockit.Expectations;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

import baseComponents.BodyPart;
import baseComponents.Mech;
import enums.ComponentType;
import enums.ItemType;
import enums.MechClass;

@RunWith(JMockit.class)
public class MechBayUnitTest {

	private MechBayService mechBayService;
	

	@Mocked
	private ArmorService armorService;
	
	@Before
	public  void setup(){
		
		
		mechBayService = new MechBayService(armorService);
	}

	@Test
	public void canAssembleMech(){
		Mech mech = mechBayService.assemble(MechClass.MEDIUM);
		
		assertNotNull(mech.getCenterTorso());
		assertNotNull(mech.getHead());
		assertNotNull(mech.getLeftTorso());
		assertNotNull(mech.getRightTorso());
		assertNotNull(mech.getLeftArm());
		assertNotNull(mech.getRightArm());
		assertNotNull(mech.getLeftLeg());
		assertNotNull(mech.getRightLeg());
	}
	
	@Test
	public void canAssembleCenterTorso(){
		
		new Expectations(){{
			armorService.getInternalArmorforTemplate((MechClass)any, (ComponentType)any);
			result = 12;
			times = 8;
		}};
		
		Mech hunchBack = mechBayService.assemble(MechClass.MEDIUM);
		BodyPart centerTorso = hunchBack.getCenterTorso();
		
		assertNotNull(centerTorso);
		assertEquals(ComponentType.CENTER_TORSO, centerTorso.getComponentType());
		assertTrue(centerTorso.supportsItemType(ItemType.ENGINE));
		assertTrue(centerTorso.supportsItemType(ItemType.GYRO));
	}
	
	@Test
	public void canAssembleMediumHead(){
		
		new Expectations(){{
			armorService.getInternalArmorforTemplate((MechClass)any, (ComponentType)any);
			result = 12;
			times = 8;
		}};
		
		Mech hunchBack = mechBayService.assemble(MechClass.MEDIUM);
		BodyPart head = hunchBack.getHead();
		
		assertNotNull(head);
		assertEquals(ComponentType.HEAD, head.getComponentType());
		assertFalse(head.supportsItemType(ItemType.ENGINE));
		assertTrue(head.supportsItemType(ItemType.SENSOR));
		
	}
	
	@Test
	public void canAssembleMediumLeftArm(){
		
		new Expectations(){{
			armorService.getInternalArmorforTemplate((MechClass)any, (ComponentType)any);
			result = 12;
			times = 8;
		}};
		
		Mech hunchBack = mechBayService.assemble(MechClass.MEDIUM);
		BodyPart leftArm = hunchBack.getLeftArm();
		
		assertNotNull(leftArm);
		assertEquals(ComponentType.LEFT_ARM, leftArm.getComponentType());
		assertFalse(leftArm.supportsItemType(ItemType.SENSOR));
		assertTrue(leftArm.supportsItemType(ItemType.SHOULDER_LEFT));
		assertTrue(leftArm.supportsItemType(ItemType.UPPER_ARM_ACTUATOR_LEFT));
		
	}

	@Test
	public void canAssembleMediumRightArm(){
		
		new Expectations(){{
			armorService.getInternalArmorforTemplate((MechClass)any, (ComponentType)any);
			result = 12;
			times = 8;
		}};
		
		Mech hunchBack = mechBayService.assemble(MechClass.MEDIUM);
		BodyPart rightArm = hunchBack.getRightArm();
		
		assertNotNull(rightArm);
		assertEquals(ComponentType.RIGHT_ARM, rightArm.getComponentType());
		assertFalse(rightArm.supportsItemType(ItemType.SHOULDER_LEFT));
		assertTrue(rightArm.supportsItemType(ItemType.SHOULDER_RIGHT));
		assertTrue(rightArm.supportsItemType(ItemType.UPPER_ARM_ACTUATOR_RIGHT));
	}
	
	
	public static class MechStatisticsService{
		
	}
	
	public static class MechAssembalService{
		
		private final ArmorService armorService;
		private final MechBayService mechBayService;
		private final MechStatisticsService mechStatisticsService;
		
		@Inject
		public MechAssembalService(ArmorService armorService, MechBayService mechBayService, MechStatisticsService mechStatisticsService){
			this.armorService = armorService;
			this.mechBayService = mechBayService;
			this.mechStatisticsService = mechStatisticsService;
		}
		
		public Mech assembleMech(String mechName, MechClass mechClass){
			Statistics statistics = mechStatisticsService.getMechDefaults("Hunchback4-g");
			Mech mech = mechBayService.assemble(MechClass.MEDIUM);
			mech.getCenterTorso().addSupportedItems(statistics.getCenterTorsoSupportedItems());
		}
		
		public MechBayService getMechBayService() {
			return mechBayService;
		}
		
		public ArmorService getArmorService() {
			return armorService;
		}
		
		
	}
	
}
