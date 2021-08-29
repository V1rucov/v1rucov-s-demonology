package net.fabricmc.v1rucovsdemons.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.v1rucovsdemons.common.item.*;
import net.fabricmc.v1rucovsdemons.v1ModMain;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class itemInit {
    public static final obsidianKnife OBSIDIAN_KNIFE;
    public static final BlockItem ALTAR_ITEM;
    public static final ectoplasm ECTOPLASM;
    static{
        OBSIDIAN_KNIFE = Registry.register(Registry.ITEM,new Identifier(v1ModMain.modId,"obsidian_knife"),new obsidianKnife());
        ALTAR_ITEM = Registry.register(Registry.ITEM, modIdentitys.ALTAR_IDENTITY,new BlockItem(blockInit.ALTAR,new Item.Settings().group(net.fabricmc.v1rucovsdemons.v1ModMain.ITEM_GROUP)));
        ECTOPLASM = Registry.register(Registry.ITEM, new Identifier(v1ModMain.modId,"ectoplasm"),new ectoplasm());
    }
}
