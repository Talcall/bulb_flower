package net.t4lcall.bulb_flower.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.t4lcall.bulb_flower.BulbFlower;
import net.t4lcall.bulb_flower.block.ModBlocks;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> BULB_TREE_PLACED_KEY = registerKey("bulb_tree_placed");
    public static final RegistryKey<PlacedFeature> SPECTRE_TREE_PLACED_KEY = registerKey("spectre_tree_placed");
    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        register(context, BULB_TREE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow((ModConfiguredFeatures.BULB_KEY)
        ), VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.05f, 2),
                        ModBlocks.BULB_SAPLING));
        register(context, SPECTRE_TREE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow((ModConfiguredFeatures.SPECTRE_KEY)
        ), VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(0, 0.125f, 4),
                ModBlocks.SPECTRE_SAPLING));


    }
    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BulbFlower.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
        List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}

