package io.github.jt122406.datagen;

import io.github.jt122406.datagen.tags.BiomeTags;
import io.github.jt122406.datagen.tags.BlockTags;
import io.github.jt122406.datagen.tags.EntityTypeTags;
import io.github.jt122406.datagen.tags.FluidTags;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class Datagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(BlockTags::new);
        pack.addProvider(FluidTags::new);
        pack.addProvider(EntityTypeTags::new);
        pack.addProvider(BiomeTags::new);
    }
}
