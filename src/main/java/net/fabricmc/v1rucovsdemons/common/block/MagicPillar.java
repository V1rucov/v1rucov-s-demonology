package net.fabricmc.v1rucovsdemons.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class MagicPillar extends Block {
    public static final IntProperty pillarPosition = IntProperty.of("pillarPosition",0,2);
    public MagicPillar(Settings settings){
        super(settings);
        setDefaultState(this.getStateManager().getDefaultState().with(pillarPosition,1));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(pillarPosition);
    }
}
