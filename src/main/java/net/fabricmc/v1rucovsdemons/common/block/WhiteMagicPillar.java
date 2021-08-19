package net.fabricmc.v1rucovsdemons.common.block;

import com.google.common.collect.ImmutableMap;
import net.fabricmc.v1rucovsdemons.common.block.model.WhiteMagicPillarModel;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import java.util.function.Function;

public class WhiteMagicPillar extends MagicPillar {
    public WhiteMagicPillar(AbstractBlock.Settings settings){
        super(settings);
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        var Lowerblock = world.getBlockState(pos.add(0,-1,0)).getBlock();
        var Upperblock = world.getBlockState(pos.add(0,1,0)).getBlock();
        if(!(Lowerblock instanceof WhiteMagicPillar)){
            //низ не соед
            int cc = state.get(pillarPosition);
            return WhiteMagicPillarModel.bottom_alone_model;
        }
        else if(Lowerblock instanceof WhiteMagicPillar && Upperblock instanceof WhiteMagicPillar){
            //середина
            return WhiteMagicPillarModel.bottom_alone_model;
        }
        //верх
        else return WhiteMagicPillarModel.bottom_alone_model;
    }

    @Override
    @SuppressWarnings("deprecation")
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
