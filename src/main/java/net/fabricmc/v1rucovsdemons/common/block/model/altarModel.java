package net.fabricmc.v1rucovsdemons.common.block.model;

import net.minecraft.block.Block;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import java.util.stream.Stream;

public class altarModel  {
    public static final VoxelShape ShapeNorth = Stream.of(
            Block.createCuboidShape(2, 0, 2, 14, 2, 14),
            Block.createCuboidShape(6, 14, 2, 9, 15, 5),
            Block.createCuboidShape(7, 15, 3, 8, 18, 4),
            Block.createCuboidShape(5, 18, 1, 10, 21, 6),
            Block.createCuboidShape(5, 21, 6, 10, 22, 7),
            Block.createCuboidShape(5, 21, 0, 10, 22, 1),
            Block.createCuboidShape(10, 21, 0, 11, 22, 7),
            Block.createCuboidShape(4, 21, 0, 5, 22, 7),
            Block.createCuboidShape(2.6999999999999993, 14.100000000000001, 7.699999999999999, 8.700000000000001, 14.100000000000001, 15.7),
            Block.createCuboidShape(11.2, 14, 10.6, 13.2, 20, 12.600000000000001),
            Block.createCuboidShape(11.700000000000001, 19.6, 11.699999999999998, 12.700000000000001, 20.6, 11.699999999999998),
            Block.createCuboidShape(12.200000000000001, 19.6, 11.199999999999998, 12.200000000000001, 20.6, 12.199999999999998),
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
            Block.createCuboidShape(5, 2, 5, 11, 3, 11)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape ShapeEast = Stream.of(
            Block.createCuboidShape(2, 0, 2, 14, 2, 14),
            Block.createCuboidShape(11, 14, 6, 14, 15, 9),
            Block.createCuboidShape(12, 15, 7, 13, 18, 8),
            Block.createCuboidShape(10, 18, 5, 15, 21, 10),
            Block.createCuboidShape(9, 21, 5, 10, 22, 10),
            Block.createCuboidShape(15, 21, 5, 16, 22, 10),
            Block.createCuboidShape(9, 21, 10, 16, 22, 11),
            Block.createCuboidShape(9, 21, 4, 16, 22, 5),
            Block.createCuboidShape(0.3000000000000007, 14.100000000000001, 2.6999999999999993, 8.3, 14.100000000000001, 8.700000000000001),
            Block.createCuboidShape(3.3999999999999986, 14, 11.2, 5.4, 20, 13.2),
            Block.createCuboidShape(4.3000000000000025, 19.6, 11.700000000000001, 4.3000000000000025, 20.6, 12.700000000000001),
            Block.createCuboidShape(3.8000000000000025, 19.6, 12.200000000000001, 4.8000000000000025, 20.6, 12.200000000000001),
            Block.createCuboidShape(1, 12, 1, 15, 14, 15),
            Block.createCuboidShape(12, 11, 0, 16, 15, 4),
            Block.createCuboidShape(0, 11, 0, 4, 15, 4),
            Block.createCuboidShape(0, 11, 12, 4, 15, 16),
            Block.createCuboidShape(12, 11, 12, 16, 15, 16),
            Block.createCuboidShape(13, 15, 13, 15, 16, 15),
            Block.createCuboidShape(1, 15, 13, 3, 16, 15),
            Block.createCuboidShape(1, 15, 1, 3, 16, 3),
            Block.createCuboidShape(13, 15, 1, 15, 16, 3),
            Block.createCuboidShape(6, 1, 6, 10, 12, 10),
            Block.createCuboidShape(5, 2, 5, 11, 3, 11)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape ShapeWest = Stream.of(
            Block.createCuboidShape(2, 0, 2, 14, 2, 14),
            Block.createCuboidShape(2, 14, 7, 5, 15, 10),
            Block.createCuboidShape(3, 15, 8, 4, 18, 9),
            Block.createCuboidShape(1, 18, 6, 6, 21, 11),
            Block.createCuboidShape(6, 21, 6, 7, 22, 11),
            Block.createCuboidShape(0, 21, 6, 1, 22, 11),
            Block.createCuboidShape(0, 21, 5, 7, 22, 6),
            Block.createCuboidShape(0, 21, 11, 7, 22, 12),
            Block.createCuboidShape(7.699999999999999, 14.100000000000001, 7.299999999999999, 15.7, 14.100000000000001, 13.3),
            Block.createCuboidShape(10.6, 14, 2.8000000000000007, 12.600000000000001, 20, 4.800000000000001),
            Block.createCuboidShape(11.699999999999998, 19.6, 3.299999999999999, 11.699999999999998, 20.6, 4.299999999999999),
            Block.createCuboidShape(11.199999999999998, 19.6, 3.799999999999999, 12.199999999999998, 20.6, 3.799999999999999),
            Block.createCuboidShape(1, 12, 1, 15, 14, 15),
            Block.createCuboidShape(0, 11, 12, 4, 15, 16),
            Block.createCuboidShape(12, 11, 12, 16, 15, 16),
            Block.createCuboidShape(12, 11, 0, 16, 15, 4),
            Block.createCuboidShape(0, 11, 0, 4, 15, 4),
            Block.createCuboidShape(1, 15, 1, 3, 16, 3),
            Block.createCuboidShape(13, 15, 1, 15, 16, 3),
            Block.createCuboidShape(13, 15, 13, 15, 16, 15),
            Block.createCuboidShape(1, 15, 13, 3, 16, 15),
            Block.createCuboidShape(6, 1, 6, 10, 12, 10),
            Block.createCuboidShape(5, 2, 5, 11, 3, 11)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public static final VoxelShape ShapeSouth = Stream.of(
            Block.createCuboidShape(2, 0, 2, 14, 2, 14),
            Block.createCuboidShape(7, 14, 11, 10, 15, 14),
            Block.createCuboidShape(8, 15, 12, 9, 18, 13),
            Block.createCuboidShape(6, 18, 10, 11, 21, 15),
            Block.createCuboidShape(6, 21, 9, 11, 22, 10),
            Block.createCuboidShape(6, 21, 15, 11, 22, 16),
            Block.createCuboidShape(5, 21, 9, 6, 22, 16),
            Block.createCuboidShape(11, 21, 9, 12, 22, 16),
            Block.createCuboidShape(7.299999999999999, 14.100000000000001, 0.3000000000000007, 13.3, 14.100000000000001, 8.3),
            Block.createCuboidShape(2.8000000000000007, 14, 3.3999999999999986, 4.800000000000001, 20, 5.4),
            Block.createCuboidShape(3.299999999999999, 19.6, 4.3000000000000025, 4.299999999999999, 20.6, 4.3000000000000025),
            Block.createCuboidShape(3.799999999999999, 19.6, 3.8000000000000025, 3.799999999999999, 20.6, 4.8000000000000025),
            Block.createCuboidShape(1, 12, 1, 15, 14, 15),
            Block.createCuboidShape(12, 11, 12, 16, 15, 16),
            Block.createCuboidShape(12, 11, 0, 16, 15, 4),
            Block.createCuboidShape(0, 11, 0, 4, 15, 4),
            Block.createCuboidShape(0, 11, 12, 4, 15, 16),
            Block.createCuboidShape(1, 15, 13, 3, 16, 15),
            Block.createCuboidShape(1, 15, 1, 3, 16, 3),
            Block.createCuboidShape(13, 15, 1, 15, 16, 3),
            Block.createCuboidShape(13, 15, 13, 15, 16, 15),
            Block.createCuboidShape(6, 1, 6, 10, 12, 10),
            Block.createCuboidShape(5, 2, 5, 11, 3, 11)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
}
