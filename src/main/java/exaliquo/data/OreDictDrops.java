package exaliquo.data;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;
import exaliquo.Registries;
import exnihilo.registries.HammerRegistry;
import exnihilo.registries.SieveRegistry;

public class OreDictDrops
{
	private static Block[] overworld = { Blocks.gravel, Blocks.sand, ENContent.dust };
	private static Block[] nether = { Blocks.netherrack, Blocks.soul_sand };
	private static Block[] end = { Blocks.end_stone };
	private static Block[] sands = { Blocks.sand };
	private static Block[] gravel = { Blocks.gravel };
	
	private enum Metals
	{
		COBALT("ingotCobalt","oreCobalt",0,-1,nether,96,"Cobalt", "cobalt.molten", 650),
		ARDITE("ingotArdite","oreArdite",0,-1,nether,96,"Ardite", "ardite.molten", 650),
		
		ADAMANTINE("ingotAdamantine","oreAdamantine",1,-1,overworld,160,"Adamantine","adamantine.molten",550),
		ASTRALSILVER("ingotAstralSilver","oreAstralSilver",1,-1,overworld,14,"AstralSilver","astral.silver.molten",550),
		ATLARUS("ingotAtlarus","oreAtlarus",1,-1,overworld,160,"Atlarus","atlarus.molten",550),
		CARMOT("ingotCarmot","oreCarmot",1,-1,overworld,32,"Carmot","carmot.molten",550),
		DEEPIRON("ingotDeepIron","oreDeepIron",1,-1,overworld,8,"DeepIron","deep.iron.molten",550),
		INFUSCOLIUM("ingotInfuscolium","oreInfuscolium",1,-1,overworld,12,"Infuscolium","infuscolium.molten",550),
		MANGANESE("ingotManganese","oreManganese",1,-1,overworld,6,"Manganese","manganese.molten",550),
		MITHRIL("ingotMithril","oreMithril",1,-1,overworld,96,"Mithril","mithril.molten",550),
		ORICHALCUM("ingotOrichalcum","oreOrichalcum",1,-1,overworld,128,"Orichalcum","orichalcum.molten",550),
		OURECLASE("ingotOureclase","oreOureclase",1,-1,overworld,32,"Oureclase","oureclase.molten",550),
		PROMETHEUM("ingotPrometheum","orePrometheum",1,-1,overworld,6,"Prometheum","prometheum.molten",550),
		RUBRACIUM("ingotRubracium","oreRubracium",1,-1,overworld,144,"Rubracium","rubracium.molten",550),
		ZINC("ingotZinc","oreZinc",1,-1,overworld,12,"Zinc","zinc.molten",550),
		ALDUORITE("ingotAlduorite","oreAlduorite",1,-1,nether,14,"Alduorite","alduorite.molten",550),
		CERUCLASE("ingotCeruclase","oreCeruclase",1,-1,nether,14,"Ceruclase","ceruclase.molten",550),
		IGNATIUS("ingotIgnatius","oreIgnatius",1,-1,nether,7,"Ignatius","ignatius.molten",550),
		KALENDRITE("ingotKalendrite","oreKalendrite",1,-1,nether,128,"Kalendrite","kalendrite.molten",550),
		LEMURITE("ingotLemurite","oreLemurite",1,-1,nether,12,"Lemurite","lemurite.molten",550),
		MIDASIUM("ingotMidasium","oreMidasium",1,-1,nether,18,"Midasium","midasium.molten",550),
		SANGUINITE("ingotSanguinite","oreSanguinite",1,-1,nether,128,"Sanguinite","sanguinite.molten",550),
		SHADOWIRON("ingotShadowIron","oreShadowIron",1,-1,nether,8,"ShadowIron","shadow.iron.molten",550),
		VULCANITE("ingotVulcanite","oreVulcanite",1,-1,nether,128,"Vulcanite","vulcanite.molten",550),
		VYROXERES("ingotVyroxeres","oreVyroxeres",1,-1,nether,64,"Vyroxeres","vyroxeres.molten",550),
		EXIMITE("ingotEximite","oreEximite",1,-1,end,92,"Eximite","eximite.molten",550),
		MEUTOITE("ingotMeutoite","oreMeutoite",1,-1,end,138,"Meutoite","meutoite.molten",550),
		
