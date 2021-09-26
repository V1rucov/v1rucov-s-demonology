package net.fabricmc.v1rucovsdemons.common.ritual;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.v1rucovsdemons.common.entity.*;
import net.fabricmc.v1rucovsdemons.common.blockEntity.altarEntity;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.Random;

public class soulBeaconRitual extends ritual {
    public soulBeaconRitual(){
        ritualCreator.rituals.add(this);

        components.set(0,new ItemStack(Items.WITHER_SKELETON_SKULL));
        components.set(1,new ItemStack(Items.ROTTEN_FLESH));
        components.set(2,new ItemStack(Items.ROTTEN_FLESH));
        components.set(3,new ItemStack(Items.ROTTEN_FLESH));
        components.set(4,new ItemStack(Items.BONE));
        components.set(5,new ItemStack(Items.BONE));
    }

    @Override
    public DefaultedList<ItemStack> getComponents() {
        return components;
    }

    @Override
    public boolean CheckConditions(PlayerEntity player, BlockEntity blockEntity) {
        var be = (altarEntity)blockEntity;
        var world = be.getWorld();

        if(world.getTimeOfDay()>=12000 && world.getTimeOfDay()<=24000){
            player.sendMessage(new LiteralText("Soul beacon ritual started."),true);
            be.IsCraftingMode = true;
            System.out.println("ночь");
            return true;
        }
        player.sendMessage(new LiteralText("This ritual requires night time."),true);
        return  false;
    }

    @Override
    public ActionResult Invoke(PlayerEntity player, BlockEntity blockEntity) {
        var be = (altarEntity)blockEntity;
        var world = be.getWorld();

        if(world.getTimeOfDay()>=12000 && world.getTimeOfDay()<=24000){
            var ghosts = world.getNonSpectatingEntities(ghostEntity.class, new Box(400,200,400,1,1,1));
            for (var ghost : ghosts) {
                ghost.setTarget(player);
            }
        }
        else {
            player.sendMessage(new LiteralText("Ritual ended."),true);
            be.ritual = null;
            be.IsCraftingMode = false;
            be.getItems().clear();
            be.sync();
        }
        return ActionResult.SUCCESS;
    }
}
