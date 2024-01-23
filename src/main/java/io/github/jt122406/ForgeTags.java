package io.github.jt122406;

import net.minecraftforge.common.Tags;
import net.fabricmc.api.ModInitializer;

/**
 * Forge Tags on Fabric
 * @author Joseph T. McQuigg
 * @see ModInitializer
 */
public class ForgeTags implements ModInitializer {

	@Override
	public void onInitialize() {
		Tags.init();
	}
}