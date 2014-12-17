package factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import service.ArmorService;
import assemblyLIne.ChassisAssemblyLine;
import assemblyLIne.WeaponAssemblyLine;
import baseComponents.ChassisPart;
import baseComponents.Mech;
import bluePrint.MechBluePrint;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import enums.ChassisType;
import enums.ComponentType;

@Singleton
public class MechFactory {

	@Inject
	public ArmorService armorService;
	@Inject
	public ChassisAssemblyLine chassieAssemblyLine;
	@Inject
	public WeaponAssemblyLine weaponAssemblyLine;
	
	public Mech assemble(MechBluePrint bluePrint) {
		List<ChassisPart> chassisParts = new ArrayList<ChassisPart>();
		Map<ComponentType, ChassisPart> mechChassisMap = new HashMap<ComponentType, ChassisPart>();
	
		ChassisType chasseType = bluePrint.getChassisType();
		if(chasseType == ChassisType.BIPEDAL){
			chassisParts = chassieAssemblyLine.assemble(bluePrint);
			mechChassisMap.put(ComponentType.HEAD, chassisParts.get(0));
			mechChassisMap.put(ComponentType.CENTER_TORSO, chassisParts.get(1));
			mechChassisMap.put(ComponentType.RIGHT_TORSO, chassisParts.get(2));
			mechChassisMap.put(ComponentType.LEFT_TORSO, chassisParts.get(3));
			mechChassisMap.put(ComponentType.RIGHT_ARM, chassisParts.get(4));
			mechChassisMap.put(ComponentType.LEFT_ARM, chassisParts.get(5));
			mechChassisMap.put(ComponentType.RIGHT_LEG, chassisParts.get(6));
			mechChassisMap.put(ComponentType.LEFT_LEG, chassisParts.get(7));
			return new Mech(mechChassisMap);
		}
		
		
		
		return null;
	}

	public void setChassieAssemblyLine(ChassisAssemblyLine chassieLine) {
		this.chassieAssemblyLine = chassieLine;
		
	}	
}
