package exaliquo.bridges.MineFactoryReloaded;

import static exaliquo.data.ModIDs.getItem;
import net.minecraft.init.Blocks;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.SieveRegistry.register;

public class Sieving
{

	protected static void SieveMFR()
	{
		register(Blocks.dirt, 0, getItem(Info.rubbersapling), 1, 8192);
	}
}
