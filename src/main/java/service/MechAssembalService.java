package service;

import org.junit.Test;

import module.BluePrintModule;
import baseComponents.Mech;
import bluePrint.MechBluePrint;

import com.google.inject.Inject;

import enums.MechClass;

public class MechAssembalService {

	private final ArmorService armorService;
	private final MechBayService mechBayService;
	private final BluePrintModule bluePrintModule;
	
	@Inject
	public MechAssembalService(ArmorService armorService, MechBayService mechBayService, BluePrintModule bluePrintModule){
		this.armorService = armorService;
		this.mechBayService = mechBayService;
		this.bluePrintModule = bluePrintModule;
	}
	
	public Mech assembleMech(String mechName, MechClass mechClass){
		MechBluePrint bluePrint = bluePrintModule.getMechBluePrint("Hunchback4-g");
		Mech mech = mechBayService.assemble(MechClass.MEDIUM);
		mech.getCenterTorso().addSupportedItems(mechBayService.getCenterTorsoSupportedItems(bluePrint));
	}
	
	public MechBayService getMechBayService() {
		return mechBayService;
	}
	
	public ArmorService getArmorService() {
		return armorService;
	}
	
	@Test
	public void canAssembleMediumLeftLegSuffix() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}


