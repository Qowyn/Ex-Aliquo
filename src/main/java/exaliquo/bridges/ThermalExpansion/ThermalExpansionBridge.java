package exaliquo.bridges.ThermalExpansion;

import io.drakon.pulsar.pulse.Pulse;
import exaliquo.ExAliquo;

@Pulse(id = ThermalExpansionBridge.PULSE_ID, modsRequired = ThermalExpansionBridge.MOD_ID)
public class ThermalExpansionBridge
{
    public static final String PULSE_ID = "ExAliquo ThermalExpansion Bridge";
    
    public static final String MOD_ID = "ThermalExpansion";

	public static void initThermalExpansion()
	{
	    ExAliquo.logger.info("Loading Thermal Expansion Compat");
	    
		Heat.HeatThermalExpansion();
	}
}
