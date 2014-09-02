package exaliquo.bridges.TConstruct;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Crafting
{
    
    private static final String[] oreshape = { "ii", "ii" };
    
    static void registerOreCrafting()
    {
        for (int i = 0; i < 3; i++)
        {
            GameRegistry.addShapedRecipe(new ItemStack(TCBlockRegistry.cobaltOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(TCItemRegistry.cobaltOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(TCBlockRegistry.arditeOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(TCItemRegistry.arditeOreItem, 1, i)});
        }
    }
}
