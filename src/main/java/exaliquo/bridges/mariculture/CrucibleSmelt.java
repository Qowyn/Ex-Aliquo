package exaliquo.bridges.mariculture;

import static net.minecraftforge.fluids.FluidRegistry.getFluid;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import exaliquo.data.OreDict;
import exnihilo.registries.CrucibleRegistry;

public class CrucibleSmelt
{

	protected static void SmeltMariculture()
	{	
		ItemStack limestone = OreDict.getFirstOre("blockLimestone");
		CrucibleRegistry.register(Block.getBlockFromItem(limestone.getItem()), 0, 2000, getFluid("natural_gas"), 250, OreDict.getBlock(limestone));
	}
}
