package net.fabricmc.v1rucovsdemons.common.blockEntity.render;
import net.fabricmc.v1rucovsdemons.common.blockEntity.*;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;

public class altarEntityRenderer implements BlockEntityRenderer<altarEntity> {
    private ItemStack toRender;
    public altarEntityRenderer(BlockEntityRenderDispatcher dispatcher){
        //super(dispatcher);
    }

    @Override
    public void render(altarEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {

    }
}
