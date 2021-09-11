package net.fabricmc.v1rucovsdemons.common.ritual;

import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import java.util.ArrayList;

public class ritualCreator {
    public static ArrayList<ritual> rituals = new ArrayList<ritual>();
    public ritual CreateRitual(DefaultedList<ItemStack> items){
        for (var ritual: rituals) {
            if(compareIngredients(items, ritual.getComponents())){
                return ritual;
            }
        }
        return null;
    }
    public boolean compareIngredients(DefaultedList<ItemStack> items, DefaultedList<ItemStack> components) {
        boolean equals = true;
        for (int i =0; i<6;i++) {
            if(items.get(i).getItem() == components.get(i).getItem()) continue;
            else {
                equals = false;
                break;
            }
        }
        return equals;
    }
}