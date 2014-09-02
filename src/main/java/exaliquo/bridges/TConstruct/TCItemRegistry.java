package exaliquo.bridges.TConstruct;

import cpw.mods.fml.common.registry.GameRegistry;
import exaliquo.items.AliquoItemOre;
import net.minecraft.item.Item;

public class TCItemRegistry
{
    
    public static Item cobaltOreItem;
    public static Item arditeOreItem;
    
    static void registerOreItems()
    {
        cobaltOreItem = new AliquoItemOre().setUnlocalizedName("Cobalt");
        GameRegistry.registerItem(cobaltOreItem, "ExAliquo.OreCobaltItem");
        arditeOreItem = new AliquoItemOre().setUnlocalizedName("Ardite");
        GameRegistry.registerItem(arditeOreItem, "ExAliquo.OreArditeItem");
    }

}
