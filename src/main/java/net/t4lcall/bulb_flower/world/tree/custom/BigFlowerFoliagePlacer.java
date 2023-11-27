package net.t4lcall.bulb_flower.world.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.t4lcall.bulb_flower.block.ModBlocks;
import net.t4lcall.bulb_flower.world.tree.ModFoliagePlacerTypes;

public class BigFlowerFoliagePlacer extends FoliagePlacer {
    public static final Codec<BigFlowerFoliagePlacer> CODEC = RecordCodecBuilder.create(bigFlowerFoliagePlacerInstance ->
            fillFoliagePlacerFields(bigFlowerFoliagePlacerInstance).and(Codec.intRange(0, 12).fieldOf("height")
                    .forGetter(instance -> instance.height)).apply(bigFlowerFoliagePlacerInstance, BigFlowerFoliagePlacer::new));
    private final int height;

    public BigFlowerFoliagePlacer(IntProvider radius, IntProvider offset, int height) {
        super(radius, offset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return ModFoliagePlacerTypes.BIG_FLOWER_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random,
                            TreeFeatureConfig config, int trunkHeight, TreeNode treeNode,
                            int foliageHeight, int radius, int offset) {
        placer.placeBlock(treeNode.getCenter(),
                (BlockState)config.foliageProvider.get(random, treeNode.getCenter()));
        placer.placeBlock(treeNode.getCenter().north(),
                (BlockState) ModBlocks.BULB_FROND.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        placer.placeBlock(treeNode.getCenter().east(),
                (BlockState) ModBlocks.BULB_FROND.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.EAST));
        placer.placeBlock(treeNode.getCenter().south(),
                (BlockState) ModBlocks.BULB_FROND.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.SOUTH));
        placer.placeBlock(treeNode.getCenter().west(),
                (BlockState) ModBlocks.BULB_FROND.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.WEST));
    }

    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return this.height;
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return false;
    }
}
