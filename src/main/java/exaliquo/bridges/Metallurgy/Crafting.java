package exaliquo.bridges.Metallurgy;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Crafting
{
    
    private static final String[] oreshape = { "ii", "ii" };

    public static void registerOreCrafting() 
    {
        for (int i = 0; i < 3; i++) 
        {
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.adamantineOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.adamantineOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.alduoriteOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.alduoriteOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.astralsilverOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.astralsilverOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.atlarusOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.atlarusOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.carmotOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.carmotOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.ceruclaseOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.ceruclaseOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.deepironOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.deepironOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.eximiteOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.eximiteOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.ignatiusOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.ignatiusOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.infuscoliumOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.infuscoliumOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.kalendriteOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.kalendriteOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.lemuriteOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.lemuriteOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.manganeseOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.manganeseOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.meutoiteOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.meutoiteOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.midasiumOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.midasiumOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.mithrilOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.mithrilOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.orichalcumOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.orichalcumOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.oureclaseOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.oureclaseOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.prometheumOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.prometheumOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.rubraciumOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.adamantineOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.sanguiniteOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.rubraciumOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.shadowironOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.shadowironOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.vulcaniteOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.vulcaniteOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.vyroxeresOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.vyroxeresOreItem, 1, i)});
            GameRegistry.addShapedRecipe(new ItemStack(MBlockRegistry.zincOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(MItemRegistry.zincOreItem, 1, i)});
        }
    }
}
