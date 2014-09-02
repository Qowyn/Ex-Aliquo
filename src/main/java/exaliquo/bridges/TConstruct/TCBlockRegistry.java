package exaliquo.bridges.TConstruct;

import cpw.mods.fml.common.registry.GameRegistry;
import exaliquo.blocks.AliquoOre;
import exaliquo.items.blocks.ItemBlockOre;
import net.minecraft.block.Block;

public class TCBlockRegistry
{
    
    public static Block cobaltOreBlock;
    public static Block arditeOreBlock;
    
    static void registerOreBlocks()
    {
        cobaltOreBlock = new AliquoOre().setBlockName("Cobalt");
        GameRegistry.registerBlock(cobaltOreBlock, ItemBlockOre.class, "ExAliquo.CobaltOreBlock");
        arditeOreBlock = new AliquoOre().setBlockName("Ardite");
        GameRegistry.registerBlock(arditeOreBlock, ItemBlockOre.class, "ExAliquo.ArditeOreBlock");
    }

}
