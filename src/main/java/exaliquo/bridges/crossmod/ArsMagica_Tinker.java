package exaliquo.bridges.crossmod;

import static exaliquo.data.ModIDs.getBlock;
import static exaliquo.data.ModIDs.getItem;
import static net.minecraftforge.fluids.FluidRegistry.getFluid;
import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import tconstruct.library.crafting.Smeltery;
import exaliquo.ExAliquo;
import exaliquo.bridges.ArsMagica.ArsMagicaBridge;
import exaliquo.bridges.TConstruct.TConstructBridge;
import exaliquo.data.ModIDs.Info;

@Pulse(id = ArsMagica_Tinker.PULSE_ID, pulsesRequired = ArsMagica_Tinker.REQUIRED_PULSES)
public class ArsMagica_Tinker
{
    public static final String PULSE_ID = "ExAliquo ArsMagic TConstruct Module";
    
    public static final String REQUIRED_PULSES = ArsMagicaBridge.PULSE_ID + ";" + TConstructBridge.PULSE_ID;

    @Handler
	public void postInit(FMLPostInitializationEvent event)
	{
        ExAliquo.logger.info("Loading Ars Magica 2 to TConstruct Compat");
        
		for (int i = 0; i < 10; i++)
		{
			Smeltery.addMelting(new ItemStack(getItem(Info.essences), 1, i), getBlock(Info.essenceBlock), 0, 800, new FluidStack(getFluid("liquidessence"), 1000));
		}
	}
}
