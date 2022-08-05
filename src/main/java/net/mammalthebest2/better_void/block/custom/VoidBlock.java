package net.mammalthebest2.better_void.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

/**
 * This is a custom block.
 * <p>Unlike the other blocks that can be placed</p>
 *
 */
public class VoidBlock extends Block{

    public VoidBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if(!pLevel.isClientSide()){
            if (pEntity instanceof LivingEntity){
                LivingEntity livingEntity = ((LivingEntity) pEntity);
                livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100, 200));
            }
        }
    }
    
}
