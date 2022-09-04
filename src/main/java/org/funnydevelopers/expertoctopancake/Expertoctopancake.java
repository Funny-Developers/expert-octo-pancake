package org.funnydevelopers.expertoctopancake;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.funnydevelopers.expertoctopancake.blocks.Blocks;
import org.funnydevelopers.expertoctopancake.items.Items;

public class Expertoctopancake implements ModInitializer {
    public static final String MODID = "expertoctopancake";

    public static Identifier ofModIdentifier(String path) {
        return new Identifier(MODID, path);
    }

    @Override
    public void onInitialize() {
        Blocks.register();
        Items.register();
    }
}
