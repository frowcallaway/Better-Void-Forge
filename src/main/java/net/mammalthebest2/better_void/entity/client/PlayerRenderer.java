package net.mammalthebest2.better_void.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mammalthebest2.better_void.BetterVoidMain;
import net.mammalthebest2.better_void.entity.custom.PlayerEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PlayerRenderer extends GeoEntityRenderer<PlayerEntity> {
    public PlayerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PlayerModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(PlayerEntity instance) {
        return new ResourceLocation(BetterVoidMain.MOD_ID, "textures/entity/player.png");
    }

    @Override
    public RenderType getRenderType(PlayerEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1, 1, 1);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
