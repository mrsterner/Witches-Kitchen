package cf.witcheskitchen.common.crop;

import cf.witcheskitchen.api.crop.WKCropBlock;
import cf.witcheskitchen.common.registry.WKItems;
import cf.witcheskitchen.common.util.TypeHelper;
import cf.witcheskitchen.common.variants.HelleboreTypes;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.quiltmc.loader.api.minecraft.ClientOnly;

import java.util.Optional;

public class HelleboreCropBlock extends WKCropBlock {
    public static final int MAX_AGE = 6;
    private final HelleboreTypes type;

    public HelleboreCropBlock(Settings settings) {
        this(settings, HelleboreTypes.COMMON);
    }

    public HelleboreCropBlock(Settings settings, HelleboreTypes rarity) {
        super(settings);
        this.type = rarity;
        this.setDefaultState(this.getDefaultState().with(getAgeProperty(), 0));
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        Optional<HelleboreTypes> nextType = type.next(type);
        if(nextType.isPresent()){
            NbtCompound nbtCompound = new NbtCompound();
            TypeHelper.toNbt(nbtCompound, nextType.get().getName(), nextType.get().getType(), nextType.get().getColor());
            getNextSeed(world, pos, nbtCompound);
        }
        super.onBreak(world, pos, state, player);
    }

    @Override
    public IntProperty getAgeProperty() {
        return IntProperty.of("age", 0, MAX_AGE);
    }

    @ClientOnly
    @Override
    protected ItemConvertible getSeedsItem() {
        return  WKItems.HELLEBORE_SEEDS;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }
}
