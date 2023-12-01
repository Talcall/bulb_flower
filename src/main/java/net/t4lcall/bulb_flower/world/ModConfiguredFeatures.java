package net.t4lcall.bulb_flower.world;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.root.AboveRootPlacement;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.t4lcall.bulb_flower.BulbFlower;
import net.t4lcall.bulb_flower.block.ModBlocks;
import net.t4lcall.bulb_flower.util.ModTags;
import net.t4lcall.bulb_flower.world.gen.BulbRootPlacement;
import net.t4lcall.bulb_flower.world.gen.BulbRootPlacer;
import net.t4lcall.bulb_flower.world.tree.custom.BigBulbFlowerFoliagePlacer;
import net.t4lcall.bulb_flower.world.tree.custom.BigSpectreFlowerFoliagePlacer;
import net.t4lcall.bulb_flower.world.tree.custom.SingleTrunkPlacer;

import java.util.Optional;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> BULB_KEY = registerKey("bulb_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SPECTRE_KEY = registerKey("spectre_tree");
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, BULB_KEY, Feature.TREE,
                new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.BULB_ROOTLOG),
                    new SingleTrunkPlacer(1, 0, 0),
                    BlockStateProvider.of(ModBlocks.BULB_PISTIL),
                    new BigBulbFlowerFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), 1),
                    Optional.of(new BulbRootPlacer(UniformIntProvider.create(0, 0), BlockStateProvider.of(ModBlocks.BULB_ROOTS),
                            Optional.of(new AboveRootPlacement(BlockStateProvider.of(ModBlocks.BULB_FROND), 0)),
                            new BulbRootPlacement(context.getRegistryLookup(RegistryKeys.BLOCK).getOrThrow(ModTags.Blocks.BULB_ROOT_REPLACEABLE_BLOCKS),
                                    RegistryEntryList.of(Block::getRegistryEntry, Blocks.END_STONE, ModBlocks.ROOTED_END_STONE),
                                    BlockStateProvider.of(ModBlocks.ROOTED_END_STONE),8,15,0.1f))),
                    new TwoLayersFeatureSize(1, 0,2)).dirtProvider(BlockStateProvider.of(ModBlocks.BULB_ROOTS)).build());

        register(context, SPECTRE_KEY, Feature.TREE,
                new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(ModBlocks.SPECTRE_ROOTLOG),
                        new SingleTrunkPlacer(1, 1, 2),
                        BlockStateProvider.of(ModBlocks.SPECTRE_PISTIL),
                        new BigSpectreFlowerFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), 1),
                        Optional.of(new BulbRootPlacer(UniformIntProvider.create(1, 3), BlockStateProvider.of(ModBlocks.SPECTRE_ROOTS),
                                Optional.of(new AboveRootPlacement(BlockStateProvider.of(ModBlocks.SPECTRE_FROND), 0)),
                                new BulbRootPlacement(context.getRegistryLookup(RegistryKeys.BLOCK).getOrThrow(ModTags.Blocks.BULB_ROOT_REPLACEABLE_BLOCKS),
                                        RegistryEntryList.of(Block::getRegistryEntry, Blocks.END_STONE, Blocks.END_STONE),
                                        BlockStateProvider.of(Blocks.END_STONE),5,6,0.2f))),
                        new TwoLayersFeatureSize(1, 0,2)).dirtProvider(BlockStateProvider.of(ModBlocks.SPECTRE_ROOTS)).build());
    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BulbFlower.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?, ?>> context,
            RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
