package baseComponents;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import components.InternalArmor;
import enums.ChassisComponent;
import enums.HardPointType;

public class ChassiesPartTest {

	
	/*2 missile hard points
	 * 2 balistic hard points
	 * 2 laser hard points
	 * 6 internal armor*/
	@Test
	public void verifyChassisPartIsCreatedSuccessfully(){
		List<HardPointType> hardPoints = new ArrayList<>();
		hardPoints.add(HardPointType.LASER);
		hardPoints.add(HardPointType.LASER);
		hardPoints.add(HardPointType.MISSILE);
		hardPoints.add(HardPointType.MISSILE);
		hardPoints.add(HardPointType.BALISTIC);
		hardPoints.add(HardPointType.BALISTIC);
		
		InternalArmor internalArmor = new InternalArmor(6);
		
		ChassisPart part = new ChassisPart(hardPoints, internalArmor, ChassisComponent.ARM);
		
		assertEquals(new Integer(6), part.getInternalArmor().getArmorPoints());
		assertEquals(new Integer(2), numberOfOccurances(HardPointType.LASER, hardPoints) );
		assertEquals(new Integer(2), numberOfOccurances(HardPointType.MISSILE, hardPoints) );
		assertEquals(new Integer(2), numberOfOccurances(HardPointType.BALISTIC, hardPoints) );
	}

	private Integer numberOfOccurances(HardPointType hardPointType, List<HardPointType> hardPoints) {
		Integer retval = new Integer(0);
		for(HardPointType hardPoint : hardPoints){
			if(hardPoint == hardPointType){
				retval++;
			}
		}
		return retval;
	}
	
}
