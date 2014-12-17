package bluePrint;

import java.util.LinkedHashMap;
import java.util.List;

import enums.ChassisComponent;
import enums.ChassisType;
import enums.HardPointType;
import enums.MechClass;

public class MechBluePrint {
	
	public final MechClass mechClass;
	public final ChassisType chassisType;
	public final LinkedHashMap<ChassisComponent, List<HardPointType>> mechSchematic;
	
	public MechBluePrint(ChassisType chassisType, MechClass mechClass, LinkedHashMap<ChassisComponent, List<HardPointType>> schematic){
		this.chassisType = chassisType;
		this.mechSchematic = schematic;
		this.mechClass = mechClass;
	}
	
	public ChassisType getChassisType(){
		return chassisType;
	}
	
	public LinkedHashMap<ChassisComponent, List<HardPointType>> getMechSchematic(){
		return mechSchematic;
	}
}
