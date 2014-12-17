package service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import mockit.Expectations;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import baseComponents.ChassisPart;
import baseComponents.Mech;
import enums.ChassisComponent;
import enums.HardPointType;
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
			armorService.getInternalArmorforTemplate((MechClass)any, (ChassisComponent)any);
			result = 12;
			times = 8;
		}};
		
		Mech hunchBack = mechBayService.assemble(MechClass.MEDIUM);
		ChassisPart centerTorso = hunchBack.getCenterTorso();
		
		assertNotNull(centerTorso);
		assertEquals(ChassisComponent.CENTER_TORSO, centerTorso.getComponentType());
		assertTrue(centerTorso.supportsHardPoint(HardPointType.ENGINE));
		assertTrue(centerTorso.supportsHardPoint(HardPointType.GYRO));
	}
	
	@Test
	public void canAssembleMediumHead(){
		
		new Expectations(){{
			armorService.getInternalArmorforTemplate((MechClass)any, (ChassisComponent)any);
			result = 12;
			times = 8;
		}};
		
		Mech hunchBack = mechBayService.assemble(MechClass.MEDIUM);
		ChassisPart head = hunchBack.getHead();
		
		assertNotNull(head);
		assertEquals(ChassisComponent.HEAD, head.getComponentType());
		assertFalse(head.supportsHardPoint(HardPointType.ENGINE));
		assertTrue(head.supportsHardPoint(HardPointType.SENSOR));
		
	}

	@Test
	public void canAssembleMediumRightArm(){
		
		new Expectations(){{
			armorService.getInternalArmorforTemplate((MechClass)any, (ChassisComponent)any);
			result = 12;
			times = 8;
		}};
		
		Mech hunchBack = mechBayService.assemble(MechClass.MEDIUM);
		ChassisPart rightArm = hunchBack.getRightArm();
		
		assertNotNull(rightArm);
		assertEquals(ChassisComponent.ARM, rightArm.getComponentType());
		assertTrue(rightArm.supportsHardPoint(HardPointType.SHOULDER));
		assertTrue(rightArm.supportsHardPoint(HardPointType.UPPER_ARM_ACTUATOR));
	}
	
	@Test
	public void canAssembleMediumLeftLeg(){
		
		new Expectations(){{
			armorService.getInternalArmorforTemplate((MechClass)any, (ChassisComponent)any);
			result = 12;
			times = 8;
		}};
		
		Mech hunchBack = mechBayService.assemble(MechClass.MEDIUM);
		ChassisPart leftLeg = hunchBack.getLeftLeg();
		
		assertNotNull(leftLeg);
		assertEquals(ChassisComponent.LEG, leftLeg.getComponentType());
		assertFalse(leftLeg.supportsHardPoint(HardPointType.SHOULDER));
		assertFalse(leftLeg.supportsHardPoint(HardPointType.UPPER_ARM_ACTUATOR));
		assertTrue(leftLeg.supportsHardPoint(HardPointType.FOOT_ACTUATOR));
		assertTrue(leftLeg.supportsHardPoint(HardPointType.HIP_ACTUATOR));
		assertTrue(leftLeg.supportsHardPoint(HardPointType.LOWER_LEG_ACTUATOR));
		assertTrue(leftLeg.supportsHardPoint(HardPointType.UPPER_LEG_ACTUATOR));
	}
		
	
	
}
