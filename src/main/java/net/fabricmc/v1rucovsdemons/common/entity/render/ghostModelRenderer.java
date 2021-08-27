package net.fabricmc.v1rucovsdemons.common.entity.render;

import net.fabricmc.v1rucovsdemons.init.renderInit;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.fabricmc.v1rucovsdemons.common.entity.render.*;
import net.fabricmc.v1rucovsdemons.init.*;
import net.fabricmc.v1rucovsdemons.common.entity.model.*;
import net.fabricmc.v1rucovsdemons.common.entity.*;
import net.minecraft.util.Identifier;

public class ghostModelRenderer extends MobEntityRenderer<ghostEntity, ghostEntityModel> {
    private static final Identifier texture = new Identifier("v1rucovsdemons:textures/entity/ghost.png");
    public ghostModelRenderer(EntityRendererFactory.Context ctx){
        super(ctx,new ghostEntityModel(ctx.getPart(entityInit.GHOST_LAYER)),2f);
    }

    @Override
    public Identifier getTexture(ghostEntity entity) {
        return texture;
    }
}
