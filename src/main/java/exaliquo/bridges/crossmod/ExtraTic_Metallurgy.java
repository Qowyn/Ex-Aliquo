package exaliquo.bridges.crossmod;

import static exaliquo.data.MoltenMetals.dustCostGeneral;
import static exaliquo.data.MoltenMetals.dustCostSmeltery;
import static exaliquo.data.MoltenMetals.ingotCost;
import static exaliquo.data.MoltenMetals.ingotCostSmeltery;
import static net.minecraftforge.fluids.FluidRegistry.getFluid;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import tconstruct.library.crafting.Smeltery;
import exaliquo.bridges.Metallurgy.MBlockRegistry;
import exaliquo.bridges.Metallurgy.MItemRegistry;
import exaliquo.bridges.Metallurgy.MetallurgyBridge;
import exaliquo.data.Configurations;
import exnihilo.registries.CrucibleRegistry;

@Pulse(id = ExtraTic_Metallurgy.PULSE_ID, modsRequired = ExtraTic_Metallurgy.REQUIRED_MODS, pulsesRequired = ExtraTic_Metallurgy.REQUIRED_PULSES)
public class ExtraTic_Metallurgy
{
    public static final String PULSE_ID = "ExAliquo ExtraTic Metallurgy Module";
    
    public static final String REQUIRED_MODS = "ExtraTiC;" + MetallurgyBridge.MOD_ID;
    
    public static final String REQUIRED_PULSES = MetallurgyBridge.PULSE_ID;

