package io.github.jt122406.datagen;

import io.github.jt122406.datagen.tags.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class Datagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(BlockTags::new);
        pack.addProvider(ItemTags::new);
        pack.addProvider(FluidTags::new);
        pack.addProvider(EntityTypeTags::new);
        pack.addProvider(BiomeTags::new);
    }
}
