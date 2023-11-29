package net.t4lcall.bulb_flower.world.tree;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.BlockStateProviderType;

public class BigFlowerBlockStateProvider extends BlockStateProvider {
    @Override
    protected BlockStateProviderType<?> getType() {
        return null;
    }

    @Override
    public BlockState get(Random random, BlockPos pos) {
        return null;
    }
}
