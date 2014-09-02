package exaliquo.bridges.ThermalExpansion;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;
import exaliquo.ExAliquo;

@Pulse(id = ThermalExpansionBridge.PULSE_ID, modsRequired = ThermalExpansionBridge.MOD_ID)
public class ThermalExpansionBridge
{
    public static final String PULSE_ID = "ExAliquo ThermalExpansion Bridge";
    
    public static final String MOD_ID = "ThermalExpansion";

    @Handler
	public static void postInit(FMLPostInitializationEvent event)
	{
	    ExAliquo.logger.info("Loading Thermal Expansion Compat");
	    
		Heat.HeatThermalExpansion();
	}
}
