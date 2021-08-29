package net.fabricmc.v1rucovsdemons.common.blockEntity;
import net.fabricmc.fabric.api.block.entity.BlockEntityClientSerializable;
import net.fabricmc.v1rucovsdemons.common.interfaces.IStorable;
import net.fabricmc.v1rucovsdemons.v1ModMain;
import net.fabricmc.v1rucovsdemons.init.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.nbt.NbtType;
import net.minecraft.nbt.visitor.NbtElementVisitor;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.io.DataOutput;
import java.io.IOException;

public class altarEntity extends BlockEntity implements IStorable, BlockEntityClientSerializable {
    DefaultedList<ItemStack> items = DefaultedList.ofSize(6,ItemStack.EMPTY);
    public boolean IsCraftingMode = false;

    public altarEntity(BlockPos pos, BlockState state){
        super(blockEntityInit.ALTAR_ENTITY,pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getItems(){
        return items;
    }

    public void setLastStack(ItemStack stack){
        for(int i =0;i<6;i++){
            if(!getItems().get(i).isEmpty()) continue;
            else {
                getItems().set(i,stack);
                return;
            }
        }
    }

    public ItemStack removeLastStack(){
        for(int i =5;i>=0;i--){
            if(!getItems().get(i).isEmpty()) {
                var toReturn = getItems().get(i).copy();
                getItems().set(i,ItemStack.EMPTY);
                //sync();
                return toReturn;
            }
            else continue;
        }
        return null;
    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return pos.isWithinDistance(player.getPos(),4.5);
    }

    @Override
    public void fromClientTag(NbtCompound tag) {
        super.readNbt(tag);
        var list = DefaultedList.ofSize(6,ItemStack.EMPTY);
        Inventories.readNbt(tag,list);
        for (int i=0;i<6;i++)
            setStack(i,list.get(i));
    }

    @Override
    public NbtCompound toClientTag(NbtCompound tag) {
        Inventories.writeNbt(tag,getItems());
        super.writeNbt(tag);
        sync();
        return tag;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
    }

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        nbt.putBoolean("IsCraftingMode",IsCraftingMode);
        Inventories.writeNbt(nbt,items);
        return super.writeNbt(nbt);
    }

    public static void tick(World world, BlockPos pos, BlockState state, altarEntity entity){

    }
}
