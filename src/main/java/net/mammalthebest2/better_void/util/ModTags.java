package net.mammalthebest2.better_void.util;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> VOID_STAFF_VALUABLES = tag("void_staff_valuables");

        private static TagKey<Block> tag (String name){
            return BlockTags.create(new ResourceLocation(BetterVoidMain.MOD_ID, name));
        }

        private static TagKey<Block> ForgeTag (String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items{
        public static final TagKey<Item> VOID_ITEMS = ForgeTag("void/void_ingot");

        private static TagKey<Item> tag (String name){
            return ItemTags.create(new ResourceLocation(BetterVoidMain.MOD_ID, name));
        }

        private static TagKey<Item> ForgeTag (String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }

    }
}
