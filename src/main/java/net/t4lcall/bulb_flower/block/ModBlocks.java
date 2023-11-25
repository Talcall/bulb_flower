package net.t4lcall.bulb_flower.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.t4lcall.bulb_flower.BulbFlower;

public class ModBlocks {
    public static final Block BULB_ROOTS = registerBlock("bulb_roots",
            new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_ROOTS)));
    public static final Block BULB_PLANKS = registerBlock("bulb_planks",
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
