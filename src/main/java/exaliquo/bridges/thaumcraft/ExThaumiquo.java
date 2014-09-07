package exaliquo.bridges.thaumcraft;

import static exaliquo.data.ModIDs.getBlock;
import static exaliquo.data.ModIDs.getItem;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.ShapedOreRecipe;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.IArcaneRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.api.crafting.ShapedArcaneRecipe;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchCategoryList;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import cpw.mods.fml.common.registry.GameRegistry;
import exaliquo.ExAliquo;
import exaliquo.Registries;
import exaliquo.data.Configurations;
import exaliquo.data.ENContent;
import exaliquo.data.ModIDs.Info;
import exnihilo.registries.OreRegistry;

public class ExThaumiquo
{
	
	protected static void initThaumiquo()
	{
		addWorkbenchRecipes();
		addCrucibleRecipes();
		addArcaneRecipes();
		addInfusionRecipes();
		addAspectsToNihilo();
		addPages();
		addResearch();
		if (Configurations.harderWands)
		{
			changePrimalWands();
		}
	}
	
	static Object findRecipe(String key) {
	    return null;
	}
	
	static void addResearch()
	{
		new ExAResearchItem("SKYCHEMY",
				"SKYCHEMY",
				new AspectList(),
				0,
				0,
				0,
				new ItemStack(Blocks.cobblestone, 1, 0)).setPages(new ResearchPage[] {		
				new ResearchPage("exa.page.SKYCHEMY.1"), new ResearchPage("exa.page.SKYCHEMY.2"), new ResearchPage("exa.page.SKYCHEMY." + (Configurations.alternatewater ? 3 : 4))
				}).setStub().setRound().setAutoUnlock().registerResearchItem();
		
		if (Configurations.runichax)
		{
			new ExAResearchItem("SKYMATRIX",
					"SKYCHEMY",
					new AspectList().add(Aspect.EARTH,1),
					3,
					4,
					0,
					new ItemStack(getBlock(Info.devices), 1, 2)).setPages(new ResearchPage[] {
							new ResearchPage("exa.page.SKYMATRIX.1"), new ResearchPage((IArcaneRecipe)findRecipe("SkyMatrix"))
					}).setConcealed().setParentsHidden("INFUSION").setStub().registerResearchItem();
			
			new ExAResearchItem("GREATWOOD",
					"SKYCHEMY",
					new AspectList().add(Aspect.TREE, 10).add(Aspect.PLANT, 20).add(Aspect.MAGIC, 10),
					0,
					-3,
					3,
					new ItemStack(getBlock(Info.thaumplants), 1, 0)).setPages(new ResearchPage[] {
							new ResearchPage("exa.page.GREATWOOD.1"), new ResearchPage((InfusionRecipe)findRecipe("Greatwood1")), new ResearchPage((InfusionRecipe)findRecipe("Greatwood2"))
					}).setParentsHidden("SKYCHEMY", "INFUSION").registerResearchItem();
		}
		else
		{
			new ExAResearchItem("GREATWOOD",
					"SKYCHEMY",
					new AspectList().add(Aspect.TREE, 10).add(Aspect.PLANT, 20).add(Aspect.MAGIC, 10),
					0,
					-3,
					3,
					new ItemStack(getBlock(Info.thaumplants), 1, 0)).setPages(new ResearchPage[] {
							new ResearchPage("exa.page.GREATWOOD.1"), new ResearchPage((IArcaneRecipe)findRecipe("Greatwood1")), new ResearchPage((IArcaneRecipe)findRecipe("Greatwood2"))
					}).setParentsHidden("SKYCHEMY", "INFUSION").registerResearchItem();
		}
		
		if (Configurations.silverwoodSwitch == 0)
		{
			new ExAResearchItem("SILVERWOOD1",
					"SKYCHEMY",
					new AspectList().add(Aspect.MAGIC, 20).add(Aspect.TREE, 20).add(Aspect.ORDER, 20).add(Aspect.VOID, 20),
					0,
					3,
					3,
					new ItemStack(getBlock(Info.thaumplants), 1, 1)).setPages(new ResearchPage[] {
							new ResearchPage("exa.page.SILVERWOOD.1"), new ResearchPage("exa.page.SILVERWOOD.2"), new ResearchPage((InfusionRecipe)findRecipe("Silverwood"))
					}).setConcealed().setSpecial().setParentsHidden(new String[] { "INFUSION", "SHIMMERLEAF", "NODEJAR" }).registerResearchItem();
		}
		else if (Configurations.silverwoodSwitch >= 1)
		{
			new ExAResearchItem("SILVERWOOD2",
					"SKYCHEMY",
					new AspectList().add(Aspect.MAGIC, 20).add(Aspect.TREE, 20).add(Aspect.ORDER, 20).add(Aspect.VOID, 20),
					0,
					3,
					0,
					new ItemStack(getBlock(Info.thaumplants), 1, 1)).setPages(new ResearchPage[] {
							new ResearchPage("exa.page.SILVERWOOD.1"), new ResearchPage("exa.page.SILVERWOOD.2"), new ResearchPage((InfusionRecipe)findRecipe("Silverwood"))
					}).setConcealed().setSpecial().setParentsHidden(new String[] { "INFUSION", "ETHEREALBLOOM", "NODEJAR" }).registerResearchItem();
		}
		
		new ExAResearchItem("SHIMMERLEAF",
				"SKYCHEMY",
				new AspectList().add(Aspect.PLANT, 6).add(Aspect.EXCHANGE, 6).add(Aspect.MAGIC, 6). add(Aspect.POISON, 6),
				-3,
				0,
				1,
				new ItemStack(getBlock(Info.thaumplants), 1, 2)).setPages(new ResearchPage[] {
						new ResearchPage("exa.page.SHIMMERLEAF.1"), new ResearchPage((CrucibleRecipe)findRecipe("Shimmerleaf"))	
				}).setParentsHidden("SKYCHEMY").registerResearchItem();
		
		new ExAResearchItem("CINDERPEARL",
				"SKYCHEMY",
				new AspectList().add(Aspect.FIRE, 6).add(Aspect.MAGIC, 6).add(Aspect.PLANT, 6),
				3,
				0,
				1,
				new ItemStack(getBlock(Info.thaumplants), 1, 3)).setPages(new ResearchPage[] {
						new ResearchPage("exa.page.CINDERPEARL.1"), new ResearchPage((CrucibleRecipe)findRecipe("Cinderpearl"))
				}).setParentsHidden("SKYCHEMY").registerResearchItem();
		
		new ExAResearchItem("THAUMHAMMER",
				"SKYCHEMY",
				new AspectList().add(Aspect.EARTH,1),
				-3,
				3,
				0,
				new ItemStack(Registries.hammerThaum)).setPages(new ResearchPage[] {
						new ResearchPage("exa.page.THAUMHAMMER.1"), new ResearchPage((IRecipe)findRecipe("ThaumiumHammer"))
				}).setConcealed().setParentsHidden("THAUMIUM").setStub().registerResearchItem();
		
		new ExAResearchItem("SKYFILTER",
				"SKYCHEMY",
				new AspectList().add(Aspect.EARTH,1),
				3,
				3,
				0,
				new ItemStack(getItem(Info.resources), 1, 8)).setPages(new ResearchPage[] {
						new ResearchPage("exa.page.SKYFILTER.1"), new ResearchPage((IArcaneRecipe)findRecipe("Skyfilter"))
				}).setConcealed().setParentsHidden("DISTILESSENTIA").setStub().registerResearchItem();
		
		new ExAResearchItem("OBSIDIANTOTEM",
				"SKYCHEMY",
				new AspectList().add(Aspect.ELDRITCH, 3).add(Aspect.EARTH, 8).add(Aspect.DARKNESS, 3),
				2,
				4,
				1,
				new ItemStack(getBlock(Info.cosmetics), 1, 0)).setPages(new ResearchPage[] {
						new ResearchPage("exa.page.OBSIDIANTOTEM.1"), new ResearchPage((IArcaneRecipe)findRecipe("ObsidianTotem"))
				}).setSecondary().registerResearchItem();
	}
	
