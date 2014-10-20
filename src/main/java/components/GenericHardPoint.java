package components;

import java.util.List;

import com.google.common.collect.Lists;

import baseComponents.BodyPart;
import baseComponents.Component;

import enums.HardPointType;

public class GenericHardPoint {
	private static final HardPointType HARD_POINT_TYPE = HardPointType.GENERIC;
	
	private final List<Component> components;
	private final BodyPart bodyPart;
	
	public GenericHardPoint(BodyPart bodyPart){
		this.bodyPart = bodyPart;
		components = Lists.newArrayList();
	}
	
public void addComponent(Component component){
		if(component.getHardPointType() != HARD_POINT_TYPE){
			throw new RuntimeException("I dont equal the generic hard point component type");
		}
		if(bodyPartHasCritSlotCapacityFor(component)){
			components.add(component);
		}else{
			throw new RuntimeException("fill me out later");
		}
	}
	
	private boolean bodyPartHasCritSlotCapacityFor(Component component) {
		return (getBodyPart().getCurrentCriticalSlotUsage() + component.getCritSlotUsage()) <= getBodyPart().getMaximumCritSlotCapacity();
	}

	public List<Component> getComponents() {
		return components;
	}

	public BodyPart getBodyPart() {
		return bodyPart;
	}
}
