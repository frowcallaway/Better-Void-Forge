package net.mammalthebest2.better_void.potion;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.mammalthebest2.better_void.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, BetterVoidMain.MOD_ID);

    public static final RegistryObject<Potion> TRAUMATISED_POTION  =
            POTIONS.register("potion_of_traumatised",
                    () -> new Potion(new MobEffectInstance(ModEffects.TRAUMATISED.get(), 280, 0)));


    public static void register(IEventBus eventBus){
        POTIONS.register(eventBus);
    }
}
