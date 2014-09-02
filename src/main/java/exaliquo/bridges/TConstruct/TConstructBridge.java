package exaliquo.bridges.TConstruct;

import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import exaliquo.ExAliquo;

@Pulse(id = TConstructBridge.PULSE_ID, modsRequired = TConstructBridge.MOD_ID)
public class TConstructBridge
{
    public static final String PULSE_ID = "ExAliquo TConstruct Module";
    
    public static final String MOD_ID = "TConstruct";
    
    @Handler
    public void preInit(FMLPreInitializationEvent event)
    {
        TCBlockRegistry.registerOreBlocks();
        TCItemRegistry.registerOreItems();
        Crafting.registerOreCrafting();
    }

    @Handler
	public void postInit(FMLPostInitializationEvent event)
	{
        ExAliquo.logger.info("Loading Tinker's Construct Compat");
        
		Colors.ColorTConstruct();
		Composting.CompostTConstruct();
		Smelting.SmeltTConstruct();
		Sieving.SieveTConstruct();
		Hammering.HammerTConstruct();
		Heat.HeatTConstruct();
		OreDict.addExTConstructOreDict();
		TCModifiers.addModifiers();
	}
	

}
