package net.mammalthebest2.better_void.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class TraumatisedEffect extends MobEffect {
    public TraumatisedEffect(MobEffectCategory p_19451_, int p_19452_) {
        super(p_19451_, p_19452_);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {

        double x = pLivingEntity.getX();
        double y = pLivingEntity.getY();
        double z = pLivingEntity.getZ();

        pLivingEntity.teleportTo(x, y, z);
        pLivingEntity.setDeltaMovement(0, 0, 0);

        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
