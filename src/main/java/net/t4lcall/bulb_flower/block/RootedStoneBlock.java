package net.t4lcall.bulb_flower.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RootedStoneBlock extends Block {
    public RootedStoneBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        ItemStack itemStack = player.getMainHandStack();
        if(player.getMainHandStack().isIn(ItemTags.HOES)){
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.BLOCK_BEEHIVE_SHEAR, SoundCategory.BLOCKS, 1f, 1.75f);
            RootedStoneBlock.dropStack(world, pos, new ItemStack(ModBlocks.BULB_ROOTS, 1));
            RootedStoneBlock.dropStack(world, pos, new ItemStack(Blocks.END_STONE, 1));
            world.setBlockState(pos, Blocks.END_STONE.getDefaultState());
        }
        super.onBreak(world, pos, this.getDefaultState(), player);
    }
}
