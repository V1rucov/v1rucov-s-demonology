package net.fabricmc.v1rucovsdemons.common.block.model;

import net.minecraft.block.Block;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import java.util.stream.Stream;

public class altarModel  {
    public static final VoxelShape Shape = Stream.of(
            Block.createCuboidShape(2, 0, 2, 14, 2, 14),
            Block.createCuboidShape(1, 12, 1, 15, 14, 15),
            Block.createCuboidShape(0, 11, 0, 4, 15, 4),
            Block.createCuboidShape(0, 11, 12, 4, 15, 16),
            Block.createCuboidShape(12, 11, 12, 16, 15, 16),
            Block.createCuboidShape(12, 11, 0, 16, 15, 4),
            Block.createCuboidShape(13, 15, 1, 15, 16, 3),
            Block.createCuboidShape(13, 15, 13, 15, 16, 15),
            Block.createCuboidShape(1, 15, 13, 3, 16, 15),
            Block.createCuboidShape(1, 15, 1, 3, 16, 3),
            Block.createCuboidShape(6, 1, 6, 10, 12, 10),
            Block.createCuboidShape(5, 2, 5, 11, 3, 11),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(5, 14.1, 2, 11, 14.1, 4), VoxelShapes.combineAndSimplify(Block.createCuboidShape(6, 14.1, 1, 10, 14.1, 2), VoxelShapes.combineAndSimplify(Block.createCuboidShape(6, 12.1, 0.9, 10, 14.1, 0.9), VoxelShapes.combineAndSimplify(Block.createCuboidShape(7, 10.1, 0.9, 9, 12.1, 0.9), VoxelShapes.combineAndSimplify(Block.createCuboidShape(12, 14.1, 5, 14, 14.1, 11), VoxelShapes.combineAndSimplify(Block.createCuboidShape(14, 14.1, 6, 15, 14.1, 10), VoxelShapes.combineAndSimplify(Block.createCuboidShape(15.1, 12.1, 6, 15.1, 14.1, 10), VoxelShapes.combineAndSimplify(Block.createCuboidShape(15, 10.1, 7, 15, 12.1, 9), VoxelShapes.combineAndSimplify(Block.createCuboidShape(2, 14.1, 5, 4, 14.1, 11), VoxelShapes.combineAndSimplify(Block.createCuboidShape(4, 14.1, 4, 12, 14.1, 12), VoxelShapes.combineAndSimplify(Block.createCuboidShape(1, 14.1, 6, 2, 14.1, 10), VoxelShapes.combineAndSimplify(Block.createCuboidShape(0.9, 12.1, 6, 0.9, 14.1, 10), VoxelShapes.combineAndSimplify(Block.createCuboidShape(0.9, 10.1, 7, 0.9, 12.1, 9), VoxelShapes.combineAndSimplify(Block.createCuboidShape(5, 14.1, 12, 11, 14.1, 14), VoxelShapes.combineAndSimplify(Block.createCuboidShape(6, 14.1, 14, 10, 14.1, 15), VoxelShapes.combineAndSimplify(Block.createCuboidShape(6, 12.1, 15.1, 10, 14.1, 15.1), Block.createCuboidShape(7, 10.1, 15, 9, 12.1, 15), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR), BooleanBiFunction.OR)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
}
