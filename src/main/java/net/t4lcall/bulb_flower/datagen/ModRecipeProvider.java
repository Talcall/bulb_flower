package net.t4lcall.bulb_flower.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.t4lcall.bulb_flower.block.ModBlocks;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BULB_ROOTLOG, ModBlocks.BULB_ROOTS);
        offerBarkBlockRecipe(exporter, ModBlocks.BULB_ROOTWOOD, ModBlocks.BULB_ROOTLOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_BULB_ROOTWOOD, ModBlocks.STRIPPED_BULB_ROOTLOG);
        offerShapelessRecipe(exporter, ModBlocks.BULB_PLANKS, ModBlocks.BULB_ROOTLOG, "bulb_planks", 4);
        offerShapelessRecipe(exporter, ModBlocks.BULB_PLANKS, ModBlocks.STRIPPED_BULB_ROOTLOG, "bulb_planks", 4);
        offerShapelessRecipe(exporter, ModBlocks.BULB_PLANKS, ModBlocks.BULB_ROOTWOOD, "bulb_planks", 4);
        offerShapelessRecipe(exporter, ModBlocks.BULB_PLANKS, ModBlocks.STRIPPED_BULB_ROOTWOOD, "bulb_planks", 4);
        offerShapelessRecipe(exporter, Items.MAGENTA_DYE, ModBlocks.BULB_SAPLING, "magenta_dye", 1);
        offerShapelessRecipe(exporter, Items.PURPLE_DYE, ModBlocks.BULB_FROND, "purple_dye", 2);
        offerShapelessRecipe(exporter, Items.PINK_DYE, ModBlocks.BULB_PISTIL, "pink_dye", 2);
        createStairsRecipe(ModBlocks.BULB_STAIRS, Ingredient.ofItems(ModBlocks.BULB_PLANKS));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BULB_SLAB, Ingredient.ofItems(ModBlocks.BULB_PLANKS));
        createDoorRecipe(ModBlocks.BULB_DOOR, Ingredient.ofItems(ModBlocks.BULB_PLANKS));
        offerShapelessRecipe(exporter, ModBlocks.BULB_BUTTON, ModBlocks.BULB_PLANKS, "button", 1);
        createTrapdoorRecipe(ModBlocks.BULB_TRAPDOOR, Ingredient.ofItems(ModBlocks.BULB_PLANKS));
        createFenceRecipe(ModBlocks.BULB_FENCE, Ingredient.ofItems(ModBlocks.BULB_PLANKS));
        createFenceGateRecipe(ModBlocks.BULB_FENCE_GATE, Ingredient.ofItems(ModBlocks.BULB_PLANKS));
    }
}
