package service;

import static org.junit.Assert.assertEquals;
import module.BluePrintModule;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.clinkworks.neptical.junit.runners.NepticalJUnit4Runner;
import com.clinkworks.neptical.junit.runners.NepticalJUnit4Runner.NepticalConfiguration;
import com.google.inject.Inject;

import enums.ComponentType;
import enums.MechClass;

@RunWith(NepticalJUnit4Runner.class)
@NepticalConfiguration({ BluePrintModule.class })
public class ArmorServiceIntegrationTest {

   @Inject
   private ArmorService armorService;


	@Test
	public void correctValueForInternalArmerSelected() {
		
		assertEquals(new Integer(16), armorService.getInternalArmorforTemplate(MechClass.MEDIUM, ComponentType.CENTER_TORSO));
		
	}

}
