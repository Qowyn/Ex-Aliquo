package exaliquo.data;

import java.util.ArrayList;

import cpw.mods.fml.common.registry.GameRegistry;
import exaliquo.bridges.Metallurgy.MBlockRegistry;
import exaliquo.bridges.Metallurgy.MItemRegistry;
import exaliquo.bridges.TConstruct.TCBlockRegistry;
import exaliquo.bridges.TConstruct.TCItemRegistry;
import exaliquo.data.ModIDs.Info;
import exnihilo.registries.HammerRegistry;
import exnihilo.registries.SieveRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictDrops
{
	private static Block[] overworld = { Blocks.gravel, Blocks.sand, ModIDs.getBlock(Info.dust) };
	private static Block[] nether = { Blocks.netherrack, Blocks.soul_sand };
	private static Block[] end = { Blocks.end_stone };
	private static Block[] sands = { Blocks.sand };
	private static Block[] gravel = { Blocks.gravel };
	
	private enum Metals
	{
		COBALT("ingotCobalt","oreCobalt",0,TCItemRegistry.cobaltOreItem,TCBlockRegistry.cobaltOreBlock,-1,nether,96),
		ARDITE("ingotArdite","oreArdite",0,TCItemRegistry.arditeOreItem,TCBlockRegistry.arditeOreBlock,-1,nether,96),
		
		ADAMANTINE("ingotAdamantine","oreAdamantine",1,MItemRegistry.adamantineOreItem,MBlockRegistry.adamantineOreBlock,-1,overworld,160),
		ASTRALSILVER("ingotAstral Silver","oreAstral Silver",1,MItemRegistry.astralsilverOreItem,MBlockRegistry.astralsilverOreBlock,-1,overworld,14),
		ATLARUS("ingotAtlarus","oreAtlatus",1,MItemRegistry.atlarusOreItem,MBlockRegistry.atlarusOreBlock,-1,overworld,160),
		CARMOT("ingotCarmot","oreCarmot",1,MItemRegistry.carmotOreItem,MBlockRegistry.carmotOreBlock,-1,overworld,32),
		DEEPIRON("ingotDeep Iron","oreDeep Iron",1,MItemRegistry.deepironOreItem,MBlockRegistry.deepironOreBlock,-1,overworld,8),
		INFUSCOLIUM("ingotInfuscolium","oreInfuscolium",1,MItemRegistry.infuscoliumOreItem,MBlockRegistry.infuscoliumOreBlock,-1,overworld,12),
		MANGANESE("ingotManganese","oreManganese",1,MItemRegistry.manganeseOreItem,MBlockRegistry.manganeseOreBlock,-1,overworld,6),
		MITHRIL("ingotMithril","oreMithril",1,MItemRegistry.mithrilOreItem,MBlockRegistry.mithrilOreBlock,-1,overworld,96),
		ORICHALCUM("ingotOrichalcum","oreOrichalcum",1,MItemRegistry.orichalcumOreItem,MBlockRegistry.orichalcumOreBlock,-1,overworld,128),
		OURECLASE("ingotOureclase","oreOureclase",1,MItemRegistry.oureclaseOreItem,MBlockRegistry.orichalcumOreBlock,-1,overworld,32),
		PROMETHEUM("ingotPrometheum","orePrometheum",1,MItemRegistry.prometheumOreItem,MBlockRegistry.prometheumOreBlock,-1,overworld,6),
		RUBRACIUM("ingotRubracium","oreRubracium",1,MItemRegistry.rubraciumOreItem,MBlockRegistry.rubraciumOreBlock,-1,overworld,144),
		ZINC("ingotZinc","oreZinc",1,MItemRegistry.zincOreItem,MBlockRegistry.zincOreBlock,-1,overworld,12),
		ALDUORITE("ingotAlduorite","oreAlduorite",1,MItemRegistry.alduoriteOreItem,MBlockRegistry.alduoriteOreBlock,-1,nether,14),
		CERUCLASE("ingotCeruclase","oreCeruclase",1,MItemRegistry.ceruclaseOreItem,MBlockRegistry.ceruclaseOreBlock,-1,nether,14),
		IGNATIUS("ingotIgnatius","oreIgnatius",1,MItemRegistry.ignatiusOreItem,MBlockRegistry.ignatiusOreBlock,-1,nether,7),
		KALENDRITE("ingotKalendrite","oreKalendrite",1,MItemRegistry.kalendriteOreItem,MBlockRegistry.kalendriteOreBlock,-1,nether,128),
		LEMURITE("ingotLemurite","oreLemurite",1,MItemRegistry.lemuriteOreItem,MBlockRegistry.lemuriteOreBlock,-1,nether,12),
		MIDASIUM("ingotMidasium","oreMidasium",1,MItemRegistry.midasiumOreItem,MBlockRegistry.midasiumOreBlock,-1,nether,18),
		SANGUINITE("ingotSanguinite","oreSanguinite",1,MItemRegistry.sanguiniteOreItem,MBlockRegistry.sanguiniteOreBlock,-1,nether,128),
		SHADOWIRON("ingotShadow Iron","oreShadow Iron",1,MItemRegistry.shadowironOreItem,MBlockRegistry.shadowironOreBlock,-1,nether,8),
		VULCANITE("ingotVulcanite","oreVulcanite",1,MItemRegistry.vulcaniteOreItem,MBlockRegistry.vulcaniteOreBlock,-1,nether,128),
		VYROXERES("ingotVyroxeres","oreVyroxeres",1,MItemRegistry.vyroxeresOreItem,MBlockRegistry.vyroxeresOreBlock,-1,nether,64),
		EXIMITE("ingotEximite","oreEximite",1,MItemRegistry.eximiteOreItem,MBlockRegistry.eximiteOreBlock,-1,end,92),
		MEUTOITE("ingotMeutoite","oreMeutoite",1,MItemRegistry.meutoiteOreItem,MBlockRegistry.meutoiteOreBlock,-1,end,138),
		
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
		}
	}
	
	public static void CheckMetals()
	{
		for (Metals metals : Metals.values())
		{
		    // Skip if blocks or items are not created
		    if (metals.partial == null || metals.full == null)
		        continue;
		    
			ArrayList<ItemStack> ores = OreDictionary.getOres(metals.ore);
			if (!ores.isEmpty())
			{
				for (int i = 0; i < metals.dropgroup.length; i++)
				{
					if (metals.meta == -1)
					{
						SieveRegistry.register(metals.dropgroup[i], 0, metals.partial, i, metals.chance);
					}
					else
					{
						SieveRegistry.register(metals.dropgroup[i], 0, metals.partial, metals.meta, metals.chance);
					}
				}
				
				for (int i = 0; i < ores.size() ;i++)
				{
					if (metals.meta == -1)
					{
						HammerRegistry.registerOre(Block.getBlockFromItem(ores.get(i).getItem()), ores.get(i).getItemDamage(), metals.partial, 0);
					}
					else
					{
						HammerRegistry.registerOre(Block.getBlockFromItem(ores.get(i).getItem()), ores.get(i).getItemDamage(), metals.partial, metals.meta);
					}
				}
				
				if (metals.full != Blocks.redstone_wire)
				{
					for (int i = 0; i < metals.dropgroup.length; i++)
					{
						OreDictionary.registerOre(metals.ore, new ItemStack(metals.full,1,i));
					}
				}
			}
			
			ArrayList<ItemStack> ingots = OreDictionary.getOres(metals.ingot);
			if (metals.smeltnum > 0 && !ingots.isEmpty())
			{
				GameRegistry.addSmelting(metals.full, ingots.get(0), 3);
			}
		}
	}
}
