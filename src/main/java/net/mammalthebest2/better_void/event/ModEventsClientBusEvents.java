package net.mammalthebest2.better_void.event;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.mammalthebest2.better_void.block.ModBlocks;
import net.mammalthebest2.better_void.entity.ModEntityTypes;
import net.mammalthebest2.better_void.entity.client.PlayerRenderer;
import net.mammalthebest2.better_void.screen.ModMenuTypes;
import net.mammalthebest2.better_void.screen.VoidInfuserScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BetterVoidMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventsClientBusEvents {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VOID_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VOID_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VOID_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VOID_LEAVES.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.VOID_INFUSER.get(), RenderType.translucent());
        MenuScreens.register(ModMenuTypes.VOID_INFUSER_MENU.get(), VoidInfuserScreen::new);

        EntityRenderers.register(ModEntityTypes.PLAYER.get(), PlayerRenderer::new);
    }
}
