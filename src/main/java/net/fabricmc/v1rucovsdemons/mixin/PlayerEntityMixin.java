package net.fabricmc.v1rucovsdemons.mixin;

import net.fabricmc.v1rucovsdemons.PlayerEntityExt;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraft.nbt.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity implements PlayerEntityExt {

    protected PlayerEntityMixin(EntityType<? extends LivingEntity> type, World world){
        super(type,world);
    }
    private int curseLevel;

    public int getCurseLevel(){
        return this.curseLevel;
    }

    public void addCurseLevel(int level){
        this.curseLevel+=level;
    }

    @Override
    public void setCurseLevel(int level) {
        this.curseLevel = level;
    }

    @Inject(method = "writeCustomDataToNbt", at = @At("RETURN"))
    public void writeCustomDataToNbt(NbtCompound nbt, CallbackInfo ci){
        nbt.putInt("curseLevel",this.curseLevel);
        System.out.println(this.curseLevel);
    }

    @Inject(method = "readCustomDataFromNbt", at = @At("RETURN"))
    public void readCustomDataFromNbt(NbtCompound nbt, CallbackInfo ci){
        this.curseLevel = nbt.getInt("curseLevel");
        System.out.println(this.curseLevel);
    }
}
