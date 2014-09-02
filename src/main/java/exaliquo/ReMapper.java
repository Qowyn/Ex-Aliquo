package exaliquo;

import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.google.common.collect.ImmutableMap;

import cpw.mods.fml.common.event.FMLMissingMappingsEvent;
import cpw.mods.fml.common.event.FMLMissingMappingsEvent.MissingMapping;
import cpw.mods.fml.common.registry.GameRegistry.Type;

public class ReMapper
{
    
    private static final Map<String, String> blockMappings; 
    
    private static final Map<String, String> itemMappings;
    
    static
    {
        ImmutableMap.Builder<String, String> blockMapBuilder = new ImmutableMap.Builder<String, String>();
        
        blockMapBuilder.put("exaliquo:ExAliquo.PromethiumOreBlock", "orePrometheum");
        blockMapBuilder.put("exaliquo:ExAliquo.SanguinuteOreBlock", "oreSanguinite");
        blockMapBuilder.put("exaliquo:ExAliquo.MeuroiteOreBlock", "oreMeutoite");
        blockMapBuilder.put("exaliquo:Exaliquo.ManganeseOreBlock", "oreManganese");
        
        blockMappings = blockMapBuilder.build();
        
        ImmutableMap.Builder<String, String> itemMapBuilder = new ImmutableMap.Builder<String, String>();
        
        itemMapBuilder.put("exaliquo:ExAliquo.PromethiumOreItem", "orePrometheum");
        itemMapBuilder.put("exaliquo:ExAliquo.SanguinuteOreItem", "oreSanguinite");
        itemMapBuilder.put("exaliquo:ExAliquo.MeuroiteOreItem", "oreMeutoite");
        itemMapBuilder.put("exaliquo:Exaliquo.ManganeseOreItem", "oreManganese");
        itemMapBuilder.put("exaliquo:ExAliquo.OreAtlarusItem", "oreAtlarus");
        itemMapBuilder.put("exaliquo:ExAliquo.OreCobaltItem", "oreCobalt");
        itemMapBuilder.put("exaliquo:ExAliquo.OreAdamantineItem", "oreAdamantine");
        itemMapBuilder.put("exaliquo:ExAliquo.OreAstralSilverItem", "oreAstralSilver");
        itemMapBuilder.put("exaliquo:ExAliquo.OreAlduoriteItem", "oreAlduorite");
        itemMapBuilder.put("exaliquo:ExAliquo.OreArditeItem", "oreArdite");
        
        itemMappings = itemMapBuilder.build();
    }
    
    public static void remap(FMLMissingMappingsEvent event)
    {

        for (MissingMapping mm: event.get())
        {
            ExAliquo.logger.info("Trying to handle missing " + mm.name + " of type " + mm.type.toString());
            if (mm.type == Type.BLOCK && blockMappings.containsKey(mm.name))
            {
                Block block = Registries.getOreBlockForOre(blockMappings.get(mm.name));
                if (block != null)
                {
                    mm.remap(block);
                    ExAliquo.logger.info("Remapped " + mm.name + "!");
                }
            } 
            else if (mm.type == Type.ITEM && blockMappings.containsKey(mm.name))
            {
                Item item = Item.getItemFromBlock(Registries.getOreBlockForOre(blockMappings.get(mm.name)));
                
                if (item != null)
                {
                    mm.remap(item);
                    ExAliquo.logger.info("Remapped " + mm.name + "!");
                }
            }
            else if (mm.type == Type.ITEM && itemMappings.containsKey(mm.name))
            {
                Item item = Registries.getOreItemForOre(itemMappings.get(mm.name));
                
                if (item != null)
                {
                    mm.remap(item);
                    ExAliquo.logger.info("Remapped " + mm.name + "!");
                }
            }
        }
    }

}
