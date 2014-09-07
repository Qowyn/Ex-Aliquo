package exaliquo.bridges.natura;

import static exaliquo.data.ModIDs.getBlock;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import exaliquo.data.ENContent;
import exaliquo.data.ModIDs.Info;

public class Recipes
{

	protected static void CraftNatura()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(getBlock(Info.nethersoil), 1, 0), Blocks.dirt, ENContent.bucketWitchwater);
		GameRegistry.addShapelessRecipe(new ItemStack(getBlock(Info.nethersand), 1, 0), Blocks.sand, getBlock(Info.thornvines), Items.blaze_powder);
	}
}
