package io.github.jt122406.datagen.tags;

import net.minecraftforge.common.Tags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

import static net.minecraftforge.common.Tags.Blocks.*;

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
                .addOptionalTag(Tags.Blocks.CHESTS)
                .addOptionalTag(Tags.Blocks.CHESTS_ENDER)
                .addOptionalTag(Tags.Blocks.CHESTS_TRAPPED);

        getOrCreateTagBuilder(ConventionalBlockTags.QUARTZ_ORES)
                .addOptionalTag(Tags.Blocks.ORES_QUARTZ);

        getOrCreateTagBuilder(ConventionalBlockTags.GLASS_PANES)
                .addOptionalTag(Tags.Blocks.GLASS_PANES);

        getOrCreateTagBuilder(ConventionalBlockTags.GLASS_BLOCKS)
                .addOptionalTag(Tags.Blocks.GLASS)
                .addOptionalTag(Tags.Blocks.STAINED_GLASS)
                .addOptionalTag(Tags.Blocks.GLASS_TINTED);

        getOrCreateTagBuilder(BARRELS).addTag(BARRELS_WOODEN);
        getOrCreateTagBuilder(BARRELS_WOODEN).add(Blocks.BARREL);
        getOrCreateTagBuilder(BOOKSHELVES).add(Blocks.BOOKSHELF);
        getOrCreateTagBuilder(CHESTS).addTag(CHESTS_ENDER).addTag(CHESTS_TRAPPED).addTag(CHESTS_WOODEN);
        getOrCreateTagBuilder(CHESTS_ENDER).add(Blocks.ENDER_CHEST);
        getOrCreateTagBuilder(CHESTS_TRAPPED).add(Blocks.TRAPPED_CHEST);
        getOrCreateTagBuilder(CHESTS_WOODEN).add(Blocks.CHEST, Blocks.TRAPPED_CHEST);
        getOrCreateTagBuilder(COBBLESTONE).addTag(COBBLESTONE_NORMAL).addTag(COBBLESTONE_INFESTED).addTag(COBBLESTONE_MOSSY).addTag(COBBLESTONE_DEEPSLATE);
        getOrCreateTagBuilder(COBBLESTONE_NORMAL).add(Blocks.COBBLESTONE);
        getOrCreateTagBuilder(COBBLESTONE_INFESTED).add(Blocks.INFESTED_COBBLESTONE);
        getOrCreateTagBuilder(COBBLESTONE_MOSSY).add(Blocks.MOSSY_COBBLESTONE);
        getOrCreateTagBuilder(COBBLESTONE_DEEPSLATE).add(Blocks.COBBLED_DEEPSLATE);
        getOrCreateTagBuilder(END_STONES).add(Blocks.END_STONE);
        getOrCreateTagBuilder(ENDERMAN_PLACE_ON_BLACKLIST);
        getOrCreateTagBuilder(FENCE_GATES).addTag(FENCE_GATES_WOODEN);
        getOrCreateTagBuilder(FENCE_GATES_WOODEN).add(Blocks.OAK_FENCE_GATE, Blocks.SPRUCE_FENCE_GATE, Blocks.BIRCH_FENCE_GATE, Blocks.JUNGLE_FENCE_GATE, Blocks.ACACIA_FENCE_GATE, Blocks.DARK_OAK_FENCE_GATE, Blocks.CRIMSON_FENCE_GATE, Blocks.WARPED_FENCE_GATE, Blocks.MANGROVE_FENCE_GATE, Blocks.BAMBOO_FENCE_GATE, Blocks.CHERRY_FENCE_GATE);
        getOrCreateTagBuilder(FENCES).addTag(FENCES_NETHER_BRICK).addTag(FENCES_WOODEN);
        getOrCreateTagBuilder(FENCES_NETHER_BRICK).add(Blocks.NETHER_BRICK_FENCE);
        getOrCreateTagBuilder(FENCES_WOODEN).forceAddTag(net.minecraft.tags.BlockTags.WOODEN_FENCES);
        getOrCreateTagBuilder(GLASS).addTag(GLASS_COLORLESS).addTag(STAINED_GLASS).addTag(GLASS_TINTED);
        getOrCreateTagBuilder(GLASS_COLORLESS).add(Blocks.GLASS);
        getOrCreateTagBuilder(GLASS_SILICA).add(Blocks.GLASS, Blocks.BLACK_STAINED_GLASS, Blocks.BLUE_STAINED_GLASS, Blocks.BROWN_STAINED_GLASS, Blocks.CYAN_STAINED_GLASS, Blocks.GRAY_STAINED_GLASS, Blocks.GREEN_STAINED_GLASS, Blocks.LIGHT_BLUE_STAINED_GLASS, Blocks.LIGHT_GRAY_STAINED_GLASS, Blocks.LIME_STAINED_GLASS, Blocks.MAGENTA_STAINED_GLASS, Blocks.ORANGE_STAINED_GLASS, Blocks.PINK_STAINED_GLASS, Blocks.PURPLE_STAINED_GLASS, Blocks.RED_STAINED_GLASS, Blocks.WHITE_STAINED_GLASS, Blocks.YELLOW_STAINED_GLASS);
        getOrCreateTagBuilder(GLASS_TINTED).add(Blocks.TINTED_GLASS);
        getOrCreateTagBuilder(STAINED_GLASS).add(Blocks.WHITE_STAINED_GLASS, Blocks.ORANGE_STAINED_GLASS, Blocks.MAGENTA_STAINED_GLASS, Blocks.LIGHT_BLUE_STAINED_GLASS, Blocks.YELLOW_STAINED_GLASS, Blocks.LIME_STAINED_GLASS, Blocks.PINK_STAINED_GLASS, Blocks.GRAY_STAINED_GLASS, Blocks.LIGHT_GRAY_STAINED_GLASS, Blocks.CYAN_STAINED_GLASS, Blocks.PURPLE_STAINED_GLASS, Blocks.BLUE_STAINED_GLASS, Blocks.BROWN_STAINED_GLASS, Blocks.GREEN_STAINED_GLASS, Blocks.RED_STAINED_GLASS, Blocks.BLACK_STAINED_GLASS);
        getOrCreateTagBuilder(GLASS_PANES).addTag(GLASS_PANES_COLORLESS).addTag(STAINED_GLASS_PANES);
        getOrCreateTagBuilder(GLASS_PANES_COLORLESS).add(Blocks.GLASS_PANE);
        getOrCreateTagBuilder(STAINED_GLASS_PANES).add(Blocks.WHITE_STAINED_GLASS_PANE, Blocks.ORANGE_STAINED_GLASS_PANE, Blocks.MAGENTA_STAINED_GLASS_PANE, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE, Blocks.YELLOW_STAINED_GLASS_PANE, Blocks.LIME_STAINED_GLASS_PANE, Blocks.PINK_STAINED_GLASS_PANE, Blocks.GRAY_STAINED_GLASS_PANE, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE, Blocks.CYAN_STAINED_GLASS_PANE, Blocks.PURPLE_STAINED_GLASS_PANE, Blocks.BLUE_STAINED_GLASS_PANE, Blocks.BROWN_STAINED_GLASS_PANE, Blocks.GREEN_STAINED_GLASS_PANE, Blocks.RED_STAINED_GLASS_PANE, Blocks.BLACK_STAINED_GLASS_PANE);
        getOrCreateTagBuilder(GRAVEL).add(Blocks.GRAVEL);
        getOrCreateTagBuilder(NETHERRACK).add(Blocks.NETHERRACK);
        getOrCreateTagBuilder(OBSIDIAN).add(Blocks.OBSIDIAN);
        getOrCreateTagBuilder(ORE_BEARING_GROUND_DEEPSLATE).add(Blocks.DEEPSLATE);
        getOrCreateTagBuilder(ORE_BEARING_GROUND_NETHERRACK).add(Blocks.NETHERRACK);
        getOrCreateTagBuilder(ORE_BEARING_GROUND_STONE).add(Blocks.STONE);
        getOrCreateTagBuilder(ORE_RATES_DENSE).add(Blocks.COPPER_ORE, Blocks.DEEPSLATE_COPPER_ORE, Blocks.DEEPSLATE_LAPIS_ORE, Blocks.DEEPSLATE_REDSTONE_ORE, Blocks.LAPIS_ORE, Blocks.REDSTONE_ORE);
        getOrCreateTagBuilder(ORE_RATES_SINGULAR).add(Blocks.ANCIENT_DEBRIS, Blocks.COAL_ORE, Blocks.DEEPSLATE_COAL_ORE, Blocks.DEEPSLATE_DIAMOND_ORE, Blocks.DEEPSLATE_EMERALD_ORE, Blocks.DEEPSLATE_GOLD_ORE, Blocks.DEEPSLATE_IRON_ORE, Blocks.DIAMOND_ORE, Blocks.EMERALD_ORE, Blocks.GOLD_ORE, Blocks.IRON_ORE, Blocks.NETHER_QUARTZ_ORE);
        getOrCreateTagBuilder(ORE_RATES_SPARSE).add(Blocks.NETHER_GOLD_ORE);
        getOrCreateTagBuilder(ORES).addTag(ORES_COAL).addTag(ORES_COPPER).addTag(ORES_DIAMOND).addTag(ORES_EMERALD).addTag(ORES_GOLD).addTag(ORES_IRON).addTag(ORES_LAPIS).addTag(ORES_REDSTONE).addTag(ORES_QUARTZ).addTag(ORES_NETHERITE_SCRAP);
        getOrCreateTagBuilder(ORES_COAL).forceAddTag(net.minecraft.tags.BlockTags.COAL_ORES);
        getOrCreateTagBuilder(ORES_COPPER).forceAddTag(net.minecraft.tags.BlockTags.COPPER_ORES);
        getOrCreateTagBuilder(ORES_DIAMOND).forceAddTag(net.minecraft.tags.BlockTags.DIAMOND_ORES);
        getOrCreateTagBuilder(ORES_EMERALD).forceAddTag(net.minecraft.tags.BlockTags.EMERALD_ORES);
        getOrCreateTagBuilder(ORES_GOLD).forceAddTag(net.minecraft.tags.BlockTags.GOLD_ORES);
        getOrCreateTagBuilder(ORES_IRON).forceAddTag(net.minecraft.tags.BlockTags.IRON_ORES);
        getOrCreateTagBuilder(ORES_LAPIS).forceAddTag(net.minecraft.tags.BlockTags.LAPIS_ORES);
        getOrCreateTagBuilder(ORES_QUARTZ).add(Blocks.NETHER_QUARTZ_ORE);
        getOrCreateTagBuilder(ORES_REDSTONE).forceAddTag(net.minecraft.tags.BlockTags.REDSTONE_ORES);
        getOrCreateTagBuilder(ORES_NETHERITE_SCRAP).add(Blocks.ANCIENT_DEBRIS);
        getOrCreateTagBuilder(ORES_IN_GROUND_DEEPSLATE).add(Blocks.DEEPSLATE_COAL_ORE, Blocks.DEEPSLATE_COPPER_ORE, Blocks.DEEPSLATE_DIAMOND_ORE, Blocks.DEEPSLATE_EMERALD_ORE, Blocks.DEEPSLATE_GOLD_ORE, Blocks.DEEPSLATE_IRON_ORE, Blocks.DEEPSLATE_LAPIS_ORE, Blocks.DEEPSLATE_REDSTONE_ORE);
        getOrCreateTagBuilder(ORES_IN_GROUND_NETHERRACK).add(Blocks.NETHER_GOLD_ORE, Blocks.NETHER_QUARTZ_ORE);
        getOrCreateTagBuilder(ORES_IN_GROUND_STONE).add(Blocks.COAL_ORE, Blocks.COPPER_ORE, Blocks.DIAMOND_ORE, Blocks.EMERALD_ORE, Blocks.GOLD_ORE, Blocks.IRON_ORE, Blocks.LAPIS_ORE, Blocks.REDSTONE_ORE);
        getOrCreateTagBuilder(SAND).addTag(SAND_COLORLESS).addTag(SAND_RED);
        getOrCreateTagBuilder(SAND_COLORLESS).add(Blocks.SAND);
        getOrCreateTagBuilder(SAND_RED).add(Blocks.RED_SAND);
        getOrCreateTagBuilder(SANDSTONE).add(Blocks.SANDSTONE, Blocks.CUT_SANDSTONE, Blocks.CHISELED_SANDSTONE, Blocks.SMOOTH_SANDSTONE, Blocks.RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE, Blocks.CHISELED_RED_SANDSTONE, Blocks.SMOOTH_RED_SANDSTONE);
        getOrCreateTagBuilder(STONE).add(Blocks.ANDESITE, Blocks.DIORITE, Blocks.GRANITE, Blocks.INFESTED_STONE, Blocks.STONE, Blocks.POLISHED_ANDESITE, Blocks.POLISHED_DIORITE, Blocks.POLISHED_GRANITE, Blocks.DEEPSLATE, Blocks.POLISHED_DEEPSLATE, Blocks.INFESTED_DEEPSLATE, Blocks.TUFF);
        getOrCreateTagBuilder(STORAGE_BLOCKS).addTag(STORAGE_BLOCKS_AMETHYST).addTag(STORAGE_BLOCKS_COAL).addTag(STORAGE_BLOCKS_COPPER).addTag(STORAGE_BLOCKS_DIAMOND).addTag(STORAGE_BLOCKS_EMERALD).addTag(STORAGE_BLOCKS_GOLD).addTag(STORAGE_BLOCKS_IRON).addTag(STORAGE_BLOCKS_LAPIS).addTag(STORAGE_BLOCKS_QUARTZ).addTag(STORAGE_BLOCKS_RAW_COPPER).addTag(STORAGE_BLOCKS_RAW_GOLD).addTag(STORAGE_BLOCKS_RAW_IRON).addTag(STORAGE_BLOCKS_REDSTONE).addTag(STORAGE_BLOCKS_NETHERITE);
        getOrCreateTagBuilder(STORAGE_BLOCKS_AMETHYST).add(Blocks.AMETHYST_BLOCK);
        getOrCreateTagBuilder(STORAGE_BLOCKS_COAL).add(Blocks.COAL_BLOCK);
        getOrCreateTagBuilder(STORAGE_BLOCKS_COPPER).add(Blocks.COPPER_BLOCK);
        getOrCreateTagBuilder(STORAGE_BLOCKS_DIAMOND).add(Blocks.DIAMOND_BLOCK);
        getOrCreateTagBuilder(STORAGE_BLOCKS_EMERALD).add(Blocks.EMERALD_BLOCK);
        getOrCreateTagBuilder(STORAGE_BLOCKS_GOLD).add(Blocks.GOLD_BLOCK);
        getOrCreateTagBuilder(STORAGE_BLOCKS_IRON).add(Blocks.IRON_BLOCK);
        getOrCreateTagBuilder(STORAGE_BLOCKS_LAPIS).add(Blocks.LAPIS_BLOCK);
        getOrCreateTagBuilder(STORAGE_BLOCKS_QUARTZ).add(Blocks.QUARTZ_BLOCK);
        getOrCreateTagBuilder(STORAGE_BLOCKS_RAW_COPPER).add(Blocks.RAW_COPPER_BLOCK);
        getOrCreateTagBuilder(STORAGE_BLOCKS_RAW_GOLD).add(Blocks.RAW_GOLD_BLOCK);
        getOrCreateTagBuilder(STORAGE_BLOCKS_RAW_IRON).add(Blocks.RAW_IRON_BLOCK);
        getOrCreateTagBuilder(STORAGE_BLOCKS_REDSTONE).add(Blocks.REDSTONE_BLOCK);
        getOrCreateTagBuilder(STORAGE_BLOCKS_NETHERITE).add(Blocks.NETHERITE_BLOCK);
    }
}
