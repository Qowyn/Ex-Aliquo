package exaliquo.proxy;

import io.drakon.pulsar.pulse.Handler;
import io.drakon.pulsar.pulse.Pulse;

import java.lang.reflect.Method;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.world.World;

@Pulse(id = ForestryReflection.PULSE_ID, modsRequired = ForestryReflection.MOD_ID)
public class ForestryReflection
{
    public static final String PULSE_ID = "ExAliquo Forestry Module";
    
    public static final String MOD_ID = "Forestry";
    
	public static boolean forestryrefcheck = false;
	private static Class forestryLeafBlock = null;
	private static Method drops = null;
	private static final Class[] spawnLeafParams = { World.class, int.class, int.class, int.class, int.class, float.class, boolean.class };

	@Handler
	public void postInit(FMLPostInitializationEvent event)
	{
		try
		{
			forestryLeafBlock = Class.forName("forestry.arboriculture.gadgets.BlockLeaves");
			
			if (forestryLeafBlock != null)
			{
				drops = forestryLeafBlock.getDeclaredMethod("spawnLeafDrops", spawnLeafParams);
				drops.setAccessible(true);
				forestryrefcheck = true;
			}
		}
		catch (Exception e)
		{
			forestryrefcheck = false;
			e.printStackTrace();
		}
	}

	public static void handleForestryLeaves(World world, Block block, int meta, int X, int Y, int Z)
	{
		if ((forestryLeafBlock != null) && (drops != null)) 
		{
			try
			{
				drops.invoke(forestryLeafBlock.cast(block), world, X, Y, Z, meta, 1.0F, true);
			}
			catch (Exception e)
			{
				if (!block.isLeaves(world, X, Y, Z))
				{
					e.printStackTrace();
				}
			}
		}
	}
}
