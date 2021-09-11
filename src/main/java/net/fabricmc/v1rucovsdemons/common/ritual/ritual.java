package net.fabricmc.v1rucovsdemons.common.ritual;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.v1rucovsdemons.common.blockEntity.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public abstract class ritual {
    DefaultedList<ItemStack> components = DefaultedList.ofSize(6,ItemStack.EMPTY);
    public abstract DefaultedList<ItemStack> getComponents();
    public abstract ActionResult Invoke(PlayerEntity player,BlockEntity blockEntity);
    public abstract boolean CheckConditions(PlayerEntity player, BlockEntity blockEntity);
}