package exaliquo.bridges.TConstruct;

import static exaliquo.data.ModIDs.getBlock;
import static exaliquo.data.ModIDs.getItem;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import exaliquo.data.Configurations;
import exaliquo.data.ModIDs.Info;
import exnihilo.registries.SieveRegistry;

public class Sieving
{

	private static Block soil = getBlock(Info.craftedsoil);
	
	protected static void SieveTConstruct()
	{
		if (Configurations.sieveOreBushes)
		{
			SieveRegistry.register(Blocks.stone, 0, getItem(Info.oreberrybush), 0, 256);	//Iron
			SieveRegistry.register(Blocks.stone, 0, getItem(Info.oreberrybush), 1, 256);	//Gold
			SieveRegistry.register(Blocks.stone, 0, getItem(Info.oreberrybush), 2, 256);	//Copper
			SieveRegistry.register(Blocks.stone, 0, getItem(Info.oreberrybush), 3, 256);	//Tin
			SieveRegistry.register(Blocks.stone, 0, getItem(Info.oreberrybush2), 0, 256);	//Aluminum
		}
		if (Configurations.sieveEssenceBushes)
		{
			SieveRegistry.register(Blocks.stone, 0, getItem(Info.oreberrybush2), 1, 128);
		}
		SieveRegistry.register(soil, 0, getItem(Info.tinkerfood), 0, 4);
		SieveRegistry.register(soil, 0, getItem(Info.materials), 1, 3);
		SieveRegistry.register(soil, 0, getItem(Info.materials), 17, 10);
	}
}
