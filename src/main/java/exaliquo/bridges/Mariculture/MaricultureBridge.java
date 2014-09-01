package exaliquo.bridges.Mariculture;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import exaliquo.ExAliquo;
import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;

@Pulse(id = MaricultureBridge.PULSE_ID, modsRequired = MaricultureBridge.MOD_ID)
public class MaricultureBridge
{
    public static final String PULSE_ID = "ExAliquo Mariculture Module";
    
    public static final String MOD_ID = "Mariculture";

    @Handler
	public void postInit(FMLPostInitializationEvent event)
	{
        ExAliquo.logger.info("Loading Mariculture Compat");

		Sieving.SieveMariculture();
		AliquoFish.InitFishery();
		CrucibleSmelt.SmeltMariculture();
	}
}
