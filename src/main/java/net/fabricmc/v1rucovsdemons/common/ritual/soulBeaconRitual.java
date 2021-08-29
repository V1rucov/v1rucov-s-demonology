package net.fabricmc.v1rucovsdemons.common.ritual;

import net.fabricmc.v1rucovsdemons.common.blockEntity.altarEntity;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.collection.DefaultedList;

public class soulBeaconRitual extends ritual{
    public soulBeaconRitual(){
        super();
        components.set(0,new ItemStack(Items.WITHER_SKELETON_SKULL));
        components.set(1,ItemStack.EMPTY);
        components.set(2,ItemStack.EMPTY);
        components.set(3,ItemStack.EMPTY);
        components.set(4,ItemStack.EMPTY);
        components.set(5,ItemStack.EMPTY);
    }

    @Override
    public void Invoke(altarEntity entity) {
        System.out.println("ритуал проведён");

    }

    @Override
    public boolean compareIngredients(DefaultedList<ItemStack> items) {
        if(items.get(0).getItem() == components.get(0).getItem())
            return true;
        return false;
    }
}
