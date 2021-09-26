package net.fabricmc.v1rucovsdemons.common.statusEffect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.MilkBucketItem;

public class curseStatusEffect extends StatusEffect {
    public curseStatusEffect(){
        super(StatusEffectType.NEUTRAL,1);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        super.applyUpdateEffect(entity, amplifier);
        //StatusEffects.BAD_OMEN
        System.out.println(entity.getPos().toString());
    }
}
