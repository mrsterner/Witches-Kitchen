package cf.witcheskitchen.datagen;

import cf.witcheskitchen.WitchesKitchen;
import cf.witcheskitchen.common.registry.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class WKLanguageProvider extends FabricLanguageProvider {
    protected WKLanguageProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        //GROUPS
        builder.add(WitchesKitchen.GENERAL_TAB, "Witches' Kitchen General");
        builder.add(WitchesKitchen.SEED_TAB, "Witches' Kitchen Seeds");
        builder.add(WitchesKitchen.GINGER_TAB, "Witches' Kitchen Gingerbread");

        //BLOCKS
        builder.add(WKBlocks.RAW_GINGERBREAD_BLOCK, "Raw Gingerbread Block");

        builder.add(WKBlocks.RAW_CHISELED_GINGERBREAD_BLOCK, "Chiseled Raw Gingerbread Block");
        builder.add(WKBlocks.RAW_GINGERBREAD_BEVELED_BLOCK, "Beveled Raw Gingerbread Block");
        builder.add(WKBlocks.GINGERBREAD_BEVELED_BLOCK, "Beveled Ginger Block");
        builder.add(WKBlocks.FROSTING_BLOCK, "Frosting Block");
        builder.add(WKBlocks.FROSTED_GINGERBREAD_BLOCK, "Frosted Gingerbread Block");
        builder.add(WKBlocks.FROSTED_BEVELED_GINGERBREAD_BLOCK, "Beveled Frosted Gingerbread Block");
        builder.add(WKBlocks.CHISELED_GINGERBREAD_BLOCK, "Chiseled Gingerbread Block");
        builder.add(WKBlocks.RAW_GINGERBREAD_TILED_BLOCK, "Tiled Raw Gingerbread Block");
        builder.add(WKBlocks.GINGERBREAD_TILED_BLOCK, "Tiled Gingerbread Block");
        builder.add(WKBlocks.FROSTED_GINGERBREAD_TILED_BLOCK, "Frosted Tiled Gingerbread Block");

        builder.add(WKBlocks.FROSTED_BEVELED_GINGERBREAD_BLOCK_YELLOW, "Frosted Yellow Beveled Gingerbread Block");
        builder.add(WKBlocks.FROSTED_BEVELED_GINGERBREAD_BLOCK_RED, "Frosted Red Beveled Gingerbread Block");
        builder.add(WKBlocks.FROSTED_BEVELED_GINGERBREAD_BLOCK_GREEN, "Frosted Green Beveled Gingerbread Block");
        builder.add(WKBlocks.FROSTED_BEVELED_GINGERBREAD_BLOCK_PURPLE, "Frosted Purple Beveled Gingerbread Block");
        builder.add(WKBlocks.FROSTED_TILED_GINGERBREAD_BLOCK_YELLOW, "Frosted Yellow Tiled Gingerbread Block");
        builder.add(WKBlocks.FROSTED_TILED_GINGERBREAD_BLOCK_RED, "Frosted Red Tiled Gingerbread Block");
        builder.add(WKBlocks.FROSTED_TILED_GINGERBREAD_BLOCK_GREEN, "Frosted Green Tiled Gingerbread Block");
        builder.add(WKBlocks.FROSTED_TILED_GINGERBREAD_BLOCK_PURPLE, "Frosted Purple Tiled Gingerbread Block");
        builder.add(WKBlocks.FROSTED_TILED_GINGERBREAD_BLOCK_VARIANT, "Frosted Tiled Gingerbread Block Variant");
        builder.add(WKBlocks.RAW_GINGERBREAD_BLOCK_SLAB, "Raw Gingerbread Slab");

        builder.add(WKBlocks.RAW_CHISELED_GINGERBREAD_BLOCK_SLAB, "Chiseled Raw Gingerbread Slab");
        builder.add(WKBlocks.RAW_GINGERBREAD_BEVELED_BLOCK_SLAB, "Beveled Raw Gingerbread Slab");
        builder.add(WKBlocks.GINGERBREAD_BEVELED_BLOCK_SLAB, "Beveled Gingerbread Slab");
        builder.add(WKBlocks.GINGERBREAD_BLOCK_SLAB, "Gingerbread Slab");
        builder.add(WKBlocks.FROSTING_BLOCK_SLAB, "Frosting Slab");
        builder.add(WKBlocks.FROSTED_GINGERBREAD_BLOCK_SLAB, "Frosted Gingerbread Slab");
        builder.add(WKBlocks.FROSTED_BEVELED_GINGERBREAD_BLOCK_SLAB, "Frosted Beveled Gingerbread Slab");
        builder.add(WKBlocks.CHISELED_GINGERBREAD_BLOCK_SLAB, "Chiseled Gingerbread Slab");
        builder.add(WKBlocks.RAW_GINGERBREAD_TILED_BLOCK_SLAB, "Tiled Raw Gingerbread Slab");
        builder.add(WKBlocks.GINGERBREAD_TILED_BLOCK_SLAB, "Tiled Gingerbread Slab");

        builder.add(WKBlocks.FROSTED_BEVELED_GINGERBREAD_BLOCK_YELLOW_SLAB, "Frosted Yellow Beveled Gingerbread Slab");
        builder.add(WKBlocks.FROSTED_BEVELED_GINGERBREAD_BLOCK_RED_SLAB, "Frosted Red Beveled Gingerbread Slab");
        builder.add(WKBlocks.FROSTED_BEVELED_GINGERBREAD_BLOCK_GREEN_SLAB, "Frosted Green Beveled Gingerbread Slab");
        builder.add(WKBlocks.FROSTED_BEVELED_GINGERBREAD_BLOCK_PURPLE_SLAB, "Frosted Purple Beveled Gingerbread Slab");
        builder.add(WKBlocks.FROSTED_TILED_GINGERBREAD_BLOCK_YELLOW_SLAB, "Frosted Yellow Tiled Gingerbread Slab");
        builder.add(WKBlocks.FROSTED_TILED_GINGERBREAD_BLOCK_RED_SLAB, "Frosted Red Tiled Gingerbread Slab");
        builder.add(WKBlocks.FROSTED_TILED_GINGERBREAD_BLOCK_PURPLE_SLAB, "Frosted Purple Tiled Gingerbread Slab");
        builder.add(WKBlocks.FROSTED_TILED_GINGERBREAD_BLOCK_GREEN_SLAB, "Frosted Green Tiled Gingerbread Slab");
        builder.add(WKBlocks.FROSTED_TILED_GINGERBREAD_BLOCK_VARIANT_SLAB, "Frosted Tiled Gingerbread Variant Slab");
        builder.add(WKBlocks.SALT_BLOCK, "Salt");

        builder.add(WKBlocks.BLACKTHORN_LOG, "Blackthorn Log");
        builder.add(WKBlocks.BLACKTHORN_SAPLING, "Blackthorn Sapling");
        builder.add(WKBlocks.ELDER_SAPLING, "Elder Sapling");
        builder.add(WKBlocks.HAWTHORN_SAPLING, "Hawthorn Sapling");
        builder.add(WKBlocks.JUNIPER_SAPLING, "Juniper Sapling");
        builder.add(WKBlocks.ROWAN_SAPLING, "Rowan Sapling");
        builder.add(WKBlocks.SUMAC_SAPLING, "Sumac Sapling");
        builder.add(WKBlocks.POTTED_BLACKTHORN_SAPLING, "Potted Blackthorn Sapling");
        builder.add(WKBlocks.POTTED_ELDER_SAPLING, "Potted Elder Sapling");
        builder.add(WKBlocks.POTTED_HAWTHORN_SAPLING, "Potted Hawthorn Sapling");
        builder.add(WKBlocks.POTTED_JUNIPER_SAPLING, "Potted Juniper Sapling");

        builder.add(WKBlocks.POTTED_ROWAN_SAPLING, "Potted Rowan Sapling");
        builder.add(WKBlocks.POTTED_SUMAC_SAPLING, "Potted Sumac Sapling");
        builder.add(WKBlocks.BLACKTHORN_PLANKS, "Blackthorn Planks");
        builder.add(WKBlocks.ELDER_LOG, "Elder Log");
        builder.add(WKBlocks.ELDER_PLANKS, "Elder Planks");
        builder.add(WKBlocks.BLACKTHORN_STAIRS, "Blackthorn Stairs");
        builder.add(WKBlocks.ELDER_STAIRS, "Elder Stairs");
        builder.add(WKBlocks.BLACKTHORN_SLAB, "Blackthorn Slab");
        builder.add(WKBlocks.ELDER_SLAB, "Elder Slab");
        builder.add(WKBlocks.BLACKTHORN_LEAVES, "Blackthorn Leaves");
        builder.add(WKBlocks.ELDER_LEAVES, "Elder Leaves");

        builder.add(WKBlocks.ELDER_LEAVES_COLORED, "Elder Leaves Colored");
        builder.add(WKBlocks.HAWTHORN_LOG, "Hawthorn Log");
        builder.add(WKBlocks.JUNIPER_LOG, "Juniper Log");
        builder.add(WKBlocks.HAWTHORN_PLANKS, "Hawthorn Planks");
        builder.add(WKBlocks.JUNIPER_PLANKS, "Juniper Planks");
        builder.add(WKBlocks.HAWTHORN_STAIRS, "Hawthorn Stairs");
        builder.add(WKBlocks.JUNIPER_STAIRS, "Juniper Stairs");
        builder.add(WKBlocks.HAWTHORN_SLAB, "Hawthorn Slab");
        builder.add(WKBlocks.JUNIPER_SLAB, "Juniper Slab");
        builder.add(WKBlocks.HAWTHORN_LEAVES, "Hawthorn Leaves");
        builder.add(WKBlocks.HAWTHORN_LEAVES_COLORED, "Hawthorn Leaves Colored");

        builder.add(WKBlocks.JUNIPER_LEAVES, "Juniper Leaves");
        builder.add(WKBlocks.ROWAN_LOG, "Rowan Log");
        builder.add(WKBlocks.SUMAC_LOG, "Sumac Log");
        builder.add(WKBlocks.ROWAN_PLANKS, "Rowan Planks");
        builder.add(WKBlocks.SUMAC_PLANKS, "Sumac Planks");
        builder.add(WKBlocks.ROWAN_STAIRS, "Rowan Stairs");
        builder.add(WKBlocks.SUMAC_STAIRS, "Sumac Stairs");
        builder.add(WKBlocks.ROWAN_SLAB, "Rowan Slab");
        builder.add(WKBlocks.SUMAC_SLAB, "Sumac Slab");
        builder.add(WKBlocks.ROWAN_LEAVES, "Rowan Leaves");
        builder.add(WKBlocks.SUMAC_LEAVES, "Sumac Leaves");

        builder.add(WKBlocks.BLACKTHORN_WOOD, "Blackthorn Wood");
        builder.add(WKBlocks.ELDER_WOOD, "Elder Wood");
        builder.add(WKBlocks.HAWTHORN_WOOD, "Hawthorn Wood");
        builder.add(WKBlocks.JUNIPER_WOOD, "Juniper Wood");
        builder.add(WKBlocks.ROWAN_WOOD, "Rowan Wood");
        builder.add(WKBlocks.SUMAC_WOOD, "Sumac Wood");
        builder.add(WKBlocks.STRIPPED_BLACKTHORN_LOG, "Stripped Blackthorn Log");
        builder.add(WKBlocks.STRIPPED_ELDER_LOG, "Stripped Elder Log");
        builder.add(WKBlocks.STRIPPED_HAWTHORN_LOG, "Stripped Hawthorn Log");
        builder.add(WKBlocks.STRIPPED_JUNIPER_LOG, "Stripped Juniper Log");
        builder.add(WKBlocks.STRIPPED_ROWAN_LOG, "Stripped Rowan Log");

        builder.add(WKBlocks.STRIPPED_SUMAC_LOG, "Stripped Sumac Log");
        builder.add(WKBlocks.STRIPPED_BLACKTHORN_WOOD, "Stripped Blackthorn Wood");
        builder.add(WKBlocks.STRIPPED_ELDER_WOOD, "Stripped Elder Wood");
        builder.add(WKBlocks.STRIPPED_HAWTHORN_WOOD, "Stripped Hawthorn Wood");
        builder.add(WKBlocks.STRIPPED_JUNIPER_WOOD, "Stripped Juniper Wood");
        builder.add(WKBlocks.STRIPPED_ROWAN_WOOD, "Stripped Rowan Wood");
        builder.add(WKBlocks.STRIPPED_SUMAC_WOOD, "Stripped Sumac Wood");
        builder.add(WKBlocks.IRON_WITCHES_OVEN, "Iron Witches' Oven");
        builder.add(WKBlocks.COPPER_WITCHES_OVEN, "Copper Witches' Oven");
        builder.add(WKBlocks.EXPOSED_COPPER_WITCHES_OVEN, "Exposed Copper Witches' Oven");

        builder.add(WKBlocks.WEATHERED_COPPER_WITCHES_OVEN, "Weathered Copper Witches' Oven");
        builder.add(WKBlocks.OXIDIZED_COPPER_WITCHES_OVEN, "Oxidized Copper Witches' Oven");
        builder.add(WKBlocks.WAXED_COPPER_WITCHES_OVEN, "Waxed Copper Witches' Oven");
        builder.add(WKBlocks.WAXED_EXPOSED_COPPER_WITCHES_OVEN, "Waxed Exposed Copper Witches' Oven");
        builder.add(WKBlocks.WAXED_WEATHERED_COPPER_WITCHES_OVEN, "Waxed Weathered Copper Witches' Oven");
        builder.add(WKBlocks.WAXED_OXIDIZED_COPPER_WITCHES_OVEN, "Waxed Oxidized Copper Witches' Oven");
        builder.add(WKBlocks.IRON_WITCHES_CAULDRON, "Iron Witches' Cauldron");
        builder.add(WKBlocks.OAK_BREWING_BARREL, "Oak Brewing Barrel");
        builder.add(WKBlocks.SPRUCE_BREWING_BARREL, "Spruce Brewing Barrel");
        builder.add(WKBlocks.BIRCH_BREWING_BARREL, "Birch Brewing Barrel");

        builder.add(WKBlocks.JUNGLE_BREWING_BARREL, "Jungle Brewing Barrel");
        builder.add(WKBlocks.ACACIA_BREWING_BARREL, "Acacia Brewing Barrel");
        builder.add(WKBlocks.DARK_OAK_BREWING_BARREL, "Dark Oak Brewing Barrel");
        builder.add(WKBlocks.CRIMSON_BREWING_BARREL, "Crimson Brewing Barrel");
        builder.add(WKBlocks.WARPED_BREWING_BARREL, "Warped Brewing Barrel");
        builder.add(WKBlocks.BELLADONNA, "Belladonna");
        builder.add(WKBlocks.BELLADONNA_GLOW, "Belladonna Glow");
        builder.add(WKBlocks.BELLADONNA_NOCTURNAL, "Belladonna Nocturnal");

        //ENTITY TYPES
        builder.add(WKEntityTypes.CUSITH, "Cu-Sith");
        builder.add(WKEntityTypes.FERRET, "Ferret");

        //ITEMS
        builder.add(WKItems.BELLADONNA_BLOSSOM, "Belladonna Blossom");
        builder.add(WKItems.AMARANTH_SPRIG, "Amaranth Spring");
        builder.add(WKItems.MINT_SPRIG, "Mint Spring");
        builder.add(WKItems.WORMWOOD_SPRIG, "Wormwood Spring");
        builder.add(WKItems.ROWAN_BERRIES, "Rowan Berries");
        builder.add(WKItems.SLOE_BERRIES, "Sloe Blossom");
        builder.add(WKItems.JUNIPER_BERRIES, "Juniper Berries");
        builder.add(WKItems.BLACKBERRY, "Blackberry");
        builder.add(WKItems.HAWTHORN_BERRIES, "Hawthorn Berries");
        builder.add(WKItems.SUMAC_BERRIES, "Sumac Berries");
        builder.add(WKItems.BRIAR_HIPS, "Briar Hips");
        builder.add(WKItems.ELDER_BLOSSOM, "Elder Blossom");
        builder.add(WKItems.CONEFLOWER_BLOSSOM, "Coneflower Blossom");
        builder.add(WKItems.ST_JOHNS_WORT_BLOSSOM, "St Johns Wort Blossom");
        builder.add(WKItems.IRIS_BLOSSOM, "Iris Blossom");
        builder.add(WKItems.CHAMOMILE_BLOSSOM, "Chamomile Blossom");
        builder.add(WKItems.GINGER_RHIZOME, "Ginger Rhizome");
        builder.add(WKItems.TEA_LEAF, "Tea Leaf");
        builder.add(WKItems.HELLEBORE_BLOSSOM, "Hellebore Blossom");
        builder.add(WKItems.FOXGLOVE_BLOSSOM, "Foxglove Blossom");
        //builder.add(WKItems.AMARANTH_COOKIES, "Amaranth Cookies");
        builder.add(WKItems.HEART_OF_INNOCENCE, "Heart of Innocence");


        builder.add(WKItems.DOLLOP_OF_FROSTING, "Dollop of Frosting");
        builder.add(WKItems.CU_SITH_SPAWN_EGG, "Cu-Sith Spawn Egg");
        builder.add(WKItems.FERRET_SPAWN_EGG, "Ferret Spawn Egg");
        builder.add(WKItems.CHOCOLATE_RUM_BALLS, "Chocolate Rum Balls");
        builder.add(WKItems.SUPER_BOOZE, "Super Booze");

        //SEEDS
        builder.add(WKItems.BELLADONNA_SEEDS, "Belladonna Seeds");
        builder.add(WKItems.AMARANTH_SEEDS, "Amaranth Seeds");
        builder.add(WKItems.ST_JOHNS_WORT_SEEDS, "St Johns Wort Seeds");
        builder.add(WKItems.BRIAR_SEEDS, "Briar Seeds");
        builder.add(WKItems.CAMELLIA_SEEDS, "Camellia Seeds");
        builder.add(WKItems.CHAMOMILE_SEEDS, "Chamomile Seeds");
        builder.add(WKItems.CONEFLOWER_SEEDS, "Coneflower Seeds");
        builder.add(WKItems.FOXGLOVE_SEEDS, "Foxglove Seeds");
        builder.add(WKItems.HELLEBORE_SEEDS, "Hellebore Seeds");
        builder.add(WKItems.IRIS_SEEDS, "Iris Seeds");
        builder.add(WKItems.SANGUINARY_SEEDS, "Sanguinary Seeds");
        builder.add(WKItems.WORMWOOD_SEEDS, "Wormwood Seeds");

        //POTIONS
        builder.add( "item.minecraft.potion.effect.rum", "Rum Potion");
        builder.add("item.minecraft.splash_potion.effect.rum", "Rum Splash Potion");
        builder.add("item.minecraft.lingering_potion.effect.rum", "Rum Lingering Potion");

        //STATUS EFFECTS
        builder.add(WKStatusEffects.DRUNK, "Drunk");

        //DEATH MESSAGE
        builder.add("death.attack.on_oven", "%s cooked themselves to a crisp... they do not taste great");
        builder.add("death.attack.hugging_blackthorn", "%s forgot to use protection while hugging a tree");
        builder.add("death.attack.punching_blackthorn", "%s lost a fight with a blackthorn");

        //SCREEN
        builder.add("screen.title.witcheskitchen.witches_oven", "Witches' Oven");
        builder.add("screen.title.witcheskitchen.brewing_barrel", "Brewing Barrel");

        //REI
        builder.add("rei.witcheskitchen.oven_cooking", "Witches' Oven Cooking");
        builder.add("rei.witcheskitchen.fermenting", "Fermenting");
    }
}
