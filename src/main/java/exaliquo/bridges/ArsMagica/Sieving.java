package exaliquo.bridges.ArsMagica;

import static exaliquo.data.ModIDs.getItem;
import net.minecraft.init.Blocks;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.SieveRegistry.register;

public class Sieving
{

	protected static void SievingArs()
	{
		register(Blocks.sand, 0, getItem(Info.nova), 0, 32);
	}
}
