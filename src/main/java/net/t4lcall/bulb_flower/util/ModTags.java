package net.t4lcall.bulb_flower.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.t4lcall.bulb_flower.BulbFlower;

public final class ModTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(BulbFlower.MOD_ID, name));
        }
        public static final TagKey<Block> BULB_ROOT_REPLACEABLE_BLOCKS =
                createTag("bulb_root_replaceable_block");
        public static final TagKey<Block> PETAL_SUPPORT_BLOCKS =
                createTag("petal_support_block");
        public static final TagKey<Block> BULB_LOGS =
                createTag("bulb_log");
        public static final TagKey<Block> SPECTRE_LOGS =
                createTag("spectre_log");
    }
    public static class Items {
        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, new Identifier(BulbFlower.MOD_ID, name));
        }

        //public static final TagKey<Item> BULB_LOG =
        //        createTag("bulb_log");
    }
  }
