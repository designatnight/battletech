package baseComponents;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import components.InternalArmor;

import enums.HardPointType;

public class HeadTest {
	
	@Test
	public void verifyHeadIsCreatedWith6CriticalSlots(){
		List<HardPointType> hardPoints = new ArrayList<>();
		hardPoints.add(HardPointType.LASER);
		
		InternalArmor internalArmor = new InternalArmor(6);
		
		Head head = new Head(hardPoints, internalArmor);
		
		assertEquals(new Integer(6), head.getMaximumCritSlotCapacity());
	}

}
