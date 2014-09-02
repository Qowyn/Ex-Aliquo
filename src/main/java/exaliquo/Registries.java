package exaliquo;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import exaliquo.blocks.AliquoOre;
import exaliquo.blocks.BlockEndCake;
import exaliquo.blocks.BlockEndEye;
import exaliquo.bridges.TConstruct.TConstructBridge;
import exaliquo.data.AliquoMaterial;
import exaliquo.data.Configurations;
import exaliquo.data.CrucibleUtil;
import exaliquo.data.ExAOreTab;
import exaliquo.data.ExATab;
import exaliquo.items.AliquoHammer;
import exaliquo.items.AliquoItemOre;
import exaliquo.items.DragonEgg;
import exaliquo.items.GoldCrook;
import exaliquo.items.HayCrook;
import exaliquo.items.ReedCrook;
import exaliquo.items.blocks.ItemBlockOre;
import exnihilo.registries.HammerRegistry;
import exnihilo.registries.OreRegistry;

public class Registries
{
	public static ExATab exatab;
	public static ExAOreTab oretab;
	
	private static String[] hammershape = { " i ", " si", "s  " };
	private static String[] crookshape = { "ii", " i", " i" };
	public static String[] oreType = { "Gravel","Sand","Dust" };
	private static String[] oreshape = { "ii", "ii" };
	public static Item hammerThaum;
	public static Item hammerInvar;
	public static Item hammerCopper;
	public static Item hammerTin;
	public static Item hammerSilver;
	public static Item hammerLead;
	public static Item hammerPlatinum;
	public static Item hammerNickel;
	public static Item hammerAluminum;
	public static Item crookReed;
	public static Item crookGold;
	public static Item crookHay;
	public static Item dragonEgg;
	
	public static Block blockEndEye;
	public static Block blockEndCake;
	
	private static Map<String, Block> oreBlocks = new HashMap<String, Block>();
	private static Map<String, Item> oreItems = new HashMap<String, Item>();
	
	public static void registerItems()
	{
		hammerInvar = new AliquoHammer("invar").registerItem();
		hammerCopper = new AliquoHammer("copper").registerItem();
		hammerTin = new AliquoHammer("tin").registerItem();
		hammerSilver = new AliquoHammer("silver").registerItem();
		hammerLead = new AliquoHammer("lead").registerItem();
		hammerPlatinum = new AliquoHammer("platinum").registerItem();
		hammerNickel = new AliquoHammer("nickel").registerItem();
		hammerAluminum = new AliquoHammer("aluminum").registerItem();
		
		crookReed = new ReedCrook().setUnlocalizedName("ExAliquo.ReedCrook").setCreativeTab(exatab);
		GameRegistry.registerItem(crookReed, "ExAliquo.ReedCrook");
		crookGold = new GoldCrook().setUnlocalizedName("ExAliquo.GoldCrook").setCreativeTab(exatab);
		GameRegistry.registerItem(crookGold, "ExAliquo.GoldCrook");
		crookHay = new HayCrook().setUnlocalizedName("ExAliquo.HayCrook").setCreativeTab(exatab);
		GameRegistry.registerItem(crookHay, "ExAliquo.HayCrook");
		dragonEgg = new DragonEgg().setUnlocalizedName("ExAliquo.DragonEgg").setCreativeTab(exatab);
		GameRegistry.registerItem(dragonEgg, "ExAliquo.DragonEgg");
	}
	
	public static void registerBlocks()
	{
		blockEndEye = new BlockEndEye().setBlockName("EndEye").setCreativeTab(exatab);
		GameRegistry.registerBlock(blockEndEye, "ExAliquo.EndEye");
		blockEndCake = new BlockEndCake().setBlockName("EndCake").setCreativeTab(exatab);
		GameRegistry.registerBlock(blockEndCake, "ExAliquo.EndCake");
		
		OreDictionary.registerOre("blockEnder", blockEndEye);
	}

