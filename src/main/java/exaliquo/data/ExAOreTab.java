package exaliquo.data;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ExAOreTab extends CreativeTabs
{
	ItemStack tab;
	
	public ExAOreTab(String label)
	{
		super(label);
	}
	
	@Override
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