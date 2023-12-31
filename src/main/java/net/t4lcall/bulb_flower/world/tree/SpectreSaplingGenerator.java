package net.t4lcall.bulb_flower.world.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.t4lcall.bulb_flower.world.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class SpectreSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.SPECTRE_KEY;
    }
}
