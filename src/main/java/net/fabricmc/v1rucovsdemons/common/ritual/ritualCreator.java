package net.fabricmc.v1rucovsdemons.common.ritual;

import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import java.util.ArrayList;

public class ritualCreator {
    public static ArrayList<ritual> rituals = new ArrayList<ritual>();
    public ritual CreateRitual(DefaultedList<ItemStack> items){
        for (var ritual: rituals) {
            if(ritual.compareIngredients(items)){
                return ritual;
            }
        }
        return null;
    }
}