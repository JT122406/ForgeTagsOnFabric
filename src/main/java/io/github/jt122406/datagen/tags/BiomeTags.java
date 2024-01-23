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
                .addOptionalTag(Tags.Biomes.IS_HOT_END);

        getOrCreateTagBuilder(ConventionalBiomeTags.CLIMATE_HOT)
                .addOptionalTag(Tags.Biomes.IS_HOT);

        getOrCreateTagBuilder(Tags.Biomes.IS_COLD)
                .addOptionalTag(Tags.Biomes.IS_COLD_OVERWORLD)
                .addOptionalTag(Tags.Biomes.IS_COLD_NETHER)
                .addOptionalTag(Tags.Biomes.IS_COLD_END);

        getOrCreateTagBuilder(ConventionalBiomeTags.CLIMATE_COLD)
                .addOptionalTag(Tags.Biomes.IS_COLD);

        getOrCreateTagBuilder(Tags.Biomes.IS_SPARSE)
                .addOptionalTag(Tags.Biomes.IS_SPARSE_OVERWORLD)
                .addOptionalTag(Tags.Biomes.IS_SPARSE_NETHER)
                .addOptionalTag(Tags.Biomes.IS_SPARSE_END);

        getOrCreateTagBuilder(ConventionalBiomeTags.VEGETATION_SPARSE)
                .addOptionalTag(Tags.Biomes.IS_SPARSE);

        getOrCreateTagBuilder(Tags.Biomes.IS_DENSE)
                .addOptionalTag(Tags.Biomes.IS_DENSE_OVERWORLD)
                .addOptionalTag(Tags.Biomes.IS_DENSE_NETHER)
                .addOptionalTag(Tags.Biomes.IS_DENSE_END);

        getOrCreateTagBuilder(ConventionalBiomeTags.VEGETATION_DENSE)
                .addOptionalTag(Tags.Biomes.IS_DENSE);

        getOrCreateTagBuilder(Tags.Biomes.IS_DRY)
                .addOptionalTag(Tags.Biomes.IS_DRY_OVERWORLD)
                .addOptionalTag(Tags.Biomes.IS_DRY_NETHER)
                .addOptionalTag(Tags.Biomes.IS_DRY_END);

        getOrCreateTagBuilder(ConventionalBiomeTags.CLIMATE_DRY)
                .addOptionalTag(Tags.Biomes.IS_DRY);

        getOrCreateTagBuilder(Tags.Biomes.IS_WET)
                .addOptionalTag(Tags.Biomes.IS_WET_OVERWORLD)
                .addOptionalTag(Tags.Biomes.IS_WET_NETHER)
                .addOptionalTag(Tags.Biomes.IS_WET_END);

        getOrCreateTagBuilder(ConventionalBiomeTags.CLIMATE_WET)
                .addOptionalTag(Tags.Biomes.IS_WET);

        getOrCreateTagBuilder(ConventionalBiomeTags.TREE_CONIFEROUS)
                .addOptionalTag(Tags.Biomes.IS_CONIFEROUS);
        
        getOrCreateTagBuilder(ConventionalBiomeTags.DEAD)
                .addOptionalTag(Tags.Biomes.IS_DEAD);

        getOrCreateTagBuilder(ConventionalBiomeTags.DESERT)
                .addOptionalTag(Tags.Biomes.IS_DESERT);

        getOrCreateTagBuilder(ConventionalBiomeTags.PLAINS)
                .addOptionalTag(Tags.Biomes.IS_PLAINS);

        getOrCreateTagBuilder(ConventionalBiomeTags.SWAMP)
                .addOptionalTag(Tags.Biomes.IS_SWAMP);

        getOrCreateTagBuilder(ConventionalBiomeTags.SNOWY)
                .addOptionalTag(Tags.Biomes.IS_SNOWY);

        getOrCreateTagBuilder(ConventionalBiomeTags.WASTELAND)
                .addOptionalTag(Tags.Biomes.IS_WASTELAND);

        getOrCreateTagBuilder(ConventionalBiomeTags.VOID)
                .addOptionalTag(Tags.Biomes.IS_VOID);

        getOrCreateTagBuilder(ConventionalBiomeTags.UNDERGROUND)
                .addOptionalTag(Tags.Biomes.IS_UNDERGROUND);

        getOrCreateTagBuilder(ConventionalBiomeTags.CAVES)
                .addOptionalTag(Tags.Biomes.IS_CAVE);

        getOrCreateTagBuilder(ConventionalBiomeTags.MOUNTAIN_PEAK)
                .addOptionalTag(Tags.Biomes.IS_PEAK);

        getOrCreateTagBuilder(ConventionalBiomeTags.MOUNTAIN_SLOPE)
                .addOptionalTag(Tags.Biomes.IS_SLOPE);

        getOrCreateTagBuilder(ConventionalBiomeTags.MOUNTAIN)
                .addOptionalTag(Tags.Biomes.IS_MOUNTAIN);
    }
}
