package exaliquo;

import java.util.Map;

import net.minecraft.item.Item.ToolMaterial;

import com.google.common.collect.Maps;

public class AliquoRegistry {
	
	private static final Map<ToolMaterial, String>
	hammerTextures = Maps.newIdentityHashMap();
	
	/**
	 * Register a enum-wise preferred texture for materials.
	 */
	public static void registerHammerTexture(ToolMaterial toolMaterial, String texture) {
		hammerTextures.put(toolMaterial, texture);
	}
	
	public static String getHammerTexture(ToolMaterial toolMaterial) {
		return hammerTextures.get(toolMaterial);
	}
	

}
