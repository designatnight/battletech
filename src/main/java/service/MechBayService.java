package service;

import java.util.Map;

import baseComponents.BodyPart;
import baseComponents.Mech;

import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import components.InternalArmor;

import enums.ComponentType;
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
		Map<ComponentType, BodyPart> bodyMap = createBodyMap(mechClass);
		
		return new Mech(bodyMap);
	}

	private Map<ComponentType, BodyPart> createBodyMap(MechClass mechClass) {
		Map<ComponentType, BodyPart> bodyMap = Maps.newHashMap();
		for(ComponentType componentType : ComponentType.values()){
			bodyMap.put(componentType, generateBodyPart(mechClass, componentType));
		}
		return bodyMap;
	}
	
	private BodyPart generateBodyPart(MechClass mechClass, ComponentType componentType){
		return new BodyPart(componentType, generateInternalArmor(mechClass, componentType), componentType.getCritSlotUsage());
	}
	
	private InternalArmor generateInternalArmor(MechClass mechClass, ComponentType componentType){
		return new InternalArmor(armorService.getInternalArmorforTemplate(mechClass, componentType));
	}
	
}
