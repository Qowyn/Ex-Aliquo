package exaliquo.bridges.TConstruct;

import static exaliquo.data.ModIDs.getBlock;
import static exaliquo.data.ModIDs.getItem;
import static exaliquo.data.MoltenMetals.*;
import static net.minecraftforge.fluids.FluidRegistry.getFluid;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import tconstruct.library.crafting.Smeltery;
import exaliquo.Registries;
import exaliquo.data.Configurations;
import exaliquo.data.ModIDs.Info;
import exnihilo.registries.CrucibleRegistry;

public class Smelting
{

	protected static void SmeltTConstruct()
	{
		for (int i = 0; i < 3; i++)
		{
			Smeltery.addMelting(getBlock(Info.ironore), i, 600, new FluidStack(getFluid("iron.molten"), ingotCostSmeltery));
			Smeltery.addMelting(getBlock(Info.goldore), i, 400, new FluidStack(getFluid("gold.molten"), ingotCostSmeltery));
			Smeltery.addMelting(getBlock(Info.copperore), i, 550, new FluidStack(getFluid("copper.molten"), ingotCostSmeltery));
			Smeltery.addMelting(getBlock(Info.tinore), i, 400, new FluidStack(getFluid("tin.molten"), ingotCostSmeltery));
			Smeltery.addMelting(getBlock(Info.silverore), i, 400, new FluidStack(getFluid("silver.molten"), ingotCostSmeltery));
			Smeltery.addMelting(getBlock(Info.leadore), i, 400, new FluidStack(getFluid("lead.molten"), ingotCostSmeltery));
			Smeltery.addMelting(getBlock(Info.nickelore), i, 400, new FluidStack(getFluid("nickel.molten"), ingotCostSmeltery));
			Smeltery.addMelting(getBlock(Info.platinumore), i, 400, new FluidStack(getFluid("platinum.molten"), ingotCostSmeltery));
			Smeltery.addMelting(getBlock(Info.aluminumore), i, 400, new FluidStack(getFluid("aluminum.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.cobaltOreBlock, i, 650, new FluidStack(getFluid("cobalt.molten"), ingotCostSmeltery));
			Smeltery.addMelting(Registries.arditeOreBlock, i, 650, new FluidStack(getFluid("ardite.molten"), ingotCostSmeltery));			
			
			if (Configurations.miniSmelting)
			{
				CrucibleRegistry.register(getBlock(Info.ironore), i, ingotCost*2, getFluid("iron.molten"), ingotCost, getBlock(Info.ironore));
				CrucibleRegistry.register(getBlock(Info.goldore), i, ingotCost*2, getFluid("gold.molten"), ingotCost, getBlock(Info.goldore));
				CrucibleRegistry.register(getBlock(Info.copperore), i, ingotCost*2, getFluid("copper.molten"), ingotCost, getBlock(Info.copperore));
				CrucibleRegistry.register(getBlock(Info.tinore), i, ingotCost*2, getFluid("tin.molten"), ingotCost, getBlock(Info.tinore));
				CrucibleRegistry.register(getBlock(Info.silverore), i, ingotCost*2, getFluid("silver.molten"), ingotCost, getBlock(Info.silverore));
				CrucibleRegistry.register(getBlock(Info.leadore), i, ingotCost*2, getFluid("lead.molten"), ingotCost, getBlock(Info.leadore));
				CrucibleRegistry.register(getBlock(Info.nickelore), i, ingotCost*2, getFluid("nickel.molten"), ingotCost, getBlock(Info.nickelore));
				CrucibleRegistry.register(getBlock(Info.platinumore), i, ingotCost*2, getFluid("platinum.molten"), ingotCost, getBlock(Info.platinumore));
				CrucibleRegistry.register(getBlock(Info.aluminumore), i, ingotCost*2, getFluid("aluminum.molten"), ingotCost, getBlock(Info.aluminumore));
				CrucibleRegistry.register(Registries.cobaltOreBlock, i, ingotCost*2, getFluid("cobalt.molten"), ingotCost, Registries.cobaltOreBlock);
				CrucibleRegistry.register(Registries.arditeOreBlock, i, ingotCost*2, getFluid("ardite.molten"), ingotCost, Registries.arditeOreBlock);
			}
		}
		
		if (Configurations.allowDustSmelting)
		{
			Smeltery.addMelting(new ItemStack(getItem(Info.irongrav),4,0), getBlock(Info.ironore), 0, 600, new FluidStack(getFluid("iron.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.ironsand),4,0), getBlock(Info.ironore), 1, 600, new FluidStack(getFluid("iron.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.irondust),4,0), getBlock(Info.ironore), 2, 600, new FluidStack(getFluid("iron.molten"), dustCostSmeltery));

			Smeltery.addMelting(new ItemStack(getItem(Info.goldgrav),4,0), getBlock(Info.goldore), 0, 400, new FluidStack(getFluid("gold.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.goldsand),4,0), getBlock(Info.goldore), 1, 400, new FluidStack(getFluid("gold.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.golddust),4,0), getBlock(Info.goldore), 2, 400, new FluidStack(getFluid("gold.molten"), dustCostSmeltery));

			Smeltery.addMelting(new ItemStack(getItem(Info.coppergrav),4,0), getBlock(Info.copperore), 0, 550, new FluidStack(getFluid("copper.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.coppersand),4,0), getBlock(Info.copperore), 1, 550, new FluidStack(getFluid("copper.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.copperdust),4,0), getBlock(Info.copperore), 2, 550, new FluidStack(getFluid("copper.molten"), dustCostSmeltery));

			Smeltery.addMelting(new ItemStack(getItem(Info.tingrav),4,0), getBlock(Info.tinore), 0, 400, new FluidStack(getFluid("tin.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.tinsand),4,0), getBlock(Info.tinore), 1, 400, new FluidStack(getFluid("tin.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.tindust),4,0), getBlock(Info.tinore), 2, 400, new FluidStack(getFluid("tin.molten"), dustCostSmeltery));

			Smeltery.addMelting(new ItemStack(getItem(Info.silvergrav),4,0), getBlock(Info.silverore), 0, 400, new FluidStack(getFluid("silver.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.silversand),4,0), getBlock(Info.silverore), 1, 400, new FluidStack(getFluid("silver.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.silverdust),4,0), getBlock(Info.silverore), 2, 400, new FluidStack(getFluid("silver.molten"), dustCostSmeltery));

			Smeltery.addMelting(new ItemStack(getItem(Info.leadgrav),4,0), getBlock(Info.leadore), 0, 400, new FluidStack(getFluid("lead.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.leadsand),4,0), getBlock(Info.leadore), 1, 400, new FluidStack(getFluid("lead.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.leaddust),4,0), getBlock(Info.leadore), 2, 400, new FluidStack(getFluid("lead.molten"), dustCostSmeltery));

			Smeltery.addMelting(new ItemStack(getItem(Info.nickelgrav),4,0), getBlock(Info.nickelore), 0, 400, new FluidStack(getFluid("nickel.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.nickelsand),4,0), getBlock(Info.nickelore), 1, 400, new FluidStack(getFluid("nickel.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.nickeldust),4,0), getBlock(Info.nickelore), 2, 400, new FluidStack(getFluid("nickel.molten"), dustCostSmeltery));

			Smeltery.addMelting(new ItemStack(getItem(Info.platinumgrav),4,0), getBlock(Info.platinumore), 0, 400, new FluidStack(getFluid("platinum.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.platinumsand),4,0), getBlock(Info.platinumore), 1, 400, new FluidStack(getFluid("platinum.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.platinumdust),4,0), getBlock(Info.platinumore), 2, 400, new FluidStack(getFluid("platinum.molten"), dustCostSmeltery));
			
			Smeltery.addMelting(new ItemStack(getItem(Info.aluminumgrav),4,0), getBlock(Info.aluminumore), 0, 400, new FluidStack(getFluid("aluminum.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.aluminumsand),4,0), getBlock(Info.aluminumore), 1, 400, new FluidStack(getFluid("aluminum.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(getItem(Info.aluminumdust),4,0), getBlock(Info.aluminumore), 2, 400, new FluidStack(getFluid("aluminum.molten"), dustCostSmeltery));

			Smeltery.addMelting(new ItemStack(Registries.cobaltOreItem,4,0), Registries.cobaltOreBlock, 0, 650, new FluidStack(getFluid("cobalt.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(Registries.cobaltOreItem,4,1), Registries.cobaltOreBlock, 1, 650, new FluidStack(getFluid("cobalt.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(Registries.cobaltOreItem,4,2), Registries.cobaltOreBlock, 2, 650, new FluidStack(getFluid("cobalt.molten"), dustCostSmeltery));

			Smeltery.addMelting(new ItemStack(Registries.arditeOreItem,4,0), Registries.arditeOreBlock, 0, 650, new FluidStack(getFluid("ardite.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(Registries.arditeOreItem,4,1), Registries.arditeOreBlock, 1, 650, new FluidStack(getFluid("ardite.molten"), dustCostSmeltery));
			Smeltery.addMelting(new ItemStack(Registries.arditeOreItem,4,2), Registries.arditeOreBlock, 2, 650, new FluidStack(getFluid("ardite.molten"), dustCostSmeltery));

			if (Configurations.miniSmelting)
			{
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.irongrav)), 0, dustCostGeneral*2, getFluid("iron.molten"), dustCostGeneral, getBlock(Info.ironore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.ironsand)), 0, dustCostGeneral*2, getFluid("iron.molten"), dustCostGeneral, getBlock(Info.ironore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.irondust)), 0, dustCostGeneral*2, getFluid("iron.molten"), dustCostGeneral, getBlock(Info.ironore));

				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.goldgrav)), 0, dustCostGeneral*2, getFluid("gold.molten"), dustCostGeneral, getBlock(Info.goldore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.goldsand)), 0, dustCostGeneral*2, getFluid("gold.molten"), dustCostGeneral, getBlock(Info.goldore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.golddust)), 0, dustCostGeneral*2, getFluid("gold.molten"), dustCostGeneral, getBlock(Info.goldore));

				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.coppergrav)), 0, dustCostGeneral*2, getFluid("copper.molten"), dustCostGeneral, getBlock(Info.copperore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.coppersand)), 0, dustCostGeneral*2, getFluid("copper.molten"), dustCostGeneral, getBlock(Info.copperore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.copperdust)), 0, dustCostGeneral*2, getFluid("copper.molten"), dustCostGeneral, getBlock(Info.copperore));

				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.tingrav)), 0, dustCostGeneral*2, getFluid("tin.molten"), dustCostGeneral, getBlock(Info.tinore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.tinsand)), 0, dustCostGeneral*2, getFluid("tin.molten"), dustCostGeneral, getBlock(Info.tinore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.tindust)), 0, dustCostGeneral*2, getFluid("tin.molten"), dustCostGeneral, getBlock(Info.tinore));

				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.silvergrav)), 0, dustCostGeneral*2, getFluid("silver.molten"), dustCostGeneral, getBlock(Info.silverore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.silversand)), 0, dustCostGeneral*2, getFluid("silver.molten"), dustCostGeneral, getBlock(Info.silverore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.silverdust)), 0, dustCostGeneral*2, getFluid("silver.molten"), dustCostGeneral, getBlock(Info.silverore));

				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.leadgrav)), 0, dustCostGeneral*2, getFluid("lead.molten"), dustCostGeneral, getBlock(Info.leadore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.leadsand)), 0, dustCostGeneral*2, getFluid("lead.molten"), dustCostGeneral, getBlock(Info.leadore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.leaddust)), 0, dustCostGeneral*2, getFluid("lead.molten"), dustCostGeneral, getBlock(Info.leadore));

				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.nickelgrav)), 0, dustCostGeneral*2, getFluid("nickel.molten"), dustCostGeneral, getBlock(Info.nickelore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.nickelsand)), 0, dustCostGeneral*2, getFluid("nickel.molten"), dustCostGeneral, getBlock(Info.nickelore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.nickeldust)), 0, dustCostGeneral*2, getFluid("nickel.molten"), dustCostGeneral, getBlock(Info.nickelore));

				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.platinumgrav)), 0, dustCostGeneral*2, getFluid("platinum.molten"), dustCostGeneral, getBlock(Info.platinumore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.platinumsand)), 0, dustCostGeneral*2, getFluid("platinum.molten"), dustCostGeneral, getBlock(Info.platinumore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.platinumdust)), 0, dustCostGeneral*2, getFluid("platinum.molten"), dustCostGeneral, getBlock(Info.platinumore));

				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.aluminumgrav)), 0, dustCostGeneral*2, getFluid("aluminum.molten"), dustCostGeneral, getBlock(Info.aluminumore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.aluminumsand)), 0, dustCostGeneral*2, getFluid("aluminum.molten"), dustCostGeneral, getBlock(Info.aluminumore));
				CrucibleRegistry.register(Block.getBlockFromItem(getItem(Info.aluminumdust)), 0, dustCostGeneral*2, getFluid("aluminum.molten"), dustCostGeneral, getBlock(Info.aluminumore));
				
				CrucibleRegistry.register(Block.getBlockFromItem(Registries.cobaltOreItem), 0, dustCostGeneral*2, getFluid("cobalt.molten"), dustCostGeneral, Registries.cobaltOreBlock);
				CrucibleRegistry.register(Block.getBlockFromItem(Registries.cobaltOreItem), 0, dustCostGeneral*2, getFluid("cobalt.molten"), dustCostGeneral, Registries.cobaltOreBlock);
				CrucibleRegistry.register(Block.getBlockFromItem(Registries.cobaltOreItem), 0, dustCostGeneral*2, getFluid("cobalt.molten"), dustCostGeneral, Registries.cobaltOreBlock);
				
				CrucibleRegistry.register(Block.getBlockFromItem(Registries.arditeOreItem), 0, dustCostGeneral*2, getFluid("ardite.molten"), dustCostGeneral, Registries.arditeOreBlock);
				CrucibleRegistry.register(Block.getBlockFromItem(Registries.arditeOreItem), 0, dustCostGeneral*2, getFluid("ardite.molten"), dustCostGeneral, Registries.arditeOreBlock);
				CrucibleRegistry.register(Block.getBlockFromItem(Registries.arditeOreItem), 0, dustCostGeneral*2, getFluid("ardite.molten"), dustCostGeneral, Registries.arditeOreBlock);
			}
		}
		
		CrucibleRegistry.register(Blocks.sand, 0, 2000, getFluid("glass.molten"), 1000, Blocks.sand);
		CrucibleRegistry.register(Blocks.glass, 0, 2000, getFluid("glass.molten"), 1000, Blocks.glass);
		CrucibleRegistry.register(getBlock(Info.stones), 0, 2, getFluid("stone.seared"), 2, Blocks.cobblestone);
	}
}
