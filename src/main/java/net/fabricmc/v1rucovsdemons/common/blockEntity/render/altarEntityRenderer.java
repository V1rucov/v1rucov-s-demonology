package net.fabricmc.v1rucovsdemons.common.blockEntity.render;
import net.fabricmc.v1rucovsdemons.common.blockEntity.*;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class altarEntityRenderer implements BlockEntityRenderer<altarEntity> {
    private BlockEntityRenderDispatcher dispatcher;

    public altarEntityRenderer(BlockEntityRenderDispatcher dispatcher){
        this.dispatcher = dispatcher;
    }

    @Override
    public void render(altarEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if(entity.getBuiltStatus()){
            //matrices.push();
            //matrices.translate(0.5, 1.25, 0.5);
            //MinecraftClient.getInstance().getItemRenderer().renderItem(new ItemStack(Items.BEACON), ModelTransformation.Mode.GROUND, light, overlay, matrices, vertexConsumers, 1);
            //matrices.pop();
        }
    }
}
