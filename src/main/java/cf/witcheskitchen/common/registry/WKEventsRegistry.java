package cf.witcheskitchen.common.registry;

import cf.witcheskitchen.api.event.network.MagicSparkleParticleEvent;
import cf.witcheskitchen.client.render.blockentity.WitchesCauldronBlockEntityRender;
import cf.witcheskitchen.common.WKEventsHandler;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;

public interface WKEventsRegistry {

    static void init(EnvType type) {
        switch (type) {
            case SERVER -> {
                LootTableEvents.MODIFY.register(new WKEventsHandler.LootTablesListener());
            }
            case CLIENT -> {
                MagicSparkleParticleEvent.PARTICLE_CONSTRUCTOR_EVENT.register(new WitchesCauldronBlockEntityRender.MagicalParticleEventHandler());
            }
        }
    }

    // used for client events
    static void initClient() {

    }
}
