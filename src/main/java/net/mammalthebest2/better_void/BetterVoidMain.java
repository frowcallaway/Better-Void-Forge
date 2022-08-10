package net.mammalthebest2.better_void;

import net.mammalthebest2.better_void.block.ModBlocks;
import net.mammalthebest2.better_void.block.entity.ModBlockEntities;
import net.mammalthebest2.better_void.effect.ModEffects;
import net.mammalthebest2.better_void.item.ModItems;
import net.mammalthebest2.better_void.potion.ModPotions;
import net.mammalthebest2.better_void.recipe.ModRecipes;
import net.mammalthebest2.better_void.screen.ModMenuTypes;
import net.mammalthebest2.better_void.screen.VoidInfuserScreen;
import net.mammalthebest2.better_void.sound.ModSounds;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file

@Mod(BetterVoidMain.MOD_ID)
public class BetterVoidMain
{
    /**
     * Welcome to the brain of the mod.
     *<p>
     *It includes all the parts.
     *</p>
     *
     *
     * Enjoy as these "//" walk you through.
     *
     * Use the "//" to walk you through.
     */


    // This is the mod id of the mod called the "better_void".
            // Continue on (Scroll down)
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "better_void";


    public BetterVoidMain() {

        // This is where the items, blocks, sounds and more are registered
        // This is some nonsense that the game uses
        // Continue on
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::setup);

        // Here they are
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        ModSounds.register(eventBus);
        ModBlockEntities.register(eventBus);

        ModEffects.register(eventBus);
        ModMenuTypes.register(eventBus);

        ModPotions.register(eventBus);
        ModRecipes.register(eventBus);



        MinecraftForge.EVENT_BUS.register(this);
    }



    private void setup(final FMLCommonSetupEvent event)
    {
       LOGGER.warn("This mod is currently in Alpha stage");
    }

}

