package exaliquo.bridges.dart;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import exaliquo.ExAliquo;
import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;

@Pulse(id = DartcraftBridge.PULSE_ID, modsRequired = DartcraftBridge.MOD_ID)
public class DartcraftBridge
{
    public static final String PULSE_ID = "ExAliquo Dartcraft Module";
    
    public static final String MOD_ID = "Dartcraft";

    @Handler
	public void postInit(FMLPostInitializationEvent event)
	{
        ExAliquo.logger.info("Loading Dartcraft Compat");
        
		Colors.ColorDart();
		Composting.CompostDart();
		Sieving.SieveDart();
	}
}
