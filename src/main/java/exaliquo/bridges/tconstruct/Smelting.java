package exaliquo.bridges.tconstruct;

import static net.minecraftforge.fluids.FluidRegistry.getFluid;
import net.minecraft.init.Blocks;
import exaliquo.data.Configurations;
import exaliquo.data.CrucibleUtil;
import exnihilo.registries.CrucibleRegistry;

public class Smelting
{   
	protected static void SmeltTConstruct()
	{
		if (Configurations.allowDustSmelting)
		{
		    TCUtil.addSmelteryDust("iron", 600);
		    TCUtil.addSmelteryDust("gold", 400);
		    TCUtil.addSmelteryDust("copper", 550);
		    TCUtil.addSmelteryDust("tin", 400);
		    TCUtil.addSmelteryDust("silver", 400);
		    TCUtil.addSmelteryDust("lead", 400);
		    TCUtil.addSmelteryDust("nickel", 400);
		    TCUtil.addSmelteryDust("platinum", 400);
		    TCUtil.addSmelteryDust("aluminum", 400);

			if (Configurations.miniSmelting)
			{
			    CrucibleUtil.addCrucibleDust("iron");
			    CrucibleUtil.addCrucibleDust("gold");
			    CrucibleUtil.addCrucibleDust("copper");
			    CrucibleUtil.addCrucibleDust("tin");
			    CrucibleUtil.addCrucibleDust("silver");
			    CrucibleUtil.addCrucibleDust("lead");
			    CrucibleUtil.addCrucibleDust("nickel");
			    CrucibleUtil.addCrucibleDust("platinum");
			    CrucibleUtil.addCrucibleDust("aluminum");
			}
		}
		
		CrucibleRegistry.register(Blocks.sand, 0, 2000, getFluid("glass.molten"), 1000, Blocks.sand);
		CrucibleRegistry.register(Blocks.glass, 0, 2000, getFluid("glass.molten"), 1000, Blocks.glass);
		//CrucibleRegistry.register(getBlock(Info.stones), 0, 2, getFluid("stone.seared"), 2, Blocks.cobblestone);
	}
}
