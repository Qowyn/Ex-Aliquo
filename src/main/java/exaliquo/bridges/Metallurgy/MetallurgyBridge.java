package exaliquo.bridges.Metallurgy;

import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import exaliquo.ExAliquo;

@Pulse(id = MetallurgyBridge.PULSE_ID, modsRequired = MetallurgyBridge.MOD_ID)
public class MetallurgyBridge
{
    public static final String PULSE_ID = "ExAliquo Metallurgy Module";
    
    public static final String MOD_ID = "Metallurgy";

    @Handler
	public void postInit(FMLPostInitializationEvent event)
	{
	    ExAliquo.logger.info("Loading Metallurgy Compat");
	    
		//Hammering.HammerMetallurgy();
		//OreDict.registerExMetallurgyOreDict();
		if (Loader.isModLoaded("ExtraTiC")) 
		{
			System.out.println("Smelting Metallurgy metals");
			Smelting.SmeltMetallurgy();
		}
	}
}
