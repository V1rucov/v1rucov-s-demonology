package net.fabricmc.v1rucovsdemons.common.interfaces;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import org.apache.logging.log4j.core.tools.picocli.CommandLine;

//@FunctionalInterface
public interface IStorable extends Inventory {
    DefaultedList<ItemStack> getItems();

    //static IStorable of(DefaultedList<ItemStack> items) {
    //    return () -> items;
    //}

    //static IStorable ofSize(int size) {
    //    return of(DefaultedList.ofSize(size, ItemStack.EMPTY));
    //}

    @Override
    default int size(){
        return getItems().size();
    }
    @Override
    default  boolean isEmpty(){
        return getItems().isEmpty();
    }
    @Override
    default ItemStack getStack(int slot){
        return getItems().get(slot);
    }
    @Override
    default ItemStack removeStack(int slot, int amount){
        var result = Inventories.splitStack(getItems(),amount,amount);
        if(!result.isEmpty()){
            markDirty();
        }
        return result;
    }
    @Override
    default ItemStack removeStack(int slot){
        return Inventories.removeStack(getItems(),slot);
    }
    @Override
    default void setStack(int slot, ItemStack stack){
        getItems().set(slot,stack);
        if(stack.getCount()>getMaxCountPerStack())
            stack.setCount(getMaxCountPerStack());
    }
    @Override
    default boolean canPlayerUse(PlayerEntity player){
        return true;
    }
    @Override
    default void clear(){
        getItems().clear();
    }
}