package exaliquo.bridges.Natura;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import exaliquo.ExAliquo;
import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;

@Pulse(id = "ExAliquo Natura Module", modsRequired = "Natura")
public class Natura {

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
