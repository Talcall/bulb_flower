package net.t4lcall.bulb_flower.block;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.t4lcall.bulb_flower.BulbFlower;

public class ModBlocks {

    public static final Block BULB_ROOTS = new Block(FabricBlockSettings.create().nonOpaque());
    @Environment(EnvType.CLIENT)
    public class BulbFlowerClient implements ClientModInitializer {
        public void onInitializeClient() {
            BlockRenderLayerMap.INSTANCE.putBlock(BulbFlower.BULB_ROOTS, RenderLayer.getCutout());
        }
    }

    public static final Block BULB_PLANKS = registerBlock("bulb_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BULB_ROOTLOG = registerBlock("bulb_rootlog",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BulbFlower.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(BulbFlower.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        BulbFlower.LOGGER.info("Registering ModBlocks for" + BulbFlower.MOD_ID);
    }
}
