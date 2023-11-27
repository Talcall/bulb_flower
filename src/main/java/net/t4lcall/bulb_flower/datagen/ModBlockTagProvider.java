package net.t4lcall.bulb_flower.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.t4lcall.bulb_flower.block.ModBlocks;
import net.t4lcall.bulb_flower.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider  extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.BULB_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.BULB_FENCE_GATE);
        getOrCreateTagBuilder(ModTags.Blocks.BULB_ROOT_REPLACEABLE_BLOCKS)
                .add(Blocks.END_STONE).add(ModBlocks.ROOTED_END_STONE);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ROOTED_END_STONE);
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.ROOTED_END_STONE)
                .add(ModBlocks.BULB_FENCE)
                .add(ModBlocks.BULB_BUTTON)
                .add(ModBlocks.BULB_FENCE_GATE)
                .add(ModBlocks.BULB_DOOR)
                .add(ModBlocks.BULB_PLANKS)
                .add(ModBlocks.BULB_PRESSURE_PLATE)
                .add(ModBlocks.BULB_ROOTLOG)
                .add(ModBlocks.BULB_ROOTS)
                .add(ModBlocks.BULB_ROOTWOOD)
                .add(ModBlocks.BULB_SLAB)
                .add(ModBlocks.BULB_STAIRS)
                .add(ModBlocks.BULB_TRAPDOOR)
                .add(ModBlocks.STRIPPED_BULB_ROOTLOG)
                .add(ModBlocks.STRIPPED_BULB_ROOTWOOD);


    }
}
