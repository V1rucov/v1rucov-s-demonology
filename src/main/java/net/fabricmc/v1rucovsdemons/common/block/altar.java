package net.fabricmc.v1rucovsdemons.common.block;

import net.fabricmc.v1rucovsdemons.common.blockEntity.altarEntity;
import net.fabricmc.v1rucovsdemons.common.block.model.altarModel;
import net.fabricmc.v1rucovsdemons.common.interfaces.IStorable;
import net.fabricmc.v1rucovsdemons.init.*;
import net.fabricmc.v1rucovsdemons.v1ModMain;
import net.fabricmc.v1rucovsdemons.common.ritual.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.block.*;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class altar extends BlockWithEntity implements BlockEntityProvider {
    public altar(Settings settings) {
        super(settings);
        //setDefaultState(this.getStateManager().getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        //builder.add(Properties.HORIZONTAL_FACING);
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
            if(player.getMainHandStack().getItem()== itemInit.OBSIDIAN_KNIFE){
                var Creator = new ritualCreator();
                var ritual = Creator.CreateRitual(be.getItems());
                /*
                 *  логика для ритуалов: проклятия, урон за ритуал и прочая хрень.
                 */
                if(ritual!=null) ritual.Invoke(be);
                be.sync();
                return  ActionResult.SUCCESS;
            }
            else if(!player.getMainHandStack().isEmpty()){
                if(be.getItems().get(5).isEmpty()){
                    be.setLastStack(player.getMainHandStack().split(1));
                    player.getMainHandStack().setCount(player.getMainHandStack().getCount()-1);
                    be.sync();
                }
                return ActionResult.SUCCESS;
            }
            else if(player.getMainHandStack().isEmpty() && player.isSneaking()){
                var lastStack = be.removeLastStack();
                if (lastStack!=null) player.getInventory().setStack(player.getInventory().selectedSlot,lastStack);
                be.sync();
            }
        }
        return ActionResult.SUCCESS;
    }
}