	static void addInfusionRecipes()
	{
		if (Configurations.runichax)
		{
			ThaumcraftApi.addInfusionCraftingRecipe("GREATWOOD",
					new ItemStack(getBlock(Info.thaumplants), 1, 0),
					10,
					new AspectList().add(Aspect.TREE, 128).add(Aspect.AIR, 64).add(Aspect.EARTH, 64).add(Aspect.FIRE, 64).add(Aspect.WATER, 64).add(Aspect.ORDER, 64).add(Aspect.ENTROPY, 64),
					new ItemStack(Blocks.sapling, 1, 3),
					new ItemStack[] {
					new ItemStack(ENContent.bucketWitchwater), new ItemStack(ENContent.bucketWitchwater), new ItemStack(getBlock(Info.thaumplants), 1, 2), 
					new ItemStack(ENContent.bucketWitchwater), new ItemStack(ENContent.bucketWitchwater), new ItemStack(ENContent.bucketWitchwater),
					new ItemStack(getBlock(Info.thaumplants), 1, 3), new ItemStack(ENContent.bucketWitchwater)
			});
			
			ThaumcraftApi.addInfusionCraftingRecipe("GREATWOOD",
					new ItemStack(getBlock(Info.thaumplants), 1, 0),
					10,
					new AspectList().add(Aspect.TREE, 128).add(Aspect.AIR, 64).add(Aspect.EARTH, 64).add(Aspect.FIRE, 64).add(Aspect.WATER, 64).add(Aspect.ORDER, 64).add(Aspect.ENTROPY, 64),
					new ItemStack(Blocks.sapling, 1, 3),
					new ItemStack[] {
					new ItemStack(ENContent.bucketWitchwater), new ItemStack(ENContent.bucketWitchwater), new ItemStack(getBlock(Info.thaumplants), 1, 3), 
					new ItemStack(ENContent.bucketWitchwater), new ItemStack(ENContent.bucketWitchwater), new ItemStack(ENContent.bucketWitchwater), 
					new ItemStack(getBlock(Info.thaumplants), 1, 2), new ItemStack(ENContent.bucketWitchwater)
			});
		}

		if (Configurations.silverwoodSwitch == 0)
		{
			ThaumcraftApi.addInfusionCraftingRecipe("SILVERWOOD1",
					new ItemStack(getBlock(Info.thaumplants), 1, 1),
					15,
					new AspectList().add(Aspect.EXCHANGE, 96).add(Aspect.MAGIC, 96).add(Aspect.CRYSTAL, 96).add(Aspect.TREE, 192),
					new ItemStack(getItem(Info.nodejar), 1, 0),
					new ItemStack[] { 
						new ItemStack(Items.nether_star, 1, 0), new ItemStack(getBlock(Info.thaumplants), 1, 2), new ItemStack(Blocks.diamond_block, 1, 0),
						new ItemStack(getBlock(Info.thaumplants), 1, 2), new ItemStack(Items.nether_star, 1, 0), new ItemStack(getBlock(Info.thaumplants), 1, 2),
						new ItemStack(Blocks.diamond_block, 1, 0), new ItemStack(getBlock(Info.thaumplants), 1, 2)
			});
		}
		else if (Configurations.silverwoodSwitch >= 1)
		{
			ThaumcraftApi.addInfusionCraftingRecipe("SILVERWOOD2",
					new ItemStack(getBlock(Info.thaumplants), 1, 1),
					12,
					new AspectList().add(Aspect.EXCHANGE, 64).add(Aspect.MAGIC, 64).add(Aspect.CRYSTAL, 64).add(Aspect.TREE, 128),
					new ItemStack(getItem(Info.nodejar), 1, 0),
					new ItemStack[] { 
						new ItemStack(Items.nether_star, 1, 0), new ItemStack(getBlock(Info.thaumplants), 1, 4), new ItemStack(Blocks.diamond_block, 1, 0),
						new ItemStack(getBlock(Info.thaumplants), 1, 4), new ItemStack(Items.nether_star, 1, 0), new ItemStack(getBlock(Info.thaumplants), 1, 4),
						new ItemStack(Blocks.diamond_block, 1, 0), new ItemStack(getBlock(Info.thaumplants), 1, 4)
			});
		}
	}

