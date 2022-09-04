package org.funnydevelopers.expertoctopancake.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.util.registry.Registry;

import static org.funnydevelopers.expertoctopancake.Expertoctopancake.ofModIdentifier;

public class Blocks {
    public static final Block TEST_BLOCK = new BlockBuilder()
            .build(AbstractBlock.Settings.of(Material.BAMBOO, MapColor.BLACK));
    public static final Block TEST_BLOCK_2 = new BlockBuilder()
            .minX(0.0)
            .minY(0.0)
            .minZ(0.0)
            .maxX(1.0)
            .maxY(1.0)
            .maxZ(1.0)
            .build(AbstractBlock.Settings.of(Material.BAMBOO, MapColor.BLUE));

    public static void register() {
        register("test_block", TEST_BLOCK);
        register("test_block_2", TEST_BLOCK_2);
    }

    private static void register(String path, Block block) {
        Registry.register(Registry.BLOCK, ofModIdentifier(path), block);
    }
}
