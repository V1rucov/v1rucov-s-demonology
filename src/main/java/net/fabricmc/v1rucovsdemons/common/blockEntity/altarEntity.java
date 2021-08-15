package net.fabricmc.v1rucovsdemons.common.blockEntity;
import net.fabricmc.v1rucovsdemons.main;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;

public class altarEntity extends BlockEntity {
    private static final int maxBloodPool = 1000;
    public altarEntity(BlockPos pos, BlockState state){
        super(main.ALTAR_ENTITY,pos, state);
    }

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putInt("bloodPool",0);
        return nbt;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        System.out.println(nbt.getInt("bloodPool"));
    }
}
