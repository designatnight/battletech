package assemblyLIne;


import java.util.ArrayList;
import java.util.List;

import service.ArmorService;
import baseComponents.Arm;
import baseComponents.CenterTorso;
import baseComponents.ChassisPart;
import baseComponents.Head;
import baseComponents.Leg;
import baseComponents.Torso;
import bluePrint.MechBluePrint;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import components.InternalArmor;

import enums.ChassisComponent;
import enums.HardPointType;
import enums.MechClass;

@Singleton
public class ChassisAssemblyLine implements AssemblyLine{

	@Inject
	private ArmorService armorService;
	
	@Override
	public List<ChassisPart> assemble(MechBluePrint bluePrint) {
		List<ChassisPart> chassisParts = new ArrayList<ChassisPart>();
		
		for(ChassisComponent part : bluePrint.getMechSchematic().keySet()){
			chassisParts.add( buildChassisPart(part, bluePrint.getMechSchematic().get(part), bluePrint.mechClass) );
		}
		
		return chassisParts;
	}

	private ChassisPart buildChassisPart(ChassisComponent part, 
			List<HardPointType> hardPoints, MechClass mechClass) {
		InternalArmor intermalArmor;
		switch(part){
		case ARM:
			intermalArmor = new InternalArmor(armorService.getInternalArmorforTemplate(mechClass, ChassisComponent.ARM));
			return new Arm(hardPoints, intermalArmor);
		case CENTER_TORSO:
			intermalArmor = new InternalArmor(armorService.getInternalArmorforTemplate(mechClass, ChassisComponent.CENTER_TORSO));
			return new CenterTorso(hardPoints, intermalArmor);
		case HEAD:
			intermalArmor = new InternalArmor(armorService.getInternalArmorforTemplate(mechClass, ChassisComponent.HEAD));
			return new Head(hardPoints, intermalArmor);
		case LEG:
			intermalArmor = new InternalArmor(armorService.getInternalArmorforTemplate(mechClass, ChassisComponent.LEG));
			return new Leg(hardPoints, intermalArmor);
		case TORSO:
			intermalArmor = new InternalArmor(armorService.getInternalArmorforTemplate(mechClass, ChassisComponent.TORSO));
			return new Torso(hardPoints, intermalArmor);
		default:
			break; 
		
		}
		
		
		return null;
	}
}
