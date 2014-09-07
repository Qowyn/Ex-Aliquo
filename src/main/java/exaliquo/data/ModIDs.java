package exaliquo.data;

import static cpw.mods.fml.common.registry.GameRegistry.findBlock;
import static cpw.mods.fml.common.registry.GameRegistry.findItem;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import exaliquo.ExAliquo;

public class ModIDs
{
	public enum Info
	{
		oreberrybush("TConstruct","block","ore.berries.one"),
		oreberrybush2("TConstruct","block","ore.berries.two"),
		hambone("TConstruct","block","MeatBlock"),
		storch("TConstruct","block","decoration.stonetorch"),
		craftedsoil("TConstruct","block","CraftedSoil"),
		slimeleaves("TConstruct","block","slime.leaves"),
		slimesapling("TConstruct","block","slime.sapling"),
		materials("TConstruct","item","materials"),
		oreberry("TConstruct","item","oreBerries"),
		tinkerfood("TConstruct","item","strangeFood"),
		
		flora("Natura","block","florasapling"),
		leaves("Natura","block","floraleaves"),
		raresap("Natura","block","RareSapling"),
		rareleaves("Natura","block","Rare Leaves"),
		darkleaves("Natura","block","Dark Leaves"),
		monochrome("Natura","block","floraleavesnocolor"),
		good("Natura","block","BerryBush"),
		evil("Natura","block","NetherBerryBush"),
		glowshroom("Natura","block","Glowshroom"),
		thornvines("Natura","block","Thornvines"),
		cactus("Natura","block","Saguaro"),
		bluebell("Natura","block","Bluebells"),
		topiary("Natura","block","GrassBlock"),
		nethersoil("Natura","block","soil.tainted"),
		nethersand("Natura","block","heatsand"),
		fruit("Natura","item","saguaro.fruit"),
		goodberry("Natura","item","berry"),
		badberry("Natura","item","berry.nether"),
		potash("Natura","item","Natura.netherfood"),
		plants("Natura","item","barleyFood"),
		impmeat("Natura","item","impmeat"),
		
		orchid("arsmagica2","block","blueOrchid"),
		nova("arsmagica2","block","desertNova"),
		aum("arsmagica2","block","Aum"),
		witchwood("arsmagica2","block","saplingWitchwood"),
		witchleaves("arsmagica2","block","WitchwoodLeaves"),
		wakebloom("arsmagica2","block","WakeBloom"),
		tarma("arsmagica2","block","TarmaRoot"),
		essenceBlock("arsmagica2","block","liquidEssence"),
		vtorch("arsmagica2","block","VinteumTorch"),
		essenceBucket("arsmagica2","item","liquidEssenceBucket"),
		magicore("arsmagica2","item","itemOre"),
		essences("arsmagica2","item","essence"),
		
		thaumplants("Thaumcraft","block","blockCustomPlant"),
		thaumleaves("Thaumcraft","block","blockMagicalLeaves"),
		ttorch("Thaumcraft","block","blockAiry"),
		candle("Thaumcraft","block","blockCandle"),
		devices("Thaumcraft","block","blockStoneDevice"),
		cosmetics("Thaumcraft","block","blockCosmeticSolid"),
		cluster("Thaumcraft","block","blockCrystal"),
		magicwood("Thaumcraft","block","blockMagicalLog"),
		shard("Thaumcraft","item","ItemShard"),
		resources("Thaumcraft","item","ItemResource"),
		nuggets("Thaumcraft","item","ItemNugget"),
		manabean("Thaumcraft","item","ItemManaBean"),
		nodejar("Thaumcraft","item","BlockJarNodeItem"),
		wands("Thaumcraft","item","WandRod"),
		
		gcsappling("Growthcraft|Apples","block","grc.appleSapling"),
		gcbamboo("Growthcraft|Bamboo","block","grc.bambooShoot"),
		gcleaves("Growthcraft|Bamboo","block","grc.bambooLeaves"),
		gcapple("Growthcraft|Apples","item","grc.appleSeeds"),
		gcbee("Growthcraft|Bees","item","grc.bee"),
		gcgrape("Growthcraft|Grapes","item","grc.grapes"),
		gcgrapeseed("Growthcraft|Grapes","item","grc.grapeSeeds"),
		gchops("Growthcraft|Hops","item","grc.hops"),
		gchopseed("Growthcraft|Hops","item","grc.hopSeeds"),
		gcrice("Growthcraft|Rice","item","grc.rice"),
		gcriceball("Growthcraft|Rice","item","grc.riceBall"),
		
		mariores("Mariculture","block","oreBlocks"),
		marioyster("Mariculture","block","oysterBlock"),
		maricoral("Mariculture","item","coral"),
		maribottle("Mariculture","item","liquidContainers"),
		
		hellfeesh("NetherOres","block","netherOresBlockHellfish"),
		
		rubbersapling("MineFactoryReloaded","block","tile.mfr.rubberwood.sapling"),
		rubberleaves("MineFactoryReloaded","block","tile.mfr.rubberwood.leaves"),
		
		dartsapling("DartCraft","block","forceSapling"),
		dartleaves("DartCraft","block","forceLeaves"),
		
		liquidcold("ThermalExpansion","block","FluidCryotheum");
		
		private final String mod;
		private final String type;
		private final String sname;
		
		private Info(String mod, String type, String sname)
		{
			this.mod = mod;
			this.type = type;
			this.sname = sname;
		}
		
		private String mod() { return mod; }
		private String type() { return type; }
		private String sname() {return sname; }
	}
	
	public static ItemStack getItemStack(Info info)
	{
	    return getItemStack(info, 0);
	}
	
	public static ItemStack getItemStack(Info info, int meta)
	{
	    if (info.type.equals("block")) {
	        Block block = findBlock(info.mod, info.sname);
	        return (block != null) ? new ItemStack(block, 1, meta) : new ItemStack(new ItemBlock(debugBlockInfo(info)), 1, 0);
	    } else {
	        Item item = findItem(info.mod, info.sname);
            return (item != null) ? new ItemStack(item, 1, meta) : new ItemStack(debugItemInfo(info), 1, 0);
	    }
	}

    public static Block getBlock(Info info)
    {
        Block block = findBlock(info.mod, info.sname);
        return (block != null) ? block : debugBlockInfo(info);
    }

    public static Item getItem(Info info)
    {
        Item item = findItem(info.mod, info.sname);
        return (item != null) ? item : debugItemInfo(info);
    }

    private static Block debugBlockInfo(Info info)
    {
        ExAliquo.logger.warn("The block from " + info.mod + " called as " + info.sname + " could not be found. Report this to Ex Aliquo");
        if (Blocks.cake == null) ExAliquo.logger.warn("AND ALSO COULDNT FIND CAKE!"); 
        return Blocks.cake;
    }

    private static Item debugItemInfo(Info info)
    {
        ExAliquo.logger.warn("The item from " + info.mod + " called as " + info.sname + " could not be found. Report this to Ex Aliquo");
        if (Items.cake == null) ExAliquo.logger.warn("AND ALSO COULDNT FIND CAKE!");
        return Items.cake;
    }
}