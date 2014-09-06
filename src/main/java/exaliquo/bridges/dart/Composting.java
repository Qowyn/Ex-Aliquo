package exaliquo.bridges.dart;

import static exaliquo.data.ModIDs.getItem;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.ColorRegistry.color;
import static exnihilo.registries.CompostRegistry.register;

public class Composting
{

	protected static void CompostDart()
	{
		register(getItem(Info.dartsapling), 0, 0.125F, color("force"));
		register(getItem(Info.dartleaves), 0, 0.125F, color("force"));
	}
}
