package exaliquo.data;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.config.Configuration;

public class Configurations {

	public static boolean isOre;
	public static boolean allowDustSmelting;
	public static boolean dustValue;
	public static boolean sieveOreBushes;
	public static boolean sieveEssenceBushes;
	public static int dualTools;
	public static boolean fortuneCrook;
	public static boolean fortuneHammer;
	public static boolean miniSmelting;
	
	public static boolean sieveRedwoods;
	public static boolean sieveHopseed;
	public static boolean sieveOverworldTrees;
	public static boolean allowTinkerBushCompost;
	public static boolean sieveNetherTrees;
	public static boolean sieveBerryBushes;
	public static boolean sieveDarkBerries;
	
	public static boolean hammerMoonstone;
	public static boolean sieveNovas;

	public static int silverwoodSwitch;
	public static boolean alternatewater;
	public static boolean runichax;
	public static boolean harderWands;
	
	public static boolean fishingOysters;
	
	public static boolean sacredohgodthewood;
	
	public static boolean ninjaFeesh;
	public static boolean whenk;
		
	public static void Load (File location)
	{
		File file = new File(location + "/exaliquo.cfg");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Configuration config = new Configuration(file);
		config.load();
		
		allowDustSmelting = config.get("TCon Tweaks", "Can Gravel/Sand/Dust items be smelted", true).getBoolean(true);
		dustValue = config.get("TCon Tweaks", "Normal dust value in the smeltery", true, "Normal is 1/4 the block value. False means dusts are 1/6 the value").getBoolean(true);
		sieveOreBushes = config.get("TCon Tweaks", "Can orebushes be obtained", true).getBoolean(true);
		sieveEssenceBushes = config.get("TCon Tweaks","Can essense bushes be obtained", true).getBoolean(true);
		allowTinkerBushCompost = config.get("TCon Tweaks", "Can oreberry bushes be composted", false).getBoolean(false);
		miniSmelting = config.get("TCon Tweaks", "Enable mini-smelteries", false).getBoolean(false);
		dualTools = config.get("TCon Tweaks", "Modifier lock", 0, "0 is default (tool restrictions), 1 is dual-use tools unrestricted, 2 is fully unlock").getInt(0);
		fortuneCrook = config.get("TCon Tweaks", "Fortune-Crooking Interaction", false).getBoolean(false);
		fortuneHammer = config.get("TCon Tweaks", "Fortune-Hammering Interaction", false).getBoolean(false);
		
		sieveRedwoods = config.get("Natura Tweaks", "Can redwood trees be obtained", false, "Redwoods eat every block going both up and down. Use at your own peril. Or enjoyment").getBoolean(false);
		sieveHopseed = config.get("Natura Tweaks", "Can hopseed trees be obtained", false).getBoolean(false);
		sieveOverworldTrees = config.get("Natura Tweaks", "Can natura trees be obtained", true).getBoolean(true);
		sieveNetherTrees = config.get("Natura Tweaks", "Can nether trees be obtained", true).getBoolean(true);
		sieveBerryBushes = config.get("Natura Tweaks", "Can berry bushes be obtained", true).getBoolean(true);
		sieveDarkBerries = config.get("Natura Tweaks", "Can nether bushes be obtained", true).getBoolean(true);
		
		hammerMoonstone = config.get("ArsMagica Tweaks", "Can moonstone be obtained", false).getBoolean(false);
		sieveNovas = config.get("ArsMagica Tweaks", "Can desert novas be obtained", true).getBoolean(true);
		
		silverwoodSwitch = config.get("Thaumcraft Tweaks", "Silverwood Setting", 0, "Set 0 for default, 1 for tweaked difficulty, and -1 to disable. See the forum post for difficulty changes").getInt(0);
		alternatewater = config.get("Thaumcraft Tweaks", "For tundra-less skyblocks", false).getBoolean(false);
		runichax = config.get("Thaumcraft Tweaks", "Alternate Runics to prevent wall", true, "False to instead change how greatwoods are obtained").getBoolean(false);
		harderWands = config.get("Thaumcraft Tweaks", "Do the primal aspect wand cores require a Greatwood wand core", false).getBoolean(false);
		
		fishingOysters = config.get("Mariculture Tweaks", "Can Oysters be obtained via fishing", true).getBoolean(true);
		
		sacredohgodthewood = config.get("MineFactory Reloaded Tweaks","Can Sacred Rubber Trees be obtained", false).getBoolean(false);
		
		ninjaFeesh = config.get("Ex Aliquo multi-mod tweaks","Hide Feesh from hammers",true).getBoolean(true);
		isOre = config.get("Ex Aliquo multi-mod tweaks", "Are Gravel/Sand/Dust Ores actually ores", true, "False for counting as an ingot").getBoolean(true);
		whenk = config.get("Ex Aliquo multi-mod tweaks", "Whenk :V", true, "Requires ninja-like feesh to do anything").getBoolean(true);
		
		config.save();
	}
}
