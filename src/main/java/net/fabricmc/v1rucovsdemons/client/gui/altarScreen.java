package net.fabricmc.v1rucovsdemons.client.gui;

import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;

public class altarScreen extends CottonInventoryScreen<altarGuiDescription> {
    public altarScreen(altarGuiDescription gui, PlayerEntity player, Text file){
        super(gui,player,file);
    }
}
