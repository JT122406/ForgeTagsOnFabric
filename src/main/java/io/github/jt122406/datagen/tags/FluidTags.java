package io.github.jt122406.datagen.tags;

import io.github.jt122406.tags.Tags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalFluidTags;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class FluidTags extends FabricTagProvider.FluidTagProvider {
    public FluidTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(ConventionalFluidTags.MILK)
                .addOptionalTag(Tags.Fluids.MILK);
    }
}
