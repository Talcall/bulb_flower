package net.t4lcall.bulb_flower.util;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.t4lcall.bulb_flower.BulbFlower;

public final class ModTags {
    public static class Blocks {
        public static final TagKey<Block> PETAL_SUPPORT_BLOCKS =
                createTag("petal_support_block");
        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(BulbFlower.MOD_ID, name));
        }
        public static final TagKey<Block> BULB_ROOT_REPLACEABLE_BLOCKS =
                createTag("bulb_root_replaceable_block");
    }
  }
