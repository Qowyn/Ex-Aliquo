package exaliquo.data;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ExATab extends CreativeTabs
{
	ItemStack tab;
	
	public ExATab(String label)
	{
		super(label);
	}
	
	public ItemStack getIconItemStack ()
    {
        return tab;
    }
	
	public void initTab(ItemStack stack)
	{
		tab = stack;
	}

    @Override
    public Item getTabIconItem()
    {
        return tab.getItem();
    }
}
