package exaliquo.bridges.thaumcraft;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;
import exaliquo.ExAliquo;
import exaliquo.Registries;
import exaliquo.items.ThaumiumHammer;

@Pulse(id = ThaumcraftBridge.PULSE_ID, modsRequired = ThaumcraftBridge.MOD_ID)
public class ThaumcraftBridge
{
    public static final String PULSE_ID = "ExAliquo Thaumcraft Module";
    
    public static final String MOD_ID = "Thaumcraft";
    
    @Handler
    public void preInit(FMLPreInitializationEvent event) {
        Registries.hammerThaum = new ThaumiumHammer().setUnlocalizedName("ExAliquo.ThaumHammer").registerItem().setCreativeTab(Registries.exatab);
    }

    @Handler
	public void postInit(FMLPostInitializationEvent event)
	{
	    ExAliquo.logger.info("Loading Thaumcraft 4 Compat");
	    
		Colors.ColorThaumcraft();
		Composting.CompostThaumcraft();
		Hammering.HammerThaumcraft();
		Sieving.SieveThaumcraft();
		Heat.HeatThaumcraft();
		ExThaumiquo.initThaumiquo();
	}
}
