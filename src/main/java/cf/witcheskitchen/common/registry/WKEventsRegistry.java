package cf.witcheskitchen.common.registry;

import cf.witcheskitchen.WK;
import cf.witcheskitchen.WKConfig;
import cf.witcheskitchen.common.WKEventsHandler;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;

public class WKEventsRegistry {

    public static void register() {
        LootTableLoadingCallback.EVENT.register(new WKEventsHandler.LootTablesListener());
    }

    // used for client events
    public static void registerClient() {
        if (WKConfig.get().debugMode) {
            WK.logger.info("Witches Kitchen Base Client Registry: Successfully Loaded");
        }
    }

}
