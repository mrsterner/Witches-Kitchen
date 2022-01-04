package cf.witcheskitchen.common.registry;

import cf.witcheskitchen.WK;
import cf.witcheskitchen.common.recipe.WitchesOvenCookingRecipe;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class WKRecipeTypes {

    private static final Map<RecipeSerializer<?>, Identifier> RECIPE_SERIALIZERS = new HashMap<>();
    private static final Map<RecipeType<?>, Identifier> RECIPE_TYPES = new HashMap<>();

    public static final RecipeSerializer<WitchesOvenCookingRecipe> WITCHES_OVEN_COOKING_RECIPE_SERIALIZER = register("witches_oven_cooking", new WitchesOvenCookingRecipe.Serializer());
    public static final RecipeType<WitchesOvenCookingRecipe> WITCHES_OVEN_COOKING_RECIPE_TYPE = register("witches_oven_cooking");

    private static <T extends Recipe<?>> RecipeSerializer<T> register(String name, RecipeSerializer<T> serializer) {
        RECIPE_SERIALIZERS.put(serializer, new Identifier(WK.MODID, name));
        return serializer;
    }

    private static <T extends Recipe<?>> RecipeType<T> register(String name) {
        RecipeType<T> type = new RecipeType<>() {
            @Override
            public String toString() {
                return name;
            }
        };
        RECIPE_TYPES.put(type, new Identifier(WK.MODID, name));
        return type;
    }

    public static void register() {
        RECIPE_SERIALIZERS.keySet().forEach(recipeSerializer -> Registry.register(Registry.RECIPE_SERIALIZER, RECIPE_SERIALIZERS.get(recipeSerializer), recipeSerializer));
        RECIPE_TYPES.keySet().forEach(recipeType -> Registry.register(Registry.RECIPE_TYPE, RECIPE_TYPES.get(recipeType), recipeType));
    }
}