	static void addCrucibleRecipes()
	{
		ThaumcraftApi.addCrucibleRecipe("SHIMMERLEAF", new ItemStack(getBlock(Info.thaumplants), 1, 2), new ItemStack(Blocks.red_flower, 1, 0), new AspectList().add(Aspect.MAGIC, 4).add(Aspect.EXCHANGE, 4).add(Aspect.PLANT, 4).add(Aspect.POISON, 4));
		ThaumcraftApi.addCrucibleRecipe("CINDERPEARL", new ItemStack(getBlock(Info.thaumplants), 1, 3), new ItemStack(Blocks.yellow_flower, 1, 0), new AspectList().add(Aspect.MAGIC, 4).add(Aspect.EXCHANGE, 4). add(Aspect.PLANT, 4).add(Aspect.FIRE, 4));
	}
	
	static void addArcaneRecipes()
	{
	    ThaumcraftApi.addArcaneCraftingRecipe("SKYFILTER", new ItemStack(getItem(Info.resources), 1, 8), new AspectList().add(Aspect.ORDER, 5).add(Aspect.WATER, 5), new Object[] { "mmm", "imi", "mmm", 'i', Items.gold_ingot, 'm', new ItemStack(ENContent.mesh) });
	    if (Configurations.runichax)
	    {
	    	ThaumcraftApi.addArcaneCraftingRecipe("SKYMATRIX", new ItemStack(getBlock(Info.devices), 1, 2), new AspectList().add(Aspect.AIR, 10).add(Aspect.EARTH, 10).add(Aspect.FIRE, 10).add(Aspect.WATER, 10).add(Aspect.ORDER, 10).add(Aspect.ENTROPY, 10), new Object[] { "bcb", "cec", "bcb", 'b', new ItemStack(getBlock(Info.cosmetics), 1, 6), 'c', new ItemStack(getBlock(Info.cluster), 1, 6), 'e', Items.ender_pearl });
	    }
	    else
	    {
	    	ThaumcraftApi.addArcaneCraftingRecipe("GREATWOOD", new ItemStack(getBlock(Info.thaumplants), 1, 0), new AspectList().add(Aspect.AIR, 25).add(Aspect.EARTH, 25).add(Aspect.FIRE, 25).add(Aspect.WATER, 25).add(Aspect.ORDER, 25).add(Aspect.ENTROPY, 25), new Object[] { "www", "csl", "www", 'w', ENContent.bucketWitchwater, 'c', new ItemStack(getBlock(Info.thaumplants), 1, 3), 'l', new ItemStack(getBlock(Info.thaumplants),1, 2), 's', new ItemStack(Blocks.sapling, 1, 3) });
	    	ThaumcraftApi.addArcaneCraftingRecipe("GREATWOOD", new ItemStack(getBlock(Info.thaumplants), 1, 0), new AspectList().add(Aspect.AIR, 25).add(Aspect.EARTH, 25).add(Aspect.FIRE, 25).add(Aspect.WATER, 25).add(Aspect.ORDER, 25).add(Aspect.ENTROPY, 25), new Object[] { "www", "lsc", "www", 'w', ENContent.bucketWitchwater, 'c', new ItemStack(getBlock(Info.thaumplants), 1, 3), 'l', new ItemStack(getBlock(Info.thaumplants),1, 2), 's', new ItemStack(Blocks.sapling, 1, 3) });
	    }
	    ThaumcraftApi.addArcaneCraftingRecipe("OBSIDIANTOTEM", new ItemStack(getBlock(Info.cosmetics), 2, 0), new AspectList().add(Aspect.EARTH, 2).add(Aspect.FIRE, 2), new Object[] { " i ", "oeo", " i ", 'i', new ItemStack(Items.dye, 1, 0), 'e', Items.ender_pearl, 'o', new ItemStack(getBlock(Info.cosmetics), 1, 1) } );
	}

	static void addWorkbenchRecipes()
	{
		addOreDictRecipes("ThaumiumHammer", new ItemStack(Registries.hammerThaum, 1, 0), new Object[] { " t ", " st", "s  ", 's', "stickWood", 't', new ItemStack(getItem(Info.resources), 1, 2)});
	}
	
