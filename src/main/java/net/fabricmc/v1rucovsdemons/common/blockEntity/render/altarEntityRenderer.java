package net.fabricmc.v1rucovsdemons.common.blockEntity.render;
import net.fabricmc.v1rucovsdemons.common.blockEntity.*;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.Vector2f;
import net.minecraft.client.util.math.Vector3d;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.Quaternion;
import net.minecraft.util.math.Vector4f;

public class altarEntityRenderer implements BlockEntityRenderer<altarEntity> {
    private final BlockEntityRenderDispatcher dispatcher;

    public altarEntityRenderer(BlockEntityRenderDispatcher dispatcher){
        this.dispatcher = dispatcher;
    }

    @Override
    public void render(altarEntity entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.push();

        double offset = (Math.sin((entity.getWorld().getTime()+tickDelta)/8))/8;

        matrices.translate(0.5, 1.5+offset, 0.5);
        MinecraftClient.getInstance().getItemRenderer().renderItem(entity.getItems().get(0), ModelTransformation.Mode.GROUND,
                light, overlay, matrices, vertexConsumers, 1);
        matrices.pop();

        double deg = 72;
        double rad = deg * Math.PI / 180F;
        for (int i =1;i<6;i++) {
            matrices.push();
            double x = Math.sin(rad*i)+0.5;
            double z = Math.cos(rad*i)+0.5;
            matrices.translate(x,1+offset,z);
            MinecraftClient.getInstance().getItemRenderer().renderItem(entity.getItems().get(i), ModelTransformation.Mode.GROUND,
                    light, overlay, matrices, vertexConsumers, 1);
            matrices.pop();
        }
    }
}