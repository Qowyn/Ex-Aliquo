package exaliquo.bridges.crossmod;

import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import exaliquo.ExAliquo;
import exaliquo.bridges.TConstruct.TCUtil;
import exaliquo.data.Configurations;
import exaliquo.data.CrucibleUtil;

@Pulse(id = ExtraTic_Mekanism.PULSE_ID, modsRequired = ExtraTic_Mekanism.REQUIRED_MODS)
public class ExtraTic_Mekanism
{
    public static final String PULSE_ID = "ExAliquo ExtraTic Mekanism Module";
    
    public static final String REQUIRED_MODS = "ExtraTiC;Mekanism";

    @Handler
	public void smeltMekanism(FMLPostInitializationEvent event)
	{
        ExAliquo.logger.info("Loading ExtraTiC to Mekanism Compat");
        
        TCUtil.addSmelteryOre("osmium", 550);
        
		if (Configurations.miniSmelting)
		{
		    CrucibleUtil.addCrucibleOre("osmium");
		}
		
		if (Configurations.allowDustSmelting)
		{
		    TCUtil.addSmelteryDust("osmium", 600);

			if (Configurations.miniSmelting)
			{
			    CrucibleUtil.addCrucibleDust("osmium");
			}
		}
	}

}
