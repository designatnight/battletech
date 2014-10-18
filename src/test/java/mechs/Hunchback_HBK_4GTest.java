package mechs;



import static org.junit.Assert.*;



import org.junit.Test;
import baseComponents.Mech;
import factory.MechFactory;

public class Hunchback_HBK_4GTest {

	
	@Test
	public void mechContainsAllRequiredBodyPartsTest(){
		MechFactory factory = new MechFactory();
		
		Mech hunchBack = factory.createMech(Hunchback_HBK_4G.getHardPointMap(), Hunchback_HBK_4G.getMechClassification());
		
		assertNotNull(hunchBack.getCenterTorso());
		assertNotNull(hunchBack.getLeftTorso());
		assertNotNull(hunchBack.getRightTorso());
		assertNotNull(hunchBack.getHead());
		assertNotNull(hunchBack.getRightArm());
		assertNotNull(hunchBack.getLeftArm());
		assertNotNull(hunchBack.getRightLeg());
		assertNotNull(hunchBack.getLeftLeg());
	}
}
