package exaliquo.bridges.Metallurgy;

import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import exaliquo.ExAliquo;

@Pulse(id = MetallurgyBridge.PULSE_ID, modsRequired = MetallurgyBridge.MOD_ID)
public class MetallurgyBridge
{
    public static final String PULSE_ID = "ExAliquo Metallurgy Module";
    
    public static final String MOD_ID = "Metallurgy";
    
    @Handler
    public void preInit(FMLPreInitializationEvent event)
    {
        MBlockRegistry.registerOreBlocks();
        MItemRegistry.registerOreItems();
        Crafting.registerOreCrafting();
    }

    @Handler
	public void postInit(FMLPostInitializationEvent event)
	{
	    ExAliquo.logger.info("Loading Metallurgy Compat");
	    
		Hammering.HammerMetallurgy();
		OreDict.registerExMetallurgyOreDict();
	}
}
