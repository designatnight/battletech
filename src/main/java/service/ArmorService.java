package service;

import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import enums.ChassisComponent;
import enums.MechClass;

@Singleton
public class ArmorService {

	private Map<ChassisComponentArmorKey,Integer> internalArmor;
	
	@Inject
	public ArmorService(Map<ChassisComponentArmorKey, Integer> interalArmorMap){
		internalArmor = interalArmorMap;
	}
	
	private ChassisComponentArmorKey createChassisDie(MechClass mechClass, ChassisComponent chassisComponent){
		return new ChassisComponentArmorKey(mechClass, chassisComponent);
	}
	
	public Integer getInternalArmorforTemplate(MechClass mechClass, ChassisComponent chassisComponent){
		return internalArmor.get(createChassisDie(mechClass, chassisComponent));
	}
	
	
	public static class ChassisComponentArmorKey{
		
		private MechClass mechClass;
		private ChassisComponent chassisComponent;
		
		
		public ChassisComponentArmorKey (MechClass mechClass, ChassisComponent chassisComponent){
			
			this.mechClass = mechClass;
			this.chassisComponent = chassisComponent;
		}
		
		@Override
		public int hashCode(){
			return ObjectUtils.hashCodeMulti(mechClass, chassisComponent);
		}
		
		@Override
		public boolean equals(Object object){
			if(!this.getClass().isAssignableFrom(object.getClass())){
				return false;
			}
			ChassisComponentArmorKey die = (ChassisComponentArmorKey)object;
			return this.getMechClass() == die.getMechClass() && this.getChassisComponent() == die.getChassisComponent();
		}
		
		public MechClass getMechClass(){
			return mechClass;
		}
		
		public ChassisComponent getChassisComponent(){
			return chassisComponent;
		}
	}
	
}
