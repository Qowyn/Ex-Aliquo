package exaliquo.bridges.tconstruct;

import static exaliquo.data.ModIDs.getItem;
import exaliquo.data.Configurations;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.ColorRegistry.color;
import static exnihilo.registries.CompostRegistry.register;

public class Composting
{

	protected static void CompostTConstruct()
	{
		if (Configurations.allowTinkerBushCompost)
		{
			register(getItem(Info.oreberry), 0, 1.0F, color("ironberry"));
			register(getItem(Info.oreberry), 1, 1.0F, color("goldberry"));
			register(getItem(Info.oreberry), 2, 1.0F, color("copperberry"));
			register(getItem(Info.oreberry), 3, 1.0F, color("tinberry"));
			register(getItem(Info.oreberrybush2), 0, 1.0F, color("aluminumberry"));
			register(getItem(Info.oreberrybush2), 1, 1.0F, color("essenceberry"));
		}
		register(getItem(Info.oreberry), 5, 0.1F, color("essenceberry"));
		register(getItem(Info.hambone), 0, 1.0F, color("pork_raw"));
		register(getItem(Info.slimeleaves), 0, 0.125F, color("slime"));
		register(getItem(Info.slimesapling), 0, 0.125F, color("slime"));
	}
}
