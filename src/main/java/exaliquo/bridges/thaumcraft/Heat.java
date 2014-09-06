package exaliquo.bridges.thaumcraft;

import static exaliquo.data.ModIDs.getBlock;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.HeatRegistry.register;

public class Heat
{

	protected static void HeatThaumcraft()
	{
		register(getBlock(Info.ttorch), 1, 0.15F);
		register(getBlock(Info.candle), 0.1F);
	}
}
