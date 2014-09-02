package exaliquo;

import io.drakon.pulsar.control.PulseManager;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import exaliquo.bridges.ArsMagica.ArsMagicaBridge;
import exaliquo.bridges.Dart.DartcraftBridge;
import exaliquo.bridges.Growthcraft.GrowthcraftBridge;
import exaliquo.bridges.Mariculture.MaricultureBridge;
import exaliquo.bridges.Metallurgy.MItemRegistry;
import exaliquo.bridges.Metallurgy.MetallurgyBridge;
import exaliquo.bridges.MineFactoryReloaded.MineFactoryReloadedBridge;
import exaliquo.bridges.Natura.NaturaBridge;
import exaliquo.bridges.TConstruct.TCItemRegistry;
import exaliquo.bridges.TConstruct.TConstructBridge;
import exaliquo.bridges.Thaumcraft.ThaumcraftBridge;
import exaliquo.bridges.ThermalExpansion.ThermalExpansionBridge;
import exaliquo.bridges.crossmod.ArsMagica_Tinker;
import exaliquo.bridges.crossmod.CropXYZ;
import exaliquo.bridges.crossmod.ExtraTic_Mekanism;
import exaliquo.bridges.crossmod.ExtraTic_Metallurgy;
import exaliquo.bridges.crossmod.NetherOres_Thaumcraft;
import exaliquo.bridges.crossmod.Whenk;
import exaliquo.data.AliquoEvents;
import exaliquo.data.AliquoTickHandler;
import exaliquo.data.Configurations;
import exaliquo.data.ExAOreTab;
import exaliquo.data.ExATab;
import exaliquo.data.OreDictDrops;
import exaliquo.proxy.ForestryReflection;

@Mod(modid = ExAliquo.modID, name = "Ex Aliquo", version = "0.12.0a2", dependencies = "required-after:exnihilo@[1.36,);after:TConstruct@(1.5.2,];after:Natura@[2.1.14,);after:arsmagica2;after:Thaumcraft@[4.1,);after:Growthcraft|Apples;after:Growthcraft|Bamboo;after:Growthcraft|Bees;after:Growthcraft|Grapes;after:Growthcraft|Hops;after:Growthcraft|Rice;after:Mariculture@[1.2.2,);after:MineFactoryReloaded;after:NetherOres;after:Metallurgy3Base;after:ExtraTiC;after:Forestry;after:ExtraTrees;after:pamharvestcraft;after:ThermalExpansion")

public class ExAliquo {

	@Instance(ExAliquo.modID)
	public static ExAliquo instance;
	
	public static final String modID = "exaliquo";
	
	public static final Logger logger = LogManager.getLogger(ExAliquo.modID);
	
	public static final PulseManager pulsar = new PulseManager(ExAliquo.modID, "ExAliquo-Modules");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Configurations.Load(event.getModConfigurationDirectory());
		Registries.exatab = new ExATab("ExA");
		Registries.registerItems();
		Registries.registerBlocks();
		Registries.registerRecipes();
		Registries.exatab.initTab(new ItemStack(Registries.crookGold, 1, 0));
		
		MinecraftForge.EVENT_BUS.register(new AliquoEvents());
		FMLCommonHandler.instance().bus().register(new AliquoTickHandler());
		
		// Mod Bridges
		pulsar.registerPulse(new ArsMagicaBridge());
		pulsar.registerPulse(new DartcraftBridge());
		pulsar.registerPulse(new ForestryReflection());
		pulsar.registerPulse(new GrowthcraftBridge());
		pulsar.registerPulse(new MaricultureBridge());
		pulsar.registerPulse(new MetallurgyBridge());
		pulsar.registerPulse(new MineFactoryReloadedBridge());
		pulsar.registerPulse(new NaturaBridge());
		pulsar.registerPulse(new TConstructBridge());
		pulsar.registerPulse(new ThaumcraftBridge());
		pulsar.registerPulse(new ThermalExpansionBridge());
		
		// Cross-Mod Bridges
		pulsar.registerPulse(new ArsMagica_Tinker());
		pulsar.registerPulse(new ExtraTic_Mekanism());
		pulsar.registerPulse(new ExtraTic_Metallurgy());
		pulsar.registerPulse(new NetherOres_Thaumcraft());
		pulsar.registerPulse(new Whenk());
		
		pulsar.preInit(event);
		
		// TODO: Optimize this
		if (TCItemRegistry.cobaltOreItem != null)
		{
		    Registries.oretab = new ExAOreTab("ExAOres");
		    Registries.oretab.initTab(new ItemStack(TCItemRegistry.cobaltOreItem, 1, 0));
		}
		else if (MItemRegistry.deepironOreItem != null)
		{
		    Registries.oretab = new ExAOreTab("ExAOres");
		    Registries.oretab.initTab(new ItemStack(MItemRegistry.deepironOreItem, 1, 0));
		}
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
	    pulsar.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		Registries.postInitHammers();
		
		if (Configurations.isOre)
		{
			Registries.registerNihiloOreDict();
		}
		GeneralAliquo.initGeneralStuff();
		CropXYZ.Shoukan();
		OreDictDrops.CheckMetals();
		
		pulsar.postInit(event);
	}
}
