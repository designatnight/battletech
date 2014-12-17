package components;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import enums.ComponentType;
import enums.HardPointType;
import baseComponents.ChassisPart;
import baseComponents.Component;

public class GenericHardPointUnitTest {
	
	private GenericHardPoint genericHardPoint;
	private ChassisPart bodyPart;
	
	@Before
	public void init(){
		bodyPart = new ChassisPart(ComponentType.CENTER_TORSO, new InternalArmor(15), 10);
		genericHardPoint = bodyPart.getGenericHardPoint();
	}
	
	@Test(expected = RuntimeException.class)
	public void ensureGenericHardPointRejectsComponentsThatDoNotFit(){
		
		Component component = new ReallyBigGenericTestComponent();
		genericHardPoint.addComponent(component);
		assertEquals(0, genericHardPoint.getComponents().size());

	}
	
	@Test
	public void ensureGenericHardPointAddsComponentsThatAreGenericThatDoFit(){
		
		Component component = new SmallEnoughGenericTestComponent();
		genericHardPoint.addComponent(component);
		assertEquals(component, genericHardPoint.getComponents().get(0));
	}

	@Test(expected = RuntimeException.class)
	public void ensureGenericHardPointRejectsNonGenericComponents(){
		
		Component component = new SmallEnoughLazerTestComponent();
		genericHardPoint.addComponent(component);
		assertEquals(0, genericHardPoint.getComponents().size());

	}
	
	public static class SmallEnoughLazerTestComponent implements Component{

		@Override
		public Integer getCritSlotUsage() {
			return 2;
		}

		@Override
		public HardPointType getHardPointType() {
			return HardPointType.LASER;
		}
		
	}
	
	public static class SmallEnoughGenericTestComponent implements Component{

		@Override
		public Integer getCritSlotUsage() {
			return 2;
		}

		@Override
		public HardPointType getHardPointType() {
			return HardPointType.GENERIC;
		}
		
	}
	
	public static class ReallyBigGenericTestComponent implements Component{

		@Override
		public Integer getCritSlotUsage() {
			return 15;
		}

		@Override
		public HardPointType getHardPointType() {
			return HardPointType.GENERIC;
		}
		
	}
}


