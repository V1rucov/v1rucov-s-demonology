package net.fabricmc.v1rucovsdemons.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.fabricmc.v1rucovsdemons.common.blockEntity.*;

public class ghostEntity extends HostileEntity {

    public ghostEntity(EntityType<? extends ghostEntity> entityType, World world){
        super(entityType, world);
    }

    protected final boolean burnsInDaylight = true;

    public static DefaultAttributeContainer.Builder createHostileAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,5d)
                .add(EntityAttributes.GENERIC_MAX_HEALTH,44)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.3);
    }

    @Override
    public void tickMovement() {
        if(this.isAffectedByDaylight()) this.setOnFireFor(8);
        super.tickMovement();
    }
    //get

    @Override
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(3, new WanderAroundGoal(this,0.35));
        this.goalSelector.add(1,new LookAtEntityGoal(this, PlayerEntity.class,5f, 1f));
        this.goalSelector.add(2,new LookAtEntityGoal(this, MobEntity.class,5f, 8f));
        this.goalSelector.add(4,new AvoidSunlightGoal(this));

        this.targetSelector.add(1,new FollowTargetGoal<>(this, AnimalEntity.class,true).setMaxTimeWithoutVisibility(300));
        this.targetSelector.add(2,new FollowTargetGoal<>(this,PlayerEntity.class,true).setMaxTimeWithoutVisibility(300));
        this.targetSelector.add(3,new AttackGoal(this));
    }

    @Override
    public void onDeath(DamageSource source) {
        //world.add
        super.onDeath(source);
    }

    @Override
    protected ActionResult interactMob(PlayerEntity player, Hand hand) {
        return super.interactMob(player, hand);
    }
}
