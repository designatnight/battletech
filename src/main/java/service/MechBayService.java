package service;

import java.util.List;
import java.util.Map;

import baseComponents.ChassisPart;
import baseComponents.Mech;
import bluePrint.BluePrint;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import components.InternalArmor;
import enums.ChassisComponent;
import enums.ComponentType;
import enums.HardPointType;
import enums.MechClass;
import factory.MechFactory;

@Singleton
public class MechBayService {
	
	@Inject
	private final ArmorService armorService;
	
	@Inject
	public MechBayService(ArmorService armorService) {
		this.armorService = armorService;
	}

	public Mech assemble(MechClass mechClass) {
		Map<ComponentType, ChassisPart> bodyMap = createBipedalBodyMap(mechClass);
		
		return new Mech(bodyMap);
	}

	private Map<ComponentType, ChassisPart> createBipedalBodyMap(MechClass mechClass) {
		Map<ComponentType, ChassisPart> bodyMap = Maps.newHashMap();
		for(ComponentType componentType : ComponentType.values()){
			bodyMap.put(componentType, generateBodyPart(mechClass, componentType));
		}
		return bodyMap;
	}
	
	private ChassisPart generateBodyPart(MechClass mechClass, List<HardPointType> hardPoints, ){
		return new ChassisPart(ChassisComponent, generateInternalArmor(mechClass, componentType));
	}
	
	private InternalArmor generateInternalArmor(MechClass mechClass, ChassisComponent componentType){
		return new InternalArmor(armorService.getInternalArmorforTemplate(mechClass, componentType));
	}

	public Object getCenterTorsoSupportedItems(BluePrint bluePrint) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
