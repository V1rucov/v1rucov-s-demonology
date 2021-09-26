package net.fabricmc.v1rucovsdemons.common.block;

import net.fabricmc.v1rucovsdemons.common.blockEntity.altarEntity;
import net.fabricmc.v1rucovsdemons.common.block.model.altarModel;
import net.fabricmc.v1rucovsdemons.init.*;
import net.fabricmc.v1rucovsdemons.PlayerEntityExt;
import net.fabricmc.v1rucovsdemons.common.ritual.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.block.*;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class altar extends BlockWithEntity implements BlockEntityProvider {
    public altar(Settings settings) {
        super(settings);
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return altarModel.Shape;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state){
        return new altarEntity(pos,state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, blockEntityInit.ALTAR_ENTITY, (world1, pos, state1, be) -> altarEntity.tick(world1,pos,state1,be));
    }

    @Override
    @SuppressWarnings("deprecation")
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(!world.isClient){
            var be = (altarEntity)world.getBlockEntity(pos);
            if(player.getMainHandStack().getItem()== itemInit.OBSIDIAN_KNIFE && !be.IsCraftingMode){
                var Creator = new ritualCreator();
                var ritual = Creator.CreateRitual(be.getItems());

                if(ritual!=null) {
                    if(ritual.CheckConditions(player,be)){
                        be.ritual = ritual;
                        be.player = player;
                        ((PlayerEntityExt)player).addCurseLevel(1);
                        be.sync();
                    }
                }
                return  ActionResult.SUCCESS;
            }
            else if(!player.getMainHandStack().isEmpty() && !be.IsCraftingMode){
                if(be.getItems().get(5).isEmpty()){
                    be.setLastStack(player.getMainHandStack().split(1));
                    be.sync();
                }
                return ActionResult.SUCCESS;
            }
            else if(player.getMainHandStack().isEmpty() && player.isSneaking() && !be.IsCraftingMode){
                var lastStack = be.removeLastStack();
                if (lastStack!=null) player.getInventory().setStack(player.getInventory().selectedSlot,lastStack);
                be.sync();
            }
        }
        return ActionResult.SUCCESS;
    }
}
