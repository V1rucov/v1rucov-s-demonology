package net.fabricmc.v1rucovsdemons;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.v1rucovsdemons.common.block.altar;
import net.fabricmc.v1rucovsdemons.common.blockEntity.altarEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class main implements ModInitializer {
	public static final String modId = "v1rucovsdemons";
	public static final Identifier ALTAR_IDENTITY = new Identifier(modId,"altar_block");
	public static final Block ALTAR;
	public static final BlockItem ALTAR_ITEM;
	public static final BlockEntityType<altarEntity> ALTAR_ENTITY;

	static{
		ALTAR = Registry.register(Registry.BLOCK, ALTAR_IDENTITY,new altar(FabricBlockSettings.of(Material.STONE)));
		ALTAR_ITEM = Registry.register(Registry.ITEM, ALTAR_IDENTITY,new BlockItem(ALTAR,new Item.Settings().group(ItemGroup.MISC)));
		ALTAR_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,"v1rucovsdemons:altar_entity",
				FabricBlockEntityTypeBuilder.create(altarEntity::new,ALTAR).build(null));
	}
	@Override
	public void onInitialize() {

	}
}
