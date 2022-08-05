package net.mammalthebest2.better_void.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class BetterVoidCreativeTab {

    public static final CreativeModeTab better_void =  new CreativeModeTab("better_void_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VOID_INGOT.get());
        }
    };
}
