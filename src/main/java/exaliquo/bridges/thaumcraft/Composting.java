package exaliquo.bridges.thaumcraft;

import static exaliquo.data.ModIDs.getItem;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.ColorRegistry.color;
import static exnihilo.registries.CompostRegistry.register;

public class Composting
{

	protected static void CompostThaumcraft()
	{
		register(getItem(Info.thaumplants), 1, 0.125F, color("silverwood"));
		register(getItem(Info.thaumplants), 2, 0.1F, color("shimmerleaf"));
		register(getItem(Info.thaumplants), 3, 0.1F, color("cinderpearl"));
		register(getItem(Info.thaumplants), 4, 0.1F, color("etherealbloom"));
		register(getItem(Info.thaumleaves), 0, 0.125F, color("greatwood"));
		register(getItem(Info.thaumleaves), 1, 0.125F, color("silverwood"));
	}
}
