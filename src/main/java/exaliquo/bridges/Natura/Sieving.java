package exaliquo.bridges.Natura;

import static exaliquo.data.ModIDs.getBlock;
import static exaliquo.data.ModIDs.getItem;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import exaliquo.data.Configurations;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.SieveRegistry.register;

public class Sieving
{
	
	private static final Block topiary = getBlock(Info.topiary);

	protected static void SieveNatura()
	{
		for (int i = 0; i < 3; i++)
		{
			if (Configurations.sieveRedwoods)
			{
				register(topiary, i, getItem(Info.flora), 0, 256);
			}
			if (Configurations.sieveOverworldTrees)
			{
				register(topiary, i, getItem(Info.flora), 1, 90);
				if (Configurations.sieveHopseed)
				{
					register(topiary, i, getItem(Info.flora), 2, 90);
				}
				register(topiary, i, getItem(Info.flora), 3, 64);
				register(topiary, i, getItem(Info.raresap), 0, 128);
				register(topiary, i, getItem(Info.raresap), 1, 128);
				register(topiary, i, getItem(Info.raresap), 2, 128);
				register(topiary, i, getItem(Info.raresap), 3, 128);
				register(topiary, i, getItem(Info.raresap), 4, 128);
			}
			if (Configurations.sieveBerryBushes)
			{
				register(topiary, i, getItem(Info.good), 0, 64);
				register(topiary, i, getItem(Info.good), 1, 64);
				register(topiary, i, getItem(Info.good), 2, 64);
				register(topiary, i, getItem(Info.good), 3, 64);
			}
		}
		if (Configurations.sieveNetherTrees)
		{
			register(Blocks.soul_sand, 0, getItem(Info.flora), 4, 128);
			register(Blocks.soul_sand, 0, getItem(Info.flora), 5, 128);
			register(Blocks.soul_sand, 0, getItem(Info.flora), 6, 128);
			register(Blocks.soul_sand, 0, getItem(Info.flora), 7, 128);
			
			for (int i = 0; i < 4; i++)
			{
				register(getBlock(Info.monochrome), 1, getItem(Info.badberry), i, 16);
				register(getBlock(Info.monochrome), 2, getItem(Info.badberry), i, 16);
				for (int j = 0; j < 4; j++)
				{
					register(getBlock(Info.darkleaves), j, getItem(Info.badberry), i, 16);
				}
			}
		}
		if (Configurations.sieveDarkBerries)
		{
			register(Blocks.soul_sand, 0, getItem(Info.evil), 0, 64);
			register(Blocks.soul_sand, 0, getItem(Info.evil), 1, 64);
			register(Blocks.soul_sand, 0, getItem(Info.evil), 2, 64);
			register(Blocks.soul_sand, 0, getItem(Info.evil), 3, 64);
		}
		register(Blocks.soul_sand, 0, getItem(Info.glowshroom), 0, 128);
		register(Blocks.soul_sand, 0, getItem(Info.glowshroom), 1, 128);
		register(Blocks.soul_sand, 0, getItem(Info.glowshroom), 2, 128);
		register(Blocks.soul_sand, 0, getItem(Info.thornvines), 0, 48);
		register(Blocks.sand, 0, getItem(Info.fruit), 0, 32);
		
		if ((Configurations.sieveRedwoods) || (Configurations.sieveOverworldTrees))
		{
			for (int i = 0; i < 4;i++)
			{
				register(getBlock(Info.monochrome), 0, getItem(Info.goodberry), i, 16);
				register(getBlock(Info.monochrome), 3, getItem(Info.goodberry), i, 16);
				for (int j = 0; j < 4; j++)
				{
					register(getBlock(Info.leaves), j, getItem(Info.goodberry), i, 16);
					register(getBlock(Info.rareleaves), j, getItem(Info.goodberry), i, 16);
				}
			}
		}
	}
}
