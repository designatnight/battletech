package factory;

import baseComponents.BodyPart;

import com.google.inject.Singleton;
import components.InternalArmor;

import enums.ComponentType;
import enums.MechClass;

public interface MechFactory {
	public InternalArmor generateInternalArmor(MechClass mechClass, ComponentType componentType);
	public BodyPart genertateBodyPart(MechClass mechClass, ComponentType componentType);
}
