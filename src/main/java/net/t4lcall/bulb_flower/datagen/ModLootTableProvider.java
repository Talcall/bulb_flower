package net.t4lcall.bulb_flower.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.t4lcall.bulb_flower.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BULB_PLANKS);
        addDrop(ModBlocks.BULB_ROOTLOG);
        addDrop(ModBlocks.BULB_ROOTS);
        addDrop(ModBlocks.BULB_ROOTLOG);
        addDrop(ModBlocks.BULB_ROOTWOOD);
        //addDrop(ModBlocks.BULB_SAPLING);
        addDrop(ModBlocks.BULB_STAIRS);
        addDrop(ModBlocks.BULB_PISTIL);
        addDrop(ModBlocks.BULB_FROND);
        addDrop(ModBlocks.BULB_BUTTON);
        addDrop(ModBlocks.BULB_PRESSURE_PLATE);
        addDrop(ModBlocks.BULB_TRAPDOOR);
        addDrop(ModBlocks.BULB_FENCE_GATE);

        addDrop(ModBlocks.BULB_DOOR, doorDrops(ModBlocks.BULB_DOOR));
        addDrop(ModBlocks.BULB_SLAB, slabDrops(ModBlocks.BULB_SLAB));
        addPottedPlantDrops(ModBlocks.POTTED_BULB_SAPLING);

        addDrop(ModBlocks.SPECTRE_PLANKS);
        addDrop(ModBlocks.SPECTRE_ROOTLOG);
        addDrop(ModBlocks.SPECTRE_ROOTS);
        addDrop(ModBlocks.SPECTRE_ROOTLOG);
        addDrop(ModBlocks.SPECTRE_ROOTWOOD);
        //addDrop(ModBlocks.SPECTRE_SAPLING);
        addDrop(ModBlocks.SPECTRE_STAIRS);
        addDrop(ModBlocks.SPECTRE_PISTIL);
        addDrop(ModBlocks.SPECTRE_FROND);
        addDrop(ModBlocks.SPECTRE_BUTTON);
        addDrop(ModBlocks.SPECTRE_PRESSURE_PLATE);
        addDrop(ModBlocks.SPECTRE_TRAPDOOR);
        addDrop(ModBlocks.SPECTRE_FENCE_GATE);

        addDrop(ModBlocks.SPECTRE_DOOR, doorDrops(ModBlocks.SPECTRE_DOOR));
        addDrop(ModBlocks.SPECTRE_SLAB, slabDrops(ModBlocks.SPECTRE_SLAB));
        addPottedPlantDrops(ModBlocks.POTTED_SPECTRE_SAPLING);

    }
}
