package net.t4lcall.bulb_flower;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.t4lcall.bulb_flower.block.ModBlocks;

public class BulbFlowerClient implements ClientModInitializer{
    @Environment(EnvType.CLIENT)
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BULB_ROOTS, RenderLayer.getCutout());
    }

}
