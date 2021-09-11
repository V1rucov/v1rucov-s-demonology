package net.fabricmc.v1rucovsdemons.init;

import net.fabricmc.v1rucovsdemons.common.ritual.*;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;

public class eventInit {
    static {
        /*soulBeaconRitualEvent.EVENT.register(((player, entity) -> {
            var world = entity.getWorld();
            if(world.getTimeOfDay()>=12000 && world.getTimeOfDay()<=24000){
                player.sendMessage(new LiteralText("Soul beacon ritual started."),true);
                entity.IsCraftingMode = true;
                while(world.getTimeOfDay()<=24000){
                    System.out.println("ночь");
                }
                player.sendMessage(new LiteralText("Ritual ended."),true);
                entity.getItems().clear();
                entity.IsCraftingMode = false;
            }
            else player.sendMessage(new LiteralText("This ritual requires night time."),true);
            return ActionResult.SUCCESS;
        }));
        */
    }
}
