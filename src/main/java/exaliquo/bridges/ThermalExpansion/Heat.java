package exaliquo.bridges.ThermalExpansion;

import static exaliquo.data.ModIDs.getBlock;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.HeatRegistry.register;


public class Heat
{
	public static void HeatThermalExpansion()
	{
		register(getBlock(Info.liquidpyro), 0.5F);
		register(getBlock(Info.liquidpyro), 0, 0.7F);
		register(getBlock(Info.liquidcold), 0.2F);
		register(getBlock(Info.liquidcold), 0, 0.3F);
	}
}
