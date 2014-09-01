package exaliquo.bridges.TConstruct;

import static exaliquo.data.ModIDs.getItem;
import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.item.ItemStack;
import tconstruct.library.TConstructRegistry;
import tconstruct.library.client.TConstructClientRegistry;
import tconstruct.library.crafting.ModifyBuilder;
import exaliquo.ExAliquo;
import exaliquo.Registries;
import exaliquo.bridges.TConstruct.Modifiers.ModCrooked;
import exaliquo.bridges.TConstruct.Modifiers.ModHammered;
import exaliquo.data.ModIDs.Info;

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
		Hammering.HammerTConstruct();
		Heat.HeatTConstruct();
		OreDict.addExTConstructOreDict();
		addModifiers();
	}
	
	public void addModifiers()
	{
	    ModifyBuilder.registerModifier(new ModCrooked(new ItemStack[] { new ItemStack(Registries.crookGold, 1, 0) }, 60));
		TConstructClientRegistry.addEffectRenderMapping(60, "exaliquo", "crook", true);
		
		ModifyBuilder.registerModifier(new ModHammered(new ItemStack[] { new ItemStack(getItem(Info.diamondhammer), 1, 0) }, 61));
		TConstructClientRegistry.addEffectRenderMapping(61, "exaliquo", "hammer", true);
		
		TConstructRegistry.registerActiveToolMod(new SkyModifiers());
	}
}
