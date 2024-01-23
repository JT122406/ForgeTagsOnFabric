package io.github.jt122406.datagen.tags;

import io.github.jt122406.tags.Tags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ItemTags extends FabricTagProvider.ItemTagProvider {
    public ItemTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(ConventionalItemTags.SHEARS)
                .addOptionalTag(Tags.Items.SHEARS);

        getOrCreateTagBuilder(ConventionalItemTags.SPEARS)
                .addOptionalTag(Tags.Items.TOOLS_TRIDENTS);

        getOrCreateTagBuilder(ConventionalItemTags.BOWS)
                .addOptionalTag(Tags.Items.TOOLS_BOWS)
                .addOptionalTag(Tags.Items.TOOLS_CROSSBOWS);

        getOrCreateTagBuilder(ConventionalItemTags.SHIELDS)
                .addOptionalTag(Tags.Items.TOOLS_SHIELDS);

        getOrCreateTagBuilder(ConventionalItemTags.DUSTS)
                .addOptionalTag(Tags.Items.DUSTS);

        getOrCreateTagBuilder(ConventionalItemTags.GEMS)
                .addOptionalTag(Tags.Items.GEMS);

        getOrCreateTagBuilder(ConventionalItemTags.INGOTS)
                .addOptionalTag(Tags.Items.INGOTS);

        getOrCreateTagBuilder(ConventionalItemTags.NUGGETS)
                .addOptionalTag(Tags.Items.NUGGETS);

        getOrCreateTagBuilder(ConventionalItemTags.ORES)
                .addOptionalTag(Tags.Items.ORES);

        getOrCreateTagBuilder(ConventionalItemTags.RAW_ORES)
                .addOptionalTag(Tags.Items.RAW_MATERIALS);

        getOrCreateTagBuilder(ConventionalItemTags.IRON_INGOTS)
                .addOptionalTag(Tags.Items.INGOTS_IRON);

        getOrCreateTagBuilder(ConventionalItemTags.GOLD_INGOTS)
                .addOptionalTag(Tags.Items.INGOTS_GOLD);

        getOrCreateTagBuilder(ConventionalItemTags.COPPER_INGOTS)
                .addOptionalTag(Tags.Items.INGOTS_COPPER);

        getOrCreateTagBuilder(ConventionalItemTags.NETHERITE_INGOTS)
                .addOptionalTag(Tags.Items.INGOTS_NETHERITE);

        getOrCreateTagBuilder(ConventionalItemTags.QUARTZ_ORES)
                .addOptionalTag(Tags.Items.ORES_QUARTZ);

        getOrCreateTagBuilder(ConventionalItemTags.BOOKSHELVES)
                .addOptionalTag(Tags.Items.BOOKSHELVES);

        getOrCreateTagBuilder(ConventionalItemTags.CHESTS)
                .addOptionalTag(Tags.Items.CHESTS);

        getOrCreateTagBuilder(ConventionalItemTags.WOODEN_BARRELS)
                .addOptionalTag(Tags.Items.BARRELS_WOODEN);

        getOrCreateTagBuilder(ConventionalItemTags.DYES)
                .addOptionalTag(Tags.Items.DYES);

        getOrCreateTagBuilder(ConventionalItemTags.REDSTONE_DUSTS)
                .addOptionalTag(Tags.Items.DUSTS_REDSTONE);

        getOrCreateTagBuilder(ConventionalItemTags.GLASS_PANES)
                .addOptionalTag(Tags.Items.GLASS_PANES);
    }
}
