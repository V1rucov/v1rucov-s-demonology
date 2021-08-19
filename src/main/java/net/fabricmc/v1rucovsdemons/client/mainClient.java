package net.fabricmc.v1rucovsdemons.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.v1rucovsdemons.client.gui.*;
import net.fabricmc.v1rucovsdemons.main;
import net.fabricmc.v1rucovsdemons.common.blockEntity.render.*;

public class mainClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(){
        ScreenRegistry.<altarGuiDescription, altarScreen>register(main.ALTAR_SCREEN,(gui,inventory, title)->new altarScreen(gui,inventory.player,title));
        //BlockEntityRendererRegistry.INSTANCE.register(main.ALTAR_ENTITY, altarEntityRenderer::new);
    }
}
