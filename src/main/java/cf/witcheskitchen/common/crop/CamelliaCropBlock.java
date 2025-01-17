package cf.witcheskitchen.common.crop;

import cf.witcheskitchen.api.crop.WKTallCropBlock;
import cf.witcheskitchen.common.registry.WKItems;
import cf.witcheskitchen.common.util.TypeHelper;
import cf.witcheskitchen.common.variants.CamelliaTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.random.RandomGenerator;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;
import org.quiltmc.loader.api.minecraft.ClientOnly;

import java.util.Optional;

public class CamelliaCropBlock extends WKTallCropBlock {
    public static final VoxelShape[] LOWER_AGE_TO_SHAPE;
    public static final VoxelShape[] UPPER_AGE_TO_SHAPE;
    public static final int MAX_AGE = 7;
    private final CamelliaTypes type;

    public CamelliaCropBlock(Settings settings) {
        this(settings, CamelliaTypes.COMMON);
    }

    public CamelliaCropBlock(Settings settings, CamelliaTypes type) {
        super(settings);
        this.type = type;
        this.setDefaultState(this.getDefaultState().with(getAgeProperty(), 0).with(HALF, DoubleBlockHalf.LOWER));
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        Optional<CamelliaTypes> nextType = type.next(type);
        if(nextType.isPresent()){
            NbtCompound nbtCompound = new NbtCompound();
            TypeHelper.toNbt(nbtCompound, nextType.get().getName(), nextType.get().getType(), nextType.get().getColor());
            getNextSeed(world, pos, nbtCompound);
        }
        super.onBreak(world, pos, state, player);
    }

    @Override
    public void applyGrowth(World world, BlockPos pos, BlockState state) {
        int maxAge;
        int age = this.getAge(state) + this.getGrowthAmount(world);
        if (age > (maxAge = this.getMaxAge())) {
            age = maxAge;
        }
        world.setBlockState(pos, this.withHalf(age == 5 ? age + 1 : age, DoubleBlockHalf.LOWER), Block.NOTIFY_LISTENERS);
        if (age >= doubleBlockAge()) {
            world.setBlockState(pos.up(), this.withHalf(age == 5 ? age + 1 : age, DoubleBlockHalf.UPPER), Block.NOTIFY_LISTENERS);
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, RandomGenerator random) {
        final int age = this.getAge(state);
        boolean bl = age == 4;
        if (world.getBaseLightLevel(pos, 0) >= 9) {
            if (age < getMaxAge()) {
                if (random.nextInt((int) (25.0f / (CropBlock.getAvailableMoisture(this, world, pos))) + 1) == 0) {
                    final int nextAge = age + 1;
                    world.setBlockState(pos, withHalf(bl ? nextAge + 1 : nextAge, DoubleBlockHalf.LOWER), Block.NOTIFY_LISTENERS);
                    if (age >= doubleBlockAge()) {
                        world.setBlockState(pos.up(), withHalf(bl ? nextAge + 1 : nextAge, DoubleBlockHalf.UPPER), Block.NOTIFY_LISTENERS);
                    }
                }
            }
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(state.get(HALF) == DoubleBlockHalf.UPPER){
            pos = pos.down();
        }

        if(player.getMainHandStack().isEmpty() && state.get(getAgeProperty()) == MAX_AGE){
            world.setBlockState(pos, this.withHalf(this.getAge(state) - 2, DoubleBlockHalf.LOWER), Block.NOTIFY_LISTENERS);
            world.setBlockState(pos.up(), this.withHalf(this.getAge(state) - 2, DoubleBlockHalf.UPPER), Block.NOTIFY_LISTENERS);
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }

    @Override
    public VoxelShape[] getLowerShape() {
        return LOWER_AGE_TO_SHAPE;
    }

    @Override
    public VoxelShape[] getUpperShape() {
        return UPPER_AGE_TO_SHAPE;
    }


    @Override
    public IntProperty getAgeProperty() {
        return IntProperty.of("age", 0, MAX_AGE);
    }

    @ClientOnly
    @Override
    protected ItemConvertible getSeedsItem() {
        return  WKItems.CAMELLIA_SEEDS;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    public int doubleBlockAge() {
        return 2;
    }

    static {
        LOWER_AGE_TO_SHAPE = new VoxelShape[]{
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
        };

        UPPER_AGE_TO_SHAPE = new VoxelShape[]{
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
                Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
        };
    }
}
