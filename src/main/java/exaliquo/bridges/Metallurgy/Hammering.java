package exaliquo.bridges.Metallurgy;

import exaliquo.Registries;
import static exnihilo.registries.HammerRegistry.registerOre;

public class Hammering
{

	protected static void HammerMetallurgy()
	{
		for (int i = 0; i < 2; i++)
		{
			registerOre(Registries.adamantineOreBlock, i, Registries.adamantineOreItem, i+1);
			registerOre(Registries.alduoriteOreBlock, i, Registries.alduoriteOreItem, i+1);
			registerOre(Registries.astralsilverOreBlock, i, Registries.astralsilverOreItem, i+1);
			registerOre(Registries.atlarusOreBlock, i, Registries.atlarusOreItem, i+1);
			registerOre(Registries.carmotOreBlock, i, Registries.carmotOreItem, i+1);
			registerOre(Registries.ceruclaseOreBlock, i, Registries.ceruclaseOreItem, i+1);
			registerOre(Registries.deepironOreBlock, i, Registries.deepironOreItem, i+1);
			registerOre(Registries.eximiteOreBlock, i, Registries.eximiteOreItem, i+1);
			registerOre(Registries.ignatiusOreBlock, i, Registries.ignatiusOreItem, i+1);
			registerOre(Registries.infuscoliumOreBlock, i, Registries.infuscoliumOreItem, i+1);
			registerOre(Registries.kalendriteOreBlock, i, Registries.kalendriteOreItem, i+1);
			registerOre(Registries.lemuriteOreBlock, i, Registries.lemuriteOreItem, i+1);
			registerOre(Registries.manganeseOreBlock, i, Registries.manganeseOreItem, i+1);
			registerOre(Registries.meutoiteOreBlock, i, Registries.meutoiteOreItem, i+1);
			registerOre(Registries.midasiumOreBlock, i, Registries.midasiumOreItem, i+1);
			registerOre(Registries.mithrilOreBlock, i, Registries.mithrilOreItem, i+1);
			registerOre(Registries.orichalcumOreBlock, i, Registries.orichalcumOreItem, i+1);
			registerOre(Registries.oureclaseOreBlock, i, Registries.oureclaseOreItem, i+1);
			registerOre(Registries.prometheumOreBlock, i, Registries.prometheumOreItem, i+1);
			registerOre(Registries.rubraciumOreBlock, i, Registries.rubraciumOreItem, i+1);
			registerOre(Registries.sanguiniteOreBlock, i, Registries.sanguiniteOreItem, i+1);
			registerOre(Registries.shadowironOreBlock, i, Registries.shadowironOreItem, i+1);
			registerOre(Registries.vulcaniteOreBlock, i, Registries.vulcaniteOreItem, i+1);
			registerOre(Registries.vyroxeresOreBlock, i, Registries.vyroxeresOreItem, i+1);
			registerOre(Registries.zincOreBlock, i, Registries.zincOreItem, i+1);
		}
	}
}