		/*LIMESTONE("blockLimestone","blockLimestone",0,OreDict.getFirstOre("blockLimestone",false).getItem(),OreDict.getBlock(OreDict.getFirstOre("blockLimestone",false)),OreDict.getFirstOre("blockLimestone",false).getItemDamage(),sands,4),
		
		ONYX("gemOnyx","oreOnyx",0,OreDict.getFirstOre("gemOnyx",false).getItem(),OreDict.getBlock(OreDict.getFirstOre("oreOnyx",false)),OreDict.getFirstOre("gemOnyx",false).getItemDamage(),gravel,64),
		
		URANIUM("ingotUranium","oreUranium",1,OreDict.getFirstOre("ingotUranium",false).getItem(),OreDict.getBlock(OreDict.getFirstOre("oreUranium",false)),OreDict.getFirstOre("ingotUranium",false).getItemDamage(),sands,48)*/;

		private final String ingot;
		private final String ore;
		private final int smeltnum;
		private final Item partial;
		private final Block full;
		private final int meta;
		private final Block[] dropgroup;
		private final int chance;
		private final String oreToGenerate;
		private final String fluidName;
		private final int temperature;
		
		private Metals(String ingot, String ore, int smeltnum, int meta, Block[] dropgroup, int chance, String oreToGenerate, String fluidName, int temperature)
		{
			this.ingot = ingot;
			this.ore = ore;
			this.smeltnum = smeltnum;
			this.partial = null;
			this.full = null;
			this.meta = meta;
			this.dropgroup = dropgroup;
			this.chance = chance;
			this.oreToGenerate = oreToGenerate;
			this.fluidName = fluidName;
			this.temperature = temperature;
		}
		
        private Metals(String ingot, String ore, int smeltnum, Item partial, Block full, int meta, Block[] dropgroup, int chance)
        {
            this.ingot = ingot;
            this.ore = ore;
            this.smeltnum = smeltnum;
            this.partial = partial;
            this.full = full;
            this.meta = meta;
            this.dropgroup = dropgroup;
            this.chance = chance;
            this.oreToGenerate = null;
            this.fluidName = null;
            this.temperature = 0;
        }
	}
	
	public static void CheckMetals()
	{
		for (Metals metals : Metals.values())
		{
		    Item partial = metals.partial;
		    Block full = metals.full;
		    
			ArrayList<ItemStack> ores = OreDictionary.getOres(metals.ore);
			if (!ores.isEmpty())
			{
			    if (metals.oreToGenerate != null)
			    {
			        Registries.registerModMetal(metals.ore, metals.oreToGenerate, metals.fluidName, metals.temperature);
			        partial = Registries.getOreItemForOre(metals.ore);
			        full = Registries.getOreBlockForOre(metals.ore);
			    }
			    
				for (int i = 0; i < metals.dropgroup.length; i++)
				{
					if (metals.meta == -1)
					{
						SieveRegistry.register(metals.dropgroup[i], 0, partial, i, metals.chance);
					}
					else
					{
						SieveRegistry.register(metals.dropgroup[i], 0, partial, metals.meta, metals.chance);
					}
				}
				
				for (int i = 0; i < ores.size() ;i++)
				{
					if (metals.meta == -1)
					{
						HammerRegistry.registerOre(Block.getBlockFromItem(ores.get(i).getItem()), ores.get(i).getItemDamage(), partial, 0);
					}
					else
					{
						HammerRegistry.registerOre(Block.getBlockFromItem(ores.get(i).getItem()), ores.get(i).getItemDamage(), partial, metals.meta);
					}
				}
				
				if (full != Blocks.redstone_wire)
				{
					for (int i = 0; i < 3; i++)
					{
						OreDictionary.registerOre(metals.ore, new ItemStack(full,1,i));
					}
				}
			}
			
			if (metals.smeltnum > 0 && full != null)
			{
    			ArrayList<ItemStack> ingots = OreDictionary.getOres(metals.ingot);
    			if (!ingots.isEmpty())
    			{
    				GameRegistry.addSmelting(full, ingots.get(0), 3);
    			}
			}
		}
	}
}
