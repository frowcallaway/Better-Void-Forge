package net.mammalthebest2.better_void.world;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.mammalthebest2.better_void.world.gen.ModOreGeneration;
import net.mammalthebest2.better_void.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BetterVoidMain.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        ModOreGeneration.generateOres(event);
        ModTreeGeneration.generateTrees(event);
    }
}
