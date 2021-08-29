package net.fabricmc.v1rucovsdemons.common.ritual;

import net.fabricmc.v1rucovsdemons.common.blockEntity.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public abstract class ritual {
    DefaultedList<ItemStack> components;
    World world;
    BlockEntity entity;
    PlayerEntity player;
    public ritual(){
        components = DefaultedList.ofSize(6,ItemStack.EMPTY);
        ritualCreator.rituals.add(this);
    }
    public abstract void Invoke(altarEntity entity, PlayerEntity player);
    public abstract  boolean compareIngredients(DefaultedList<ItemStack> items);
}
