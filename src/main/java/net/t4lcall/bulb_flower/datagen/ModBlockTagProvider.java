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
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.BULB_FENCE)
                .add(ModBlocks.SPECTRE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.BULB_FENCE_GATE)
                .add(ModBlocks.SPECTRE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.BULB_BUTTON)
                .add(ModBlocks.SPECTRE_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.BULB_DOOR)
                .add(ModBlocks.SPECTRE_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.BULB_SLAB)
                .add(ModBlocks.SPECTRE_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.BULB_STAIRS)
                .add(ModBlocks.SPECTRE_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.BULB_PRESSURE_PLATE)
                .add(ModBlocks.SPECTRE_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.BULB_TRAPDOOR)
                .add(ModBlocks.SPECTRE_TRAPDOOR);
        getOrCreateTagBuilder(ModTags.Blocks.BULB_ROOT_REPLACEABLE_BLOCKS)
                .add(Blocks.END_STONE).add(ModBlocks.ROOTED_END_STONE);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ROOTED_END_STONE);
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
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
                .add(ModBlocks.STRIPPED_BULB_ROOTWOOD)
                .add(ModBlocks.SPECTRE_FENCE)
                .add(ModBlocks.SPECTRE_BUTTON)
                .add(ModBlocks.SPECTRE_FENCE_GATE)
                .add(ModBlocks.SPECTRE_DOOR)
                .add(ModBlocks.SPECTRE_PLANKS)
                .add(ModBlocks.SPECTRE_PRESSURE_PLATE)
                .add(ModBlocks.SPECTRE_ROOTLOG)
                .add(ModBlocks.SPECTRE_ROOTS)
                .add(ModBlocks.SPECTRE_ROOTWOOD)
                .add(ModBlocks.SPECTRE_SLAB)
                .add(ModBlocks.SPECTRE_STAIRS)
                .add(ModBlocks.SPECTRE_TRAPDOOR)
                .add(ModBlocks.STRIPPED_SPECTRE_ROOTLOG)
                .add(ModBlocks.STRIPPED_SPECTRE_ROOTWOOD);
        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.ROOTED_END_STONE)
                .add(ModBlocks.BULB_ROOTS)
                .add(ModBlocks.BULB_PISTIL)
                .add(ModBlocks.BULB_FROND)
                .add(ModBlocks.SPECTRE_ROOTS)
                .add(ModBlocks.SPECTRE_PISTIL)
                .add(ModBlocks.SPECTRE_FROND);
        getOrCreateTagBuilder(ModTags.Blocks.BULB_LOGS)
                .add(ModBlocks.BULB_ROOTLOG)
                .add(ModBlocks.BULB_ROOTWOOD)
                .add(ModBlocks.STRIPPED_BULB_ROOTLOG)
                .add(ModBlocks.STRIPPED_BULB_ROOTWOOD);
        getOrCreateTagBuilder(ModTags.Blocks.SPECTRE_LOGS)
                .add(ModBlocks.SPECTRE_ROOTLOG)
                .add(ModBlocks.SPECTRE_ROOTWOOD)
                .add(ModBlocks.STRIPPED_SPECTRE_ROOTLOG)
                .add(ModBlocks.STRIPPED_SPECTRE_ROOTWOOD);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .addTag(ModTags.Blocks.BULB_LOGS)
                .addTag(ModTags.Blocks.SPECTRE_LOGS);
        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.BULB_PLANKS)
                .add(ModBlocks.SPECTRE_PLANKS);
        getOrCreateTagBuilder(ModTags.Blocks.PETAL_SUPPORT_BLOCKS)
                .add(ModBlocks.BULB_PISTIL)
                .add(ModBlocks.SPECTRE_PISTIL);
        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                //.add(ModBlocks.BULB_SIGN)
        ;
        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                //.add(ModBlocks.BULB_WALL_HANGING_SIGN)
        ;
        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                //.add(ModBlocks.BULB_WALL_SIGN)
        ;
        getOrCreateTagBuilder(BlockTags.FLOWERS)
                .add(ModBlocks.BULB_PISTIL)
                .add(ModBlocks.SPECTRE_PISTIL);
    }
}
