package net.fabricmc.v1rucovsdemons.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.v1rucovsdemons.common.blockEntity.render.*;
import net.fabricmc.v1rucovsdemons.common.blockEntity.*;
import net.fabricmc.v1rucovsdemons.common.entity.model.ghostEntityModel;
import net.fabricmc.v1rucovsdemons.common.entity.render.ghostModelRenderer;
import net.fabricmc.v1rucovsdemons.init.*;
import net.fabricmc.v1rucovsdemons.init.renderInit;
import net.fabricmc.v1rucovsdemons.v1ModMain;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;

@Environment(EnvType.CLIENT)
public class v1ModMainClient implements ClientModInitializer {

    @Override
    public void onInitializeClient(){
        EntityRendererRegistry.INSTANCE.register(entityInit.GHOST_ENTITY,(context)-> new ghostModelRenderer(context));
        EntityModelLayerRegistry.registerModelLayer(entityInit.GHOST_LAYER, ghostEntityModel::getTexturedModelData);

        BlockEntityRendererRegistry.INSTANCE.register(blockEntityInit.ALTAR_ENTITY, new BlockEntityRendererFactory<altarEntity>() {
            @Override
            public BlockEntityRenderer<altarEntity> create(Context ctx) {
                return new altarEntityRenderer(ctx.getRenderDispatcher());
            }
        });

        renderInit RI = new renderInit();
        entityInit EI = new entityInit();
    }
}
