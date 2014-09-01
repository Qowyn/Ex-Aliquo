package exaliquo.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import exaliquo.Registries;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class AliquoItemOre extends Item
{
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icon;
	//private String name = this.getUnlocalizedName().substring(5);
	
	public AliquoItemOre() {
		setHasSubtypes(true);
		setCreativeTab(Registries.oretab);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack item)
	{
			return "item.ExAliquo." + this.getUnlocalizedName().substring(5) + Registries.oreType[item.getItemDamage()];
	}
	
	@Override
	public int getMetadata (int meta)
    {
        return meta;
    }
	
	@Override
	public void registerIcons(IIconRegister register)
	{
		icon = new IIcon[3];
		
		for (int i = 0; i < icon.length; i++)
		{
			icon[i] = register.registerIcon("exaliquo:" + Registries.oreType[i] + "/Item" + this.getUnlocalizedName().substring(5) + Registries.oreType[i]);
		}
	}
	
	@Override
	public IIcon getIconFromDamage(int meta)
	{
		return icon[meta];
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubItems(Item item, CreativeTabs tabs, List subItems)
	{
		for (int i = 0; i < 3; i++) {
			subItems.add(new ItemStack(item, 1, i));
		}
	}
}