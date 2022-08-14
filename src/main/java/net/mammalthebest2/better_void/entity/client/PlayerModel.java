package net.mammalthebest2.better_void.entity.client;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.mammalthebest2.better_void.entity.custom.PlayerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PlayerModel extends AnimatedGeoModel<PlayerEntity> {
    @Override
    public ResourceLocation getModelLocation(PlayerEntity object) {
        return new ResourceLocation(BetterVoidMain.MOD_ID, "geo/player.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(PlayerEntity object) {
        return new ResourceLocation(BetterVoidMain.MOD_ID, "textures/entity/face.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(PlayerEntity animatable) {
        return new ResourceLocation(BetterVoidMain.MOD_ID, "animations/player.animation.json");
    }
}
