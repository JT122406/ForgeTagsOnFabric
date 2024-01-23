package io.github.jt122406.datagen.tags;

import io.github.jt122406.tags.Tags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class BlockTags extends FabricTagProvider.BlockTagProvider {


    public BlockTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(Tags.Blocks.BARRELS_WOODEN)
                .forceAddTag(ConventionalBlockTags.WOODEN_BARRELS);

        getOrCreateTagBuilder(Tags.Blocks.ORES)
                .forceAddTag(ConventionalBlockTags.ORES);

        getOrCreateTagBuilder(Tags.Blocks.BOOKSHELVES)
                .forceAddTag(ConventionalBlockTags.BOOKSHELVES);

        getOrCreateTagBuilder(Tags.Blocks.CHESTS)
                .forceAddTag(ConventionalBlockTags.CHESTS);

        getOrCreateTagBuilder(Tags.Blocks.ORES_QUARTZ)
                .forceAddTag(ConventionalBlockTags.QUARTZ_ORES);
    }
}
