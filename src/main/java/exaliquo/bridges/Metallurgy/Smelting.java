package exaliquo.bridges.Metallurgy;

import static exaliquo.data.MoltenMetals.*;
import static net.minecraftforge.fluids.FluidRegistry.getFluid;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import tconstruct.library.crafting.Smeltery;
import exaliquo.Registries;
import exaliquo.data.Configurations;
import exnihilo.registries.CrucibleRegistry;

public class Smelting
{

	protected static void SmeltMetallurgy()
	{
		for (int i = 0; i < 3; i++)
		{
			Smeltery.addMelting(Registries.adamantineOreBlock, i, 550, new FluidStack(getFluid("molten.adamantine"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.alduoriteOreBlock, i, 550, new FluidStack(getFluid("molten.alduorite"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.astralsilverOreBlock, i, 550, new FluidStack(getFluid("molten.astral.silver"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.atlarusOreBlock, i, 550, new FluidStack(getFluid("molten.atlarus"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.carmotOreBlock, i, 550, new FluidStack(getFluid("molten.carmot"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.ceruclaseOreBlock, i, 550, new FluidStack(getFluid("molten.ceruclase"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.deepironOreBlock, i, 550, new FluidStack(getFluid("molten.deep.iron"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.eximiteOreBlock, i, 550, new FluidStack(getFluid("molten.eximite"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.ignatiusOreBlock, i, 550, new FluidStack(getFluid("molten.ignatius"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.infuscoliumOreBlock, i, 550, new FluidStack(getFluid("molten.infuscolium"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.kalendriteOreBlock, i, 550, new FluidStack(getFluid("molten.kalendrite"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.lemuriteOreBlock, i, 550, new FluidStack(getFluid("molten.lemurite"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.manganeseOreBlock, i, 700, new FluidStack(getFluid("molten.manganese"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.meutoiteOreBlock, i, 550, new FluidStack(getFluid("molten.meutoite"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.midasiumOreBlock, i, 550, new FluidStack(getFluid("molten.midasium"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.mithrilOreBlock, i, 550, new FluidStack(getFluid("molten.mithril"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.orichalcumOreBlock, i, 550, new FluidStack(getFluid("molten.orichalcum"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.oureclaseOreBlock, i, 550, new FluidStack(getFluid("molten.oureclase"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.prometheumOreBlock, i, 550, new FluidStack(getFluid("molten.prometheum"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.rubraciumOreBlock, i, 550, new FluidStack(getFluid("molten.rubracium"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.sanguiniteOreBlock, i, 550, new FluidStack(getFluid("molten.sanguinite"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.shadowironOreBlock, i, 550, new FluidStack(getFluid("molten.shadow.iron"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.vulcaniteOreBlock, i, 550, new FluidStack(getFluid("molten.vulcanite"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.vyroxeresOreBlock, i, 550, new FluidStack(getFluid("molten.vyroxeres"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.zincOreBlock, i, 550, new FluidStack(getFluid("molten.zinc"), ingotCostSmeltery));

			if (Configurations.miniSmelting)
			{
				CrucibleRegistry.register(Registries.adamantineOreBlock, i, ingotCost*2, getFluid("adamantine.molten"), ingotCost, Registries.adamantineOreBlock);
				CrucibleRegistry.register(Registries.alduoriteOreBlock, i, ingotCost*2, getFluid("molten.alduorite"), ingotCost, Registries.alduoriteOreBlock);
				CrucibleRegistry.register(Registries.astralsilverOreBlock, i, ingotCost*2, getFluid("molten.astral.silver"), ingotCost, Registries.astralsilverOreBlock);
				CrucibleRegistry.register(Registries.atlarusOreBlock, i, ingotCost*2, getFluid("molten.atlarus"), ingotCost, Registries.atlarusOreBlock);
				CrucibleRegistry.register(Registries.carmotOreBlock, i, ingotCost*2, getFluid("molten.carmot"), ingotCost, Registries.carmotOreBlock);
				CrucibleRegistry.register(Registries.ceruclaseOreBlock, i, ingotCost*2, getFluid("molten.ceruclase"), ingotCost, Registries.ceruclaseOreBlock);
				CrucibleRegistry.register(Registries.deepironOreBlock, i, ingotCost*2, getFluid("molten.deep.iron"), ingotCost, Registries.deepironOreBlock);
				CrucibleRegistry.register(Registries.eximiteOreBlock, i, ingotCost*2, getFluid("molten.eximite"), ingotCost, Registries.eximiteOreBlock);
				CrucibleRegistry.register(Registries.ignatiusOreBlock, i, ingotCost*2, getFluid("molten.ignatius"), ingotCost, Registries.ignatiusOreBlock);
				CrucibleRegistry.register(Registries.infuscoliumOreBlock, i, ingotCost*2, getFluid("molten.infuscolium"), ingotCost, Registries.infuscoliumOreBlock);
				CrucibleRegistry.register(Registries.kalendriteOreBlock, i, ingotCost*2, getFluid("molten.kalendrite"), ingotCost, Registries.kalendriteOreBlock);
				CrucibleRegistry.register(Registries.lemuriteOreBlock, i, ingotCost*2, getFluid("molten.lemurite"), ingotCost, Registries.lemuriteOreBlock);
				CrucibleRegistry.register(Registries.manganeseOreBlock, i, ingotCost*2, getFluid("molten.manganese"), ingotCost, Registries.manganeseOreBlock);
				CrucibleRegistry.register(Registries.meutoiteOreBlock, i, ingotCost*2, getFluid("molten.meutoite"), ingotCost, Registries.meutoiteOreBlock);
				CrucibleRegistry.register(Registries.midasiumOreBlock, i, ingotCost*2, getFluid("molten.midasium"), ingotCost, Registries.midasiumOreBlock);
				CrucibleRegistry.register(Registries.mithrilOreBlock, i, ingotCost*2, getFluid("molten.mithril"), ingotCost, Registries.mithrilOreBlock);
				CrucibleRegistry.register(Registries.orichalcumOreBlock, i, ingotCost*2, getFluid("molten.orichalcum"), ingotCost, Registries.orichalcumOreBlock);
				CrucibleRegistry.register(Registries.oureclaseOreBlock, i, ingotCost*2, getFluid("molten.oureclase"), ingotCost, Registries.oureclaseOreBlock);
				CrucibleRegistry.register(Registries.prometheumOreBlock, i, ingotCost*2, getFluid("molten.prometheum"), ingotCost, Registries.prometheumOreBlock);
				CrucibleRegistry.register(Registries.rubraciumOreBlock, i, ingotCost*2, getFluid("molten.rubracium"), ingotCost, Registries.rubraciumOreBlock);
				CrucibleRegistry.register(Registries.sanguiniteOreBlock, i, ingotCost*2, getFluid("molten.sanguinite"), ingotCost, Registries.sanguiniteOreBlock);
				CrucibleRegistry.register(Registries.vulcaniteOreBlock, i, ingotCost*2, getFluid("molten.vulcanite"), ingotCost, Registries.vulcaniteOreBlock);
				CrucibleRegistry.register(Registries.vyroxeresOreBlock, i, ingotCost*2, getFluid("molten.vyroxeres"), ingotCost, Registries.vyroxeresOreBlock);
				CrucibleRegistry.register(Registries.zincOreBlock, i, ingotCost*2, getFluid("molten.zinc"), ingotCost, Registries.zincOreBlock);
			}

			if (Configurations.allowDustSmelting)
			{
				Smeltery.addMelting(new ItemStack(Registries.adamantineOreItem, 4, i), Registries.adamantineOreBlock, i ,550, new FluidStack(getFluid("molten.adamantine"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.alduoriteOreItem, 4, i), Registries.alduoriteOreBlock, i ,550, new FluidStack(getFluid("molten.alduorite"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.astralsilverOreItem, 4, i), Registries.astralsilverOreBlock, i ,550, new FluidStack(getFluid("molten.astral.silver"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.atlarusOreItem, 4, i), Registries.atlarusOreBlock, i ,550, new FluidStack(getFluid("molten.atlarus"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.carmotOreItem, 4, i), Registries.carmotOreBlock, i ,550, new FluidStack(getFluid("molten.carmot"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.ceruclaseOreItem, 4, i), Registries.ceruclaseOreBlock, i ,550, new FluidStack(getFluid("molten.ceruclase"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.deepironOreItem, 4, i), Registries.deepironOreBlock, i ,550, new FluidStack(getFluid("molten.deep.iron"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.eximiteOreItem, 4, i), Registries.eximiteOreBlock, i ,550, new FluidStack(getFluid("molten.eximite"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.ignatiusOreItem, 4, i), Registries.ignatiusOreBlock, i ,550, new FluidStack(getFluid("molten.ignatius"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.infuscoliumOreItem, 4, i), Registries.infuscoliumOreBlock, i ,550, new FluidStack(getFluid("molten.infuscolium"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.kalendriteOreItem, 4, i), Registries.kalendriteOreBlock, i ,550, new FluidStack(getFluid("molten.kalendrite"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.lemuriteOreItem, 4, i), Registries.lemuriteOreBlock, i ,550, new FluidStack(getFluid("molten.lemurite"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.manganeseOreItem, 4, i), Registries.manganeseOreBlock, i ,700, new FluidStack(getFluid("molten.manganese"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.meutoiteOreItem, 4, i), Registries.meutoiteOreBlock, i ,550, new FluidStack(getFluid("molten.meutoite"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.midasiumOreItem, 4, i), Registries.midasiumOreBlock, i ,550, new FluidStack(getFluid("molten.midasium"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.mithrilOreItem, 4, i), Registries.mithrilOreBlock, i ,550, new FluidStack(getFluid("molten.mithril"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.orichalcumOreItem, 4, i), Registries.orichalcumOreBlock, i ,550, new FluidStack(getFluid("molten.orichalcum"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.oureclaseOreItem, 4, i), Registries.oureclaseOreBlock, i ,550, new FluidStack(getFluid("molten.oureclase"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.prometheumOreItem, 4, i), Registries.prometheumOreBlock, i ,550, new FluidStack(getFluid("molten.prometheum"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.rubraciumOreItem, 4, i), Registries.rubraciumOreBlock, i ,550, new FluidStack(getFluid("molten.rubracium"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.sanguiniteOreItem, 4, i), Registries.sanguiniteOreBlock, i ,550, new FluidStack(getFluid("molten.sanguinite"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.shadowironOreItem, 4, i), Registries.shadowironOreBlock, i ,550, new FluidStack(getFluid("molten.shadow.iron"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.vulcaniteOreItem, 4, i), Registries.vulcaniteOreBlock, i ,550, new FluidStack(getFluid("molten.vulcanite"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.vyroxeresOreItem, 4, i), Registries.vyroxeresOreBlock, i ,550, new FluidStack(getFluid("molten.vyroxeres"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.zincOreItem, 4, i), Registries.zincOreBlock, i ,550, new FluidStack(getFluid("molten.zinc"), dustCostSmeltery));

				if (Configurations.miniSmelting)
				{
					/*CrucibleRegistry.register(Registries.adamantineOreItem.itemID, i, dustCostGeneral*2, getFluid("adamantine.molten"), dustCostGeneral, Registries.adamantineOreBlock);
					CrucibleRegistry.register(Registries.alduoriteOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.alduorite"), dustCostGeneral, Registries.alduoriteOreBlock);
					CrucibleRegistry.register(Registries.astralsilverOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.astral.silver"), dustCostGeneral, Registries.astralsilverOreBlock);
					CrucibleRegistry.register(Registries.atlarusOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.atlarus"), dustCostGeneral, Registries.atlarusOreBlock);
					CrucibleRegistry.register(Registries.carmotOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.carmot"), dustCostGeneral, Registries.carmotOreBlock);
					CrucibleRegistry.register(Registries.ceruclaseOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.ceruclase"), dustCostGeneral, Registries.ceruclaseOreBlock);
					CrucibleRegistry.register(Registries.deepironOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.deep.iron"), dustCostGeneral, Registries.deepironOreBlock);
					CrucibleRegistry.register(Registries.eximiteOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.eximite"), dustCostGeneral, Registries.eximiteOreBlock);
					CrucibleRegistry.register(Registries.ignatiusOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.ignatius"), dustCostGeneral, Registries.ignatiusOreBlock);
					CrucibleRegistry.register(Registries.infuscoliumOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.infuscolium"), dustCostGeneral, Registries.infuscoliumOreBlock);
					CrucibleRegistry.register(Registries.kalendriteOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.kalendrite"), dustCostGeneral, Registries.kalendriteOreBlock);
					CrucibleRegistry.register(Registries.lemuriteOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.lemurite"), dustCostGeneral, Registries.lemuriteOreBlock);
					CrucibleRegistry.register(Registries.manganeseOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.manganese"), dustCostGeneral, Registries.manganeseOreBlock);
					CrucibleRegistry.register(Registries.meutoiteOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.meutoite"), dustCostGeneral, Registries.meutoiteOreBlock);
					CrucibleRegistry.register(Registries.midasiumOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.midasium"), dustCostGeneral, Registries.midasiumOreBlock);
					CrucibleRegistry.register(Registries.mithrilOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.mithril"), dustCostGeneral, Registries.mithrilOreBlock);
					CrucibleRegistry.register(Registries.orichalcumOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.orichalcum"), dustCostGeneral, Registries.orichalcumOreBlock);
					CrucibleRegistry.register(Registries.oureclaseOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.oureclase"), dustCostGeneral, Registries.oureclaseOreBlock);
					CrucibleRegistry.register(Registries.prometheumOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.prometheum"), dustCostGeneral, Registries.prometheumOreBlock);
					CrucibleRegistry.register(Registries.rubraciumOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.rubracium"), dustCostGeneral, Registries.rubraciumOreBlock);
					CrucibleRegistry.register(Registries.sanguiniteOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.sanguinite"), dustCostGeneral, Registries.sanguiniteOreBlock);
					CrucibleRegistry.register(Registries.vulcaniteOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.vulcanite"), dustCostGeneral, Registries.vulcaniteOreBlock);
					CrucibleRegistry.register(Registries.vyroxeresOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.vyroxeres"), dustCostGeneral, Registries.vyroxeresOreBlock);
					CrucibleRegistry.register(Registries.zincOreItem.itemID, i, dustCostGeneral*2, getFluid("molten.zinc"), dustCostGeneral, Registries.zincOreBlock);*/
				}
			}
		}
	}
}
