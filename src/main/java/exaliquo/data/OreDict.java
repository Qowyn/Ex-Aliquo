package exaliquo.data;

import java.util.ArrayList;

import exaliquo.exaliquo;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict
{
	public static boolean isOreDict(ItemStack itemstack, String name)
	{
		if (OreDictionary.getOreName(OreDictionary.getOreID(itemstack)).equals(name))
		{
			return true;
		}
		else
		{
			return ((OreDictionary.getOres(name).isEmpty()) && (itemstack.getItem() == Items.iron_ingot)) ? true : false;
		}
	}

	public static ToolMaterial getMaterial(String string)
	{
		try
		{
			return ToolMaterial.valueOf(string);
		}
		catch (IllegalArgumentException e)
		{
			return ToolMaterial.IRON;
		}
	}

	public static ItemStack getFirstOre(String string)
	{
		return getFirstOre(string, true);
	}
	
	public static ItemStack getFirstOre(String string, boolean warning)
	{
		ArrayList<ItemStack> ores = OreDictionary.getOres(string);
		if (!ores.isEmpty())
		{
			return ores.get(0);
		}
		if (warning) exaliquo.logger.warning("ExAliquo could not find the oreDict item called by " + string);
		return new ItemStack(Blocks.redstone_wire, 1, 0);
	}

	public static Block getBlock(ItemStack itemStack)
	{
	    return Block.getBlockFromItem(itemStack.getItem());
	}
}