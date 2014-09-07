package exaliquo.bridges.tconstruct;

import net.minecraft.item.ItemStack;
import tconstruct.library.TConstructRegistry;
import tconstruct.library.client.TConstructClientRegistry;
import tconstruct.library.crafting.ModifyBuilder;
import exaliquo.Registries;
import exaliquo.bridges.tconstruct.modifiers.ModCrooked;
import exaliquo.bridges.tconstruct.modifiers.ModHammered;
import exaliquo.data.ENContent;

public class TCModifiers
{
    public static void addModifiers()
    {
        ModifyBuilder.registerModifier(new ModCrooked(new ItemStack[] { new ItemStack(Registries.crookGold, 1, 0) }, 60));
        TConstructClientRegistry.addEffectRenderMapping(60, "exaliquo", "crook", true);
        
        ModifyBuilder.registerModifier(new ModHammered(new ItemStack[] { new ItemStack(ENContent.hammerDiamond) }, 61));
        TConstructClientRegistry.addEffectRenderMapping(61, "exaliquo", "hammer", true);
        
        TConstructRegistry.registerActiveToolMod(new SkyModifiers());
    }
}
