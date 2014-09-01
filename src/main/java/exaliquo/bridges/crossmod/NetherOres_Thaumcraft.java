package exaliquo.bridges.crossmod;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import io.drakon.pulsar.pulse.Pulse;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import exaliquo.bridges.Thaumcraft.ThaumcraftBridge;
import exaliquo.data.Configurations;
//import powercrystals.netherores.NetherOresCore;

@Pulse(id = NetherOres_Thaumcraft.PULSE_ID, pulsesRequired = NetherOres_Thaumcraft.REQUIRED_PULSES, modsRequired = NetherOres_Thaumcraft.REQUIRED_MODS)
public class NetherOres_Thaumcraft
{
    public static final String PULSE_ID = "ExAliquo NetherOres Thaumcraft Module";
    
    public static final String REQUIRED_PULSES = ThaumcraftBridge.PULSE_ID;
    
    public static final String REQUIRED_MODS = "NetherOres";
    
	public void postInit(FMLPostInitializationEvent event)
	{
		if (Configurations.whenk && Configurations.ninjaFeesh)
		{
			ThaumcraftApi.registerObjectTag(new ItemStack(Blocks.netherrack), null);
		}
		else
		{
			//AspectList rack = (AspectList)ThaumcraftApi.objectTags.get(Arrays.asList(new Integer[] { Integer.valueOf(Block.netherrack.blockID), Integer.valueOf(-1) }));
			//ThaumcraftApi.registerObjectTag(NetherOresCore.blockHellfish.blockID, 0, rack);
		}
	}
}
