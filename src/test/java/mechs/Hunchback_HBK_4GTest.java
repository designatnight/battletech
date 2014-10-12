package mechs;

import org.junit.Test;

import factory.MechFactory;

import junit.framework.TestCase;

public class Hunchback_HBK_4GTest extends TestCase {

	
	@Test
	public void mechContainsAllRequiredBodyParts(){
		MechFactory factory = new MechFactory();
		factory.createMech(Hunchback_HBK_4G.getHardPointMap(), Hunchback_HBK_4G.getMechClassification());
		
	}
}
