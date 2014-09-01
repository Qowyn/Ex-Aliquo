package exaliquo.bridges.Thaumcraft;

import static exaliquo.data.ModIDs.getItem;
import net.minecraft.init.Blocks;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.SieveRegistry.register;

public class Sieving
{

	protected static void SieveThaumcraft()
	{
		register(Blocks.gravel, 0, getItem(Info.nuggets), 5, 8);
		register(Blocks.gravel, 0, getItem(Info.resources), 6, 8);
		register(Blocks.dirt, 0, getItem(Info.manabean), 0, 64);
	}
}
