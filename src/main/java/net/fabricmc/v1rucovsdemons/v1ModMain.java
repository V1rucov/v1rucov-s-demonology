package net.fabricmc.v1rucovsdemons;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.fabricmc.v1rucovsdemons.common.block.*;
import net.fabricmc.v1rucovsdemons.common.item.*;
import net.fabricmc.v1rucovsdemons.common.ritual.*;
import net.fabricmc.v1rucovsdemons.common.blockEntity.altarEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.*;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class v1ModMain implements ModInitializer {
	public static final String modId = "v1rucovsdemons";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(modId,"v1demons"))
			.icon(()->new ItemStack(net.fabricmc.v1rucovsdemons.v1ModMain.OBSIDIAN_KNIFE)).build();

	public static final Identifier ALTAR_IDENTITY = new Identifier(modId,"altar_block");
	public static final Block ALTAR;
	public static final BlockItem ALTAR_ITEM;
	public static final BlockEntityType<altarEntity> ALTAR_ENTITY;

	public static final obsidianKnife OBSIDIAN_KNIFE;

	static{
		//altar
		ALTAR = Registry.register(Registry.BLOCK, ALTAR_IDENTITY,new altar(FabricBlockSettings.of(Material.STONE).breakByHand(true).hardness(0.5f)));
		ALTAR_ITEM = Registry.register(Registry.ITEM, ALTAR_IDENTITY,new BlockItem(ALTAR,new Item.Settings().group(net.fabricmc.v1rucovsdemons.v1ModMain.ITEM_GROUP)));
		ALTAR_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,"v1rucovsdemons:altar_entity",
				FabricBlockEntityTypeBuilder.create(altarEntity::new,ALTAR).build(null));
		// obsidian knife
		OBSIDIAN_KNIFE = Registry.register(Registry.ITEM,new Identifier(modId,"obsidian_knife"),new obsidianKnife());
	}
	@Override
	public void onInitialize() {
		ritual soulBeacon = new soulBeaconRitual();
	}
}
