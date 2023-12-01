package net.t4lcall.bulb_flower.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.t4lcall.bulb_flower.block.ModBlocks;
import net.t4lcall.bulb_flower.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Items.BULB_LOGS)
                .add(ModBlocks.BULB_ROOTLOG.asItem())
                .add(ModBlocks.BULB_ROOTWOOD.asItem())
                .add(ModBlocks.STRIPPED_BULB_ROOTLOG.asItem())
                .add(ModBlocks.STRIPPED_BULB_ROOTWOOD.asItem());
        getOrCreateTagBuilder(ModTags.Items.SPECTRE_LOGS)
                .add(ModBlocks.SPECTRE_ROOTLOG.asItem())
                .add(ModBlocks.SPECTRE_ROOTWOOD.asItem())
                .add(ModBlocks.STRIPPED_SPECTRE_ROOTLOG.asItem())
                .add(ModBlocks.STRIPPED_SPECTRE_ROOTWOOD.asItem());
        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS)
                .add(ModBlocks.BULB_PISTIL.asItem())
                .add(ModBlocks.SPECTRE_PISTIL.asItem());
        getOrCreateTagBuilder(ItemTags.SIGNS)
                //.add(ModBlocks.BULB_SIGN)
                //.add(ModBlocks.SPECTRE_SIGN)
                ;
        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS)
                //.add(ModBlocks.BULB_HANGING_SIGN)
                //.add(ModBlocks.SPECTRE_HANGING_SIGN)
        ;
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.BULB_BUTTON.asItem())
                .add(ModBlocks.SPECTRE_BUTTON.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.BULB_DOOR.asItem())
                .add(ModBlocks.SPECTRE_DOOR.asItem());
        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(ModBlocks.BULB_FENCE_GATE.asItem())
                .add(ModBlocks.SPECTRE_FENCE_GATE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.BULB_FENCE.asItem())
                .add(ModBlocks.SPECTRE_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .addTag(ModTags.Items.BULB_LOGS)
                .addTag(ModTags.Items.SPECTRE_LOGS);
        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.BULB_PLANKS.asItem())
                .add(ModBlocks.SPECTRE_PLANKS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.BULB_SLAB.asItem())
                .add(ModBlocks.SPECTRE_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.BULB_STAIRS.asItem())
                .add(ModBlocks.SPECTRE_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.BULB_PRESSURE_PLATE.asItem())
                .add(ModBlocks.SPECTRE_PRESSURE_PLATE.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.BULB_TRAPDOOR.asItem())
                .add(ModBlocks.SPECTRE_TRAPDOOR.asItem());
    }
}
