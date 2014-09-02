package exaliquo.bridges.TConstruct;

import static exnihilo.registries.HammerRegistry.registerOre;

public class Hammering
{

	protected static void HammerTConstruct()
	{
		for (int i = 0; i < 2; i++)
		{
			registerOre(TCBlockRegistry.cobaltOreBlock, i, TCItemRegistry.cobaltOreItem, i+1);
			registerOre(TCBlockRegistry.arditeOreBlock, i, TCItemRegistry.arditeOreItem, i+1);
		}
	}
}
