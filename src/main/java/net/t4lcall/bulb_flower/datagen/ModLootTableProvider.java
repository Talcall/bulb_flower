package net.t4lcall.bulb_flower.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.t4lcall.bulb_flower.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    protected ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BULB_PLANKS);
        addDrop(ModBlocks.BULB_ROOTLOG);
        addDrop(ModBlocks.BULB_ROOTS);
        addDrop(ModBlocks.BULB_ROOTLOG);
        addDrop(ModBlocks.BULB_ROOTWOOD);
        addDrop(ModBlocks.BULB_SAPLING);
        addDrop(ModBlocks.BULB_STAIRS);
        addDrop(ModBlocks.BULB_PISTIL);
        addDrop(ModBlocks.BULB_BUTTON);
        addDrop(ModBlocks.BULB_PRESSURE_PLATE);
        addDrop(ModBlocks.BULB_TRAPDOOR);
        addDrop(ModBlocks.BULB_FENCE_GATE);

        addDrop(ModBlocks.BULB_DOOR, doorDrops(ModBlocks.BULB_DOOR));
        addDrop(ModBlocks.BULB_SLAB, slabDrops(ModBlocks.BULB_SLAB));


    }
}
