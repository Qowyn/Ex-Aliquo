package exaliquo.bridges.mfr;

import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import exaliquo.ExAliquo;
import exaliquo.data.Configurations;

@Pulse(id = MineFactoryReloadedBridge.PULSE_ID, modsRequired = MineFactoryReloadedBridge.MOD_ID)
public class MineFactoryReloadedBridge
{
    public static final String PULSE_ID = "ExAliquo MFR Module";
    
    public static final String MOD_ID = "MineFactoryReloaded";

    @Handler
	public void postInit(FMLPostInitializationEvent event)
	{
	    ExAliquo.logger.info("Loading MFR Compat");
	    
		Colors.ColorMFR();
		Composting.CompostMFR();
		if (Configurations.sacredohgodthewood) Sieving.SieveMFR();
	}
}
