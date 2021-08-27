package net.fabricmc.v1rucovsdemons.init;
import net.fabricmc.v1rucovsdemons.init.*;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.v1rucovsdemons.common.blockEntity.altarEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;

public class blockEntityInit {
    public static final BlockEntityType<altarEntity> ALTAR_ENTITY;
    static {
        ALTAR_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,"v1rucovsdemons:altar_entity",
                FabricBlockEntityTypeBuilder.create(altarEntity::new,blockInit.ALTAR).build(null));
    }
}
