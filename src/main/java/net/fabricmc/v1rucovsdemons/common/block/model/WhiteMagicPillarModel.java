package net.fabricmc.v1rucovsdemons.common.block.model;

import net.minecraft.block.Block;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class WhiteMagicPillarModel {
    public static final VoxelShape bottom_alone_model = VoxelShapes.combineAndSimplify(Block.createCuboidShape(2, 0, 2, 14, 10, 14),
            Block.createCuboidShape(3, 10, 3, 13, 11, 13), BooleanBiFunction.OR);
}
