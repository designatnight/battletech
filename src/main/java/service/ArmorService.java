package service;

import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import enums.ComponentType;
import enums.MechClass;

@Singleton
public class ArmorService {

	private Map<ComponentTypeArmorKey,Integer> internalArmor;
	
	@Inject
	public ArmorService(Map<ComponentTypeArmorKey, Integer> interalArmorMap){
		internalArmor = interalArmorMap;
	}
	
	private ComponentTypeArmorKey createChassisDie(MechClass mechClass, ComponentType componentType){
		return new ComponentTypeArmorKey(mechClass, componentType);
	}
	
	public Integer getInternalArmorforTemplate(MechClass mechClass, ComponentType componentType){
		return internalArmor.get(createChassisDie(mechClass, componentType));
	}
	
	
	public static class ComponentTypeArmorKey{
		
		private MechClass mechClass;
		private ComponentType componentType;
		
		
		public ComponentTypeArmorKey (MechClass mechClass, ComponentType componentType){
			
			this.mechClass = mechClass;
			this.componentType = componentType;
		}
		
		@Override
		public int hashCode(){
			return ObjectUtils.hashCodeMulti(mechClass, componentType);
		}
		
		@Override
		public boolean equals(Object object){
			if(!this.getClass().isAssignableFrom(object.getClass())){
				return false;
			}
			ComponentTypeArmorKey die = (ComponentTypeArmorKey)object;
			return this.getMechClass() == die.getMechClass() && this.getComponentType() == die.getComponentType();
		}
		
		public MechClass getMechClass(){
			return mechClass;
		}
		
		public ComponentType getComponentType(){
			return componentType;
		}
	}
	
}
