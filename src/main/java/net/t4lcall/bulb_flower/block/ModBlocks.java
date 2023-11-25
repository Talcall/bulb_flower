package net.t4lcall.bulb_flower.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.t4lcall.bulb_flower.BulbFlower;

public class ModBlocks {
    public static final Block BULB_ROOTS = registerBlock("bulb_roots",
            new TransparentBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_ROOTS)));
    public static final Block ROOTED_END_STONE = registerBlock("rooted_end_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block BULB_PLANKS = registerBlock("bulb_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BULB_ROOTLOG = registerBlock("bulb_rootlog",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block BULB_ROOTWOOD = registerBlock("bulb_rootwood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_BULB_ROOTLOG = registerBlock("stripped_bulb_rootlog",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_BULB_ROOTWOOD = registerBlock("stripped_bulb_rootwood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block BULB_SAPLING = registerBlock("bulb_sapling",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block BULB_PISTIL = registerBlock("bulb_pistil",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.PINK_PETALS)));
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
