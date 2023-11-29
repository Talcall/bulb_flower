package net.t4lcall.bulb_flower.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class BulbSaplingBlock extends SaplingBlock {
    public BulbSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.END_STONE) || floor.isOf((ModBlocks.ROOTED_END_STONE));
    }
}
