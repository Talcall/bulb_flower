package net.t4lcall.bulb_flower.world.tree;

import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.t4lcall.bulb_flower.BulbFlower;
import net.t4lcall.bulb_flower.mixin.TrunkPlacerTypeInvoker;
import net.t4lcall.bulb_flower.world.tree.custom.SingleTrunkPlacer;

public class ModTrunkPlacerTypes {
    public static final TrunkPlacerType<?> SINGLE_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("single_trunk_placer", SingleTrunkPlacer.CODEC);

    public static void register() {
        BulbFlower.LOGGER.info("Registering Trunk Placers for " + BulbFlower.MOD_ID);
    }
}
