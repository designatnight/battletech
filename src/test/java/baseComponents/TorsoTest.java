package baseComponents;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import components.InternalArmor;

import enums.HardPointType;

public class TorsoTest {

	@Test
	public void verifyTorsoIsCreatedWith12CriticalSlots(){
		List<HardPointType> hardPoints = new ArrayList<>();
		hardPoints.add(HardPointType.LASER);
		hardPoints.add(HardPointType.LASER);
		hardPoints.add(HardPointType.MISSILE);
		hardPoints.add(HardPointType.MISSILE);
		hardPoints.add(HardPointType.BALISTIC);
		hardPoints.add(HardPointType.BALISTIC);
		
		InternalArmor internalArmor = new InternalArmor(6);
		
		Torso torso = new Torso(hardPoints, internalArmor);
		
		assertEquals(new Integer(12), torso.getMaximumCritSlotCapacity());
	}
}
