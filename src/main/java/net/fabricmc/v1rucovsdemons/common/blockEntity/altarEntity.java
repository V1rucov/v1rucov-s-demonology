package net.fabricmc.v1rucovsdemons.common.blockEntity;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.fabricmc.v1rucovsdemons.client.gui.altarGuiDescription;
import net.fabricmc.v1rucovsdemons.common.interfaces.IStorable;
import net.fabricmc.v1rucovsdemons.main;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.text.Texts;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.w3c.dom.*;

public class altarEntity extends BlockEntity implements NamedScreenHandlerFactory, IStorable {
    private DefaultedList<ItemStack> items = DefaultedList.ofSize(8,ItemStack.EMPTY);
    private int level;

    public altarEntity(BlockPos pos, BlockState state){
        super(main.ALTAR_ENTITY,pos, state);
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
    public NbtCompound writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putInt("altarLevel",level);
        Inventories.writeNbt(nbt,items);
        return nbt;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt,items);
    }

    public static void tick(World world, BlockPos pos, BlockState state, altarEntity entity){
        if(!world.isClient){
            double x = pos.getX();
            double z = pos.getZ();
            double y = pos.getY();
            var block = world.getBlockState(new BlockPos(x,y-1,z)).getBlock();

        }
    }
}
