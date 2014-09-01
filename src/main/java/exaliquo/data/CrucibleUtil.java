package exaliquo.data;

import static exaliquo.data.MoltenMetals.dustCostGeneral;
import static exaliquo.data.MoltenMetals.ingotCost;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import exaliquo.ExAliquo;
import exnihilo.registries.CrucibleRegistry;
import exnihilo.registries.OreRegistry;

public class CrucibleUtil
{

    public static void addCrucibleDust(String ore)
    {
        addCrucibleDust(ore, ore + ".molten");
    }

    public static void addCrucibleDust(String ore, String fluidName)
    {
        /*
        Block gravel = OreRegistry.getGravel(ore);
        Block sand = OreRegistry.getSand(ore);
        Block dust = OreRegistry.getDust(ore);
        Item broken = OreRegistry.getBroken(ore);
        Item crushed = OreRegistry.getCrushed(ore);
        Item powdered = OreRegistry.getPowdered(ore);
        Fluid fluid = FluidRegistry.getFluid(fluidName);

        if (gravel == null)
        {
            ExAliquo.logger.warn("Cant find gravel for " + ore + "!");
            return;
        }

        if (sand == null)
        {
            ExAliquo.logger.warn("Cant find sand for " + ore + "!");
            return;
        }

        if (dust == null)
        {
            ExAliquo.logger.warn("Cant find dust for " + ore + "!");
            return;
        }

        if (broken == null)
        {
            ExAliquo.logger.warn("Cant find broken version of " + ore + "!");
            return;
        }

        if (crushed == null)
        {
            ExAliquo.logger.warn("Cant find crushed version of " + ore + "!");
            return;
        }

        if (powdered == null)
        {
            ExAliquo.logger.warn("Cant find powdered version of " + ore + "!");
            return;
        }

        if (fluid == null)
        {
            ExAliquo.logger.warn("Cant find fluid " + fluidName + "!");
            return;
        }

        try
        {
            CrucibleRegistry.register(Block.getBlockFromItem(broken), 0, dustCostGeneral * 2, fluid, dustCostGeneral, gravel);
            CrucibleRegistry.register(Block.getBlockFromItem(crushed), 0, dustCostGeneral * 2, fluid, dustCostGeneral, sand);
            CrucibleRegistry.register(Block.getBlockFromItem(powdered), 0, dustCostGeneral * 2, fluid, dustCostGeneral, dust);
        } 
        catch (Exception e)
        {
            ExAliquo.logger.catching(e);
        }*/
    }

    public static void addCrucibleOre(String ore)
    {
        addCrucibleOre(ore, ore + ".molten");
    }

    public static void addCrucibleOre(String ore, String fluidName)
    {
        Block gravel = OreRegistry.getGravel(ore);
        Block sand = OreRegistry.getSand(ore);
        Block dust = OreRegistry.getDust(ore);
        Fluid fluid = FluidRegistry.getFluid(fluidName);

        if (gravel == null)
        {
            ExAliquo.logger.warn("Cant find gravel for " + ore + "!");
            return;
        }

        if (sand == null)
        {
            ExAliquo.logger.warn("Cant find sand for " + ore + "!");
            return;
        }

        if (dust == null)
        {
            ExAliquo.logger.warn("Cant find dust for " + ore + "!");
            return;
        }

        if (fluid == null)
        {
            ExAliquo.logger.warn("Cant find fluid " + fluidName + "!");
            return;
        }

        try
        {
            CrucibleRegistry.register(gravel, 0, ingotCost * 2, fluid, ingotCost, gravel);
            CrucibleRegistry.register(sand, 0, ingotCost * 2, fluid, ingotCost, sand);
            CrucibleRegistry.register(dust, 0, ingotCost * 2, fluid, ingotCost, dust);
        } 
        catch (Exception e)
        {
            ExAliquo.logger.catching(e);
        }
    }

}
