package net.fabricmc.v1rucovsdemons.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.v1rucovsdemons.client.gui.*;
import net.fabricmc.v1rucovsdemons.common.blockEntity.render.*;
import net.fabricmc.v1rucovsdemons.common.blockEntity.*;
import net.fabricmc.v1rucovsdemons.v1ModMain;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;

public class v1ModMainClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(){

        BlockEntityRendererRegistry.INSTANCE.register(net.fabricmc.v1rucovsdemons.v1ModMain.ALTAR_ENTITY, new BlockEntityRendererFactory<altarEntity>() {
            @Override
            public BlockEntityRenderer<altarEntity> create(Context ctx) {
                return new altarEntityRenderer(ctx.getRenderDispatcher());
            }
        });
    }
}
