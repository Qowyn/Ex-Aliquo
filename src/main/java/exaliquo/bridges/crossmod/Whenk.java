package exaliquo.bridges.crossmod;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;
import exaliquo.data.Configurations;
import exaliquo.data.ModIDs;
import exaliquo.data.ModIDs.Info;
import exnihilo.registries.HammerRegistry;

@Pulse(id = Whenk.PULSE_ID, modsRequired = Whenk.MOD_ID)
public class Whenk
{
    public static final String PULSE_ID = "ExAliquo NetherOres Module";
    
    public static final String MOD_ID = "NetherOres";
    
    @Handler
	public void ninjaFeesh(FMLPreInitializationEvent event)
	{
        if (Configurations.ninjaFeesh)
        {
            HammerRegistry.register(ModIDs.getBlock(Info.hellfeesh), 0, null, 0, 0.0F, 0.0F);
        }
	}
}
