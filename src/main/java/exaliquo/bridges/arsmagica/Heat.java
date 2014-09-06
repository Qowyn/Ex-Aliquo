package exaliquo.bridges.arsmagica;

import static exaliquo.data.ModIDs.getBlock;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.HeatRegistry.register;

public class Heat
{

	protected static void HeatArs()
	{
		register(getBlock(Info.vtorch), 0.1F);
	}
}
