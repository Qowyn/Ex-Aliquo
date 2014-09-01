package exaliquo.bridges.Growthcraft;

import static exaliquo.data.ModIDs.getBlock;
import static exaliquo.data.ModIDs.getItem;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import exaliquo.data.ModIDs.Info;
import exnihilo.registries.SieveRegistry;
import static exnihilo.registries.SieveRegistry.register;

public class Sieving
{

	protected static void SieveGrowth()
	{
		if (Growthcraft.isGCBamboo)
		{
			register(Blocks.leaves, 3, getItem(Info.gcbamboo), 0, 64);
		}
		if (Growthcraft.isGCBees)
		{
			register(getBlock(Info.silkleaves), 0, getItem(Info.gcbee), 0, 16);
			register(getBlock(Info.silkleaves), 1, getItem(Info.gcbee), 0, 16);
			register(getBlock(Info.silkleaves), 2, getItem(Info.gcbee), 0, 16);
			register(getBlock(Info.silkleaves), 3, getItem(Info.gcbee), 0, 16);
		}
	}
}
