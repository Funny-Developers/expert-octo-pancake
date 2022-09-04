package org.funnydevelopers.expertoctopancake.items;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static org.funnydevelopers.expertoctopancake.Expertoctopancake.ofModIdentifier;
import static org.funnydevelopers.expertoctopancake.blocks.Blocks.*;


public class Items {
    public static final Item TEST_ITEM = new Item(new Item.Settings());

    public static void register() {
        register("test_item", TEST_ITEM);
        register("test_block", new BlockItem(TEST_BLOCK, new Item.Settings()));
        register("test_block_2", new BlockItem(TEST_BLOCK_2, new Item.Settings()));
    }

    private static void register(String path, Item item) {
        Registry.register(Registry.ITEM, ofModIdentifier(path), item);
    }
}
