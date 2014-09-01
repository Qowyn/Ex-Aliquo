package exaliquo.bridges.Growthcraft;

import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import exaliquo.ExAliquo;

@Pulse(id = GrowthcraftBridge.PULSE_ID, modsRequired = GrowthcraftBridge.MOD_ID)
public class GrowthcraftBridge
{
    public static final String PULSE_ID = "ExAliquo Growthcraft Module";
    
    public static final String MOD_ID = "Growthcraft";

	protected static boolean isGCApples = Loader.isModLoaded("Growthcraft|Apples");
	protected static boolean isGCBamboo = Loader.isModLoaded("Growthcraft|Bamboo");
	protected static boolean isGCBees = Loader.isModLoaded("Growthcraft|Bees");
	protected static boolean isGCGrapes = Loader.isModLoaded("Growthcraft|Grapes");
	protected static boolean isGCHops = Loader.isModLoaded("Growthcraft|Hops");
	protected static boolean isGCRice = Loader.isModLoaded("Growthcraft|Rice");
	
	@Handler
	public void postInit(FMLPostInitializationEvent event)
	{
	    ExAliquo.logger.info("Loading Growthcraft Compat");

		Colors.ColorGrowth();
		Composting.CompostGrowth();
		Sieving.SieveGrowth();
	}
}
