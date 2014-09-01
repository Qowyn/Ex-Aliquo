package exaliquo;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import exaliquo.data.Configurations;
import exnihilo.registries.ColorRegistry;
import exnihilo.registries.CompostRegistry;
import exnihilo.registries.HammerRegistry;
import exnihilo.registries.SieveRegistry;

public class GeneralAliquo
{
	
	public static void initGeneralStuff()
	{
		registerGeneralCompost();
		registerGeneralSieving();
		registerGeneralHammering();
	}
	
	public static void registerGeneralCompost()
	{
		ArrayList<ItemStack> treeSapling = OreDictionary.getOres("treeSapling");
		ArrayList<ItemStack> treeLeaves = OreDictionary.getOres("treeLeaves");
		
		
		for (ItemStack sapling : treeSapling)
		{
			if (Block.getBlockFromItem(sapling.getItem()) != Blocks.sapling)
			{
					CompostRegistry.register(sapling.getItem(), sapling.getItemDamage(), 0.125F, ColorRegistry.color("oak"));
			}
		}
		for (ItemStack leaves : treeLeaves)
		{
			if (Block.getBlockFromItem(leaves.getItem()) != Blocks.leaves)
			{
				CompostRegistry.register(leaves.getItem(), leaves.getItemDamage(), 0.125F, ColorRegistry.color("oak"));
			}
		}
	}

	public static void registerGeneralSieving()
	{
		SieveRegistry.register(Blocks.lava, 0, Items.fish, 0, 1);
		SieveRegistry.register(Blocks.water, 0, Items.cooked_fished, 0, 1);
		SieveRegistry.register(Blocks.dragon_egg, 0, Registries.dragonEgg, 0, 1);
	}
	
	public static void registerGeneralHammering()
	{
		if (Configurations.ninjaFeesh)
		{
			HammerRegistry.register(Blocks.monster_egg, 0, null, 0, 0.0F, 0.0F);
			HammerRegistry.register(Blocks.monster_egg, 1, null, 0, 0.0F, 0.0F);
			HammerRegistry.register(Blocks.monster_egg, 2, null, 0, 0.0F, 0.0F);
		}
	}	
}
