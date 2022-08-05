package net.mammalthebest2.better_void.recipe;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, BetterVoidMain.MOD_ID);

    public static final RegistryObject<RecipeSerializer<VoidInfuserRecipe>> VOID_INFUSING_RECIPE =
            SERIALIZERS.register("void_infusing",
                    () -> VoidInfuserRecipe.Serializer.INSTANCE);


    public static void register(IEventBus eventBus){
        SERIALIZERS.register(eventBus);
    }
}
