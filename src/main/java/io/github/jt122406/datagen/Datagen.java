package io.github.jt122406.datagen;

import io.github.jt122406.datagen.tags.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class Datagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        FabricTagProvider.BlockTagProvider blockProvider = pack.addProvider(BlockTags::new);
        pack.addProvider((output, completableFuture) -> new ItemTags(output, completableFuture, blockProvider));
        pack.addProvider(FluidTags::new);
        pack.addProvider(EntityTypeTags::new);
        pack.addProvider(BiomeTags::new);
    }
}
