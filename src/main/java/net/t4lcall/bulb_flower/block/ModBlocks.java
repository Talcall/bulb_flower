package net.t4lcall.bulb_flower.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.t4lcall.bulb_flower.BulbFlower;
import net.t4lcall.bulb_flower.world.tree.BulbSaplingGenerator;
import net.t4lcall.bulb_flower.world.tree.SpectreSaplingGenerator;

public class ModBlocks {
    public static final Block BULB_ROOTS = registerBlock("bulb_roots",
            new MangroveRootsBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_ROOTS)));
    public static final Block BULB_PLANKS = registerBlock("bulb_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BULB_STAIRS = registerBlock("bulb_stairs",
            new StairsBlock(ModBlocks.BULB_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BULB_SLAB = registerBlock("bulb_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BULB_BUTTON = registerBlock("bulb_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noCollision(), BlockSetType.OAK, 30, true));
    public static final Block BULB_PRESSURE_PLATE = registerBlock("bulb_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noCollision(), BlockSetType.OAK));
    public static final Block BULB_FENCE = registerBlock("bulb_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BULB_FENCE_GATE = registerBlock("bulb_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), WoodType.OAK));
    public static final Block BULB_DOOR = registerBlock("bulb_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque(), BlockSetType.OAK));
    public static final Block BULB_TRAPDOOR = registerBlock("bulb_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque(), BlockSetType.OAK));
    public static final Block BULB_ROOTLOG = registerBlock("bulb_rootlog",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block BULB_ROOTWOOD = registerBlock("bulb_rootwood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_BULB_ROOTLOG = registerBlock("stripped_bulb_rootlog",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_BULB_ROOTWOOD = registerBlock("stripped_bulb_rootwood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    //public static final Block BULB_SAPLING = registerBlock("bulb_sapling",
    //        new SaplingBlock(new BulbSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block ROOTED_END_STONE = registerBlock("rooted_end_stone",
            new RootedStoneBlock(FabricBlockSettings.copyOf(Blocks.END_STONE)));
    public static final Block BULB_PISTIL = registerBlock("bulb_pistil",
            new PistilBlock(StatusEffects.LEVITATION,4,FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).luminance(state -> 5).noCollision().hardness(0f)));
    public static final Block BULB_SAPLING = registerBlock("bulb_sapling",
            new BulbSaplingBlock(new BulbSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block BULB_FROND = registerBlock("bulb_frond",
            new PetalBlock(StatusEffects.LEVITATION,4,FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).noCollision().hardness(0f), ModBlocks.BULB_SAPLING));

    public static final Block POTTED_BULB_SAPLING = Registry.register(Registries.BLOCK, new Identifier(BulbFlower.MOD_ID, "potted_bulb_sapling"),
            new FlowerPotBlock(BULB_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));

    public static final Block SPECTRE_ROOTS = registerBlock("spectre_roots",
            new MangroveRootsBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_ROOTS)));
    public static final Block SPECTRE_PLANKS = registerBlock("spectre_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPECTRE_STAIRS = registerBlock("spectre_stairs",
            new StairsBlock(ModBlocks.BULB_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPECTRE_SLAB = registerBlock("spectre_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPECTRE_BUTTON = registerBlock("spectre_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noCollision(), BlockSetType.OAK, 30, true));
    public static final Block SPECTRE_PRESSURE_PLATE = registerBlock("spectre_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noCollision(), BlockSetType.OAK));
    public static final Block SPECTRE_FENCE = registerBlock("spectre_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPECTRE_FENCE_GATE = registerBlock("spectre_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), WoodType.OAK));
    public static final Block SPECTRE_DOOR = registerBlock("spectre_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque(), BlockSetType.OAK));
    public static final Block SPECTRE_TRAPDOOR = registerBlock("spectre_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque(), BlockSetType.OAK));
    public static final Block SPECTRE_ROOTLOG = registerBlock("spectre_rootlog",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block SPECTRE_ROOTWOOD = registerBlock("spectre_rootwood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_SPECTRE_ROOTLOG = registerBlock("stripped_spectre_rootlog",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_SPECTRE_ROOTWOOD = registerBlock("stripped_spectre_rootwood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block SPECTRE_PISTIL = registerBlock("spectre_pistil",
            new PistilBlock(StatusEffects.SLOW_FALLING,4,FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).luminance(state -> 5).noCollision().hardness(0f)));
    public static final Block SPECTRE_SAPLING = registerBlock("spectre_sapling",
            new BulbSaplingBlock(new SpectreSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block SPECTRE_FROND = registerBlock("spectre_frond",
            new PetalBlock(StatusEffects.SLOW_FALLING,4,FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).noCollision().hardness(0f), ModBlocks.SPECTRE_SAPLING));

    public static final Block POTTED_SPECTRE_SAPLING = Registry.register(Registries.BLOCK, new Identifier(BulbFlower.MOD_ID, "potted_spectre_sapling"),
            new FlowerPotBlock(SPECTRE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));
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


    public static void registerModStripped() {
        StrippableBlockRegistry.register(ModBlocks.BULB_ROOTLOG, ModBlocks.STRIPPED_BULB_ROOTLOG);
        StrippableBlockRegistry.register(ModBlocks.BULB_ROOTWOOD, ModBlocks.STRIPPED_BULB_ROOTWOOD);
    }
}