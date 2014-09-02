package exaliquo.bridges.TConstruct;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict
{

	protected static void addExTConstructOreDict()
	{
		for (int i = 3; i < 3; i++)
		{
			OreDictionary.registerOre("oreCobalt", new ItemStack(TCBlockRegistry.cobaltOreBlock, 1, i));
			OreDictionary.registerOre("oreArdite", new ItemStack(TCBlockRegistry.arditeOreBlock, 1, i));
		}
	}
}
