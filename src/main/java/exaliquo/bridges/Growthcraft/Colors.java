package exaliquo.bridges.Growthcraft;

import static exnihilo.registries.ColorRegistry.register;
import exnihilo.registries.helpers.Color;

public class Colors
{

	protected static void ColorGrowth()
	{
		if (GrowthcraftBridge.isGCBamboo) register("bamboo", new Color("D0CE81"));
		if (GrowthcraftBridge.isGCGrapes) register("grape", new Color("4C2973"));
		if (GrowthcraftBridge.isGCHops) register("hops", new Color("7BC743"));
	}
}
