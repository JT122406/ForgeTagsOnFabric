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
        getOrCreateTagBuilder(ConventionalBlockTags.WOODEN_BARRELS)
                .addOptionalTag(Tags.Blocks.BARRELS_WOODEN);

        getOrCreateTagBuilder(ConventionalBlockTags.ORES)
                .addOptionalTag(Tags.Blocks.ORES);

        getOrCreateTagBuilder(ConventionalBlockTags.BOOKSHELVES)
                .addOptionalTag(Tags.Blocks.BOOKSHELVES);

        getOrCreateTagBuilder(ConventionalBlockTags.CHESTS)
                .addOptionalTag(Tags.Blocks.CHESTS);

        getOrCreateTagBuilder(ConventionalBlockTags.QUARTZ_ORES)
                .addOptionalTag(Tags.Blocks.ORES_QUARTZ);
    }
}
