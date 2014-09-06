package exaliquo.bridges.mfr;

import static exaliquo.data.ModIDs.getItem;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.ColorRegistry.color;
import static exnihilo.registries.CompostRegistry.register;

public class Composting
{

	protected static void CompostMFR()
	{
		register(getItem(Info.rubberleaves), 0, 0.125F, color("rubberwood"));
		register(getItem(Info.rubbersapling), 0, 0.125F, color("rubberwood"));
		register(getItem(Info.rubbersapling), 1, 0.125F, color("rubberwood"));
	}
}
