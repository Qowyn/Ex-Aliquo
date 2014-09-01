package exaliquo.bridges.ArsMagica;

import static exaliquo.data.ModIDs.getItem;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.ColorRegistry.color;
import static exnihilo.registries.CompostRegistry.register;

public class Composting
{

	protected static void CompostingArs()
	{
		register(getItem(Info.nova), 0, 0.1F, color("nova"));
		register(getItem(Info.orchid), 0, 0.1F, color("orchid"));
		register(getItem(Info.aum), 0, 0.1F, color("white"));
		register(getItem(Info.witchwood), 0, 0.125F, color("witchwood"));
		register(getItem(Info.witchleaves), 0, 0.125F, color("witchwood"));
		register(getItem(Info.wakebloom), 0, 0.125F, color("wakebloom"));
		register(getItem(Info.tarma), 0, 0.125F, color("tarma"));
	}
}
