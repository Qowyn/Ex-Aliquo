package exaliquo.bridges.TConstruct;

import static exaliquo.data.MoltenMetals.dustCostSmeltery;
import static exaliquo.data.MoltenMetals.ingotCostSmeltery;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import tconstruct.library.crafting.Smeltery;
import exaliquo.ExAliquo;
import exnihilo.registries.OreRegistry;

public class TCUtil
{
    public static void addSmelteryDust(String ore, int temperature)
    {
        addSmelteryDust(ore, temperature, ore + ".molten");
    }
    
    public static void addSmelteryDust(String ore, int temperature, String fluidName)
    {
        Block gravel = OreRegistry.getGravel(ore);
        Block sand = OreRegistry.getSand(ore);
        Block dust = OreRegistry.getDust(ore);
        Item broken = OreRegistry.getBroken(ore);
        Item crushed = OreRegistry.getCrushed(ore);
        Item powdered = OreRegistry.getPowdered(ore);
        Fluid fluid = FluidRegistry.getFluid(fluidName);
        
        if (gravel == null) {
            ExAliquo.logger.warn("Cant find gravel for " + ore + "!");
            return;
        }
        
        if (sand == null) {
            ExAliquo.logger.warn("Cant find sand for " + ore + "!");
            return;
        }
        
        if (dust == null) {
            ExAliquo.logger.warn("Cant find dust for " + ore + "!");
            return;
        }
        
        if (broken == null) {
            ExAliquo.logger.warn("Cant find broken version of " + ore + "!");
            return;
        }
        
        if (crushed == null) {
            ExAliquo.logger.warn("Cant find crushed version of " + ore + "!");
            return;
        }
        
        if (powdered == null) {
            ExAliquo.logger.warn("Cant find powdered version of " + ore + "!");
            return;
        }
        
        if (fluid == null) {
            ExAliquo.logger.warn("Cant find fluid " + fluidName + "!");
            return;
        }
        
        try
        {
            Smeltery.addMelting(new ItemStack(broken, 4, 0), gravel, 0, temperature, new FluidStack(fluid, dustCostSmeltery));
            Smeltery.addMelting(new ItemStack(crushed, 4, 0), sand, 0, temperature, new FluidStack(fluid, dustCostSmeltery));
            Smeltery.addMelting(new ItemStack(powdered, 4, 0), dust, 0, temperature, new FluidStack(fluid, dustCostSmeltery));
        } 
        catch (Exception e)
        {
            ExAliquo.logger.catching(e);
        }
    }
    
    public static void addSmelteryOre(String ore, int temperature)
    {
        addSmelteryOre(ore, temperature, ore + ".molten");
    }
    
    public static void addSmelteryOre(String ore, int temperature, String fluidName)
    {
        Block gravel = OreRegistry.getGravel(ore);
        Block sand = OreRegistry.getSand(ore);
        Block dust = OreRegistry.getDust(ore);
        Fluid fluid = FluidRegistry.getFluid(fluidName);
        
        if (gravel == null) {
            ExAliquo.logger.warn("Cant find gravel for " + ore + "!");
            return;
        }
        
        if (sand == null) {
            ExAliquo.logger.warn("Cant find sand for " + ore + "!");
            return;
        }
        
        if (dust == null) {
            ExAliquo.logger.warn("Cant find dust for " + ore + "!");
            return;
        }
        
        if (fluid == null) {
            ExAliquo.logger.warn("Cant find fluid " + fluidName + "!");
            return;
        }
        
        try
        {
            Smeltery.addMelting(gravel, 0, temperature, new FluidStack(fluid, ingotCostSmeltery));
            Smeltery.addMelting(sand, 0, temperature, new FluidStack(fluid, ingotCostSmeltery));
            Smeltery.addMelting(dust, 0, temperature, new FluidStack(fluid, ingotCostSmeltery));
        } 
        catch (Exception e)
        {
            ExAliquo.logger.catching(e);
        }
    }
}
