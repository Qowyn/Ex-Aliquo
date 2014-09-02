package exaliquo.bridges.Metallurgy;

import static exnihilo.registries.HammerRegistry.registerOre;

public class Hammering
{

	protected static void HammerMetallurgy()
	{
		for (int i = 0; i < 2; i++)
		{
			registerOre(MBlockRegistry.adamantineOreBlock, i, MItemRegistry.adamantineOreItem, i+1);
			registerOre(MBlockRegistry.alduoriteOreBlock, i, MItemRegistry.alduoriteOreItem, i+1);
			registerOre(MBlockRegistry.astralsilverOreBlock, i, MItemRegistry.astralsilverOreItem, i+1);
			registerOre(MBlockRegistry.atlarusOreBlock, i, MItemRegistry.atlarusOreItem, i+1);
			registerOre(MBlockRegistry.carmotOreBlock, i, MItemRegistry.carmotOreItem, i+1);
			registerOre(MBlockRegistry.ceruclaseOreBlock, i, MItemRegistry.ceruclaseOreItem, i+1);
			registerOre(MBlockRegistry.deepironOreBlock, i, MItemRegistry.deepironOreItem, i+1);
			registerOre(MBlockRegistry.eximiteOreBlock, i, MItemRegistry.eximiteOreItem, i+1);
			registerOre(MBlockRegistry.ignatiusOreBlock, i, MItemRegistry.ignatiusOreItem, i+1);
			registerOre(MBlockRegistry.infuscoliumOreBlock, i, MItemRegistry.infuscoliumOreItem, i+1);
			registerOre(MBlockRegistry.kalendriteOreBlock, i, MItemRegistry.kalendriteOreItem, i+1);
			registerOre(MBlockRegistry.lemuriteOreBlock, i, MItemRegistry.lemuriteOreItem, i+1);
			registerOre(MBlockRegistry.manganeseOreBlock, i, MItemRegistry.manganeseOreItem, i+1);
			registerOre(MBlockRegistry.meutoiteOreBlock, i, MItemRegistry.meutoiteOreItem, i+1);
			registerOre(MBlockRegistry.midasiumOreBlock, i, MItemRegistry.midasiumOreItem, i+1);
			registerOre(MBlockRegistry.mithrilOreBlock, i, MItemRegistry.mithrilOreItem, i+1);
			registerOre(MBlockRegistry.orichalcumOreBlock, i, MItemRegistry.orichalcumOreItem, i+1);
			registerOre(MBlockRegistry.oureclaseOreBlock, i, MItemRegistry.oureclaseOreItem, i+1);
			registerOre(MBlockRegistry.prometheumOreBlock, i, MItemRegistry.prometheumOreItem, i+1);
			registerOre(MBlockRegistry.rubraciumOreBlock, i, MItemRegistry.rubraciumOreItem, i+1);
			registerOre(MBlockRegistry.sanguiniteOreBlock, i, MItemRegistry.sanguiniteOreItem, i+1);
			registerOre(MBlockRegistry.shadowironOreBlock, i, MItemRegistry.shadowironOreItem, i+1);
			registerOre(MBlockRegistry.vulcaniteOreBlock, i, MItemRegistry.vulcaniteOreItem, i+1);
			registerOre(MBlockRegistry.vyroxeresOreBlock, i, MItemRegistry.vyroxeresOreItem, i+1);
			registerOre(MBlockRegistry.zincOreBlock, i, MItemRegistry.zincOreItem, i+1);
		}
	}
}
