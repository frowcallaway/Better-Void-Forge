package net.mammalthebest2.better_void.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class BetterVoidCreativeTab {

    public static final CreativeModeTab BETTER_VOID =  new CreativeModeTab("better_void_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VOID_INGOT.get());
        }
    };

    public static final CreativeModeTab ELEMENTAL_VOID_INGOTS = new CreativeModeTab("elemental_void_ingots_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.EARTH_INFUSED_VOID_INGOT.get());
        }
    };
}
