package io.github.jt122406;

import io.github.jt122406.tags.Tags;
import net.fabricmc.api.ModInitializer;

public class ForgeTags implements ModInitializer {

	@Override
	public void onInitialize() {
		Tags.init();
	}
}