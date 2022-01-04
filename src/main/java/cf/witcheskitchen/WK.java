package cf.witcheskitchen;

import cf.witcheskitchen.common.registry.*;
import cf.witcheskitchen.config.ConfigurableSeed;
import cf.witcheskitchen.mixin.AxeAccess;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

import org.apache.logging.log4j.LogManager; //lol 
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

public class WK implements ModInitializer {
    
    public static ArrayList<Block> modBlocks = new ArrayList<>();
    public static ArrayList<Block> leafBlocks = new ArrayList<>();
    public static List<ConfigurableSeed> seeds = new ArrayList<>();
    
    public static final String MODID = "witcheskitchen";
    public static final Logger logger = LogManager.getLogger(MODID);
    public static final ItemGroup WK_GROUP = FabricItemGroupBuilder.create(
                    new Identifier("witcheskitchen", "general"))
            .icon(() -> new ItemStack(Items.POTION))
            .build();

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        /* 
        logger.info("Remember when I told you how my");
        logger.info("Kin is different in some ways?");

        logger.info("It's a fact, she is exactly that!");
        logger.info("A harbinger of death from the world of witchcraft,");
        logger.info("And she's feeding them cakes and her ale to this innocent boy,");
        logger.info("And her magic brings dismay!");

        logger.info("I hear her in the wind, the bane of our town");
        logger.info("Come with me, father, I'm to expose a heathen");
        */ //removing this until we create a game mechanic for it
        WKBlocks.register();
        WKItems.register();
        WKBlockEntityTypes.register();
        WKGenerator.register();
        WKStatusEffects.register();
        WKSounds.register();
        GeckoLib.initialize();
        WKEntities.register();
        
        modifyAxeBlockStripping();
    }
    
     private void modifyAxeBlockStripping() {
        Map<Block, Block> immutableBlocks = AxeAccess.getStrippedBlocks();
        AxeAccess.setStrippedBlocks(new ImmutableMap.Builder<Block, Block>()
                .putAll(immutableBlocks)
                .put(WKBlocks.BLACKTHORN_LOG, WKBlocks.STRIPPED_BLACKTHORN_LOG)
                .put(WKBlocks.BLACKTHORN_WOOD, WKBlocks.STRIPPED_BLACKTHORN_WOOD)
                .put(WKBlocks.ELDER_LOG, WKBlocks.STRIPPED_ELDER_LOG)
                .put(WKBlocks.ELDER_WOOD, WKBlocks.STRIPPED_ELDER_WOOD)
                .put(WKBlocks.HAWTHORN_LOG, WKBlocks.STRIPPED_HAWTHORN_LOG)
                .put(WKBlocks.HAWTHORN_WOOD, WKBlocks.STRIPPED_HAWTHORN_WOOD)
                .put(WKBlocks.JUNIPER_LOG, WKBlocks.STRIPPED_JUNIPER_LOG)
                .put(WKBlocks.JUNIPER_WOOD, WKBlocks.STRIPPED_JUNIPER_WOOD)
                .put(WKBlocks.ROWAN_LOG, WKBlocks.STRIPPED_ROWAN_LOG)
                .put(WKBlocks.ROWAN_WOOD, WKBlocks.STRIPPED_ROWAN_WOOD)
                .put(WKBlocks.SUMAC_LOG, WKBlocks.STRIPPED_SUMAC_LOG)
                .put(WKBlocks.SUMAC_WOOD, WKBlocks.STRIPPED_SUMAC_WOOD)
                .build());
    }
}
