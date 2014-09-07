package exaliquo.data;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * Contains references to Ex Nihilo content
 */
public class ENContent {
	
	public static final String MOD_ID = "exnihilo";
	
	public static Block barrelWood;
	
	public static Block barrelStone;
	
	public static Block crucible;
	
	public static Block dust;
	
	public static Block infestedLeaves;
	
	public static Block beeTrap;
	
	public static Block beeTrapTreated;
	
	public static Block witchwater;
	
	public static Item silkworm;
	
	public static Item silkwormCooked;
	
	public static Item spores;
	
	public static Item seedGrass;
	
	public static Item seedOak;
	
	public static Item seedBirch;
	
	public static Item seedSpruce;
	
	public static Item seedJungle;
	
	public static Item seedCactus;
	
	public static Item seedSugerCane;
	
	public static Item seedCarrot;
	
	public static Item seedPotato;
	
	public static Item seedRubber;
	
	public static Item bucketWitchwater;
	
	public static Item mesh;
	
	public static Item stone;
	
	public static Item hammerDiamond;
	
	static
	{
		barrelWood = GameRegistry.findBlock(MOD_ID, "barrel");
		
		barrelStone = GameRegistry.findBlock(MOD_ID, "barrel_stone");
		
		crucible = GameRegistry.findBlock(MOD_ID, "crucible");
		
		dust = GameRegistry.findBlock(MOD_ID, "dust");
		
		infestedLeaves = GameRegistry.findBlock(MOD_ID, "infested_leaves");
		
		beeTrap = GameRegistry.findBlock(MOD_ID, "bee_trap");
		
		beeTrapTreated = GameRegistry.findBlock(MOD_ID, "bee_trap_treated");
		
		witchwater = GameRegistry.findBlock(MOD_ID, "witchwater");
		
		silkworm = GameRegistry.findItem(MOD_ID, "silkworm");
		
		silkwormCooked = GameRegistry.findItem(MOD_ID, "silkworm_cooked");
		
		spores = GameRegistry.findItem(MOD_ID, "spores");
		
		seedGrass = GameRegistry.findItem(MOD_ID, "seed_grass");
		
		seedOak = GameRegistry.findItem(MOD_ID, "seed_oak");
		
		seedBirch = GameRegistry.findItem(MOD_ID, "seed_birch");
		
		seedSpruce = GameRegistry.findItem(MOD_ID, "seed_spruce");
		
		seedJungle = GameRegistry.findItem(MOD_ID, "seed_jungle");
		
		seedCactus = GameRegistry.findItem(MOD_ID, "seed_cactus");
		
		seedSugerCane = GameRegistry.findItem(MOD_ID, "seed_sugar_cane");
		
		seedCarrot = GameRegistry.findItem(MOD_ID, "seed_carrot");
		
		seedPotato = GameRegistry.findItem(MOD_ID, "seed_potato");
		
		seedRubber = GameRegistry.findItem(MOD_ID, "seed_rubber");
		
		bucketWitchwater = GameRegistry.findItem(MOD_ID, "bucket_witchwater");
		
		mesh = GameRegistry.findItem(MOD_ID, "mesh");
		
		stone = GameRegistry.findItem(MOD_ID, "stone");
		
		hammerDiamond = GameRegistry.findItem(MOD_ID, "hammer_diamond");
	}

}
