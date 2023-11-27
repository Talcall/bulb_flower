package net.t4lcall.bulb_flower.world.tree;

import net.minecraft.world.gen.root.RootPlacerType;
import net.t4lcall.bulb_flower.BulbFlower;
import net.t4lcall.bulb_flower.mixin.RootPlacerTypeInvoker;
import net.t4lcall.bulb_flower.world.gen.BulbRootPlacer;

public class ModRootPlacerTypes {
    public static final RootPlacerType<?> BULB_ROOT_PLACER = RootPlacerTypeInvoker.callRegister("bulb_root_placer", BulbRootPlacer.CODEC);
    public static void register() {
        BulbFlower.LOGGER.info("Registering Root Placer for " + BulbFlower.MOD_ID);
    }
}
