package exaliquo;

import static exaliquo.data.ModIDs.getBlock;
import static exaliquo.data.ModIDs.getItemStack;

import org.lwjgl.opengl.Display;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;
import exaliquo.blocks.*;
import exaliquo.bridges.TConstruct.SkyModifiers;
import exaliquo.bridges.TConstruct.Modifiers.ModCrooked;
import exaliquo.bridges.TConstruct.Modifiers.ModHammered;
import exaliquo.data.AliquoMaterial;
import exaliquo.data.Configurations;
import exaliquo.data.ExAOreTab;
import exaliquo.data.ExATab;
import exaliquo.data.OreDict;
import static exaliquo.data.ModIDs.getItem;
import exaliquo.data.ModIDs.Info;
import exaliquo.items.AliquoHammer;
import exaliquo.items.AliquoItemOre;
import exaliquo.items.DragonEgg;
import exaliquo.items.GoldCrook;
import exaliquo.items.HayCrook;
import exaliquo.items.ReedCrook;
import exaliquo.items.ThaumiumHammer;
import exaliquo.items.blocks.ItemBlockOre;
import exaliquo.data.ModsLoaded;

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
	
	public static Block cobaltOreBlock;
	public static Block arditeOreBlock;
	public static Block adamantineOreBlock;
	public static Block alduoriteOreBlock;
	public static Block astralsilverOreBlock;
	public static Block atlarusOreBlock;
	public static Block carmotOreBlock;
	public static Block ceruclaseOreBlock;
	public static Block deepironOreBlock;
	public static Block eximiteOreBlock;
	public static Block ignatiusOreBlock;
	public static Block infuscoliumOreBlock;
	public static Block kalendriteOreBlock;
	public static Block lemuriteOreBlock;
	public static Block manganeseOreBlock;
	public static Block meutoiteOreBlock;
	public static Block midasiumOreBlock;
	public static Block mithrilOreBlock;
	public static Block orichalcumOreBlock;
	public static Block oureclaseOreBlock;
	public static Block prometheumOreBlock;
	public static Block rubraciumOreBlock;
	public static Block sanguiniteOreBlock;
	public static Block shadowironOreBlock;
	public static Block vulcaniteOreBlock;
	public static Block vyroxeresOreBlock;
	public static Block zincOreBlock;
	
	public static Item cobaltOreItem;
	public static Item arditeOreItem;
	public static Item adamantineOreItem;
	public static Item alduoriteOreItem;
	public static Item astralsilverOreItem;
	public static Item atlarusOreItem;
	public static Item carmotOreItem;
	public static Item ceruclaseOreItem;
	public static Item deepironOreItem;
	public static Item eximiteOreItem;
	public static Item ignatiusOreItem;
	public static Item infuscoliumOreItem;
	public static Item kalendriteOreItem;
	public static Item lemuriteOreItem;
	public static Item manganeseOreItem;
	public static Item meutoiteOreItem;
	public static Item midasiumOreItem;
	public static Item mithrilOreItem;
	public static Item orichalcumOreItem;
	public static Item oureclaseOreItem;
	public static Item prometheumOreItem;
	public static Item rubraciumOreItem;
	public static Item sanguiniteOreItem;
	public static Item shadowironOreItem;
	public static Item vulcaniteOreItem;
	public static Item vyroxeresOreItem;
	public static Item zincOreItem;
	
	public static void registerItems()
	{
		if (ModsLoaded.isThaumcraftLoaded)
		{
			hammerThaum = new ThaumiumHammer().setUnlocalizedName("ExAliquo.ThaumHammer").registerItem().setCreativeTab(exatab);
		}
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
		
		registerOreItems();
	}
	
	public static void registerBlocks()
	{
		blockEndEye = new BlockEndEye().setBlockName("EndEye").setCreativeTab(exatab);
		GameRegistry.registerBlock(blockEndEye, "ExAliquo.EndEye");
		blockEndCake = new BlockEndCake().setBlockName("EndCake").setCreativeTab(exatab);
		GameRegistry.registerBlock(blockEndCake, "ExAliquo.EndCake");
		
		OreDictionary.registerOre("blockEnder", blockEndEye);
		
		registerOres();
	}
	
	static void registerOres()
	{
		cobaltOreBlock = new AliquoOre().setBlockName("Cobalt");
		GameRegistry.registerBlock(cobaltOreBlock, ItemBlockOre.class, "ExAliquo.CobaltOreBlock");
		arditeOreBlock = new AliquoOre().setBlockName("Ardite");
		GameRegistry.registerBlock(arditeOreBlock, ItemBlockOre.class, "ExAliquo.ArditeOreBlock");
		
		adamantineOreBlock = new AliquoOre().setBlockName("Adamantine");
		GameRegistry.registerBlock(adamantineOreBlock, ItemBlockOre.class, "ExAliquo.AdamantineOreBlock");
		alduoriteOreBlock = new AliquoOre().setBlockName("Alduorite");
		GameRegistry.registerBlock(alduoriteOreBlock, ItemBlockOre.class, "ExAliquo.AlduoriteOreBlock");
		astralsilverOreBlock = new AliquoOre().setBlockName("AstralSilver");
		GameRegistry.registerBlock(astralsilverOreBlock, ItemBlockOre.class, "ExAliquo.AstralSilverOreBlock");
		atlarusOreBlock = new AliquoOre().setBlockName("Atlarus");
		GameRegistry.registerBlock(atlarusOreBlock, ItemBlockOre.class, "ExAliquo.AtlarusOreBlock");
		carmotOreBlock = new AliquoOre().setBlockName("Carmot");
		GameRegistry.registerBlock(carmotOreBlock, ItemBlockOre.class, "ExAliquo.CarmotOreBlock");
		ceruclaseOreBlock = new AliquoOre().setBlockName("Ceruclase");
		GameRegistry.registerBlock(ceruclaseOreBlock, ItemBlockOre.class, "ExAliquo.CeruclaseOreBlock");
		deepironOreBlock = new AliquoOre().setBlockName("DeepIron");
		GameRegistry.registerBlock(deepironOreBlock, ItemBlockOre.class, "ExAliquo.DeepIronOreBlock");
		eximiteOreBlock = new AliquoOre().setBlockName("Eximite");
		GameRegistry.registerBlock(eximiteOreBlock, ItemBlockOre.class, "ExAliquo.EximiteOreBlock");
		ignatiusOreBlock = new AliquoOre().setBlockName("Ignatius");
		GameRegistry.registerBlock(ignatiusOreBlock, ItemBlockOre.class, "ExAliquo.IgnatiusOreBlock");
		infuscoliumOreBlock = new AliquoOre().setBlockName("Infuscolium");
		GameRegistry.registerBlock(infuscoliumOreBlock, ItemBlockOre.class, "ExAliquo.InfuscoliumOreBlock");
		kalendriteOreBlock = new AliquoOre().setBlockName("Kalendrite");
		GameRegistry.registerBlock(kalendriteOreBlock, ItemBlockOre.class, "ExAliquo.KalendriteOreBlock");
		lemuriteOreBlock = new AliquoOre().setBlockName("Lemurite");
		GameRegistry.registerBlock(lemuriteOreBlock, ItemBlockOre.class, "ExAliquo.LemuriteOreBlock");
		manganeseOreBlock = new AliquoOre().setBlockName("Manganese");
		GameRegistry.registerBlock(manganeseOreBlock, ItemBlockOre.class, "Exaliquo.ManganeseOreBlock");
		meutoiteOreBlock = new AliquoOre().setBlockName("Meutoite");
		GameRegistry.registerBlock(meutoiteOreBlock, ItemBlockOre.class, "ExAliquo.MeuroiteOreBlock");
		midasiumOreBlock = new AliquoOre().setBlockName("Midasium");
		GameRegistry.registerBlock(midasiumOreBlock, ItemBlockOre.class, "ExAliquo.MidasiumOreBlock");
		mithrilOreBlock = new AliquoOre().setBlockName("Mithril");
		GameRegistry.registerBlock(mithrilOreBlock, ItemBlockOre.class, "ExAliquo.MithrilOreBlock");
		orichalcumOreBlock = new AliquoOre().setBlockName("Orichalcum");
		GameRegistry.registerBlock(orichalcumOreBlock, ItemBlockOre.class, "ExAliquo.OrichalcumOreBlock");
		oureclaseOreBlock = new AliquoOre().setBlockName("Oureclase");
		GameRegistry.registerBlock(oureclaseOreBlock, ItemBlockOre.class, "ExAliquo.OureclaseOreBlock");
		prometheumOreBlock = new AliquoOre().setBlockName("Prometheum");
		GameRegistry.registerBlock(prometheumOreBlock, ItemBlockOre.class, "ExAliquo.PromethiumOreBlock");
		rubraciumOreBlock = new AliquoOre().setBlockName("Rubracium");
		GameRegistry.registerBlock(rubraciumOreBlock, ItemBlockOre.class, "ExAliquo.RubraciumOreBlock");
		sanguiniteOreBlock = new AliquoOre().setBlockName("Sanguinite");
		GameRegistry.registerBlock(sanguiniteOreBlock, ItemBlockOre.class, "ExAliquo.SanguinuteOreBlock");
		shadowironOreBlock = new AliquoOre().setBlockName("ShadowIron");
		GameRegistry.registerBlock(shadowironOreBlock, ItemBlockOre.class, "ExAliquo.ShadowIronOreBlock");
		vulcaniteOreBlock = new AliquoOre().setBlockName("Vulcanite");
		GameRegistry.registerBlock(vulcaniteOreBlock, ItemBlockOre.class, "ExAliquo.VulcaniteOreBlock");
		vyroxeresOreBlock = new AliquoOre().setBlockName("Vyroxeres");
		GameRegistry.registerBlock(vyroxeresOreBlock, ItemBlockOre.class, "ExAliquo.VyroxeresOreBlock");
		zincOreBlock = new AliquoOre().setBlockName("Zinc");
		GameRegistry.registerBlock(zincOreBlock, ItemBlockOre.class, "ExAliquo.ZincOreBlock");
	}
	
	static void registerOreItems()
	{
		cobaltOreItem = new AliquoItemOre().setUnlocalizedName("Cobalt");
		GameRegistry.registerItem(cobaltOreItem, "ExAliquo.OreCobaltItem");
		arditeOreItem = new AliquoItemOre().setUnlocalizedName("Ardite");
		GameRegistry.registerItem(arditeOreItem, "ExAliquo.OreArditeItem");
		
		adamantineOreItem = new AliquoItemOre().setUnlocalizedName("Adamantine");
		GameRegistry.registerItem(adamantineOreItem, "ExAliquo.OreAdamantineItem");
		alduoriteOreItem = new AliquoItemOre().setUnlocalizedName("Alduorite");
		GameRegistry.registerItem(alduoriteOreItem, "ExAliquo.OreAlduoriteItem");
		astralsilverOreItem = new AliquoItemOre().setUnlocalizedName("AstralSilver");
		GameRegistry.registerItem(astralsilverOreItem, "ExAliquo.OreAstralSilverItem");
		atlarusOreItem = new AliquoItemOre().setUnlocalizedName("Atlarus");
		GameRegistry.registerItem(atlarusOreItem, "ExAliquo.OreAtlarusItem");
		carmotOreItem = new AliquoItemOre().setUnlocalizedName("Carmot");
		GameRegistry.registerItem(carmotOreItem, "ExAliquo.CarmotOreItem");
		ceruclaseOreItem = new AliquoItemOre().setUnlocalizedName("Ceruclase");
		GameRegistry.registerItem(ceruclaseOreItem, "ExAliquo.CeruclaseOreItem");
		deepironOreItem = new AliquoItemOre().setUnlocalizedName("DeepIron");
		GameRegistry.registerItem(deepironOreItem, "ExAliquo.DeepIronOreItem");
		eximiteOreItem = new AliquoItemOre().setUnlocalizedName("Eximite");
		GameRegistry.registerItem(eximiteOreItem, "ExAliquo.EximiteOreItem");
		ignatiusOreItem = new AliquoItemOre().setUnlocalizedName("Ignatius");
		GameRegistry.registerItem(ignatiusOreItem, "ExAliquo.IgnatiusOreItem");
		infuscoliumOreItem = new AliquoItemOre().setUnlocalizedName("Infuscolium");
		GameRegistry.registerItem(infuscoliumOreItem, "ExAliquo.InfuscoliumOreItem");
		kalendriteOreItem = new AliquoItemOre().setUnlocalizedName("Kalendrite");
		GameRegistry.registerItem(kalendriteOreItem, "ExAliquo.KalendriteOreItem");
		lemuriteOreItem = new AliquoItemOre().setUnlocalizedName("Lemurite");
		GameRegistry.registerItem(lemuriteOreItem, "ExAliquo.LemuriteOreItem");
		manganeseOreItem = new AliquoItemOre().setUnlocalizedName("Manganese");
		GameRegistry.registerItem(manganeseOreItem, "Exaliquo.ManganeseOreItem");
		meutoiteOreItem = new AliquoItemOre().setUnlocalizedName("Meuroite");
		GameRegistry.registerItem(meutoiteOreItem, "ExAliquo.MeuroiteOreItem");
		midasiumOreItem = new AliquoItemOre().setUnlocalizedName("Midasium");
		GameRegistry.registerItem(midasiumOreItem, "ExAliquo.MidasiumOreItem");
		mithrilOreItem = new AliquoItemOre().setUnlocalizedName("Mithril");
		GameRegistry.registerItem(mithrilOreItem, "ExAliquo.MithrilOreItem");
		orichalcumOreItem = new AliquoItemOre().setUnlocalizedName("Orichalcum");
		GameRegistry.registerItem(orichalcumOreItem, "ExAliquo.OrichalcumOreItem");
		oureclaseOreItem = new AliquoItemOre().setUnlocalizedName("Oureclase");
		GameRegistry.registerItem(oureclaseOreItem, "ExAliquo.OureclaseOreItem");
		prometheumOreItem = new AliquoItemOre().setUnlocalizedName("Prometheum");
		GameRegistry.registerItem(prometheumOreItem, "ExAliquo.PromethiumOreItem");
		rubraciumOreItem = new AliquoItemOre().setUnlocalizedName("Rubracium");
		GameRegistry.registerItem(rubraciumOreItem, "ExAliquo.RubraciumOreItem");
		sanguiniteOreItem = new AliquoItemOre().setUnlocalizedName("Sanguinite");
		GameRegistry.registerItem(sanguiniteOreItem, "ExAliquo.SanguinuteOreItem");
		shadowironOreItem = new AliquoItemOre().setUnlocalizedName("ShadowIron");
		GameRegistry.registerItem(shadowironOreItem, "ExAliquo.ShadowIronOreItem");
		vulcaniteOreItem = new AliquoItemOre().setUnlocalizedName("Vulcanite");
		GameRegistry.registerItem(vulcaniteOreItem, "ExAliquo.VulcaniteOreItem");
		vyroxeresOreItem = new AliquoItemOre().setUnlocalizedName("Vyroxeres");
		GameRegistry.registerItem(vyroxeresOreItem, "ExAliquo.VyroxeresOreItem");
		zincOreItem = new AliquoItemOre().setUnlocalizedName("Zinc");
		GameRegistry.registerItem(zincOreItem, "ExAliquo.ZincOreItem");
	}

	public static void registerRecipes()
	{
		GameRegistry.addShapedRecipe(new ItemStack(crookReed), new Object[] { crookshape, 'i', Items.reeds });
		GameRegistry.addShapedRecipe(new ItemStack(crookGold), new Object[] { crookshape, 'i', Items.gold_ingot });
		GameRegistry.addShapedRecipe(new ItemStack(crookHay), new Object[] { "wwi", "iwi", " w ", 'w', Items.wheat, 'i', Blocks.iron_bars });
		GameRegistry.addShapedRecipe(new ItemStack(Items.potionitem, 1, 0), new Object[] { "ccc", "cbc", "ccc", 'c', Blocks.cactus, 'b', Items.glass_bottle });
		GameRegistry.addShapedRecipe(new ItemStack(blockEndEye), new Object[] { oreshape, 'i', Items.ender_pearl});
		GameRegistry.addShapedRecipe(new ItemStack(blockEndCake), new Object[] { "eee", "cnc", "eee", 'e', blockEndEye, 'c', Items.cake, 'n', new ItemStack(Items.golden_apple, 1, 1)});
		
		registerOreCrafting();
	}
	
	static void registerOreCrafting()
	{
		for (int i = 0; i < 3; i++)
		{
			GameRegistry.addShapedRecipe(new ItemStack(cobaltOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(cobaltOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(arditeOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(arditeOreItem, 1, i)});
			
			GameRegistry.addShapedRecipe(new ItemStack(adamantineOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(adamantineOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(alduoriteOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(alduoriteOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(astralsilverOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(astralsilverOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(atlarusOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(atlarusOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(carmotOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(carmotOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(ceruclaseOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(ceruclaseOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(deepironOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(deepironOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(eximiteOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(eximiteOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(ignatiusOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(ignatiusOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(infuscoliumOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(infuscoliumOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(kalendriteOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(kalendriteOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(lemuriteOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(lemuriteOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(manganeseOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(manganeseOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(meutoiteOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(meutoiteOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(midasiumOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(midasiumOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(mithrilOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(mithrilOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(orichalcumOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(orichalcumOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(oureclaseOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(oureclaseOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(prometheumOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(prometheumOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(rubraciumOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(adamantineOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(sanguiniteOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(rubraciumOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(shadowironOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(shadowironOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(vulcaniteOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(vulcaniteOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(vyroxeresOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(vyroxeresOreItem, 1, i)});
			GameRegistry.addShapedRecipe(new ItemStack(zincOreBlock, 1, i), new Object[] { oreshape, 'i', new ItemStack(zincOreItem, 1, i)});
		}
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

	public static void registerNihiloOreDict()
	{
		for (int i = 0; i < 3; i++)
		{
			OreDictionary.registerOre("oreIron", getItemStack(Info.ironore, i));
			OreDictionary.registerOre("oreGold", getItemStack(Info.goldore, i));
			OreDictionary.registerOre("oreCopper", getItemStack(Info.copperore, i));
			OreDictionary.registerOre("oreTin", getItemStack(Info.tinore, i));
			OreDictionary.registerOre("oreSilver", getItemStack(Info.silverore, i));
			OreDictionary.registerOre("oreLead", getItemStack(Info.leadore, i));
			OreDictionary.registerOre("oreNickel", getItemStack(Info.nickelore, i));
			OreDictionary.registerOre("orePlatinum", getItemStack(Info.platinumore, i));
			OreDictionary.registerOre("oreAluminum", getItemStack(Info.aluminumore, i));
			OreDictionary.registerOre("oreAluminium", getItemStack(Info.aluminumore, i));
		}
	}
}
