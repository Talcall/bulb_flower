package net.t4lcall.bulb_flower.world.gen;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryCodecs;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public record BulbRootPlacement(RegistryEntryList<Block> bulbCanGrowThrough, RegistryEntryList<Block> endStoneRootsIn, BlockStateProvider endStoneRootsProvider, int maxBulbRootWidth, int maxBulbRootLength, float bulbRandomSkewChance) {
    public static final Codec<BulbRootPlacement> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(RegistryCodecs.entryList(RegistryKeys.BLOCK).fieldOf("can_grow_through").forGetter((bulbRootPlacement) -> {
            return bulbRootPlacement.bulbCanGrowThrough;
        }), RegistryCodecs.entryList(RegistryKeys.BLOCK).fieldOf("muddy_roots_in").forGetter((bulbRootPlacement) -> {
            return bulbRootPlacement.endStoneRootsIn;
        }), BlockStateProvider.TYPE_CODEC.fieldOf("muddy_roots_provider").forGetter((bulbRootPlacement) -> {
            return bulbRootPlacement.endStoneRootsProvider;
        }), Codec.intRange(1, 12).fieldOf("max_root_width").forGetter((bulbRootPlacement) -> {
            return bulbRootPlacement.maxBulbRootWidth;
        }), Codec.intRange(1, 64).fieldOf("max_root_length").forGetter((bulbRootPlacement) -> {
            return bulbRootPlacement.maxBulbRootLength;
        }), Codec.floatRange(0.0F, 1.0F).fieldOf("random_skew_chance").forGetter((bulbRootPlacement) -> {
            return bulbRootPlacement.bulbRandomSkewChance;
        })).apply(instance, BulbRootPlacement::new);
    });

    public BulbRootPlacement(RegistryEntryList<Block> bulbCanGrowThrough, RegistryEntryList<Block> endStoneRootsIn, BlockStateProvider endStoneRootsProvider, int maxBulbRootWidth, int maxBulbRootLength, float bulbRandomSkewChance) {
        this.bulbCanGrowThrough = bulbCanGrowThrough;
        this.endStoneRootsIn = endStoneRootsIn;
        this.endStoneRootsProvider = endStoneRootsProvider;
        this.maxBulbRootWidth = maxBulbRootWidth;
        this.maxBulbRootLength = maxBulbRootLength;
        this.bulbRandomSkewChance = bulbRandomSkewChance;
    }

    public RegistryEntryList<Block> bulbCanGrowThrough() {
        return this.bulbCanGrowThrough;
    }

    public RegistryEntryList<Block> endStoneRootsIn() {
        return this.endStoneRootsIn;
    }

    public BlockStateProvider endStoneRootsProvider() {
        return this.endStoneRootsProvider;
    }

    public int maxBulbRootWidth() {
        return this.maxBulbRootWidth;
    }

    public int maxBulbRootLength() {
        return this.maxBulbRootLength;
    }

    public float bulbRandomSkewChance() {
        return this.bulbRandomSkewChance;
    }
}
