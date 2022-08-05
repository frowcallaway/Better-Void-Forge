package net.mammalthebest2.better_void.effect;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BetterVoidMain.MOD_ID);

    public static final RegistryObject<MobEffect> TRAUMATISED = MOB_EFFECTS.register("traumatised",
            () -> new TraumatisedEffect(MobEffectCategory.HARMFUL, 3058597));


    public static void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }
}
