package net.mammalthebest2.better_void.enchantment;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, BetterVoidMain.MOD_ID);

    public static final RegistryObject<Enchantment> DEATH_THREAT =
            ENCHANTMENTS.register("death_threat", () ->
                    new DeathThreatEnchantment(Enchantment.Rarity.RARE,
                    EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));

    public static void register(IEventBus eventBus){
        ENCHANTMENTS.register(eventBus);
    }
}
