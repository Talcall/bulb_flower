package net.t4lcall.bulb_flower.world.tree;


import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.t4lcall.bulb_flower.BulbFlower;
import net.t4lcall.bulb_flower.mixin.FoliagePlacerTypeInvoker;
import net.t4lcall.bulb_flower.world.tree.custom.BigFlowerFoliagePlacer;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> BIG_FLOWER_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("big_flower_foliage_placer", BigFlowerFoliagePlacer.CODEC);
    public static void register() {
        BulbFlower.LOGGER.info("Registering Foliage Placer for " + BulbFlower.MOD_ID);
    }
}
