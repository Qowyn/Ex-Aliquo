package exaliquo.bridges.TConstruct;

import static exaliquo.data.ModIDs.getBlock;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.HeatRegistry.register;

public class Heat
{

	protected static void HeatTConstruct()
	{
		register(getBlock(Info.storch), 0.1F);
	}
}
