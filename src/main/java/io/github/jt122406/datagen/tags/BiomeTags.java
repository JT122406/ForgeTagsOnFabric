package io.github.jt122406.datagen.tags;

import io.github.jt122406.tags.Tags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBiomeTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.biome.Biome;

import java.util.concurrent.CompletableFuture;

public class BiomeTags extends FabricTagProvider<Biome>  {

    public BiomeTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, Registries.BIOME, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(Tags.Biomes.IS_HOT)
                .addOptionalTag(Tags.Biomes.IS_HOT_OVERWORLD)
                .addOptionalTag(Tags.Biomes.IS_HOT_NETHER)
                .addOptionalTag(Tags.Biomes.IS_HOT_END)
                .addOptionalTag(ConventionalBiomeTags.CLIMATE_HOT);

        getOrCreateTagBuilder(Tags.Biomes.IS_COLD)
                .addOptionalTag(Tags.Biomes.IS_COLD_OVERWORLD)
                .addOptionalTag(Tags.Biomes.IS_COLD_NETHER)
                .addOptionalTag(Tags.Biomes.IS_COLD_END)
                .addOptionalTag(ConventionalBiomeTags.CLIMATE_COLD);

        getOrCreateTagBuilder(Tags.Biomes.IS_SPARSE)
                .addOptionalTag(Tags.Biomes.IS_SPARSE_OVERWORLD)
                .addOptionalTag(Tags.Biomes.IS_SPARSE_NETHER)
                .addOptionalTag(Tags.Biomes.IS_SPARSE_END)
                .addOptionalTag(ConventionalBiomeTags.VEGETATION_SPARSE);

        getOrCreateTagBuilder(Tags.Biomes.IS_DENSE)
                .addOptionalTag(Tags.Biomes.IS_DENSE_OVERWORLD)
                .addOptionalTag(Tags.Biomes.IS_DENSE_NETHER)
                .addOptionalTag(Tags.Biomes.IS_DENSE_END)
                .addOptionalTag(ConventionalBiomeTags.VEGETATION_DENSE);

        getOrCreateTagBuilder(Tags.Biomes.IS_DRY)
                .addOptionalTag(Tags.Biomes.IS_DRY_OVERWORLD)
                .addOptionalTag(Tags.Biomes.IS_DRY_NETHER)
                .addOptionalTag(Tags.Biomes.IS_DRY_END)
                .addOptionalTag(ConventionalBiomeTags.CLIMATE_DRY);

        getOrCreateTagBuilder(Tags.Biomes.IS_WET)
                .addOptionalTag(Tags.Biomes.IS_WET_OVERWORLD)
                .addOptionalTag(Tags.Biomes.IS_WET_NETHER)
                .addOptionalTag(Tags.Biomes.IS_WET_END)
                .addOptionalTag(ConventionalBiomeTags.CLIMATE_WET);

        getOrCreateTagBuilder(Tags.Biomes.IS_CONIFEROUS)
                .addOptionalTag(ConventionalBiomeTags.TREE_CONIFEROUS);
        
        getOrCreateTagBuilder(Tags.Biomes.IS_DEAD)
                .addOptionalTag(ConventionalBiomeTags.DEAD);

        getOrCreateTagBuilder(Tags.Biomes.IS_DESERT)
                .addOptionalTag(ConventionalBiomeTags.DESERT);

        getOrCreateTagBuilder(Tags.Biomes.IS_PLAINS)
                .addOptionalTag(ConventionalBiomeTags.PLAINS);

        getOrCreateTagBuilder(Tags.Biomes.IS_SWAMP)
                .addOptionalTag(ConventionalBiomeTags.SWAMP);

        getOrCreateTagBuilder(Tags.Biomes.IS_SNOWY)
                .addOptionalTag(ConventionalBiomeTags.SNOWY);

        getOrCreateTagBuilder(Tags.Biomes.IS_WASTELAND)
                .addOptionalTag(ConventionalBiomeTags.WASTELAND);

        getOrCreateTagBuilder(Tags.Biomes.IS_VOID)
                .addOptionalTag(ConventionalBiomeTags.VOID);

        getOrCreateTagBuilder(Tags.Biomes.IS_UNDERGROUND)
                .addOptionalTag(ConventionalBiomeTags.UNDERGROUND);

        getOrCreateTagBuilder(Tags.Biomes.IS_CAVE)
                .addOptionalTag(ConventionalBiomeTags.CAVES);

        getOrCreateTagBuilder(Tags.Biomes.IS_PEAK)
                .addOptionalTag(ConventionalBiomeTags.MOUNTAIN_PEAK);

        getOrCreateTagBuilder(Tags.Biomes.IS_SLOPE)
                .addOptionalTag(ConventionalBiomeTags.MOUNTAIN_SLOPE);

        getOrCreateTagBuilder(Tags.Biomes.IS_MOUNTAIN)
                .addOptionalTag(ConventionalBiomeTags.MOUNTAIN);
    }
}
