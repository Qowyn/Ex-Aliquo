package exaliquo.bridges.arsmagica;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;
import exaliquo.ExAliquo;
import exaliquo.data.Configurations;

@Pulse(id = ArsMagicaBridge.PULSE_ID, modsRequired = ArsMagicaBridge.MOD_ID)
public class ArsMagicaBridge
{
    public static final String PULSE_ID = "ExAliquo AM2 Bridge";
    
    public static final String MOD_ID = "arsmagica2";

    @Handler
	public void postInit(FMLPostInitializationEvent event)
	{
	    ExAliquo.logger.info("Loading Ars Magica 2 Compat");
	    
		Colors.ColorArs();
		Composting.CompostingArs();
		Hammering.HammerArs();
		Heat.HeatArs();
		Recipes.CraftArs();
		if (Configurations.sieveNovas) Sieving.SievingArs();
	}
}
