package net.fabricmc.v1rucovsdemons.common.ritual;

import net.fabricmc.v1rucovsdemons.common.blockEntity.altarEntity;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.collection.DefaultedList;

public class soulBeaconRitual extends ritual{
    public soulBeaconRitual(){
        super();
        components.add(new ItemStack(Items.WITHER_SKELETON_SKULL));
    }

    @Override
    public void Invoke(altarEntity entity) {
        System.out.println("ритуал проведён");
    }

    @Override
    public boolean compareIngredients(DefaultedList<ItemStack> items) {
        if(items == components)
            return true;
        return false;
    }
}
