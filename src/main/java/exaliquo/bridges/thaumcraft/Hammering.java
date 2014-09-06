package exaliquo.bridges.thaumcraft;

import static exaliquo.data.ModIDs.getItem;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import exaliquo.data.Configurations;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.HammerRegistry.register;

public class Hammering
{

	protected static void HammerThaumcraft()
	{
		Block watershard = (Configurations.alternatewater) ? Blocks.clay : Blocks.ice; 
		register(Blocks.sandstone, 1, getItem(Info.shard), 0, 0.1F, 0.03F);
		register(Blocks.netherrack, 0, getItem(Info.shard), 1, 0.1F, 0.03F);
		register(watershard, 0, getItem(Info.shard), 2, 0.1F, 0.03F);
		register(Blocks.grass, 0, getItem(Info.shard), 3, 0.1F, 0.03F);
		register(Blocks.obsidian, 0, getItem(Info.shard), 4, 0.25F, 0.05F);
		register(Blocks.tnt, 0, getItem(Info.shard), 5, 0.15F, 0.05F);
	}
}
