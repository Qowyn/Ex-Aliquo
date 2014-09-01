package exaliquo.bridges.crossmod;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import exaliquo.data.Configurations;
//import powercrystals.netherores.NetherOresCore;

public class NetherOres_Thaumcraft
{
	protected static void Whenk()
	{
			if (Configurations.whenk && Configurations.ninjaFeesh)
			{
				ThaumcraftApi.registerObjectTag(new ItemStack(Blocks.netherrack), null);
			}
			else
			{
				//AspectList rack = (AspectList)ThaumcraftApi.objectTags.get(Arrays.asList(new Integer[] { Integer.valueOf(Block.netherrack.blockID), Integer.valueOf(-1) }));
				//ThaumcraftApi.registerObjectTag(NetherOresCore.blockHellfish.blockID, 0, rack);
			}
	}
}
