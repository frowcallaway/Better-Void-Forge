package net.mammalthebest2.better_void.world.gen;

import net.mammalthebest2.better_void.world.feature.ModPlacedFeature;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(ModPlacedFeature.VOID_ORE_PLACED);

        if (event.getCategory() == Biome.BiomeCategory.THEEND){
            base.add(ModPlacedFeature.END_VOID_ORE_PLACED);
        }

        if (event.getCategory() == Biome.BiomeCategory.NETHER){
            base.add(ModPlacedFeature.NETHER_VOID_ORE_PLACED);
        }
    }
}

