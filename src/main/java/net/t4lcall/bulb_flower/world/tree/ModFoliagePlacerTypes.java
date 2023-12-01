package net.t4lcall.bulb_flower.world.tree;


import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.t4lcall.bulb_flower.BulbFlower;
import net.t4lcall.bulb_flower.mixin.FoliagePlacerTypeInvoker;
import net.t4lcall.bulb_flower.world.tree.custom.BigBulbFlowerFoliagePlacer;
import net.t4lcall.bulb_flower.world.tree.custom.BigSpectreFlowerFoliagePlacer;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> BIG_BULB_FLOWER_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("big_bulb_flower_foliage_placer", BigBulbFlowerFoliagePlacer.CODEC);
    public static final FoliagePlacerType<?> BIG_SPECTRE_FLOWER_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("big_spectre_flower_foliage_placer", BigSpectreFlowerFoliagePlacer.CODEC);

    public static void register() {
        BulbFlower.LOGGER.info("Registering Foliage Placer for " + BulbFlower.MOD_ID);
    }
}
