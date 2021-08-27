package net.fabricmc.v1rucovsdemons.init;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.v1rucovsdemons.common.entity.ghostEntity;
import net.fabricmc.v1rucovsdemons.v1ModMain;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class entityInit {
    public static final EntityModelLayer GHOST_LAYER = new EntityModelLayer(new Identifier("v1rucovsdemons","ghost"),"main");
    public static final EntityType<ghostEntity> GHOST_ENTITY;
    static{
        GHOST_ENTITY = Registry.register(Registry.ENTITY_TYPE, new Identifier(v1ModMain.modId,"ghost"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ghostEntity::new)
                .dimensions(EntityDimensions.fixed(0.75f,2.5f)).build());
        FabricDefaultAttributeRegistry.register(GHOST_ENTITY,ghostEntity.createHostileAttributes());
    }
}
