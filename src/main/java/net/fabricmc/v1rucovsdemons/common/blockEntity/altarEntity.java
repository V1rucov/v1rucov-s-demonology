package net.fabricmc.v1rucovsdemons.common.blockEntity;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.fabricmc.v1rucovsdemons.common.interfaces.IStorable;
import net.fabricmc.v1rucovsdemons.v1ModMain;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.gui.screen.ingame.ScreenHandlerProvider;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class altarEntity extends BlockEntity implements IStorable {
    DefaultedList<ItemStack> items = DefaultedList.ofSize(6,ItemStack.EMPTY);
    private boolean IsCraftingMode = false;
    public boolean getBuiltStatus(){
        return IsCraftingMode;
    }

    public altarEntity(BlockPos pos, BlockState state){
        super(v1ModMain.ALTAR_ENTITY,pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getItems(){
        return items;
    }

    public void setLastStack(ItemStack stack){
        int lastIndex = 0;
        for (int i=0; i<6;i++) {
            if(!items.get(i).isEmpty()) lastIndex++;
            else break;
        }
        if(lastIndex<6) items.add(lastIndex,stack);
    }
    public ItemStack removeLastStack(){
        return null;
    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return pos.isWithinDistance(player.getPos(),4.5);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt,items);
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
