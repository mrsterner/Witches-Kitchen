package cf.witcheskitchen.common.registry;

import cf.witcheskitchen.WitchesKitchen;
import cf.witcheskitchen.api.registry.ObjectDefinition;
import cf.witcheskitchen.common.statuseffect.*;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.commons.lang3.Validate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface WKStatusEffects {
    List<ObjectDefinition<StatusEffect>> STATUS_EFFECTS = new ArrayList<>();

    StatusEffect HORROR = create("horror", new HorrorStatusEffect(StatusEffectType.HARMFUL, 0x555D50));
    StatusEffect HELLFIRE = create("hellfire", new HellfireStatusEffect(StatusEffectType.HARMFUL, 0xA91101));
    StatusEffect FROST_SHIELD = create("frost_shield", new FrostShieldStatusEffect(StatusEffectType.BENEFICIAL, 0xAFDBF5));
    StatusEffect FROSTBITE = create("frostbite", new FrostbiteStatusEffect(StatusEffectType.HARMFUL, 0xAFDBF5));
    StatusEffect DRUNK = create("drunk", new DrunkStatusEffect(StatusEffectType.NEUTRAL, 0x7B3F00));
    StatusEffect FIRE_SHIELD = create("fire_shield", new FireShieldStatusEffect(StatusEffectType.BENEFICIAL, 0xAF28500));
    StatusEffect DISROBING = create("disrobing", new DisrobingStatusEffect(StatusEffectType.HARMFUL, 0xFDF5E6));
    StatusEffect COOLDOWN = create("cooldown", new CooldownStatusEffect(StatusEffectType.NEUTRAL, 0x1F75FE));
    StatusEffect GROWTH = create("growth", new GrowthStatusEffect(StatusEffectType.BENEFICIAL, 0x4F7942));
    StatusEffect LOVE = create("love", new LoveStatusEffect(StatusEffectType.BENEFICIAL, 0xFFB7C5));
    StatusEffect PARALYSIS = create("paralysis", new ParalysisStatusEffect(StatusEffectType.HARMFUL, 0xFADA5E));
    StatusEffect PHASING = create("phasing", new PhasingStatusEffect(StatusEffectType.NEUTRAL, 0x7851A9));
    StatusEffect SHADOWS = create("shadows", new PhasingStatusEffect(StatusEffectType.BENEFICIAL, 0x86608E));
    StatusEffect CORROSION = create("corrosion", new CorrosionStatusEffect(StatusEffectType.HARMFUL, 0x3FFF00)).addAttributeModifier(EntityAttributes.GENERIC_ARMOR, "e8506ffe-e2b4-4f19-8669-becb8e3eb666", -4D, EntityAttributeModifier.Operation.ADDITION).addAttributeModifier(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, "1845f14c-5411-4380-8be7-85e81317523a", -2D, EntityAttributeModifier.Operation.ADDITION);
    StatusEffect REINFORCEMENT = create("reinforcement", new ReinforcementStatusEffect(StatusEffectType.BENEFICIAL, 0x4000FF)).addAttributeModifier(EntityAttributes.GENERIC_ARMOR, "52823351-ea91-4db3-958d-1b1ce3804dd6", 4D, EntityAttributeModifier.Operation.ADDITION).addAttributeModifier(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, "ec255b60-8b01-450b-8538-17a8a28e4aaf", 2D, EntityAttributeModifier.Operation.ADDITION);
    StatusEffect FELIFORM = create("feliform", new FeliformStatusEffect(StatusEffectType.BENEFICIAL, 0x228B22));

    static List<ObjectDefinition<StatusEffect>> getStatusEffects() {
        return Collections.unmodifiableList(STATUS_EFFECTS);
    }

    static <T extends StatusEffect> T create(String name, T effect) {
        Validate.isTrue(effect != null);
        final Identifier id = WitchesKitchen.id(name);
        final ObjectDefinition<StatusEffect> def = new ObjectDefinition<>(id, effect);
        STATUS_EFFECTS.add(def);
        return effect;
    }

    static void init() {
        STATUS_EFFECTS.forEach(entry -> Registry.register(Registry.STATUS_EFFECT, entry.id(), entry.object()));
    }
}
