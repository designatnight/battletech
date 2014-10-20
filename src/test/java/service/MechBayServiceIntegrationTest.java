package service;

import module.BluePrintModule;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import com.clinkworks.neptical.junit.runners.NepticalJUnit4Runner;
import com.clinkworks.neptical.junit.runners.NepticalJUnit4Runner.NepticalConfiguration;
import com.google.inject.Inject;

@RunWith(NepticalJUnit4Runner.class)
@NepticalConfiguration({BluePrintModule.class})
public class MechBayServiceIntegrationTest {

	@Inject
	private MechBayService mechBayService;
	
	@Inject
	private MechBayService mechBayService2;
	
	@Test
	public void guiceCorrectlyInjectsMySingleton(){
		assertSame(mechBayService, mechBayService2);
	}
}
