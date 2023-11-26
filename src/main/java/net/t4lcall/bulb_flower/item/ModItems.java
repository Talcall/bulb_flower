package net.t4lcall.bulb_flower.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.t4lcall.bulb_flower.BulbFlower;
import net.t4lcall.bulb_flower.block.ModBlocks;


public class ModItems {

    //public static final Item BULB_SAPLING = registerItem("bulb_sapling", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.BULB_SAPLING);
        entries.add(ModBlocks.BULB_ROOTS);
        entries.add(ModBlocks.ROOTED_END_STONE);
        entries.add(ModBlocks.BULB_PLANKS);
        entries.add(ModBlocks.BULB_ROOTLOG);
        entries.add(ModBlocks.BULB_ROOTWOOD);
        entries.add(ModBlocks.STRIPPED_BULB_ROOTLOG);
        entries.add(ModBlocks.STRIPPED_BULB_ROOTWOOD);
        entries.add(ModBlocks.BULB_PISTIL);
        entries.add(ModBlocks.BULB_TRAPDOOR);
        entries.add(ModBlocks.BULB_DOOR);
        entries.add(ModBlocks.BULB_SLAB);
        entries.add(ModBlocks.BULB_STAIRS);
        entries.add(ModBlocks.BULB_BUTTON);
        entries.add(ModBlocks.BULB_PRESSURE_PLATE);
        entries.add(ModBlocks.BULB_FENCE);
        entries.add(ModBlocks.BULB_FENCE_GATE);
        entries.add(ModBlocks.BULB_FROND);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BulbFlower.MOD_ID, name), item);
    }
    public static void registerModItems () {
        BulbFlower.LOGGER.info("Registering Mod Items For" + BulbFlower.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
    }
}
