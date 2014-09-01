package exaliquo.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import exaliquo.Registries;
import net.minecraft.block.BlockSand;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class AliquoOre extends BlockSand
{

	@SideOnly(Side.CLIENT)
	private IIcon[] icon;
	
	public AliquoOre() {
		super();
		setHardness(0.4F);
		setStepSound(soundTypeSand);
		setCreativeTab(Registries.oretab);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register)
	{
		icon = new IIcon[3];
		
		for (int i = 0; i < icon.length; i++)
		{
			icon[i] = register.registerIcon("exaliquo:" + Registries.oreType[i] + "/Block" + this.getUnlocalizedName().substring(5) + Registries.oreType[i]);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int id, int meta)
	{
		return icon[meta];
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(Item item, CreativeTabs tabs, List subItems)
	{
		for (int i = 0; i < 3; i++) {
			subItems.add(new ItemStack(item, 1, i));
		}
	}
	
	@Override
	public int damageDropped (int meta)
	{
		return meta;
	}
}
