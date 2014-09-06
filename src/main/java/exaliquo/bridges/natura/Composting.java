package exaliquo.bridges.natura;

import static exaliquo.data.ModIDs.getItem;
import exaliquo.data.ModIDs.Info;
import static exnihilo.registries.ColorRegistry.color;
import static exnihilo.registries.CompostRegistry.register;

public class Composting
{

	protected static void CompostNatura()
	{
		register(getItem(Info.good), 0, 0.2F, color("raspbush"));
		register(getItem(Info.good), 1, 0.2F, color("bluebush"));
		register(getItem(Info.good), 2, 0.2F, color("blackbush"));
		register(getItem(Info.good), 3, 0.2F, color("geobush"));
		register(getItem(Info.evil), 0, 0.2F, color("blightbush"));
		register(getItem(Info.evil), 1, 0.2F, color("duskbush"));
		register(getItem(Info.evil), 2, 0.2F, color("skybush"));
		register(getItem(Info.evil), 3, 0.2F, color("stingbush"));
		
		register(getItem(Info.goodberry), 0, 0.05F, color("raspberry"));
		register(getItem(Info.goodberry), 1, 0.05F, color("blueberry"));
		register(getItem(Info.goodberry), 2, 0.05F, color("blackberry"));
		register(getItem(Info.goodberry), 3, 0.05F, color("geoberry"));
		register(getItem(Info.badberry), 0, 0.05F, color("blightberry"));
		register(getItem(Info.badberry), 1, 0.05F, color("duskberry"));
		register(getItem(Info.badberry), 2, 0.05F, color("skyberry"));
		register(getItem(Info.badberry), 3, 0.05F, color("stingberry"));
		
		register(getItem(Info.leaves), 0, 0.005F, color("redwood"));
		register(getItem(Info.leaves), 1, 0.125F, color("eucalyptus"));
		register(getItem(Info.leaves), 2, 0.125F, color("hopseed"));
		register(getItem(Info.rareleaves), 0, 0.125F, color("maple"));
		register(getItem(Info.rareleaves), 1, 0.125F, color("silverbell"));
		register(getItem(Info.rareleaves), 2, 0.125F, color("amaranth"));
		register(getItem(Info.rareleaves), 3, 0.125F, color("tigerwood"));
		register(getItem(Info.darkleaves), 0, 0.125F, color("darkwood"));
		register(getItem(Info.darkleaves), 1, 0.125F, color("darkwood"));
		register(getItem(Info.darkleaves), 2, 0.125F, color("darkwood"));
		register(getItem(Info.darkleaves), 3, 0.125F, color("fusewood"));
		register(getItem(Info.monochrome), 0, 0.125F, color("sakura"));
		register(getItem(Info.monochrome), 1, 0.125F, color("ghostwood"));
		register(getItem(Info.monochrome), 2, 0.125F, color("bloodwood"));
		register(getItem(Info.monochrome), 3, 0.125F, color("willow"));
		
		register(getItem(Info.flora), 0, 0.005F, color("redwood"));
		register(getItem(Info.flora), 1, 0.125F, color("eucalyptus"));
		register(getItem(Info.flora), 2, 0.125F, color("hopseed"));
		register(getItem(Info.flora), 3, 0.125F, color("sakura"));
		register(getItem(Info.flora), 4, 0.125F, color("ghostwood"));
		register(getItem(Info.flora), 5, 0.125F, color("bloodwood"));
		register(getItem(Info.flora), 6, 0.125F, color("darkwood"));
		register(getItem(Info.flora), 7, 0.125F, color("fusewood"));
		register(getItem(Info.raresap), 0, 0.125F, color("maple"));
		register(getItem(Info.raresap), 1, 0.125F, color("silverbell"));
		register(getItem(Info.raresap), 2, 0.125F, color("amaranth"));
		register(getItem(Info.raresap), 3, 0.125F, color("tigerwood"));
		register(getItem(Info.raresap), 4, 0.125F, color("willow"));
		
		register(getItem(Info.glowshroom), 0, 0.1F, color("blueglow"));
		register(getItem(Info.glowshroom), 1, 0.1F, color("greenglow"));
		register(getItem(Info.glowshroom), 2, 0.1F, color("purpleglow"));
		
		register(getItem(Info.cactus), 0, 0.1F, color("saguaro"));
		register(getItem(Info.fruit), 0, 0.1F, color("fruit"));
		register(getItem(Info.potash), 0, 0.1F, color("potash"));
		register(getItem(Info.plants), 0, 0.08F, color("barley"));
		register(getItem(Info.plants), 1, 0.08F, color("barley"));
		register(getItem(Info.plants), 2, 0.08F, color("flour"));
		register(getItem(Info.plants), 3, 0.04F, color("white"));
		register(getItem(Info.bluebell), 0, 0.1F, color("bluebell"));
		register(getItem(Info.thornvines), 0, 0.1F, color("thornvine"));
		register(getItem(Info.impmeat), 0, 0.2F, color("impmeat"));
		register(getItem(Info.impmeat), 1, 0.2F, color("impmeat"));
	}
}
