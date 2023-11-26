package net.t4lcall.bulb_flower.world;

import net.minecraft.block.Block;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.t4lcall.bulb_flower.BulbFlower;
import net.t4lcall.bulb_flower.block.ModBlocks;
import net.minecraft.registry.RegistryEntryLookup;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?,?>> BULB_KEY = registerKey("bulb");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RegistryEntryLookup<Block> registryEntryLookup = context.getRegistryLookup(RegistryKeys.BLOCK);
        register(context,
                BULB_KEY,
                Feature.TREE,
                new TreeFeatureConfig.Builder(BlockStateProvider.of(ModBlocks.BULB_ROOTLOG),
                        new StraightTrunkPlacer(1,0,0),
                        BlockStateProvider.of(ModBlocks.BULB_ROOTS),
                        new BlobFoliagePlacer(ConstantIntProvider.create(1),ConstantIntProvider.create(0),1),
                        new TwoLayersFeatureSize(0, 0, 0))
                        .build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BulbFlower.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
