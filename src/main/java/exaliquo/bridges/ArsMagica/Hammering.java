package exaliquo.bridges.ArsMagica;

import static exaliquo.data.ModIDs.getItem;
import net.minecraft.init.Blocks;
import exaliquo.data.Configurations;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.HammerRegistry.register;

public class Hammering
{
	
	protected static void HammerArs()
	{
		register(Blocks.stone, 0, getItem(Info.magicore), 0, 0.15F, 0.05F);		//Vinteum
		register(Blocks.stone, 0, getItem(Info.magicore), 4, 0.1F, 0.05F);		//Chimerite
		register(Blocks.stone, 0, getItem(Info.magicore), 5, 0.08F, 0.05F);		//Blue Topaz
		if (Configurations.hammerMoonstone)
		{
		register(Blocks.stone, 0, getItem(Info.magicore), 7, 0.05F, 0.05F);		//Moonstone
		}
		register(Blocks.netherrack, 0, getItem(Info.magicore), 6, 0.05F, 0.05F);	//Sunstone		
	}
}
