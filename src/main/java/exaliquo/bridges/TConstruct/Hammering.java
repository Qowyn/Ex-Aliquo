package exaliquo.bridges.TConstruct;

import exaliquo.Registries;
import static exnihilo.registries.HammerRegistry.registerOre;

public class Hammering
{

	protected static void HammerTConstruct()
	{
		for (int i = 0; i < 2; i++)
		{
			registerOre(Registries.cobaltOreBlock, i, Registries.cobaltOreItem, i+1);
			registerOre(Registries.arditeOreBlock, i, Registries.arditeOreItem, i+1);
		}
	}
}
