package net.mammalthebest2.voidless_mod.block.entity;

import net.mammalthebest2.voidless_mod.VoidlessModMain;
import net.mammalthebest2.voidless_mod.block.ModBlocks;
import net.mammalthebest2.voidless_mod.block.entity.custom.VoidInfuserBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, VoidlessModMain.MOD_ID);

    public static final RegistryObject<BlockEntityType<VoidInfuserBlockEntity>> VOID_INFUSER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("void_infuser_block_entity",
                    () -> BlockEntityType.Builder.of(VoidInfuserBlockEntity::new,
                            ModBlocks.VOID_INFUSER.get()).build(null));
    public static void register(IEventBus eventBus){
        BLOCK_ENTITIES.register(eventBus);
    }
}
