package net.t4lcall.bulb_flower.world.gen;

import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.FeatureSize;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.root.RootPlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.trunk.TrunkPlacer;

import java.util.List;
import java.util.Optional;

public class ModTreeFeatureConfig extends TreeFeatureConfig {
    protected ModTreeFeatureConfig(
            BlockStateProvider trunkProvider,
            TrunkPlacer trunkPlacer,
            BlockStateProvider foliageProvider,
            FoliagePlacer foliagePlacer,
            Optional<RootPlacer> rootPlacer,
            BlockStateProvider dirtProvider,
            FeatureSize minimumSize,
            List<TreeDecorator> decorators,
            boolean ignoreVines,
            boolean forceDirt) {
        super(trunkProvider,
                trunkPlacer,
                foliageProvider,
                foliagePlacer,
                rootPlacer,
                dirtProvider,
                minimumSize,
                decorators,
                ignoreVines,
                forceDirt);
    }
}
