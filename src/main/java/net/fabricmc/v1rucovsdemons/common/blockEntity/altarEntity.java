package net.fabricmc.v1rucovsdemons.common.blockEntity;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.fabricmc.v1rucovsdemons.client.gui.altarGuiDescription;
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

public class altarEntity extends BlockEntity implements NamedScreenHandlerFactory, IStorable {
    public DefaultedList<ItemStack> items = DefaultedList.ofSize(1,ItemStack.EMPTY);
    private boolean IsBuilt = false;
    public boolean getBuiltStatus(){
        return IsBuilt;
    }

    public altarEntity(BlockPos pos, BlockState state){
        super(v1ModMain.ALTAR_ENTITY,pos, state);
    }

    @Override
    public DefaultedList<ItemStack> getItems(){
        return items;
    }

    @Override
    public boolean canPlayerUse(PlayerEntity player) {
        return pos.isWithinDistance(player.getPos(),4.5);
    }

    @Override
    public Text getDisplayName(){
        return new TranslatableText(getCachedState().getBlock().getTranslationKey());
    }

    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inventory, PlayerEntity player){
        return new altarGuiDescription(syncId, inventory, ScreenHandlerContext.create(world, pos));
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt,items);
    }

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        nbt.putBoolean("IsBuilt",IsBuilt);
        Inventories.writeNbt(nbt,items);
        return super.writeNbt(nbt);
    }

    public static void tick(World world, BlockPos pos, BlockState state, altarEntity entity){
        //var blockUnder = world.getBlockState(pos.add(0,-1,0)).getBlock();
        System.out.println(entity.items.get(0).getName());
        if(entity.items.get(0) == new ItemStack(v1ModMain.OBSIDIAN_KNIFE)){
            entity.IsBuilt = true;
        }
        else entity.IsBuilt = false;
    }
}
