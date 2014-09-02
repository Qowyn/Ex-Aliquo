package exaliquo.bridges.Metallurgy;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict
{

	protected static void registerExMetallurgyOreDict()
	{
		for (int i = 0; i < 3; i++)
		{
			OreDictionary.registerOre("oreAdamantine", new ItemStack(MBlockRegistry.adamantineOreBlock, 1, i));
			OreDictionary.registerOre("oreAlduorite", new ItemStack(MBlockRegistry.alduoriteOreBlock, 1, i));
			OreDictionary.registerOre("oreAstral Silver", new ItemStack(MBlockRegistry.astralsilverOreBlock, 1, i));
			OreDictionary.registerOre("oreAtlarus", new ItemStack(MBlockRegistry.atlarusOreBlock, 1, i));
			OreDictionary.registerOre("oreCarmot", new ItemStack(MBlockRegistry.carmotOreBlock, 1, i));
			OreDictionary.registerOre("oreCeruclase", new ItemStack(MBlockRegistry.ceruclaseOreBlock, 1, i));
			OreDictionary.registerOre("oreDeep Iron", new ItemStack(MBlockRegistry.deepironOreBlock, 1, i));
			OreDictionary.registerOre("oreEximite", new ItemStack(MBlockRegistry.eximiteOreBlock, 1, i));
			OreDictionary.registerOre("oreIgnatius", new ItemStack(MBlockRegistry.ignatiusOreBlock, 1, i));
			OreDictionary.registerOre("oreInfuscolium", new ItemStack(MBlockRegistry.infuscoliumOreBlock, 1, i));
			OreDictionary.registerOre("oreKalendrite", new ItemStack(MBlockRegistry.kalendriteOreBlock, 1, i));
			OreDictionary.registerOre("oreLemurite", new ItemStack(MBlockRegistry.lemuriteOreBlock, 1, i));
			OreDictionary.registerOre("oreManganese", new ItemStack(MBlockRegistry.manganeseOreBlock, 1, i));
			OreDictionary.registerOre("oreMeutoite", new ItemStack(MBlockRegistry.meutoiteOreBlock, 1, i));
			OreDictionary.registerOre("oreMidasium", new ItemStack(MBlockRegistry.midasiumOreBlock, 1, i));
			OreDictionary.registerOre("oreMithril", new ItemStack(MBlockRegistry.mithrilOreBlock, 1, i));
			OreDictionary.registerOre("oreOrichalcum", new ItemStack(MBlockRegistry.orichalcumOreBlock, 1, i));
			OreDictionary.registerOre("oreOureclase", new ItemStack(MBlockRegistry.oureclaseOreBlock, 1, i));
			OreDictionary.registerOre("orePrometheum", new ItemStack(MBlockRegistry.prometheumOreBlock, 1, i));
			OreDictionary.registerOre("oreRubracium", new ItemStack(MBlockRegistry.rubraciumOreBlock, 1, i));
			OreDictionary.registerOre("oreSanguinite", new ItemStack(MBlockRegistry.sanguiniteOreBlock, 1, i));
			OreDictionary.registerOre("oreShadow Iron", new ItemStack(MBlockRegistry.shadowironOreBlock, 1, i));
			OreDictionary.registerOre("oreVulcanite", new ItemStack(MBlockRegistry.vulcaniteOreBlock, 1, i));
			OreDictionary.registerOre("oreVyroxeres", new ItemStack(MBlockRegistry.vyroxeresOreBlock, 1, i));
			OreDictionary.registerOre("oreZinc", new ItemStack(MBlockRegistry.zincOreBlock, 1, i));
		}
	}
}
