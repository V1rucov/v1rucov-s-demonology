package net.fabricmc.v1rucovsdemons.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.v1rucovsdemons.common.block.altar;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class blockInit {
    public static final Block ALTAR;
    static{
        ALTAR = Registry.register(Registry.BLOCK, modIdentitys.ALTAR_IDENTITY ,new altar(FabricBlockSettings.of(Material.STONE).breakByHand(true).hardness(0.5f)));
    }
}
