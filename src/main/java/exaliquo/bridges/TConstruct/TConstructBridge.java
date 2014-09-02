package exaliquo.bridges.TConstruct;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import exaliquo.ExAliquo;

@Pulse(id = TConstructBridge.PULSE_ID, modsRequired = TConstructBridge.MOD_ID)
public class TConstructBridge
{
    public static final String PULSE_ID = "ExAliquo TConstruct Module";
    
    public static final String MOD_ID = "TConstruct";

    @Handler
	public void postInit(FMLPostInitializationEvent event)
	{
        ExAliquo.logger.info("Loading Tinker's Construct Compat");
        
		Colors.ColorTConstruct();
		Composting.CompostTConstruct();
		Smelting.SmeltTConstruct();
		Sieving.SieveTConstruct();
		Heat.HeatTConstruct();
		TCModifiers.addModifiers();
	}
    
    public static void addSmelteryDust(Item item, String fluidName, int temperature, Block block)
    {
        
    }
    
    public static void addSmelteryOre(Block block, String fluidName, int temperature)
    {
        
    }
	

}
