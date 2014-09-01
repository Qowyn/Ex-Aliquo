package exaliquo.bridges.crossmod;

import static exaliquo.data.MoltenMetals.dustCostGeneral;
import static exaliquo.data.MoltenMetals.dustCostSmeltery;
import static exaliquo.data.MoltenMetals.ingotCost;
import static exaliquo.data.MoltenMetals.ingotCostSmeltery;
import static net.minecraftforge.fluids.FluidRegistry.getFluid;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import tconstruct.library.crafting.Smeltery;
import exaliquo.Registries;
import exaliquo.bridges.Metallurgy.MetallurgyBridge;
import exaliquo.data.Configurations;
import exnihilo.registries.CrucibleRegistry;

@Pulse(id = ExtraTic_Metallurgy.PULSE_ID, modsRequired = ExtraTic_Metallurgy.REQUIRED_MODS)
public class ExtraTic_Metallurgy
{
    public static final String PULSE_ID = "ExAliquo ExtraTic Metallurgy Module";
    
    public static final String REQUIRED_MODS = "ExtraTiC;" + MetallurgyBridge.MOD_ID;

    @Handler
	public void postInit(FMLPostInitializationEvent event)
	{
		for (int i = 0; i < 3; i++)
		{
			Smeltery.addMelting(Registries.adamantineOreBlock, i, 550, new FluidStack(getFluid("adamantine.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.alduoriteOreBlock, i, 550, new FluidStack(getFluid("alduorite.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.astralsilverOreBlock, i, 550, new FluidStack(getFluid("astral.silver.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.atlarusOreBlock, i, 550, new FluidStack(getFluid("atlarus.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.carmotOreBlock, i, 550, new FluidStack(getFluid("carmot.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.ceruclaseOreBlock, i, 550, new FluidStack(getFluid("ceruclase.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.deepironOreBlock, i, 550, new FluidStack(getFluid("deep.iron.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.eximiteOreBlock, i, 550, new FluidStack(getFluid("eximite.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.ignatiusOreBlock, i, 550, new FluidStack(getFluid("ignatius.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.infuscoliumOreBlock, i, 550, new FluidStack(getFluid("infuscolium.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.kalendriteOreBlock, i, 550, new FluidStack(getFluid("kalendrite.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.lemuriteOreBlock, i, 550, new FluidStack(getFluid("lemurite.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.manganeseOreBlock, i, 700, new FluidStack(getFluid("manganese.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.meutoiteOreBlock, i, 550, new FluidStack(getFluid("meutoite.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.midasiumOreBlock, i, 550, new FluidStack(getFluid("midasium.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.mithrilOreBlock, i, 550, new FluidStack(getFluid("mithril.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.orichalcumOreBlock, i, 550, new FluidStack(getFluid("orichalcum.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.oureclaseOreBlock, i, 550, new FluidStack(getFluid("oureclase.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.prometheumOreBlock, i, 550, new FluidStack(getFluid("prometheum.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.rubraciumOreBlock, i, 550, new FluidStack(getFluid("rubracium.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.sanguiniteOreBlock, i, 550, new FluidStack(getFluid("sanguinite.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.shadowironOreBlock, i, 550, new FluidStack(getFluid("shadow.iron.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.vulcaniteOreBlock, i, 550, new FluidStack(getFluid("vulcanite.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.vyroxeresOreBlock, i, 550, new FluidStack(getFluid("vyroxeres.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.zincOreBlock, i, 550, new FluidStack(getFluid("zinc.molten"), ingotCostSmeltery));

			if (Configurations.miniSmelting)
			{
				CrucibleRegistry.register(Registries.adamantineOreBlock, i, ingotCost*2, getFluid("adamantine.molten"), ingotCost, Registries.adamantineOreBlock);
				CrucibleRegistry.register(Registries.alduoriteOreBlock, i, ingotCost*2, getFluid("alduorite.molten"), ingotCost, Registries.alduoriteOreBlock);
				CrucibleRegistry.register(Registries.astralsilverOreBlock, i, ingotCost*2, getFluid("astral.silver.molten"), ingotCost, Registries.astralsilverOreBlock);
				CrucibleRegistry.register(Registries.atlarusOreBlock, i, ingotCost*2, getFluid("atlarus.molten"), ingotCost, Registries.atlarusOreBlock);
				CrucibleRegistry.register(Registries.carmotOreBlock, i, ingotCost*2, getFluid("carmot.molten"), ingotCost, Registries.carmotOreBlock);
				CrucibleRegistry.register(Registries.ceruclaseOreBlock, i, ingotCost*2, getFluid("ceruclase.molten"), ingotCost, Registries.ceruclaseOreBlock);
				CrucibleRegistry.register(Registries.deepironOreBlock, i, ingotCost*2, getFluid("deep.iron.molten"), ingotCost, Registries.deepironOreBlock);
				CrucibleRegistry.register(Registries.eximiteOreBlock, i, ingotCost*2, getFluid("eximite.molten"), ingotCost, Registries.eximiteOreBlock);
				CrucibleRegistry.register(Registries.ignatiusOreBlock, i, ingotCost*2, getFluid("ignatius.molten"), ingotCost, Registries.ignatiusOreBlock);
				CrucibleRegistry.register(Registries.infuscoliumOreBlock, i, ingotCost*2, getFluid("infuscolium.molten"), ingotCost, Registries.infuscoliumOreBlock);
				CrucibleRegistry.register(Registries.kalendriteOreBlock, i, ingotCost*2, getFluid("kalendrite.molten"), ingotCost, Registries.kalendriteOreBlock);
				CrucibleRegistry.register(Registries.lemuriteOreBlock, i, ingotCost*2, getFluid("lemurite.molten"), ingotCost, Registries.lemuriteOreBlock);
				CrucibleRegistry.register(Registries.manganeseOreBlock, i, ingotCost*2, getFluid("manganese.molten"), ingotCost, Registries.manganeseOreBlock);
				CrucibleRegistry.register(Registries.meutoiteOreBlock, i, ingotCost*2, getFluid("meutoite.molten"), ingotCost, Registries.meutoiteOreBlock);
				CrucibleRegistry.register(Registries.midasiumOreBlock, i, ingotCost*2, getFluid("midasium.molten"), ingotCost, Registries.midasiumOreBlock);
				CrucibleRegistry.register(Registries.mithrilOreBlock, i, ingotCost*2, getFluid("mithril.molten"), ingotCost, Registries.mithrilOreBlock);
				CrucibleRegistry.register(Registries.orichalcumOreBlock, i, ingotCost*2, getFluid("orichalcum.molten"), ingotCost, Registries.orichalcumOreBlock);
				CrucibleRegistry.register(Registries.oureclaseOreBlock, i, ingotCost*2, getFluid("oureclase.molten"), ingotCost, Registries.oureclaseOreBlock);
				CrucibleRegistry.register(Registries.prometheumOreBlock, i, ingotCost*2, getFluid("prometheum.molten"), ingotCost, Registries.prometheumOreBlock);
				CrucibleRegistry.register(Registries.rubraciumOreBlock, i, ingotCost*2, getFluid("rubracium.molten"), ingotCost, Registries.rubraciumOreBlock);
				CrucibleRegistry.register(Registries.sanguiniteOreBlock, i, ingotCost*2, getFluid("sanguinite.molten"), ingotCost, Registries.sanguiniteOreBlock);
				CrucibleRegistry.register(Registries.vulcaniteOreBlock, i, ingotCost*2, getFluid("vulcanite.molten"), ingotCost, Registries.vulcaniteOreBlock);
				CrucibleRegistry.register(Registries.vyroxeresOreBlock, i, ingotCost*2, getFluid("vyroxeres.molten"), ingotCost, Registries.vyroxeresOreBlock);
				CrucibleRegistry.register(Registries.zincOreBlock, i, ingotCost*2, getFluid("zinc.molten"), ingotCost, Registries.zincOreBlock);
			}

			if (Configurations.allowDustSmelting)
			{
				Smeltery.addMelting(new ItemStack(Registries.adamantineOreItem, 4, i), Registries.adamantineOreBlock, i ,550, new FluidStack(getFluid("adamantine.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.alduoriteOreItem, 4, i), Registries.alduoriteOreBlock, i ,550, new FluidStack(getFluid("alduorite.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.astralsilverOreItem, 4, i), Registries.astralsilverOreBlock, i ,550, new FluidStack(getFluid("astral.silver.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.atlarusOreItem, 4, i), Registries.atlarusOreBlock, i ,550, new FluidStack(getFluid("atlarus.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.carmotOreItem, 4, i), Registries.carmotOreBlock, i ,550, new FluidStack(getFluid("carmot.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.ceruclaseOreItem, 4, i), Registries.ceruclaseOreBlock, i ,550, new FluidStack(getFluid("ceruclase.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.deepironOreItem, 4, i), Registries.deepironOreBlock, i ,550, new FluidStack(getFluid("deep.iron.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.eximiteOreItem, 4, i), Registries.eximiteOreBlock, i ,550, new FluidStack(getFluid("eximite.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.ignatiusOreItem, 4, i), Registries.ignatiusOreBlock, i ,550, new FluidStack(getFluid("ignatius.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.infuscoliumOreItem, 4, i), Registries.infuscoliumOreBlock, i ,550, new FluidStack(getFluid("infuscolium.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.kalendriteOreItem, 4, i), Registries.kalendriteOreBlock, i ,550, new FluidStack(getFluid("kalendrite.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.lemuriteOreItem, 4, i), Registries.lemuriteOreBlock, i ,550, new FluidStack(getFluid("lemurite.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.manganeseOreItem, 4, i), Registries.manganeseOreBlock, i ,700, new FluidStack(getFluid("manganese.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.meutoiteOreItem, 4, i), Registries.meutoiteOreBlock, i ,550, new FluidStack(getFluid("meutoite.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.midasiumOreItem, 4, i), Registries.midasiumOreBlock, i ,550, new FluidStack(getFluid("midasium.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.mithrilOreItem, 4, i), Registries.mithrilOreBlock, i ,550, new FluidStack(getFluid("mithril.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.orichalcumOreItem, 4, i), Registries.orichalcumOreBlock, i ,550, new FluidStack(getFluid("orichalcum.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.oureclaseOreItem, 4, i), Registries.oureclaseOreBlock, i ,550, new FluidStack(getFluid("oureclase.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.prometheumOreItem, 4, i), Registries.prometheumOreBlock, i ,550, new FluidStack(getFluid("prometheum.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.rubraciumOreItem, 4, i), Registries.rubraciumOreBlock, i ,550, new FluidStack(getFluid("rubracium.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.sanguiniteOreItem, 4, i), Registries.sanguiniteOreBlock, i ,550, new FluidStack(getFluid("sanguinite.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.shadowironOreItem, 4, i), Registries.shadowironOreBlock, i ,550, new FluidStack(getFluid("shadow.iron.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.vulcaniteOreItem, 4, i), Registries.vulcaniteOreBlock, i ,550, new FluidStack(getFluid("vulcanite.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.vyroxeresOreItem, 4, i), Registries.vyroxeresOreBlock, i ,550, new FluidStack(getFluid("vyroxeres.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(Registries.zincOreItem, 4, i), Registries.zincOreBlock, i ,550, new FluidStack(getFluid("zinc.molten"), dustCostSmeltery));

				if (Configurations.miniSmelting)
				{
					/*CrucibleRegistry.register(Block.getBlockFromItem(Registries.adamantineOreItem), i, dustCostGeneral*2, getFluid("adamantine.molten"), dustCostGeneral, Registries.adamantineOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.alduoriteOreItem), i, dustCostGeneral*2, getFluid("alduorite.molten"), dustCostGeneral, Registries.alduoriteOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.astralsilverOreItem), i, dustCostGeneral*2, getFluid("astral.silver.molten"), dustCostGeneral, Registries.astralsilverOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.atlarusOreItem), i, dustCostGeneral*2, getFluid("atlarus.molten"), dustCostGeneral, Registries.atlarusOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.carmotOreItem), i, dustCostGeneral*2, getFluid("carmot.molten"), dustCostGeneral, Registries.carmotOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.ceruclaseOreItem), i, dustCostGeneral*2, getFluid("ceruclase.molten"), dustCostGeneral, Registries.ceruclaseOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.deepironOreItem), i, dustCostGeneral*2, getFluid("deep.iron.molten"), dustCostGeneral, Registries.deepironOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.eximiteOreItem), i, dustCostGeneral*2, getFluid("eximite.molten"), dustCostGeneral, Registries.eximiteOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.ignatiusOreItem), i, dustCostGeneral*2, getFluid("ignatius.molten"), dustCostGeneral, Registries.ignatiusOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.infuscoliumOreItem), i, dustCostGeneral*2, getFluid("infuscolium.molten"), dustCostGeneral, Registries.infuscoliumOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.kalendriteOreItem), i, dustCostGeneral*2, getFluid("kalendrite.molten"), dustCostGeneral, Registries.kalendriteOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.lemuriteOreItem), i, dustCostGeneral*2, getFluid("lemurite.molten"), dustCostGeneral, Registries.lemuriteOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.manganeseOreItem), i, dustCostGeneral*2, getFluid("manganese.molten"), dustCostGeneral, Registries.manganeseOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.meutoiteOreItem), i, dustCostGeneral*2, getFluid("meutoite.molten"), dustCostGeneral, Registries.meutoiteOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.midasiumOreItem), i, dustCostGeneral*2, getFluid("midasium.molten"), dustCostGeneral, Registries.midasiumOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.mithrilOreItem), i, dustCostGeneral*2, getFluid("mithril.molten"), dustCostGeneral, Registries.mithrilOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.orichalcumOreItem), i, dustCostGeneral*2, getFluid("orichalcum.molten"), dustCostGeneral, Registries.orichalcumOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.oureclaseOreItem), i, dustCostGeneral*2, getFluid("oureclase.molten"), dustCostGeneral, Registries.oureclaseOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.prometheumOreItem), i, dustCostGeneral*2, getFluid("prometheum.molten"), dustCostGeneral, Registries.prometheumOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.rubraciumOreItem), i, dustCostGeneral*2, getFluid("rubracium.molten"), dustCostGeneral, Registries.rubraciumOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.sanguiniteOreItem), i, dustCostGeneral*2, getFluid("sanguinite.molten"), dustCostGeneral, Registries.sanguiniteOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.vulcaniteOreItem), i, dustCostGeneral*2, getFluid("vulcanite.molten"), dustCostGeneral, Registries.vulcaniteOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.vyroxeresOreItem), i, dustCostGeneral*2, getFluid("vyroxeres.molten"), dustCostGeneral, Registries.vyroxeresOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(Registries.zincOreItem), i, dustCostGeneral*2, getFluid("zinc.molten"), dustCostGeneral, Registries.zincOreBlock);*/
				}
			}
		}
	}
}
