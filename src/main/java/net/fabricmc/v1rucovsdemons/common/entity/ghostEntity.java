package net.fabricmc.v1rucovsdemons.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ghostEntity extends HostileEntity {

    public ghostEntity(EntityType<? extends ghostEntity> entityType, World world){
        super(entityType, world);
    }
    protected final boolean burnsInDaylight = true;
    public static DefaultAttributeContainer.Builder createHostileAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,5d)
                .add(EntityAttributes.GENERIC_MAX_HEALTH,44);
    }

    @Override
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(1, new WanderAroundGoal(this,0.35));
        this.goalSelector.add(2,new LookAtEntityGoal(this, PlayerEntity.class,5f, 1f));
        this.goalSelector.add(3,new LookAtEntityGoal(this, MobEntity.class,5f, 8f));
        this.goalSelector.add(4,new AvoidSunlightGoal(this));

        this.targetSelector.add(1,new FollowTargetGoal<>(this,PlayerEntity.class,true).setMaxTimeWithoutVisibility(300));
        this.targetSelector.add(2,new AttackGoal(this));

    }
}