	public static void registerRecipes()
	{
		GameRegistry.addShapedRecipe(new ItemStack(crookReed), new Object[] { crookshape, 'i', Items.reeds });
		GameRegistry.addShapedRecipe(new ItemStack(crookGold), new Object[] { crookshape, 'i', Items.gold_ingot });
		GameRegistry.addShapedRecipe(new ItemStack(crookHay), new Object[] { "wwi", "iwi", " w ", 'w', Items.wheat, 'i', Blocks.iron_bars });
		GameRegistry.addShapedRecipe(new ItemStack(Items.potionitem, 1, 0), new Object[] { "ccc", "cbc", "ccc", 'c', Blocks.cactus, 'b', Items.glass_bottle });
		GameRegistry.addShapedRecipe(new ItemStack(blockEndEye), new Object[] { oreshape, 'i', Items.ender_pearl});
		GameRegistry.addShapedRecipe(new ItemStack(blockEndCake), new Object[] { "eee", "cnc", "eee", 'e', blockEndEye, 'c', Items.cake, 'n', new ItemStack(Items.golden_apple, 1, 1)});
	}
	
	public static void postInitHammers() {
		for (AliquoHammer hammer : AliquoHammer.registeredHammers()) {
			AliquoMaterial am = AliquoMaterial.get(hammer.material);
			
			ToolMaterial toolEnum = am.getToolEnumFromRecipe();
			if (toolEnum == null)
			{
				toolEnum = am.getFallbackToolEnum();
			}
			
			GameRegistry.addRecipe(new ShapedOreRecipe(hammer, hammershape, 's', "stickWood", 'i', hammer.getIngotName()));
			
			hammer.setToolMaterial(toolEnum);
		}
	}
	
	public static void registerSingleNihiloOre(String oreName, String ore)
	{
	    Block gravel = OreRegistry.getGravel(ore);
	    Block sand = OreRegistry.getSand(ore);
	    Block dust = OreRegistry.getDust(ore);
	    
	    if (gravel != null) 
	        OreDictionary.registerOre(oreName, new ItemStack(gravel));
	    
	    if (sand != null)
	        OreDictionary.registerOre(oreName, new ItemStack(sand));
	    
	    if (dust != null)
	        OreDictionary.registerOre(oreName, new ItemStack(dust));
	}

	public static void registerNihiloOreDict()
	{
	    registerSingleNihiloOre("oreIron", "iron");
	    registerSingleNihiloOre("oreGold", "gold");
	    registerSingleNihiloOre("oreCopper", "copper");
	    registerSingleNihiloOre("oreTin", "tin");
	    registerSingleNihiloOre("oreSilver", "silver");
	    registerSingleNihiloOre("oreLead", "lead");
	    registerSingleNihiloOre("oreNickel", "nickel");
	    registerSingleNihiloOre("orePlatinum", "platinum");
	    registerSingleNihiloOre("oreAluminum", "aluminum");
	    registerSingleNihiloOre("oreAluminium", "aluminum");
	}
	
	public static void registerModMetal(String oreName, String oreToGenerate, String fluidName, int temperature)
	{
	    Block oreBlock = new AliquoOre().setBlockName(oreToGenerate);
	    GameRegistry.registerBlock(oreBlock, ItemBlockOre.class, "ExAliquo." + oreToGenerate + "OreBlock");
	    
	    Item oreItem = new AliquoItemOre().setUnlocalizedName(oreToGenerate);
        GameRegistry.registerItem(oreItem, "ExAliquo." + oreToGenerate + "OreItem");
        
        oreBlocks.put(oreName, oreBlock);
        oreItems.put(oreName, oreItem);
        
        for (int i = 0; i < 3; i++)
        {
            GameRegistry.addShapedRecipe(new ItemStack(oreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(oreItem, 1, i)});
        }
        
        for (int i = 0; i < 2; i++)
        {
            HammerRegistry.registerOre(oreBlock, i, oreItem, i+1);
        }
        
        if (Configurations.miniSmelting)
        {
            CrucibleUtil.addCrucibleDust(oreItem, fluidName);
            CrucibleUtil.addCrucibleOre(oreBlock, fluidName);
        }
        
        if (temperature > 0 && ExAliquo.pulsar.isPulseLoaded(TConstructBridge.PULSE_ID))
        {
            TConstructBridge.addSmelteryDust(oreItem, fluidName, temperature, oreBlock);
            TConstructBridge.addSmelteryOre(oreBlock, fluidName, temperature);
        }
	}
	
	public static Block getOreBlockForOre(String oreName)
	{
	    return oreBlocks.get(oreName);
	}
	
	public static Item getOreItemForOre(String oreName)
    {
        return oreItems.get(oreName);
    }
	
	public static boolean hasOreItems()
	{
	    return oreItems.size() > 0;
	}
	
	public static Item getFirstOreItem()
	{
	    return oreItems.size() > 0 ? oreItems.values().iterator().next() : null;
	}
}
