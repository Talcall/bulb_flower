package net.t4lcall.bulb_flower.world.gen;

import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.root.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.t4lcall.bulb_flower.world.tree.ModRootPlacerTypes;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;

public class BulbRootPlacer
        extends RootPlacer {
    public static final Codec<BulbRootPlacer> CODEC = RecordCodecBuilder.create((instance) -> {
        return method_43182(instance).and(BulbRootPlacement.CODEC.fieldOf("bulb_root_placement").forGetter((rootPlacer) -> {
            return rootPlacer.bulbRootPlacement;
        })).apply(instance, BulbRootPlacer::new);
    });
    private final BulbRootPlacement bulbRootPlacement;
    public BulbRootPlacer(IntProvider trunkOffsetY, BlockStateProvider rootProvider, Optional<AboveRootPlacement> aboveRootPlacement, BulbRootPlacement bulbRootPlacement) {
        super(trunkOffsetY, rootProvider, aboveRootPlacement);
        this.bulbRootPlacement = bulbRootPlacement;
    }

    @Override
    protected RootPlacerType<?> getType() {
        return ModRootPlacerTypes.BULB_ROOT_PLACER;
    }

    @Override
    public boolean generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, BlockPos pos, BlockPos trunkPos, TreeFeatureConfig config) {
        ArrayList<BlockPos> list = Lists.newArrayList();
        BlockPos.Mutable mutable = pos.mutableCopy();
        while (mutable.getY() < trunkPos.getY()) {
            if (!this.canGrowThrough(world, mutable)) {
                return false;
            }
            mutable.move(Direction.UP);
        }
        list.add(trunkPos.down());
        for (Direction direction : Direction.Type.HORIZONTAL) {
            ArrayList<BlockPos> list2;
            BlockPos blockPos = trunkPos.offset(direction);
            if (!this.canGrow(world, random, blockPos, direction, trunkPos, list2 = Lists.newArrayList(), 0)) {
                continue;
            }
            list.addAll(list2);
            list.add(trunkPos.offset(direction));
        }
        for (BlockPos blockPos2 : list) {
            this.placeRoots(world, replacer, random, blockPos2, config);
        }
        return true;
    }
    private boolean canGrow(TestableWorld world, Random random, BlockPos pos, Direction direction, BlockPos origin, List<BlockPos> offshootPositions, int rootLength) {
        int i = this.bulbRootPlacement.maxBulbRootLength();
        if (rootLength == i || offshootPositions.size() > i) {
            return true;
        }
        List<BlockPos> list = this.getOffshootPositions(pos, direction, random, origin);
        for (BlockPos blockPos : list) {
            offshootPositions.add(blockPos);
            if (this.canGrow(world, random, blockPos, direction, origin, offshootPositions, rootLength + 1)) continue;
            continue;
        }
        return true;
    }
    protected List<BlockPos> getOffshootPositions(BlockPos pos, Direction direction, Random random, BlockPos origin) {
        BlockPos blockPos = pos.down();
        BlockPos blockPos2 = pos.offset(direction);
        int i = pos.getManhattanDistance(origin);
        int j = this.bulbRootPlacement.maxBulbRootWidth();
        float f = this.bulbRootPlacement.bulbRandomSkewChance();
        if (i > j - 3 && i <= j) {
            return random.nextFloat() < f ? List.of(blockPos, blockPos2.down()) : List.of(blockPos);
        }
        if (i > j) {
            return List.of(blockPos);
        }
        if (random.nextFloat() < f) {
            return List.of(blockPos);
        }
        return random.nextBoolean() ? List.of(blockPos2) : List.of(blockPos);
    }
    @Override
    protected boolean canGrowThrough(TestableWorld world, BlockPos pos) {
        return super.canGrowThrough(world, pos) ||
                world.testBlockState(pos, state -> state.isIn(this.bulbRootPlacement.bulbCanGrowThrough()));
    }

    @Override
    protected void placeRoots(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, BlockPos pos, TreeFeatureConfig config) {
        if (world.testBlockState(pos, state -> state.isIn(this.bulbRootPlacement.endStoneRootsIn()))) {
            BlockState blockState = this.bulbRootPlacement.endStoneRootsProvider().get(random, pos);
            replacer.accept(pos, this.applyWaterlogging(world, pos, blockState));
        } else {
            super.placeRoots(world, replacer, random, pos, config);
        }
    }
}
