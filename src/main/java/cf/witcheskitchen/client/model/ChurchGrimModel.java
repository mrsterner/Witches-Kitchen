package cf.witcheskitchen.client.model;

import cf.witcheskitchen.WitchesKitchen;
import cf.witcheskitchen.common.entity.neutral.ChurchGrimEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ChurchGrimModel extends AnimatedGeoModel<ChurchGrimEntity> {

    @Override
    public Identifier getModelResource(ChurchGrimEntity object) {
        return new Identifier(WitchesKitchen.MODID, "geo/churchgrim.geo.json");
    }

    @Override
    public Identifier getTextureResource(ChurchGrimEntity object) {
        //Todo: See how well name variants are supported, then apply one of the short-haired white ones if one is named Max
        return new Identifier(WitchesKitchen.MODID, "textures/entity/grim_" + object.getVariant() + ".png");
    }

    @Override
    public Identifier getAnimationResource(ChurchGrimEntity animatable) {
        return new Identifier(WitchesKitchen.MODID, "animations/churchgrim.json");
    }
}
