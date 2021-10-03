package net.fabricmc.v1rucovsdemons.common.ritual;

import net.fabricmc.v1rucovsdemons.common.ritual.*;
import net.fabricmc.v1rucovsdemons.init.*;
import net.fabricmc.v1rucovsdemons.common.blockEntity.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.particle.RedDustParticle;
import net.minecraft.client.particle.WhiteAshParticle;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.Vec3f;

public class boneOfEthernalThirstRitual extends ritual{
    public boneOfEthernalThirstRitual(){
        ritualCreator.rituals.add(this);
        components.set(0,new ItemStack(Items.BONE));
        components.set(1,new ItemStack(Items.BONE));
        components.set(2,new ItemStack(Items.BONE));
        components.set(3,new ItemStack(Items.BONE));
        components.set(4,new ItemStack(Items.BONE));
        components.set(5,new ItemStack(Items.BONE));
    }
    @Override
    public DefaultedList<ItemStack> getComponents() {
        return components;
    }

    @Override
    public ActionResult Invoke(PlayerEntity player, BlockEntity blockEntity) {
        var be = (altarEntity) blockEntity;
        var world = blockEntity.getWorld();
        if(world.getTimeOfDay() >= 11000 && world.getTimeOfDay() <= 24000) {
            MinecraftClient.getInstance().particleManager.addParticle(ParticleTypes.ELECTRIC_SPARK,
                    be.getPos().getX()+0.5 ,be.getPos().getY()+1 ,be.getPos().getZ()+0.5,0,0,0);
        }
        else{
            player.sendMessage(new LiteralText("Ritual ended."),true);
            be.ritual = null;
            be.IsCraftingMode = false;
            be.getItems().clear();
            be.sync();
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public boolean CheckConditions(PlayerEntity player, BlockEntity blockEntity) {
        if(blockEntity.getWorld().getTimeOfDay() >= 11000 && blockEntity.getWorld().getTimeOfDay() <= 13000){
            var be = (altarEntity)blockEntity;
            be.IsCraftingMode = true;
            return true;
        }
        else {
            player.sendMessage(new LiteralText("This ritual must be started only at sunset."), true);
            return false;
        }
    }
}