	static void addOreDictRecipes(String name, ItemStack stack, Object[] recipe)
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(stack, recipe));
		List<IRecipe> irecipe = CraftingManager.getInstance().getRecipeList();
		//ConfigResearch.recipes.put(name, irecipe.get(irecipe.size() -1));
	}
	
	static void registerObjectTag(Block block, AspectList aspects)
	{
		if (block != null)
		{
			ThaumcraftApi.registerObjectTag(new ItemStack(block), aspects);
		}
	}
	
	static void registerObjectTag(Block block, int meta, AspectList aspects)
	{
		if (block != null)
		{
			ThaumcraftApi.registerObjectTag(new ItemStack(block, 1, meta), aspects);
		}
	}
	
	static void registerObjectTag(Item item, AspectList aspects)
	{
		if (item != null)
		{
			ThaumcraftApi.registerObjectTag(new ItemStack(item), aspects);
		}
	}
	
	static void registerObjectTag(Item item, int damage, AspectList aspects)
	{
		if (item != null)
		{
			ThaumcraftApi.registerObjectTag(new ItemStack(item, 1, damage), aspects);
		}
	}

	static void addAspectsToNihilo() 
	{
		registerObjectTag(OreRegistry.getGravel("iron"), new AspectList().add(Aspect.METAL, 3).add(Aspect.EARTH, 2));
		registerObjectTag(OreRegistry.getSand("iron"), new AspectList().add(Aspect.METAL, 3).add(Aspect.ENTROPY, 1).add(Aspect.EARTH, 1));
		registerObjectTag(OreRegistry.getDust("iron"), new AspectList().add(Aspect.METAL, 3).add(Aspect.AIR, 1).add(Aspect.ENTROPY, 1));
		
		registerObjectTag(OreRegistry.getGravel("gold"), new AspectList().add(Aspect.METAL, 2).add(Aspect.EARTH, 2).add(Aspect.GREED, 1));
		registerObjectTag(OreRegistry.getSand("gold"), new AspectList().add(Aspect.METAL, 2).add(Aspect.ENTROPY, 1).add(Aspect.EARTH, 1).add(Aspect.GREED, 1));
		registerObjectTag(OreRegistry.getDust("gold"), new AspectList().add(Aspect.METAL, 2).add(Aspect.AIR, 1).add(Aspect.ENTROPY, 1).add(Aspect.GREED, 1));
		
		registerObjectTag(OreRegistry.getGravel("copper"), new AspectList().add(Aspect.METAL, 2).add(Aspect.EARTH, 2).add(Aspect.EXCHANGE, 1));
		registerObjectTag(OreRegistry.getSand("copper"), new AspectList().add(Aspect.METAL, 2).add(Aspect.ENTROPY, 1).add(Aspect.EARTH, 1).add(Aspect.EXCHANGE, 1));
		registerObjectTag(OreRegistry.getDust("copper"), new AspectList().add(Aspect.METAL, 2).add(Aspect.AIR, 1).add(Aspect.ENTROPY, 1).add(Aspect.EXCHANGE, 1));
		
		registerObjectTag(OreRegistry.getGravel("tin"), new AspectList().add(Aspect.METAL, 3).add(Aspect.ENTROPY, 1).add(Aspect.CRYSTAL, 1));
		registerObjectTag(OreRegistry.getSand("tin"), new AspectList().add(Aspect.METAL, 3).add(Aspect.ENTROPY, 2).add(Aspect.CRYSTAL, 1));
		registerObjectTag(OreRegistry.getDust("tin"), new AspectList().add(Aspect.METAL, 3).add(Aspect.AIR, 1).add(Aspect.ENTROPY, 2).add(Aspect.CRYSTAL, 1));
		
		registerObjectTag(OreRegistry.getGravel("silver"), new AspectList().add(Aspect.METAL, 3).add(Aspect.ENTROPY, 1).add(Aspect.GREED, 1));
		registerObjectTag(OreRegistry.getSand("silver"), new AspectList().add(Aspect.METAL, 3).add(Aspect.ENTROPY, 2).add(Aspect.GREED, 1));
		registerObjectTag(OreRegistry.getDust("silver"), new AspectList().add(Aspect.METAL, 3).add(Aspect.AIR, 1).add(Aspect.ENTROPY, 2).add(Aspect.GREED, 1));
		
		registerObjectTag(OreRegistry.getGravel("lead"), new AspectList().add(Aspect.METAL, 3).add(Aspect.ORDER, 1).add(Aspect.ENTROPY, 1));
		registerObjectTag(OreRegistry.getSand("lead"), new AspectList().add(Aspect.METAL, 3).add(Aspect.ENTROPY, 2).add(Aspect.ORDER, 1));
		registerObjectTag(OreRegistry.getDust("lead"), new AspectList().add(Aspect.METAL, 3).add(Aspect.AIR, 1).add(Aspect.ENTROPY, 2).add(Aspect.ORDER, 1));
		
		registerObjectTag(OreRegistry.getGravel("nickel"), new AspectList().add(Aspect.METAL, 3).add(Aspect.EARTH, 1).add(Aspect.VOID, 1));
		registerObjectTag(OreRegistry.getSand("nickel"), new AspectList().add(Aspect.METAL, 3).add(Aspect.ENTROPY, 1).add(Aspect.VOID, 1));
		registerObjectTag(OreRegistry.getDust("nickel"), new AspectList().add(Aspect.METAL, 3).add(Aspect.AIR, 1).add(Aspect.ENTROPY, 1).add(Aspect.VOID, 1));
		
		ThaumcraftApi.registerObjectTag("orePlatinum", new AspectList().merge(Aspect.METAL, 2).merge(Aspect.GREED, 1).merge(Aspect.CRYSTAL, 1));
		registerObjectTag(OreRegistry.getGravel("platinum"), new AspectList().add(Aspect.METAL, 2).add(Aspect.GREED, 1).add(Aspect.CRYSTAL, 1));
		registerObjectTag(OreRegistry.getSand("platinum"), new AspectList().add(Aspect.METAL, 2).add(Aspect.GREED, 1).add(Aspect.CRYSTAL, 1));
		registerObjectTag(OreRegistry.getDust("platinum"), new AspectList().add(Aspect.METAL, 2).add(Aspect.AIR, 1).add(Aspect.GREED, 1).add(Aspect.CRYSTAL, 1));
		
		registerObjectTag(OreRegistry.getGravel("osmium"), new AspectList().add(Aspect.METAL, 3).add(Aspect.EARTH, 2).add(Aspect.GREED, 1));
		registerObjectTag(OreRegistry.getSand("osmium"), new AspectList().add(Aspect.METAL, 3).add(Aspect.ENTROPY, 1).add(Aspect.EARTH, 1).add(Aspect.GREED, 1));
		registerObjectTag(OreRegistry.getDust("osmium"), new AspectList().add(Aspect.METAL, 3).add(Aspect.AIR, 1).add(Aspect.ENTROPY, 1).add(Aspect.GREED, 1));
		
		ThaumcraftApi.registerObjectTag("oreAluminum", new AspectList().merge(Aspect.METAL, 2).merge(Aspect.MECHANISM, 1).merge(Aspect.AIR, 1));
		registerObjectTag(OreRegistry.getGravel("aluminum"), new AspectList().add(Aspect.METAL, 3).add(Aspect.EARTH, 2));
		registerObjectTag(OreRegistry.getSand("aluminum"), new AspectList().add(Aspect.METAL, 3).add(Aspect.ENTROPY, 1).add(Aspect.EARTH, 1));
		registerObjectTag(OreRegistry.getDust("aluminum"), new AspectList().add(Aspect.METAL, 3).add(Aspect.AIR, 1).add(Aspect.ENTROPY, 1));

		registerObjectTag(OreRegistry.getBroken("iron"), new AspectList().add(Aspect.METAL, 1));
		registerObjectTag(OreRegistry.getCrushed("iron"), new AspectList().add(Aspect.METAL, 1));
		registerObjectTag(OreRegistry.getPowdered("iron"), new AspectList().add(Aspect.METAL, 1).add(Aspect.AIR,1));
		
		registerObjectTag(OreRegistry.getBroken("gold"), new AspectList().add(Aspect.GREED, 1));
		registerObjectTag(OreRegistry.getCrushed("gold"), new AspectList().add(Aspect.GREED, 1));
		registerObjectTag(OreRegistry.getPowdered("gold"), new AspectList().add(Aspect.GREED, 1).add(Aspect.AIR, 1));
		
		ThaumcraftApi.registerObjectTag("ingotCopper", new AspectList().merge(Aspect.METAL, 3).add(Aspect.EXCHANGE, 1));
		registerObjectTag(OreRegistry.getBroken("copper"), new AspectList().add(Aspect.EXCHANGE, 1));
		registerObjectTag(OreRegistry.getCrushed("copper"), new AspectList().add(Aspect.EXCHANGE, 1));
		registerObjectTag(OreRegistry.getPowdered("copper"), new AspectList().add(Aspect.EXCHANGE, 1).add(Aspect.AIR, 1));
		
		ThaumcraftApi.registerObjectTag("ingotTin", new AspectList().merge(Aspect.METAL, 3).add(Aspect.CRYSTAL, 1));
		registerObjectTag(OreRegistry.getBroken("tin"), new AspectList().add(Aspect.CRYSTAL, 1));
		registerObjectTag(OreRegistry.getCrushed("tin"), new AspectList().add(Aspect.CRYSTAL, 1));
		registerObjectTag(OreRegistry.getPowdered("tin"), new AspectList().add(Aspect.CRYSTAL, 1).add(Aspect.AIR, 1));
		
		ThaumcraftApi.registerObjectTag("ingotSilver", new AspectList().merge(Aspect.METAL, 3).merge(Aspect.GREED, 1));
		registerObjectTag(OreRegistry.getBroken("silver"), new AspectList().add(Aspect.GREED, 1));
		registerObjectTag(OreRegistry.getCrushed("silver"), new AspectList().add(Aspect.GREED, 1));
		registerObjectTag(OreRegistry.getPowdered("silver"), new AspectList().add(Aspect.GREED, 1).add(Aspect.AIR, 1));
		
		ThaumcraftApi.registerObjectTag("ingotLead", new AspectList().merge(Aspect.METAL, 3).merge(Aspect.ORDER, 1));
		registerObjectTag(OreRegistry.getBroken("lead"), new AspectList().add(Aspect.ORDER, 1));
		registerObjectTag(OreRegistry.getCrushed("lead"), new AspectList().add(Aspect.ORDER, 1));
		registerObjectTag(OreRegistry.getPowdered("lead"), new AspectList().add(Aspect.ORDER, 1).add(Aspect.AIR, 1));
		
		ThaumcraftApi.registerObjectTag("ingotNickel", new AspectList().merge(Aspect.METAL, 3).merge(Aspect.VOID, 2));
		registerObjectTag(OreRegistry.getBroken("nickel"), new AspectList().add(Aspect.VOID, 1));
		registerObjectTag(OreRegistry.getCrushed("nickel"), new AspectList().add(Aspect.VOID, 1));
		registerObjectTag(OreRegistry.getPowdered("nickel"), new AspectList().add(Aspect.VOID, 1).add(Aspect.AIR, 1));
		
		ThaumcraftApi.registerObjectTag("ingotPlatinum", new AspectList().merge(Aspect.METAL, 3).merge(Aspect.GREED, 2).merge(Aspect.CRYSTAL, 2));
		registerObjectTag(OreRegistry.getBroken("platinum"), new AspectList().add(Aspect.CRYSTAL, 1));
		registerObjectTag(OreRegistry.getCrushed("platinum"), new AspectList().add(Aspect.CRYSTAL, 1));
		registerObjectTag(OreRegistry.getPowdered("platinum"), new AspectList().add(Aspect.CRYSTAL, 1).add(Aspect.AIR, 1));
		
		registerObjectTag(OreRegistry.getBroken("osmium"), new AspectList().add(Aspect.GREED, 1));
		registerObjectTag(OreRegistry.getCrushed("osmium"), new AspectList().add(Aspect.GREED, 1));
		registerObjectTag(OreRegistry.getPowdered("osmium"), new AspectList().add(Aspect.GREED, 1).add(Aspect.AIR, 1));
		
		ThaumcraftApi.registerObjectTag("ingotAluminum", new AspectList().add(Aspect.METAL, 4).add(Aspect.AIR, 2).add(Aspect.MECHANISM, 2));
		registerObjectTag(OreRegistry.getBroken("aluminum"), new AspectList().add(Aspect.AIR, 1).add(Aspect.MECHANISM, 1));
		registerObjectTag(OreRegistry.getCrushed("aluminum"), new AspectList().add(Aspect.AIR, 1).add(Aspect.MECHANISM, 1));
		registerObjectTag(OreRegistry.getPowdered("aluminum"), new AspectList().add(Aspect.AIR, 2).add(Aspect.MECHANISM, 1));
		
		registerObjectTag(ENContent.beeTrap, new AspectList().add(Aspect.BEAST, 1).add(Aspect.MECHANISM, 3).add(Aspect.PLANT, 8));
		registerObjectTag(ENContent.beeTrapTreated, new AspectList().add(Aspect.BEAST, 1).add(Aspect.TRAP, 3).add(Aspect.PLANT, 8));
		registerObjectTag(ENContent.infestedLeaves, new AspectList().add(Aspect.PLANT, 1).add(Aspect.CLOTH, 1));
		registerObjectTag(ENContent.witchwater, new AspectList().add(Aspect.WATER, 1).add(Aspect.POISON, 3).add(Aspect.DEATH, 3).add(Aspect.TAINT, 3).add(Aspect.DARKNESS, 3));
		registerObjectTag(ENContent.barrelWood, 0, new AspectList().add(Aspect.WATER, 2).add(Aspect.VOID, 2));
		registerObjectTag(ENContent.barrelWood, 1, new AspectList().add(Aspect.WATER, 2).add(Aspect.VOID, 2));
		registerObjectTag(ENContent.barrelWood, 2, new AspectList().add(Aspect.WATER, 2).add(Aspect.VOID, 2));
		registerObjectTag(ENContent.barrelWood, 3, new AspectList().add(Aspect.WATER, 2).add(Aspect.VOID, 2));
		registerObjectTag(ENContent.barrelWood, 4, new AspectList().add(Aspect.WATER, 2).add(Aspect.VOID, 2));
		registerObjectTag(ENContent.barrelWood, 5, new AspectList().add(Aspect.WATER, 2).add(Aspect.VOID, 2));
		registerObjectTag(ENContent.barrelStone, new AspectList().add(Aspect.WATER, 2).add(Aspect.VOID, 2));
		registerObjectTag(ENContent.seedGrass, new AspectList().add(Aspect.PLANT, 2).add(Aspect.LIFE, 1));
		registerObjectTag(ENContent.spores, new AspectList().add(Aspect.PLANT, 2).add(Aspect.LIFE, 1));
		registerObjectTag(ENContent.seedCactus, 0, new AspectList().add(Aspect.PLANT, 4).add(Aspect.WATER, 1));
		registerObjectTag(ENContent.seedSugerCane, 0, new AspectList().add(Aspect.PLANT, 2).add(Aspect.WATER, 1));
		registerObjectTag(ENContent.seedPotato, 0, new AspectList().add(Aspect.PLANT, 1).add(Aspect.ENTROPY, 1).add(Aspect.CROP, 1));
		registerObjectTag(ENContent.seedCarrot, 0, new AspectList().add(Aspect.PLANT, 1).add(Aspect.AIR, 1).add(Aspect.CROP, 1));
		registerObjectTag(ENContent.seedOak, 0, new AspectList().add(Aspect.PLANT, 2));
		registerObjectTag(ENContent.seedBirch, 0, new AspectList().add(Aspect.PLANT, 2));
		registerObjectTag(ENContent.seedSpruce, 0, new AspectList().add(Aspect.PLANT, 2));
		registerObjectTag(ENContent.seedJungle, 0, new AspectList().add(Aspect.PLANT, 2));
		registerObjectTag(ENContent.seedRubber, 0, new AspectList().add(Aspect.PLANT, 2).add(Aspect.SLIME, 1));
		registerObjectTag(ENContent.silkworm, 0, new AspectList().add(Aspect.BEAST, 1).add(Aspect.CLOTH, 1));
		registerObjectTag(ENContent.silkwormCooked, 0, new AspectList().add(Aspect.BEAST, 1).add(Aspect.HUNGER, 1).add(Aspect.FLESH, 1));
		registerObjectTag(ENContent.bucketWitchwater, 0, new AspectList().add(Aspect.METAL, 8).add(Aspect.VOID, 1).add(Aspect.WATER, 1).add(Aspect.POISON, 3).add(Aspect.DEATH, 3).add(Aspect.TAINT, 3).add(Aspect.DARKNESS, 3));
		registerObjectTag(ENContent.stone, 0, new AspectList().add(Aspect.EARTH, 1));
	}

	static void addPages()
	{
		ResearchCategories.registerCategory("SKYCHEMY", new ResourceLocation("exaliquo:textures/misc/thaumicpage.png"), new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png"));
	}
	
	static Object getRecipe(String name)
	{
		ThaumcraftApi.getCraftingRecipes();
		return null;
	}
	
	static void changePrimalWands()
	{
	    ExAliquo.logger.info("Changing Primal Aspect Wand and Staff Recipes");
		
		String[] infusionName = { "ROD_obsidian", "ROD_ice", "ROD_quartz", "ROD_reed", "ROD_blaze", "ROD_bone", "ROD_silverwood", "ROD_primal_staff"};
		String[] infusionRecipe = { "WandRodObsidian", "WandRodIce", "WandRodQuartz", "WandRodReed", "WandRodBlaze", "WandRodBone", "WandRodSilverwood", "WandRodPrimalStaff"};
		
		String[] arcaneName = { "ROD_greatwood_staff", "ROD_obsidian_staff", "ROD_ice_staff", "ROD_quartz_staff", "ROD_reed_staff", "ROD_blaze_staff", "ROD_bone_staff", "ROD_silverwood_staff" };
		String[] arcaneRecipe = { "WandRodGreatwoodStaff", "WandRodObsidianStaff", "WandRodIceStaff", "WandRodQuartzStaff", "WandRodReedStaff", "WandRodBlazeStaff", "WandRodBoneStaff", "WandRodSilverwoodStaff" };
		String[] staffshape = { "  f", " g ", "s  " };
		
		InfusionRecipe[] oldInfusion = {
				ThaumcraftApi.getInfusionRecipe(new ItemStack(getItem(Info.wands), 1, 1)),
				ThaumcraftApi.getInfusionRecipe(new ItemStack(getItem(Info.wands), 1, 3)),
				ThaumcraftApi.getInfusionRecipe(new ItemStack(getItem(Info.wands), 1, 4)),
				ThaumcraftApi.getInfusionRecipe(new ItemStack(getItem(Info.wands), 1, 5)),
				ThaumcraftApi.getInfusionRecipe(new ItemStack(getItem(Info.wands), 1, 6)),
				ThaumcraftApi.getInfusionRecipe(new ItemStack(getItem(Info.wands), 1, 7)),
				ThaumcraftApi.getInfusionRecipe(new ItemStack(getItem(Info.wands), 1, 2)),
				ThaumcraftApi.getInfusionRecipe(new ItemStack(getItem(Info.wands), 1, 100))
				}; //Obsidian, Ice, Quartz, Reed, Blaze, Bone, Silverwood, Primal
		
		InfusionRecipe[] newInfusion = {
				new InfusionRecipe(oldInfusion[0].getResearch(), oldInfusion[0].getRecipeOutput(), oldInfusion[0].getInstability(), oldInfusion[0].getAspects(), new ItemStack(getItem(Info.wands), 1, 0), new ItemStack[] { new ItemStack(getItem(Info.resources), 1, 14), new ItemStack(getItem(Info.shard), 1, 3), new ItemStack(Blocks.obsidian) }),
				new InfusionRecipe(oldInfusion[1].getResearch(), oldInfusion[1].getRecipeOutput(), oldInfusion[1].getInstability(), oldInfusion[1].getAspects(), new ItemStack(getItem(Info.wands), 1, 0), new ItemStack[] { new ItemStack(getItem(Info.resources), 1, 14), new ItemStack(getItem(Info.shard), 1, 2), new ItemStack(Blocks.ice) }),
				new InfusionRecipe(oldInfusion[2].getResearch(), oldInfusion[2].getRecipeOutput(), oldInfusion[2].getInstability(), oldInfusion[2].getAspects(), new ItemStack(getItem(Info.wands), 1, 0), new ItemStack[] { new ItemStack(getItem(Info.resources), 1, 14), new ItemStack(getItem(Info.shard), 1, 4), new ItemStack(Blocks.quartz_block) }),
				new InfusionRecipe(oldInfusion[3].getResearch(), oldInfusion[3].getRecipeOutput(), oldInfusion[3].getInstability(), oldInfusion[3].getAspects(), new ItemStack(getItem(Info.wands), 1, 0), new ItemStack[] { new ItemStack(getItem(Info.resources), 1, 14), new ItemStack(getItem(Info.shard), 1, 0), new ItemStack(Items.reeds) }),
				new InfusionRecipe(oldInfusion[4].getResearch(), oldInfusion[4].getRecipeOutput(), oldInfusion[4].getInstability(), oldInfusion[4].getAspects(), new ItemStack(getItem(Info.wands), 1, 0), new ItemStack[] { new ItemStack(getItem(Info.resources), 1, 14), new ItemStack(getItem(Info.shard), 1, 1), new ItemStack(Items.blaze_rod) }),
				new InfusionRecipe(oldInfusion[5].getResearch(), oldInfusion[5].getRecipeOutput(), oldInfusion[5].getInstability(), oldInfusion[5].getAspects(), new ItemStack(getItem(Info.wands), 1, 0), new ItemStack[] { new ItemStack(getItem(Info.resources), 1, 14), new ItemStack(getItem(Info.shard), 1, 5), new ItemStack(Items.bone) }),
				new InfusionRecipe(oldInfusion[6].getResearch(), oldInfusion[6].getRecipeOutput(), oldInfusion[6].getInstability(), oldInfusion[6].getAspects(), new ItemStack(getItem(Info.magicwood), 1, 1), new ItemStack[] { new ItemStack(getItem(Info.resources), 1, 14), new ItemStack(getItem(Info.wands), 1, 5), new ItemStack(getItem(Info.wands), 1, 6), new ItemStack(getItem(Info.wands), 1, 3), new ItemStack(getItem(Info.wands), 1, 0), new ItemStack(getItem(Info.wands), 1, 1), new ItemStack(getItem(Info.wands), 1, 4), new ItemStack(getItem(Info.wands), 1, 7) }),
				new InfusionRecipe(oldInfusion[7].getResearch(), oldInfusion[7].getRecipeOutput(), oldInfusion[7].getInstability(), oldInfusion[7].getAspects(), new ItemStack(getItem(Info.wands), 1, 52), new ItemStack[] { new ItemStack(getItem(Info.resources), 1, 15), new ItemStack(getItem(Info.wands), 1, 51), new ItemStack(getItem(Info.wands), 1, 53), new ItemStack(getItem(Info.wands), 1, 54), new ItemStack(getItem(Info.resources), 1, 15), new ItemStack(getItem(Info.wands), 1, 55), new ItemStack(getItem(Info.wands), 1, 56), new ItemStack(getItem(Info.wands), 1, 57) })
		};
		
		IArcaneRecipe[] oldArcane = {
				getArcaneRecipe("ROD_greatwood_staff"),
				getArcaneRecipe("ROD_obsidian_staff"),
				getArcaneRecipe("ROD_ice_staff"),
				getArcaneRecipe("ROD_quartz_staff"),
				getArcaneRecipe("ROD_reed_staff"),
				getArcaneRecipe("ROD_blaze_staff"),
				getArcaneRecipe("ROD_bone_staff"),
				getArcaneRecipe("ROD_silverwood_staff")
		};
		
		IArcaneRecipe[] newArcane = {
				new ShapedArcaneRecipe(oldArcane[0].getResearch(), oldArcane[0].getRecipeOutput(), oldArcane[0].getAspects(), new Object[] { staffshape, 'f', new ItemStack(getItem(Info.resources), 1, 15), 'g', new ItemStack(getItem(Info.wands), 1, 0), 's', new ItemStack(getItem(Info.wands), 1, 2) }),
				new ShapedArcaneRecipe(oldArcane[1].getResearch(), oldArcane[1].getRecipeOutput(), oldArcane[1].getAspects(), new Object[] { staffshape, 'f', new ItemStack(getItem(Info.resources), 1, 15), 'g', new ItemStack(getItem(Info.wands), 1, 1), 's', new ItemStack(getItem(Info.wands), 1, 50) }),
				new ShapedArcaneRecipe(oldArcane[2].getResearch(), oldArcane[2].getRecipeOutput(), oldArcane[2].getAspects(), new Object[] { staffshape, 'f', new ItemStack(getItem(Info.resources), 1, 15), 'g', new ItemStack(getItem(Info.wands), 1, 3), 's', new ItemStack(getItem(Info.wands), 1, 50) }),
				new ShapedArcaneRecipe(oldArcane[3].getResearch(), oldArcane[3].getRecipeOutput(), oldArcane[3].getAspects(), new Object[] { staffshape, 'f', new ItemStack(getItem(Info.resources), 1, 15), 'g', new ItemStack(getItem(Info.wands), 1, 4), 's', new ItemStack(getItem(Info.wands), 1, 50) }),
				new ShapedArcaneRecipe(oldArcane[4].getResearch(), oldArcane[4].getRecipeOutput(), oldArcane[4].getAspects(), new Object[] { staffshape, 'f', new ItemStack(getItem(Info.resources), 1, 15), 'g', new ItemStack(getItem(Info.wands), 1, 5), 's', new ItemStack(getItem(Info.wands), 1, 50) }),
				new ShapedArcaneRecipe(oldArcane[5].getResearch(), oldArcane[5].getRecipeOutput(), oldArcane[5].getAspects(), new Object[] { staffshape, 'f', new ItemStack(getItem(Info.resources), 1, 15), 'g', new ItemStack(getItem(Info.wands), 1, 6), 's', new ItemStack(getItem(Info.wands), 1, 50) }),
				new ShapedArcaneRecipe(oldArcane[6].getResearch(), oldArcane[6].getRecipeOutput(), oldArcane[6].getAspects(), new Object[] { staffshape, 'f', new ItemStack(getItem(Info.resources), 1, 15), 'g', new ItemStack(getItem(Info.wands), 1, 7), 's', new ItemStack(getItem(Info.wands), 1, 50) }),
				new ShapedArcaneRecipe(oldArcane[7].getResearch(), oldArcane[7].getRecipeOutput(), oldArcane[7].getAspects(), new Object[] { " gf", "gsg", "sg ", 'f', new ItemStack(getItem(Info.resources), 1, 15), 'g', new ItemStack(getItem(Info.wands), 1, 50), 's', new ItemStack(getItem(Info.wands), 1, 2) })
		};
		
		for (int i = 0; i < infusionRecipe.length; i++)
		{
			//ConfigResearch.recipes.put(infusionRecipe[i], newInfusion[i]);
		}
		for (int i = 0; i < arcaneRecipe.length; i++)
		{
			//ConfigResearch.recipes.put(arcaneRecipe[i], newArcane[i]);
		}
		
		try
		{
			//Reflectionstuff Start
			Field recipes = Class.forName("thaumcraft.api.ThaumcraftApi").getDeclaredField("craftingRecipes");
			recipes.setAccessible(true);
			ArrayList oldList = (ArrayList) recipes.get(oldInfusion[0]);
			for (int i = 0; i < oldInfusion.length; i++)
			{
				//oldList.set(oldList.indexOf(oldInfusion[i]), newInfusion[i]);
			}
			for (int i = 0; i < oldArcane.length; i++)
			{
				oldList.set(oldList.indexOf(oldArcane[i]), newArcane[i]);
			}
			recipes.set(recipes, oldList);
			//Reflectionstuff End
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		ResearchItem[] infusionResearch = {
				copyResearch(ResearchCategories.getResearch(infusionName[0])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_obsidian.1"), new ResearchPage((InfusionRecipe)getRecipe("WandRodObsidian")) }),
				copyResearch(ResearchCategories.getResearch(infusionName[1])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_ice.1"), new ResearchPage((InfusionRecipe)getRecipe("WandRodIce")) }),
				copyResearch(ResearchCategories.getResearch(infusionName[2])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_quartz.1"), new ResearchPage((InfusionRecipe)getRecipe("WandRodQuartz")) }),
				copyResearch(ResearchCategories.getResearch(infusionName[3])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_reed.1"), new ResearchPage((InfusionRecipe)getRecipe("WandRodReed")) }),
				copyResearch(ResearchCategories.getResearch(infusionName[4])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_blaze.1"), new ResearchPage((InfusionRecipe)getRecipe("WandRodBlaze")) }),
				copyResearch(ResearchCategories.getResearch(infusionName[5])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_bone.1"), new ResearchPage((InfusionRecipe)getRecipe("WandRodBone")) }),
				copyResearch(ResearchCategories.getResearch(infusionName[6])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_silverwood.1"), new ResearchPage((InfusionRecipe)getRecipe("WandRodSilverwood")) }),
				copyResearch(ResearchCategories.getResearch(infusionName[7])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_primal_staff.1"), new ResearchPage((InfusionRecipe)getRecipe("WandRodPrimalStaff")) })
		};
		
		ResearchItem[] arcaneResearch = {
				copyResearch(ResearchCategories.getResearch(arcaneName[0])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_greatwood_staff.1"), new ResearchPage("tc.research_page.ROD_greatwood_staff.2"), new ResearchPage((IArcaneRecipe)getRecipe("WandRodGreatwoodStaff")) }),
				copyResearch(ResearchCategories.getResearch(arcaneName[1])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_obsidian_staff.1"), new ResearchPage((IArcaneRecipe)getRecipe("WandRodObsidianStaff")) }),
				copyResearch(ResearchCategories.getResearch(arcaneName[2])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_ice_staff.1"), new ResearchPage((IArcaneRecipe)getRecipe("WandRodIceStaff")) }),
				copyResearch(ResearchCategories.getResearch(arcaneName[3])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_quartz_staff.1"), new ResearchPage((IArcaneRecipe)getRecipe("WandRodQuartzStaff")) }),
				copyResearch(ResearchCategories.getResearch(arcaneName[4])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_reed_staff.1"), new ResearchPage((IArcaneRecipe)getRecipe("WandRodReedStaff")) }),
				copyResearch(ResearchCategories.getResearch(arcaneName[5])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_blaze_staff.1"), new ResearchPage((IArcaneRecipe)getRecipe("WandRodBlazeStaff")) }),
				copyResearch(ResearchCategories.getResearch(arcaneName[6])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_bone_staff.1"), new ResearchPage((IArcaneRecipe)getRecipe("WandRodBoneStaff")) }),
				copyResearch(ResearchCategories.getResearch(arcaneName[7])).setPages(new ResearchPage[] { new ResearchPage("tc.research_page.ROD_silverwood_staff.1"), new ResearchPage((IArcaneRecipe)getRecipe("WandRodSilverwoodStaff")) })
		};
		
		for (int i = 0; i < infusionResearch.length; i++)
		{
			removeResearch(infusionName[i]);
			infusionResearch[i].registerResearchItem();
		}
		for (int i = 0; i < arcaneResearch.length; i++)
		{
			removeResearch(arcaneName[i]);
			arcaneResearch[i].registerResearchItem();
		}
	}
	
	private static void removeResearch(String research)
	{
		Collection researchcategory = ResearchCategories.researchCategories.values();
		for (Object obj : researchcategory)
		{
			Collection researchlist = ((ResearchCategoryList)obj).research.values();
			for (Object researchitem : researchlist)
			{
				if (((ResearchItem)researchitem).key.equals(research))
				{
					researchlist.remove(researchitem);
					break;
				}
			}
		}
	}
	
	private static ResearchItem copyResearch(ResearchItem research)
	{
		String k = research.key;
		String cat = research.category;
		AspectList as = research.tags;
		int col = research.displayColumn;
		int row = research.displayRow;
		int complex = research.getComplexity();
		ItemStack icon = research.icon_item;
		
		ResearchItem override = new ResearchItem(research.key, research.category, research.tags, research.displayColumn, research.displayRow, research.getComplexity(), research.icon_item);
		override.setPages(research.getPages());
		if (research.isAutoUnlock()) override.setSpecial();
		if (research.isConcealed()) override.setStub();
		if (research.isHidden()) override.setHidden();
		if (research.isRound()) override.setRound();
		if (research.isSecondary()) override.setSecondary();
		if (research.isStub()) override.setStub();
		if (research.isVirtual()) override.setVirtual();
		override.setSiblings(research.siblings);
		override.setParents(research.parents);
		override.setParentsHidden(research.parentsHidden);
		override.setAspectTriggers(research.getAspectTriggers());
		override.setItemTriggers(research.getItemTriggers());
		
		return override;
	}
	
	private static IArcaneRecipe getArcaneRecipe(String research)
	{
		for (Object recipe : ThaumcraftApi.getCraftingRecipes())
		{
			if (recipe instanceof IArcaneRecipe)
			{
				if (((IArcaneRecipe)recipe).getResearch().equals(research))
				{
					return (IArcaneRecipe) recipe;
				}
			}
		}
		return null;
	}
}
