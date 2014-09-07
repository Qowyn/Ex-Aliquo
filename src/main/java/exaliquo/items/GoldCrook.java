package exaliquo.items;

import static exaliquo.proxy.ForestryReflection.forestryrefcheck;
import static exaliquo.proxy.ForestryReflection.handleForestryLeaves;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import exaliquo.data.ENContent;
import exnihilo.data.ModData;
import exnihilo.items.ItemCrook;

public class GoldCrook extends ItemCrook
{
	public GoldCrook()
	{
		super(ToolMaterial.GOLD);
		this.setMaxDamage(this.getMaxDamage()/2-1);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		return "item.ExAliquo.GoldCrook";
	}
	
	@Override
	public void registerIcons(IIconRegister register)
	{
		this.itemIcon = register.registerIcon("exaliquo:CrookGold");
	}
	
	@Override
	public boolean onBlockStartBreak(ItemStack item, int X, int Y, int Z, EntityPlayer player)
	{
		World world = player.worldObj;
		Block block = world.getBlock(X,Y,Z);
		int meta = world.getBlockMetadata(X, Y, Z);
		boolean validTarget = false;
		boolean extraDropped = false;

		if (block.isLeaves(null, 0, 0, 0))
		{
			if (!world.isRemote)
			{
				if (forestryrefcheck)
				{
					handleForestryLeaves(world, block, meta, X, Y, Z);
					handleForestryLeaves(world, block, meta, X, Y, Z);
					handleForestryLeaves(world, block, meta, X, Y, Z);
				}
				else
				{
					block.dropBlockAsItem(world, X, Y, Z, meta, 0);
					block.dropBlockAsItem(world, X, Y, Z, meta, 0);
					block.dropBlockAsItem(world, X, Y, Z, meta, 0);
				}

				if (ModData.ALLOW_SILKWORMS && world.rand.nextInt(75) == 0)
				{
					world.spawnEntityInWorld(new EntityItem(world, X + 0.5D, Y + 0.5D, Z + 0.5D, new ItemStack(ENContent.silkworm)));
				}
			}
		}

		if (block == ENContent.infestedLeaves)
		{
			if (!world.isRemote)
			{
				if (ModData.ALLOW_SILKWORMS && world.rand.nextInt(10) == 0)
				{
					world.spawnEntityInWorld(new EntityItem(world, X + 0.5D, Y + 0.5D, Z + 0.5D, new ItemStack(ENContent.silkworm)));
				}
			}
		}
		
		return false;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean flag)
	{
		list.add("I am probably a crook");
	}
}
