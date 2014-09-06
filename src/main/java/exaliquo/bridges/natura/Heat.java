package exaliquo.bridges.natura;

import static exaliquo.data.ModIDs.getBlock;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.HeatRegistry.register;

public class Heat
{
	
	protected static void HeatNatura()
	{
		register(getBlock(Info.nethersand), 0.25F);
	}
}