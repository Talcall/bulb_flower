package net.t4lcall.bulb_flower.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.t4lcall.bulb_flower.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool bulbPlanks = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BULB_PLANKS);
        //blockStateModelGenerator.registerLog(ModBlocks.BULB_ROOTLOG);
        //blockStateModelGenerator.registerLog(ModBlocks.BULB_ROOTWOOD);
        //blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BULB_ROOTLOG);
        //blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BULB_ROOTWOOD);
        //blockStateModelGenerator.registerLog(ModBlocks.BULB_ROOTS);
        //blockStateModelGenerator.registerLog(ModBlocks.ROOTED_END_STONE);
        //blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BULB_ROOTWOOD);
        bulbPlanks.stairs(ModBlocks.BULB_STAIRS);
        bulbPlanks.slab(ModBlocks.BULB_SLAB);
        bulbPlanks.button(ModBlocks.BULB_BUTTON);
        bulbPlanks.fence(ModBlocks.BULB_FENCE);
        bulbPlanks.fenceGate(ModBlocks.BULB_FENCE_GATE);
        bulbPlanks.pressurePlate(ModBlocks.BULB_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(ModBlocks.BULB_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BULB_TRAPDOOR);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BULB_SAPLING, ModBlocks.POTTED_BULB_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
