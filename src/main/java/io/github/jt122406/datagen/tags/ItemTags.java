package io.github.jt122406.datagen.tags;

import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ItemTags extends FabricTagProvider.ItemTagProvider {


    public ItemTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture, @Nullable FabricTagProvider.BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
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

        getOrCreateTagBuilder(ConventionalItemTags.RAW_IRON_ORES)
                .addOptionalTag(Tags.Items.RAW_MATERIALS_IRON);

        getOrCreateTagBuilder(ConventionalItemTags.GOLD_INGOTS)
                .addOptionalTag(Tags.Items.INGOTS_GOLD);

        getOrCreateTagBuilder(ConventionalItemTags.RAW_GOLD_ORES)
                .addOptionalTag(Tags.Items.RAW_MATERIALS_GOLD);

        getOrCreateTagBuilder(ConventionalItemTags.COPPER_INGOTS)
                .addOptionalTag(Tags.Items.INGOTS_COPPER);

        getOrCreateTagBuilder(ConventionalItemTags.RAW_COPPER_ORES)
                .addOptionalTag(Tags.Items.RAW_MATERIALS_COPPER);

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

        copy(Tags.Blocks.BARRELS, Tags.Items.BARRELS);
        copy(Tags.Blocks.BARRELS_WOODEN, Tags.Items.BARRELS_WOODEN);
        getOrCreateTagBuilder(Tags.Items.BONES).add(Items.BONE);
        copy(Tags.Blocks.BOOKSHELVES, Tags.Items.BOOKSHELVES);
        copy(Tags.Blocks.CHESTS, Tags.Items.CHESTS);
        copy(Tags.Blocks.CHESTS_ENDER, Tags.Items.CHESTS_ENDER);
        copy(Tags.Blocks.CHESTS_TRAPPED, Tags.Items.CHESTS_TRAPPED);
        copy(Tags.Blocks.CHESTS_WOODEN, Tags.Items.CHESTS_WOODEN);
        copy(Tags.Blocks.COBBLESTONE, Tags.Items.COBBLESTONE);
        copy(Tags.Blocks.COBBLESTONE_NORMAL, Tags.Items.COBBLESTONE_NORMAL);
        copy(Tags.Blocks.COBBLESTONE_INFESTED, Tags.Items.COBBLESTONE_INFESTED);
        copy(Tags.Blocks.COBBLESTONE_MOSSY, Tags.Items.COBBLESTONE_MOSSY);
        copy(Tags.Blocks.COBBLESTONE_DEEPSLATE, Tags.Items.COBBLESTONE_DEEPSLATE);
        getOrCreateTagBuilder(Tags.Items.CROPS).addTag(Tags.Items.CROPS_BEETROOT).addTag(Tags.Items.CROPS_CARROT).addTag(Tags.Items.CROPS_NETHER_WART).addTag(Tags.Items.CROPS_POTATO).addTag(Tags.Items.CROPS_WHEAT);
        getOrCreateTagBuilder(Tags.Items.CROPS_BEETROOT).add(Items.BEETROOT);
        getOrCreateTagBuilder(Tags.Items.CROPS_CARROT).add(Items.CARROT);
        getOrCreateTagBuilder(Tags.Items.CROPS_NETHER_WART).add(Items.NETHER_WART);
        getOrCreateTagBuilder(Tags.Items.CROPS_POTATO).add(Items.POTATO);
        getOrCreateTagBuilder(Tags.Items.CROPS_WHEAT).add(Items.WHEAT);
        getOrCreateTagBuilder(Tags.Items.DUSTS).addTag(Tags.Items.DUSTS_GLOWSTONE).addTag(Tags.Items.DUSTS_PRISMARINE).addTag(Tags.Items.DUSTS_REDSTONE);
        getOrCreateTagBuilder(Tags.Items.DUSTS_GLOWSTONE).add(Items.GLOWSTONE_DUST);
        getOrCreateTagBuilder(Tags.Items.DUSTS_PRISMARINE).add(Items.PRISMARINE_SHARD);
        getOrCreateTagBuilder(Tags.Items.DUSTS_REDSTONE).add(Items.REDSTONE);
        getOrCreateTagBuilder(Tags.Items.DYES).add(Items.BLACK_DYE, Items.BLUE_DYE, Items.BROWN_DYE, Items.CYAN_DYE, Items.GRAY_DYE, Items.GREEN_DYE, Items.LIGHT_BLUE_DYE, Items.LIGHT_GRAY_DYE, Items.LIME_DYE, Items.MAGENTA_DYE, Items.ORANGE_DYE, Items.PINK_DYE, Items.PURPLE_DYE, Items.RED_DYE, Items.WHITE_DYE, Items.YELLOW_DYE);
        getOrCreateTagBuilder(Tags.Items.EGGS).add(Items.EGG);
        getOrCreateTagBuilder(Tags.Items.ENCHANTING_FUELS).addTag(Tags.Items.GEMS_LAPIS);
        copy(Tags.Blocks.END_STONES, Tags.Items.END_STONES);
        getOrCreateTagBuilder(Tags.Items.ENDER_PEARLS).add(Items.ENDER_PEARL);
        getOrCreateTagBuilder(Tags.Items.FEATHERS).add(Items.FEATHER);
        copy(Tags.Blocks.FENCE_GATES, Tags.Items.FENCE_GATES);
        copy(Tags.Blocks.FENCE_GATES_WOODEN, Tags.Items.FENCE_GATES_WOODEN);
        copy(Tags.Blocks.FENCES, Tags.Items.FENCES);
        copy(Tags.Blocks.FENCES_NETHER_BRICK, Tags.Items.FENCES_NETHER_BRICK);
        copy(Tags.Blocks.FENCES_WOODEN, Tags.Items.FENCES_WOODEN);
        getOrCreateTagBuilder(Tags.Items.GEMS).addTag(Tags.Items.GEMS_AMETHYST).addTag(Tags.Items.GEMS_DIAMOND).addTag(Tags.Items.GEMS_EMERALD).addTag(Tags.Items.GEMS_LAPIS).addTag(Tags.Items.GEMS_PRISMARINE).addTag(Tags.Items.GEMS_QUARTZ);
        getOrCreateTagBuilder(Tags.Items.GEMS_AMETHYST).add(Items.AMETHYST_SHARD);
        getOrCreateTagBuilder(Tags.Items.GEMS_DIAMOND).add(Items.DIAMOND);
        getOrCreateTagBuilder(Tags.Items.GEMS_EMERALD).add(Items.EMERALD);
        getOrCreateTagBuilder(Tags.Items.GEMS_LAPIS).add(Items.LAPIS_LAZULI);
        getOrCreateTagBuilder(Tags.Items.GEMS_PRISMARINE).add(Items.PRISMARINE_CRYSTALS);
        getOrCreateTagBuilder(Tags.Items.GEMS_QUARTZ).add(Items.QUARTZ);
        copy(Tags.Blocks.GLASS, Tags.Items.GLASS);
        copy(Tags.Blocks.GLASS_COLORLESS, Tags.Items.GLASS_COLORLESS);
        copy(Tags.Blocks.GLASS_TINTED, Tags.Items.GLASS_TINTED);
        copy(Tags.Blocks.GLASS_SILICA, Tags.Items.GLASS_SILICA);
        copy(Tags.Blocks.GLASS, Tags.Items.GLASS);
        copy(Tags.Blocks.GLASS_PANES, Tags.Items.GLASS_PANES);
        copy(Tags.Blocks.GLASS_PANES_COLORLESS, Tags.Items.GLASS_PANES_COLORLESS);
        copy(Tags.Blocks.GRAVEL, Tags.Items.GRAVEL);
        getOrCreateTagBuilder(Tags.Items.GUNPOWDER).add(Items.GUNPOWDER);
        getOrCreateTagBuilder(Tags.Items.HEADS).add(Items.CREEPER_HEAD, Items.DRAGON_HEAD, Items.PLAYER_HEAD, Items.SKELETON_SKULL, Items.WITHER_SKELETON_SKULL, Items.ZOMBIE_HEAD);
        getOrCreateTagBuilder(Tags.Items.INGOTS).addTag(Tags.Items.INGOTS_BRICK).addTag(Tags.Items.INGOTS_COPPER).addTag(Tags.Items.INGOTS_GOLD).addTag(Tags.Items.INGOTS_IRON).addTag(Tags.Items.INGOTS_NETHERITE).addTag(Tags.Items.INGOTS_NETHER_BRICK);
        getOrCreateTagBuilder(Tags.Items.INGOTS_BRICK).add(Items.BRICK);
        getOrCreateTagBuilder(Tags.Items.INGOTS_COPPER).add(Items.COPPER_INGOT);
        getOrCreateTagBuilder(Tags.Items.INGOTS_GOLD).add(Items.GOLD_INGOT);
        getOrCreateTagBuilder(Tags.Items.INGOTS_GOLD).add(Items.GOLD_INGOT);
        getOrCreateTagBuilder(Tags.Items.INGOTS_IRON).add(Items.IRON_INGOT);
        getOrCreateTagBuilder(Tags.Items.INGOTS_NETHERITE).add(Items.NETHERITE_INGOT);
        getOrCreateTagBuilder(Tags.Items.INGOTS_NETHER_BRICK).add(Items.NETHER_BRICK);
        getOrCreateTagBuilder(Tags.Items.LEATHER).add(Items.LEATHER);
        getOrCreateTagBuilder(Tags.Items.MUSHROOMS).add(Items.BROWN_MUSHROOM, Items.RED_MUSHROOM);
        getOrCreateTagBuilder(Tags.Items.NETHER_STARS).add(Items.NETHER_STAR);
        copy(Tags.Blocks.NETHERRACK, Tags.Items.NETHERRACK);
        getOrCreateTagBuilder(Tags.Items.NUGGETS).addTag(Tags.Items.NUGGETS_IRON).addTag(Tags.Items.NUGGETS_GOLD);
        getOrCreateTagBuilder(Tags.Items.NUGGETS_IRON).add(Items.IRON_NUGGET);
        getOrCreateTagBuilder(Tags.Items.NUGGETS_GOLD).add(Items.GOLD_NUGGET);
        copy(Tags.Blocks.OBSIDIAN, Tags.Items.OBSIDIAN);
        copy(Tags.Blocks.ORE_BEARING_GROUND_DEEPSLATE, Tags.Items.ORE_BEARING_GROUND_DEEPSLATE);
        copy(Tags.Blocks.ORE_BEARING_GROUND_NETHERRACK, Tags.Items.ORE_BEARING_GROUND_NETHERRACK);
        copy(Tags.Blocks.ORE_BEARING_GROUND_STONE, Tags.Items.ORE_BEARING_GROUND_STONE);
        copy(Tags.Blocks.ORE_RATES_DENSE, Tags.Items.ORE_RATES_DENSE);
        copy(Tags.Blocks.ORE_RATES_SINGULAR, Tags.Items.ORE_RATES_SINGULAR);
        copy(Tags.Blocks.ORE_RATES_SPARSE, Tags.Items.ORE_RATES_SPARSE);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(Tags.Blocks.ORES_COAL, Tags.Items.ORES_COAL);
        copy(Tags.Blocks.ORES_COPPER, Tags.Items.ORES_COPPER);
        copy(Tags.Blocks.ORES_DIAMOND, Tags.Items.ORES_DIAMOND);
        copy(Tags.Blocks.ORES_EMERALD, Tags.Items.ORES_EMERALD);
        copy(Tags.Blocks.ORES_GOLD, Tags.Items.ORES_GOLD);
        copy(Tags.Blocks.ORES_IRON, Tags.Items.ORES_IRON);
        copy(Tags.Blocks.ORES_LAPIS, Tags.Items.ORES_LAPIS);
        copy(Tags.Blocks.ORES_QUARTZ, Tags.Items.ORES_QUARTZ);
        copy(Tags.Blocks.ORES_REDSTONE, Tags.Items.ORES_REDSTONE);
        copy(Tags.Blocks.ORES_NETHERITE_SCRAP, Tags.Items.ORES_NETHERITE_SCRAP);
        copy(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE, Tags.Items.ORES_IN_GROUND_DEEPSLATE);
        copy(Tags.Blocks.ORES_IN_GROUND_NETHERRACK, Tags.Items.ORES_IN_GROUND_NETHERRACK);
        copy(Tags.Blocks.ORES_IN_GROUND_STONE, Tags.Items.ORES_IN_GROUND_STONE);
        getOrCreateTagBuilder(Tags.Items.RAW_MATERIALS).addTag(Tags.Items.RAW_MATERIALS_COPPER).addTag(Tags.Items.RAW_MATERIALS_GOLD).addTag(Tags.Items.RAW_MATERIALS_IRON);
        getOrCreateTagBuilder(Tags.Items.RAW_MATERIALS_COPPER).add(Items.RAW_COPPER);
        getOrCreateTagBuilder(Tags.Items.RAW_MATERIALS_GOLD).add(Items.RAW_GOLD);
        getOrCreateTagBuilder(Tags.Items.RAW_MATERIALS_IRON).add(Items.RAW_IRON);
        getOrCreateTagBuilder(Tags.Items.RODS).addTag(Tags.Items.RODS_BLAZE).addTag(Tags.Items.RODS_WOODEN);
        getOrCreateTagBuilder(Tags.Items.RODS_BLAZE).add(Items.BLAZE_ROD);
        getOrCreateTagBuilder(Tags.Items.RODS_WOODEN).add(Items.STICK);
        copy(Tags.Blocks.SAND, Tags.Items.SAND);
        copy(Tags.Blocks.SAND_COLORLESS, Tags.Items.SAND_COLORLESS);
        copy(Tags.Blocks.SAND_RED, Tags.Items.SAND_RED);
        copy(Tags.Blocks.SANDSTONE, Tags.Items.SANDSTONE);
        getOrCreateTagBuilder(Tags.Items.SEEDS).addTag(Tags.Items.SEEDS_BEETROOT).addTag(Tags.Items.SEEDS_MELON).addTag(Tags.Items.SEEDS_PUMPKIN).addTag(Tags.Items.SEEDS_WHEAT);
        getOrCreateTagBuilder(Tags.Items.SEEDS_BEETROOT).add(Items.BEETROOT_SEEDS);
        getOrCreateTagBuilder(Tags.Items.SEEDS_MELON).add(Items.MELON_SEEDS);
        getOrCreateTagBuilder(Tags.Items.SEEDS_PUMPKIN).add(Items.PUMPKIN_SEEDS);
        getOrCreateTagBuilder(Tags.Items.SEEDS_WHEAT).add(Items.WHEAT_SEEDS);
        getOrCreateTagBuilder(Tags.Items.SHEARS).add(Items.SHEARS);
        getOrCreateTagBuilder(Tags.Items.SLIMEBALLS).add(Items.SLIME_BALL);
        copy(Tags.Blocks.STAINED_GLASS, Tags.Items.STAINED_GLASS);
        copy(Tags.Blocks.STAINED_GLASS_PANES, Tags.Items.STAINED_GLASS_PANES);
        copy(Tags.Blocks.STONE, Tags.Items.STONE);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);
        copy(Tags.Blocks.STORAGE_BLOCKS_AMETHYST, Tags.Items.STORAGE_BLOCKS_AMETHYST);
        copy(Tags.Blocks.STORAGE_BLOCKS_COAL, Tags.Items.STORAGE_BLOCKS_COAL);
        copy(Tags.Blocks.STORAGE_BLOCKS_COPPER, Tags.Items.STORAGE_BLOCKS_COPPER);
        copy(Tags.Blocks.STORAGE_BLOCKS_DIAMOND, Tags.Items.STORAGE_BLOCKS_DIAMOND);
        copy(Tags.Blocks.STORAGE_BLOCKS_EMERALD, Tags.Items.STORAGE_BLOCKS_EMERALD);
        copy(Tags.Blocks.STORAGE_BLOCKS_GOLD, Tags.Items.STORAGE_BLOCKS_GOLD);
        copy(Tags.Blocks.STORAGE_BLOCKS_IRON, Tags.Items.STORAGE_BLOCKS_IRON);
        copy(Tags.Blocks.STORAGE_BLOCKS_LAPIS, Tags.Items.STORAGE_BLOCKS_LAPIS);
        copy(Tags.Blocks.STORAGE_BLOCKS_QUARTZ, Tags.Items.STORAGE_BLOCKS_QUARTZ);
        copy(Tags.Blocks.STORAGE_BLOCKS_REDSTONE, Tags.Items.STORAGE_BLOCKS_REDSTONE);
        copy(Tags.Blocks.STORAGE_BLOCKS_RAW_COPPER, Tags.Items.STORAGE_BLOCKS_RAW_COPPER);
        copy(Tags.Blocks.STORAGE_BLOCKS_RAW_GOLD, Tags.Items.STORAGE_BLOCKS_RAW_GOLD);
        copy(Tags.Blocks.STORAGE_BLOCKS_RAW_IRON, Tags.Items.STORAGE_BLOCKS_RAW_IRON);
        copy(Tags.Blocks.STORAGE_BLOCKS_NETHERITE, Tags.Items.STORAGE_BLOCKS_NETHERITE);
        getOrCreateTagBuilder(Tags.Items.STRING).add(Items.STRING);
        getOrCreateTagBuilder(Tags.Items.TOOLS_SHIELDS).add(Items.SHIELD);
        getOrCreateTagBuilder(Tags.Items.TOOLS_BOWS).add(Items.BOW);
        getOrCreateTagBuilder(Tags.Items.TOOLS_CROSSBOWS).add(Items.CROSSBOW);
        getOrCreateTagBuilder(Tags.Items.TOOLS_FISHING_RODS).add(Items.FISHING_ROD);
        getOrCreateTagBuilder(Tags.Items.TOOLS_TRIDENTS).add(Items.TRIDENT);
        getOrCreateTagBuilder(Tags.Items.TOOLS)
                .forceAddTag(net.minecraft.tags.ItemTags.SWORDS).forceAddTag(net.minecraft.tags.ItemTags.AXES).forceAddTag(net.minecraft.tags.ItemTags.PICKAXES).forceAddTag(net.minecraft.tags.ItemTags.SHOVELS).forceAddTag(net.minecraft.tags.ItemTags.HOES)
                .addTag(Tags.Items.TOOLS_SHIELDS).addTag(Tags.Items.TOOLS_BOWS).addTag(Tags.Items.TOOLS_CROSSBOWS).addTag(Tags.Items.TOOLS_FISHING_RODS).addTag(Tags.Items.TOOLS_TRIDENTS);
        getOrCreateTagBuilder(Tags.Items.ARMORS_HELMETS).add(Items.LEATHER_HELMET, Items.TURTLE_HELMET, Items.CHAINMAIL_HELMET, Items.IRON_HELMET, Items.GOLDEN_HELMET, Items.DIAMOND_HELMET, Items.NETHERITE_HELMET);
        getOrCreateTagBuilder(Tags.Items.ARMORS_CHESTPLATES).add(Items.LEATHER_CHESTPLATE, Items.CHAINMAIL_CHESTPLATE, Items.IRON_CHESTPLATE, Items.GOLDEN_CHESTPLATE, Items.DIAMOND_CHESTPLATE, Items.NETHERITE_CHESTPLATE);
        getOrCreateTagBuilder(Tags.Items.ARMORS_LEGGINGS).add(Items.LEATHER_LEGGINGS, Items.CHAINMAIL_LEGGINGS, Items.IRON_LEGGINGS, Items.GOLDEN_LEGGINGS, Items.DIAMOND_LEGGINGS, Items.NETHERITE_LEGGINGS);
        getOrCreateTagBuilder(Tags.Items.ARMORS_BOOTS).add(Items.LEATHER_BOOTS, Items.CHAINMAIL_BOOTS, Items.IRON_BOOTS, Items.GOLDEN_BOOTS, Items.DIAMOND_BOOTS, Items.NETHERITE_BOOTS);
        getOrCreateTagBuilder(Tags.Items.ARMORS).addTag(Tags.Items.ARMORS_HELMETS).addTag(Tags.Items.ARMORS_CHESTPLATES).addTag(Tags.Items.ARMORS_LEGGINGS).addTag(Tags.Items.ARMORS_BOOTS);
    }
}
