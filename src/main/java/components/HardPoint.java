package components;

import baseComponents.Component;
import enums.HardPointType;

public class HardPoint {

	
	
	private final Boolean isRequired;
	private final HardPointType hardPointType;
	private Component component;

	public HardPoint(HardPointType hardPointType, Boolean isRequired){
		this.hardPointType = hardPointType;
		this.isRequired = isRequired;
	}

	public HardPointType getHardPointType() {
		return hardPointType;
	}

	public Boolean getIsRequired() {
		return isRequired;
	}
	
	public Component getComponent() {
		return component;
	}
	
	public void setComponent(Component component){
		if(component.getHardPointType() == getHardPointType()){
			this.component = component;
		}else{
			throw new RuntimeException("Invalid componentType allowed " + getHardPointType() + " attempted " + component.getHardPointType());
		}
	}
	
}
