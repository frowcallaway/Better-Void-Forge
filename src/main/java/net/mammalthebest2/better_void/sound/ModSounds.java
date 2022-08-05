package net.mammalthebest2.better_void.sound;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BetterVoidMain.MOD_ID);

    public static final RegistryObject<SoundEvent> AMONG_US_MUSIC = registerSoundEvent("amongus_music");
    public static final RegistryObject<SoundEvent> VOID_STAFF_DETECTED_VALUABLES_SOUND = registerSoundEvent("void_staff_detected_valuables_sound");

    private static RegistryObject<SoundEvent> registerSoundEvent(String name){
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(BetterVoidMain.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
