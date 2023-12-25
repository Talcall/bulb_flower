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
        createStairsRecipe(ModBlocks.BULB_STAIRS, Ingredient.ofItems(ModBlocks.BULB_PLANKS)).criterion(FabricRecipeProvider.hasItem(ModBlocks.BULB_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.BULB_PLANKS)).offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BULB_SLAB, Ingredient.ofItems(ModBlocks.BULB_PLANKS)).criterion(FabricRecipeProvider.hasItem(ModBlocks.BULB_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.BULB_PLANKS)).offerTo(exporter);
        createDoorRecipe(ModBlocks.BULB_DOOR, Ingredient.ofItems(ModBlocks.BULB_PLANKS)).criterion(FabricRecipeProvider.hasItem(ModBlocks.BULB_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.BULB_PLANKS)).offerTo(exporter);
        offerShapelessRecipe(exporter, ModBlocks.BULB_BUTTON, ModBlocks.BULB_PLANKS, "button", 1);
        createTrapdoorRecipe(ModBlocks.BULB_TRAPDOOR, Ingredient.ofItems(ModBlocks.BULB_PLANKS)).criterion(FabricRecipeProvider.hasItem(ModBlocks.BULB_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.BULB_PLANKS)).offerTo(exporter);
        createFenceRecipe(ModBlocks.BULB_FENCE, Ingredient.ofItems(ModBlocks.BULB_PLANKS)).criterion(FabricRecipeProvider.hasItem(ModBlocks.BULB_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.BULB_PLANKS)).offerTo(exporter);
        createFenceGateRecipe(ModBlocks.BULB_FENCE_GATE, Ingredient.ofItems(ModBlocks.BULB_PLANKS)).criterion(FabricRecipeProvider.hasItem(ModBlocks.BULB_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.BULB_PLANKS)).offerTo(exporter);

        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPECTRE_ROOTLOG, ModBlocks.SPECTRE_ROOTS);
        offerBarkBlockRecipe(exporter, ModBlocks.SPECTRE_ROOTWOOD, ModBlocks.SPECTRE_ROOTLOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_SPECTRE_ROOTWOOD, ModBlocks.STRIPPED_SPECTRE_ROOTLOG);
        offerShapelessRecipe(exporter, ModBlocks.SPECTRE_PLANKS, ModBlocks.SPECTRE_ROOTLOG, "spectre_planks", 4);
        offerShapelessRecipe(exporter, ModBlocks.SPECTRE_PLANKS, ModBlocks.STRIPPED_SPECTRE_ROOTLOG, "spectre_planks", 4);
        offerShapelessRecipe(exporter, ModBlocks.SPECTRE_PLANKS, ModBlocks.SPECTRE_ROOTWOOD, "spectre_planks", 4);
        offerShapelessRecipe(exporter, ModBlocks.SPECTRE_PLANKS, ModBlocks.STRIPPED_SPECTRE_ROOTWOOD, "spectre_planks", 4);
        offerShapelessRecipe(exporter, Items.LIGHT_BLUE_DYE, ModBlocks.SPECTRE_SAPLING, "light_blue_dye", 1);
        offerShapelessRecipe(exporter, Items.LIGHT_GRAY_DYE, ModBlocks.SPECTRE_FROND, "light_gray_dye", 2);
        offerShapelessRecipe(exporter, Items.LIGHT_BLUE_DYE, ModBlocks.SPECTRE_PISTIL, "light_blue_dye", 2);
        createStairsRecipe(ModBlocks.SPECTRE_STAIRS, Ingredient.ofItems(ModBlocks.SPECTRE_PLANKS)).criterion(FabricRecipeProvider.hasItem(ModBlocks.SPECTRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SPECTRE_PLANKS)).offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPECTRE_SLAB, Ingredient.ofItems(ModBlocks.SPECTRE_PLANKS)).criterion(FabricRecipeProvider.hasItem(ModBlocks.SPECTRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SPECTRE_PLANKS)).offerTo(exporter);
        createDoorRecipe(ModBlocks.SPECTRE_DOOR, Ingredient.ofItems(ModBlocks.SPECTRE_PLANKS)).criterion(FabricRecipeProvider.hasItem(ModBlocks.SPECTRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SPECTRE_PLANKS)).offerTo(exporter);
        offerShapelessRecipe(exporter, ModBlocks.SPECTRE_BUTTON, ModBlocks.SPECTRE_PLANKS, "button", 1);
        createTrapdoorRecipe(ModBlocks.SPECTRE_TRAPDOOR, Ingredient.ofItems(ModBlocks.SPECTRE_PLANKS)).criterion(FabricRecipeProvider.hasItem(ModBlocks.SPECTRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SPECTRE_PLANKS)).offerTo(exporter);
        createFenceRecipe(ModBlocks.SPECTRE_FENCE, Ingredient.ofItems(ModBlocks.SPECTRE_PLANKS)).criterion(FabricRecipeProvider.hasItem(ModBlocks.SPECTRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SPECTRE_PLANKS)).offerTo(exporter);
        createFenceGateRecipe(ModBlocks.SPECTRE_FENCE_GATE, Ingredient.ofItems(ModBlocks.SPECTRE_PLANKS)).criterion(FabricRecipeProvider.hasItem(ModBlocks.SPECTRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SPECTRE_PLANKS)).offerTo(exporter);
    }
}
