package net.mammalthebest2.better_void.screen;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, BetterVoidMain.MOD_ID);

    public static final RegistryObject<MenuType<VoidInfuserMenu>> VOID_INFUSER_MENU =
            registerMenuType(VoidInfuserMenu::new, "void_infuser_menu");

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name){
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventbus){
        MENUS.register(eventbus);
    }
}
