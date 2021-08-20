package net.fabricmc.v1rucovsdemons.common.item;

import net.fabricmc.v1rucovsdemons.common.item.material.obsidianToolMaterial;
import net.fabricmc.v1rucovsdemons.v1ModMain;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.SwordItem;

public class obsidianKnife extends SwordItem implements ItemConvertible {
    public obsidianKnife(){
        super(new obsidianToolMaterial(),2,0.8f,new Settings().maxDamage(1024).group(v1ModMain.ITEM_GROUP));
    }
}
