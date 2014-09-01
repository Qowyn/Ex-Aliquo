package exaliquo.bridges.Growthcraft;

import static exaliquo.data.ModIDs.getItem;
import static exnihilo.registries.ColorRegistry.color;
import static exnihilo.registries.CompostRegistry.register;
import net.minecraft.init.Items;
import exaliquo.data.ModIDs.Info;

public class Composting
{

	protected static void CompostGrowth()
	{
		if (GrowthcraftBridge.isGCApples)
		{
			register(getItem(Info.gcapple), 0, 0.03125F, color("apple"));
			register(Items.apple, 0, 0.03125F, color("apple"));
			register(getItem(Info.gcsappling), 0, 0.03125F, color("oak"));
		}
		if (GrowthcraftBridge.isGCBamboo)
		{
			register(getItem(Info.gcbamboo), 0, 0.125F, color("bamboo"));
			register(getItem(Info.gcleaves), 0, 0.125F, color("bamboo"));
		}
		if (GrowthcraftBridge.isGCGrapes)
		{
			register(getItem(Info.gcgrape), 0, 0.125F, color("grape"));
			register(getItem(Info.gcgrapeseed), 0, 0.125F, color("grape"));
		}
		if (GrowthcraftBridge.isGCHops)
		{
			register(getItem(Info.gchops), 0, 0.125F, color("hops"));
			register(getItem(Info.gchopseed), 0, 0.125F, color("hops"));
		}
		if (GrowthcraftBridge.isGCRice)
		{
			register(getItem(Info.gcrice), 0, 0.125F, color("white"));
			register(getItem(Info.gcriceball), 0, 0.125F, color("white"));
		}
	}
}
