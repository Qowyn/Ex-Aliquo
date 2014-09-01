package exaliquo;

import static exaliquo.data.ModsLoaded.isArsMagicaLoaded;
import static exaliquo.data.ModsLoaded.isDartcraftLoaded;
import static exaliquo.data.ModsLoaded.isForestryLoaded;
import static exaliquo.data.ModsLoaded.isGrowthcraftLoaded;
import static exaliquo.data.ModsLoaded.isMFRLoaded;
import static exaliquo.data.ModsLoaded.isMaricultureLoaded;
import static exaliquo.data.ModsLoaded.isMetallurgyLoaded;
import static exaliquo.data.ModsLoaded.isTConLoaded;
import static exaliquo.data.ModsLoaded.isThaumcraftLoaded;
import static exaliquo.data.ModsLoaded.isThermalExpansionLoaded;
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
import exaliquo.bridges.ArsMagica.ArsMagica;
import exaliquo.bridges.Dart.Dartcraft;
import exaliquo.bridges.Growthcraft.Growthcraft;
import exaliquo.bridges.Mariculture.Mariculture;
import exaliquo.bridges.Metallurgy.Metallurgy;
import exaliquo.bridges.MineFactoryReloaded.MineFactoryReloaded;
import exaliquo.bridges.Natura.Natura;
import exaliquo.bridges.TConstruct.TConstruct;
import exaliquo.bridges.Thaumcraft.Thaumcraft;
import exaliquo.bridges.ThermalExpansion.ThermalExpansion;
import exaliquo.bridges.crossmod.Crossmod;
import exaliquo.data.AliquoEvents;
import exaliquo.data.AliquoTickHandler;
import exaliquo.data.Configurations;
import exaliquo.data.ExAOreTab;
import exaliquo.data.ExATab;
import exaliquo.data.OreDictDrops;
import exaliquo.proxy.ForestryReflection;

@Mod(modid = ExAliquo.modID, name = "Ex Aliquo", version = "0.11.2", dependencies = "required-after:exnihilo@[1.26b,);after:TConstruct@(1.5.2,];after:Natura@[2.1.14,);after:arsmagica2;after:Thaumcraft@[4.1,);after:Growthcraft|Apples;after:Growthcraft|Bamboo;after:Growthcraft|Bees;after:Growthcraft|Grapes;after:Growthcraft|Hops;after:Growthcraft|Rice;after:Mariculture@[1.2.2,);after:MineFactoryReloaded;after:NetherOres;after:Metallurgy3Base;after:ExtraTiC;after:Forestry;after:ExtraTrees;after:pamharvestcraft;after:ThermalExpansion")

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
		Registries.oretab = new ExAOreTab("ExAOres");
		Registries.registerItems();
		Registries.registerBlocks();
		Registries.registerRecipes();
		Registries.exatab.initTab(new ItemStack(Registries.crookGold, 1, 0));
		Registries.oretab.initTab(new ItemStack(Registries.cobaltOreItem, 1, 0));
		
		MinecraftForge.EVENT_BUS.register(new AliquoEvents());
		FMLCommonHandler.instance().bus().register(new AliquoTickHandler());
		
		pulsar.registerPulse(new Natura());
		
		pulsar.preInit(event);
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
		Crossmod.initCross();
		OreDictDrops.CheckMetals();
		if (isTConLoaded)
		{
		    ExAliquo.logger.info("Loading Tinker's Construct Compat");
			TConstruct.initTConstruct();
		}
		if (isArsMagicaLoaded)
		{
		    ExAliquo.logger.info("Loading Ars Magica 2 Compat");
			ArsMagica.initArsMagica();
		}
		if (isThaumcraftLoaded)
		{
		    ExAliquo.logger.info("Loading Thaumcraft 4 Compat");
			Thaumcraft.initThaumcraft();
		}
		if(isGrowthcraftLoaded)
		{
		    ExAliquo.logger.info("Loading Growthcraft Compat");
			Growthcraft.initGrowthcraft();
		}
		if (isMaricultureLoaded)
		{
		    ExAliquo.logger.info("Loading Mariculture Compat");
			Mariculture.initMariculture();
		}
		if (isMFRLoaded)
		{
		    ExAliquo.logger.info("Loading MFR Compat");
			MineFactoryReloaded.initMFR();
		}
		if (isMetallurgyLoaded)
		{
		    ExAliquo.logger.info("Loading Metallurgy Compat");
			Metallurgy.initMetallurgy();
		}
		if (isDartcraftLoaded)
		{
		    ExAliquo.logger.info("Loading Dartcraft Compat");
			Dartcraft.initDartcraft();
		}
		if (isForestryLoaded)
		{
			ForestryReflection.initProxy();
		}
		if (isThermalExpansionLoaded)
		{
		    ExAliquo.logger.info("Loading Thermal Expansion Compat");
			ThermalExpansion.initThermalExpansion();
		}
		
		pulsar.postInit(event);
	}
}
