package net.mammalthebest2.better_void.entity;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.mammalthebest2.better_void.entity.custom.PlayerEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, BetterVoidMain.MOD_ID);

    public static final RegistryObject<EntityType<PlayerEntity>> PLAYER =
            ENTITY_TYPES.register("player",
                    () -> EntityType.Builder.of(PlayerEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 1.0f)
                            .build(new ResourceLocation(BetterVoidMain.MOD_ID, "player").toString()));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
