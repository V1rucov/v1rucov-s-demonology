package net.fabricmc.v1rucovsdemons.common.ritual;

import net.fabricmc.v1rucovsdemons.common.blockEntity.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;

public abstract class ritual {
    DefaultedList<ItemStack> components;
    public ritual(){
        components = DefaultedList.ofSize(6,ItemStack.EMPTY);
        ritualCreator.rituals.add(this);
    }
    public abstract void Invoke(altarEntity entity);
    public abstract  boolean compareIngredients(DefaultedList<ItemStack> items);
}
