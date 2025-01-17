package cf.witcheskitchen.client;

import cf.witcheskitchen.client.gui.screen.BrewingBarrelScreen;
import cf.witcheskitchen.client.gui.screen.WitchesOvenScreen;
import cf.witcheskitchen.client.particle.BubbleParticle;
import cf.witcheskitchen.client.particle.MagicSparkleParticle;
import cf.witcheskitchen.client.particle.WKSplashParticle;
import cf.witcheskitchen.client.registry.RenderRegistry;
import cf.witcheskitchen.client.render.blockentity.BrewingBarrelBlockEntityRender;
import cf.witcheskitchen.client.render.blockentity.WitchesCauldronBlockEntityRender;
import cf.witcheskitchen.client.render.blockentity.WitchesOvenBlockEntityRender;
import cf.witcheskitchen.common.registry.*;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.minecraft.ClientOnly;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

@ClientOnly
public class WitchesKitchenClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(ModContainer mod) {
        WKPacketTypes.init(EnvType.CLIENT);
        ParticleFactoryRegistry.getInstance().register(WKParticleTypes.BUBBLE, BubbleParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(WKParticleTypes.SPLASH, WKSplashParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(WKParticleTypes.MAGIC_SPARKLE, MagicSparkleParticle.Factory::new);
        WKEventsRegistry.initClient();
        BlockEntityRendererFactories.register(WKBlockEntityTypes.WITCHES_OVEN, (ctx) -> new WitchesOvenBlockEntityRender());
        BlockEntityRendererFactories.register(WKBlockEntityTypes.WITCHES_CAULDRON, (ctx) -> new WitchesCauldronBlockEntityRender());
        BlockEntityRendererFactories.register(WKBlockEntityTypes.BREWING_BARREL, (ctx) -> new BrewingBarrelBlockEntityRender());
        HandledScreens.register(WKScreenHandlerTypes.WITCHES_OVEN, WitchesOvenScreen::new);
        HandledScreens.register(WKScreenHandlerTypes.BREWING_BARREL, BrewingBarrelScreen::new);
        WKBlocks.getBlocks().forEach(entry -> BlockRenderLayerMap.put(RenderLayer.getCutout(), entry.object()));//TODO eyo what is this, bad code, fix this
        registerColorProvider();
        RenderRegistry.register();
    }

    //allows for color map modification of leaves based on biome
    public void registerColorProvider() {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) ->
                world != null && pos != null
                        ? BiomeColors.getFoliageColor(world, pos)
                        : FoliageColors.getDefaultColor(), WKBlocks.LEAF_BLOCKS.toArray(new Block[]{}));
    }
}
