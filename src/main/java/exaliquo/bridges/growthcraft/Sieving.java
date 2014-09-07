package exaliquo.bridges.growthcraft;

import static exaliquo.data.ModIDs.getItem;
import static exnihilo.registries.SieveRegistry.register;
import net.minecraft.init.Blocks;
import exaliquo.data.ENContent;
import exaliquo.data.ModIDs.Info;

public class Sieving
{

	protected static void SieveGrowth()
	{
		if (GrowthcraftBridge.isGCBamboo)
		{
			register(Blocks.leaves, 3, getItem(Info.gcbamboo), 0, 64);
		}
		if (GrowthcraftBridge.isGCBees)
		{
			register(ENContent.infestedLeaves, 0, getItem(Info.gcbee), 0, 16);
			register(ENContent.infestedLeaves, 1, getItem(Info.gcbee), 0, 16);
			register(ENContent.infestedLeaves, 2, getItem(Info.gcbee), 0, 16);
			register(ENContent.infestedLeaves, 3, getItem(Info.gcbee), 0, 16);
		}
	}
}
