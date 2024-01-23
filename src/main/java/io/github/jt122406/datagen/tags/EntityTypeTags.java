package io.github.jt122406.datagen.tags;

import io.github.jt122406.tags.Tags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalEntityTypeTags;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class EntityTypeTags extends FabricTagProvider.EntityTypeTagProvider {
    public EntityTypeTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(Tags.EntityTypes.BOSSES)
                .forceAddTag(ConventionalEntityTypeTags.BOSSES);
    }
}
