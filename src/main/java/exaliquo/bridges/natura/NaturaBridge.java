package exaliquo.bridges.natura;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import exaliquo.ExAliquo;
import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;

@Pulse(id = NaturaBridge.PULSE_ID, modsRequired = NaturaBridge.MOD_ID)
public class NaturaBridge
{
    public static final String PULSE_ID = "ExAliquo Natura Module";
    
    public static final String MOD_ID = "Natura";

    @Handler
    public void postInit(FMLPostInitializationEvent event)
    {
        ExAliquo.logger.info("Loading Natura Compat");

        Colors.ColorNatura();
        Composting.CompostNatura();
        Recipes.CraftNatura();
        Sieving.SieveNatura();
    }
}
