package exaliquo.data;

import cpw.mods.fml.common.Loader;
import exaliquo.bridges.tconstruct.TConstructBridge;
import tconstruct.TConstruct;

public class MoltenMetals
{
	public static final int ingotCost = Loader.isModLoaded(TConstructBridge.MOD_ID) ? TConstruct.ingotLiquidValue : 144;
	public static final int ingotCostSmeltery = ingotCost * (Configurations.isOre?2:1);
	public static final int dustCostGeneral = ingotCost / (Configurations.dustValue?4:6);
	public static final int dustCostSmeltery = dustCostGeneral * (Configurations.isOre?2:1);
}
