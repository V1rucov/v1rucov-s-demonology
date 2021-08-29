package net.fabricmc.v1rucovsdemons.common.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

public class ectoplasm extends Item {
    public ectoplasm(){
        super(new Settings().maxCount(16).food(new FoodComponent.Builder().hunger(1).alwaysEdible().build()));
    }

}