    @Handler
	public void postInit(FMLPostInitializationEvent event)
	{
		for (int i = 0; i < 3; i++)
		{
			Smeltery.addMelting(MBlockRegistry.adamantineOreBlock, i, 550, new FluidStack(getFluid("adamantine.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.alduoriteOreBlock, i, 550, new FluidStack(getFluid("alduorite.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.astralsilverOreBlock, i, 550, new FluidStack(getFluid("astral.silver.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.atlarusOreBlock, i, 550, new FluidStack(getFluid("atlarus.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.carmotOreBlock, i, 550, new FluidStack(getFluid("carmot.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.ceruclaseOreBlock, i, 550, new FluidStack(getFluid("ceruclase.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.deepironOreBlock, i, 550, new FluidStack(getFluid("deep.iron.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.eximiteOreBlock, i, 550, new FluidStack(getFluid("eximite.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.ignatiusOreBlock, i, 550, new FluidStack(getFluid("ignatius.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.infuscoliumOreBlock, i, 550, new FluidStack(getFluid("infuscolium.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.kalendriteOreBlock, i, 550, new FluidStack(getFluid("kalendrite.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.lemuriteOreBlock, i, 550, new FluidStack(getFluid("lemurite.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.manganeseOreBlock, i, 700, new FluidStack(getFluid("manganese.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.meutoiteOreBlock, i, 550, new FluidStack(getFluid("meutoite.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.midasiumOreBlock, i, 550, new FluidStack(getFluid("midasium.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.mithrilOreBlock, i, 550, new FluidStack(getFluid("mithril.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.orichalcumOreBlock, i, 550, new FluidStack(getFluid("orichalcum.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.oureclaseOreBlock, i, 550, new FluidStack(getFluid("oureclase.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.prometheumOreBlock, i, 550, new FluidStack(getFluid("prometheum.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.rubraciumOreBlock, i, 550, new FluidStack(getFluid("rubracium.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.sanguiniteOreBlock, i, 550, new FluidStack(getFluid("sanguinite.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.shadowironOreBlock, i, 550, new FluidStack(getFluid("shadow.iron.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.vulcaniteOreBlock, i, 550, new FluidStack(getFluid("vulcanite.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.vyroxeresOreBlock, i, 550, new FluidStack(getFluid("vyroxeres.molten"), ingotCostSmeltery));
			Smeltery.addMelting(MBlockRegistry.zincOreBlock, i, 550, new FluidStack(getFluid("zinc.molten"), ingotCostSmeltery));

			if (Configurations.miniSmelting)
			{
				CrucibleRegistry.register(MBlockRegistry.adamantineOreBlock, i, ingotCost*2, getFluid("adamantine.molten"), ingotCost, MBlockRegistry.adamantineOreBlock);
				CrucibleRegistry.register(MBlockRegistry.alduoriteOreBlock, i, ingotCost*2, getFluid("alduorite.molten"), ingotCost, MBlockRegistry.alduoriteOreBlock);
				CrucibleRegistry.register(MBlockRegistry.astralsilverOreBlock, i, ingotCost*2, getFluid("astral.silver.molten"), ingotCost, MBlockRegistry.astralsilverOreBlock);
				CrucibleRegistry.register(MBlockRegistry.atlarusOreBlock, i, ingotCost*2, getFluid("atlarus.molten"), ingotCost, MBlockRegistry.atlarusOreBlock);
				CrucibleRegistry.register(MBlockRegistry.carmotOreBlock, i, ingotCost*2, getFluid("carmot.molten"), ingotCost, MBlockRegistry.carmotOreBlock);
				CrucibleRegistry.register(MBlockRegistry.ceruclaseOreBlock, i, ingotCost*2, getFluid("ceruclase.molten"), ingotCost, MBlockRegistry.ceruclaseOreBlock);
				CrucibleRegistry.register(MBlockRegistry.deepironOreBlock, i, ingotCost*2, getFluid("deep.iron.molten"), ingotCost, MBlockRegistry.deepironOreBlock);
				CrucibleRegistry.register(MBlockRegistry.eximiteOreBlock, i, ingotCost*2, getFluid("eximite.molten"), ingotCost, MBlockRegistry.eximiteOreBlock);
				CrucibleRegistry.register(MBlockRegistry.ignatiusOreBlock, i, ingotCost*2, getFluid("ignatius.molten"), ingotCost, MBlockRegistry.ignatiusOreBlock);
				CrucibleRegistry.register(MBlockRegistry.infuscoliumOreBlock, i, ingotCost*2, getFluid("infuscolium.molten"), ingotCost, MBlockRegistry.infuscoliumOreBlock);
				CrucibleRegistry.register(MBlockRegistry.kalendriteOreBlock, i, ingotCost*2, getFluid("kalendrite.molten"), ingotCost, MBlockRegistry.kalendriteOreBlock);
				CrucibleRegistry.register(MBlockRegistry.lemuriteOreBlock, i, ingotCost*2, getFluid("lemurite.molten"), ingotCost, MBlockRegistry.lemuriteOreBlock);
				CrucibleRegistry.register(MBlockRegistry.manganeseOreBlock, i, ingotCost*2, getFluid("manganese.molten"), ingotCost, MBlockRegistry.manganeseOreBlock);
				CrucibleRegistry.register(MBlockRegistry.meutoiteOreBlock, i, ingotCost*2, getFluid("meutoite.molten"), ingotCost, MBlockRegistry.meutoiteOreBlock);
				CrucibleRegistry.register(MBlockRegistry.midasiumOreBlock, i, ingotCost*2, getFluid("midasium.molten"), ingotCost, MBlockRegistry.midasiumOreBlock);
				CrucibleRegistry.register(MBlockRegistry.mithrilOreBlock, i, ingotCost*2, getFluid("mithril.molten"), ingotCost, MBlockRegistry.mithrilOreBlock);
				CrucibleRegistry.register(MBlockRegistry.orichalcumOreBlock, i, ingotCost*2, getFluid("orichalcum.molten"), ingotCost, MBlockRegistry.orichalcumOreBlock);
				CrucibleRegistry.register(MBlockRegistry.oureclaseOreBlock, i, ingotCost*2, getFluid("oureclase.molten"), ingotCost, MBlockRegistry.oureclaseOreBlock);
				CrucibleRegistry.register(MBlockRegistry.prometheumOreBlock, i, ingotCost*2, getFluid("prometheum.molten"), ingotCost, MBlockRegistry.prometheumOreBlock);
				CrucibleRegistry.register(MBlockRegistry.rubraciumOreBlock, i, ingotCost*2, getFluid("rubracium.molten"), ingotCost, MBlockRegistry.rubraciumOreBlock);
				CrucibleRegistry.register(MBlockRegistry.sanguiniteOreBlock, i, ingotCost*2, getFluid("sanguinite.molten"), ingotCost, MBlockRegistry.sanguiniteOreBlock);
				CrucibleRegistry.register(MBlockRegistry.vulcaniteOreBlock, i, ingotCost*2, getFluid("vulcanite.molten"), ingotCost, MBlockRegistry.vulcaniteOreBlock);
				CrucibleRegistry.register(MBlockRegistry.vyroxeresOreBlock, i, ingotCost*2, getFluid("vyroxeres.molten"), ingotCost, MBlockRegistry.vyroxeresOreBlock);
				CrucibleRegistry.register(MBlockRegistry.zincOreBlock, i, ingotCost*2, getFluid("zinc.molten"), ingotCost, MBlockRegistry.zincOreBlock);
			}

			if (Configurations.allowDustSmelting)
			{
				Smeltery.addMelting(new ItemStack(MItemRegistry.adamantineOreItem, 4, i), MBlockRegistry.adamantineOreBlock, i ,550, new FluidStack(getFluid("adamantine.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.alduoriteOreItem, 4, i), MBlockRegistry.alduoriteOreBlock, i ,550, new FluidStack(getFluid("alduorite.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.astralsilverOreItem, 4, i), MBlockRegistry.astralsilverOreBlock, i ,550, new FluidStack(getFluid("astral.silver.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.atlarusOreItem, 4, i), MBlockRegistry.atlarusOreBlock, i ,550, new FluidStack(getFluid("atlarus.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.carmotOreItem, 4, i), MBlockRegistry.carmotOreBlock, i ,550, new FluidStack(getFluid("carmot.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.ceruclaseOreItem, 4, i), MBlockRegistry.ceruclaseOreBlock, i ,550, new FluidStack(getFluid("ceruclase.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.deepironOreItem, 4, i), MBlockRegistry.deepironOreBlock, i ,550, new FluidStack(getFluid("deep.iron.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.eximiteOreItem, 4, i), MBlockRegistry.eximiteOreBlock, i ,550, new FluidStack(getFluid("eximite.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.ignatiusOreItem, 4, i), MBlockRegistry.ignatiusOreBlock, i ,550, new FluidStack(getFluid("ignatius.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.infuscoliumOreItem, 4, i), MBlockRegistry.infuscoliumOreBlock, i ,550, new FluidStack(getFluid("infuscolium.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.kalendriteOreItem, 4, i), MBlockRegistry.kalendriteOreBlock, i ,550, new FluidStack(getFluid("kalendrite.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.lemuriteOreItem, 4, i), MBlockRegistry.lemuriteOreBlock, i ,550, new FluidStack(getFluid("lemurite.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.manganeseOreItem, 4, i), MBlockRegistry.manganeseOreBlock, i ,700, new FluidStack(getFluid("manganese.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.meutoiteOreItem, 4, i), MBlockRegistry.meutoiteOreBlock, i ,550, new FluidStack(getFluid("meutoite.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.midasiumOreItem, 4, i), MBlockRegistry.midasiumOreBlock, i ,550, new FluidStack(getFluid("midasium.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.mithrilOreItem, 4, i), MBlockRegistry.mithrilOreBlock, i ,550, new FluidStack(getFluid("mithril.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.orichalcumOreItem, 4, i), MBlockRegistry.orichalcumOreBlock, i ,550, new FluidStack(getFluid("orichalcum.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.oureclaseOreItem, 4, i), MBlockRegistry.oureclaseOreBlock, i ,550, new FluidStack(getFluid("oureclase.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.prometheumOreItem, 4, i), MBlockRegistry.prometheumOreBlock, i ,550, new FluidStack(getFluid("prometheum.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.rubraciumOreItem, 4, i), MBlockRegistry.rubraciumOreBlock, i ,550, new FluidStack(getFluid("rubracium.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.sanguiniteOreItem, 4, i), MBlockRegistry.sanguiniteOreBlock, i ,550, new FluidStack(getFluid("sanguinite.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.shadowironOreItem, 4, i), MBlockRegistry.shadowironOreBlock, i ,550, new FluidStack(getFluid("shadow.iron.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.vulcaniteOreItem, 4, i), MBlockRegistry.vulcaniteOreBlock, i ,550, new FluidStack(getFluid("vulcanite.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.vyroxeresOreItem, 4, i), MBlockRegistry.vyroxeresOreBlock, i ,550, new FluidStack(getFluid("vyroxeres.molten"), dustCostSmeltery));
				Smeltery.addMelting(new ItemStack(MItemRegistry.zincOreItem, 4, i), MBlockRegistry.zincOreBlock, i ,550, new FluidStack(getFluid("zinc.molten"), dustCostSmeltery));

				if (Configurations.miniSmelting)
				{
					/*CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.adamantineOreItem), i, dustCostGeneral*2, getFluid("adamantine.molten"), dustCostGeneral, MBlockRegistry.adamantineOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.alduoriteOreItem), i, dustCostGeneral*2, getFluid("alduorite.molten"), dustCostGeneral, MBlockRegistry.alduoriteOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.astralsilverOreItem), i, dustCostGeneral*2, getFluid("astral.silver.molten"), dustCostGeneral, MBlockRegistry.astralsilverOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.atlarusOreItem), i, dustCostGeneral*2, getFluid("atlarus.molten"), dustCostGeneral, MBlockRegistry.atlarusOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.carmotOreItem), i, dustCostGeneral*2, getFluid("carmot.molten"), dustCostGeneral, MBlockRegistry.carmotOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.ceruclaseOreItem), i, dustCostGeneral*2, getFluid("ceruclase.molten"), dustCostGeneral, MBlockRegistry.ceruclaseOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.deepironOreItem), i, dustCostGeneral*2, getFluid("deep.iron.molten"), dustCostGeneral, MBlockRegistry.deepironOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.eximiteOreItem), i, dustCostGeneral*2, getFluid("eximite.molten"), dustCostGeneral, MBlockRegistry.eximiteOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.ignatiusOreItem), i, dustCostGeneral*2, getFluid("ignatius.molten"), dustCostGeneral, MBlockRegistry.ignatiusOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.infuscoliumOreItem), i, dustCostGeneral*2, getFluid("infuscolium.molten"), dustCostGeneral, MBlockRegistry.infuscoliumOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.kalendriteOreItem), i, dustCostGeneral*2, getFluid("kalendrite.molten"), dustCostGeneral, MBlockRegistry.kalendriteOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.lemuriteOreItem), i, dustCostGeneral*2, getFluid("lemurite.molten"), dustCostGeneral, MBlockRegistry.lemuriteOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.manganeseOreItem), i, dustCostGeneral*2, getFluid("manganese.molten"), dustCostGeneral, MBlockRegistry.manganeseOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.meutoiteOreItem), i, dustCostGeneral*2, getFluid("meutoite.molten"), dustCostGeneral, MBlockRegistry.meutoiteOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.midasiumOreItem), i, dustCostGeneral*2, getFluid("midasium.molten"), dustCostGeneral, MBlockRegistry.midasiumOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.mithrilOreItem), i, dustCostGeneral*2, getFluid("mithril.molten"), dustCostGeneral, MBlockRegistry.mithrilOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.orichalcumOreItem), i, dustCostGeneral*2, getFluid("orichalcum.molten"), dustCostGeneral, MBlockRegistry.orichalcumOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.oureclaseOreItem), i, dustCostGeneral*2, getFluid("oureclase.molten"), dustCostGeneral, MBlockRegistry.oureclaseOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.prometheumOreItem), i, dustCostGeneral*2, getFluid("prometheum.molten"), dustCostGeneral, MBlockRegistry.prometheumOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.rubraciumOreItem), i, dustCostGeneral*2, getFluid("rubracium.molten"), dustCostGeneral, MBlockRegistry.rubraciumOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.sanguiniteOreItem), i, dustCostGeneral*2, getFluid("sanguinite.molten"), dustCostGeneral, MBlockRegistry.sanguiniteOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.vulcaniteOreItem), i, dustCostGeneral*2, getFluid("vulcanite.molten"), dustCostGeneral, MBlockRegistry.vulcaniteOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.vyroxeresOreItem), i, dustCostGeneral*2, getFluid("vyroxeres.molten"), dustCostGeneral, MBlockRegistry.vyroxeresOreBlock);
					CrucibleRegistry.register(Block.getBlockFromItem(MItemRegistry.zincOreItem), i, dustCostGeneral*2, getFluid("zinc.molten"), dustCostGeneral, MBlockRegistry.zincOreBlock);*/
				}
			}
		}
	}
}
