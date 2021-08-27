package net.fabricmc.v1rucovsdemons;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.v1rucovsdemons.common.ritual.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.v1rucovsdemons.init.blockInit;
import net.fabricmc.v1rucovsdemons.init.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;

public class v1ModMain implements ModInitializer {
	public static final String modId = "v1rucovsdemons";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(modId,"v1demons"))
			.icon(()->new ItemStack(itemInit.OBSIDIAN_KNIFE)).build();
	static{
		itemInit II = new itemInit();
		//renderInit RI = new renderInit();
		blockInit BI = new blockInit();
		blockEntityInit BEI = new blockEntityInit();
		entityInit EI = new entityInit();
	}
	@Override
	public void onInitialize() {
		//rituals
		ritual soulBeacon = new soulBeaconRitual();
	}
}
