package net.fabricmc.v1rucovsdemons.client.gui;

import io.github.cottonmc.cotton.gui.SyncedGuiDescription;
import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WItemSlot;
import io.github.cottonmc.cotton.gui.widget.WTabPanel;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import io.github.cottonmc.cotton.gui.widget.icon.ItemIcon;
import net.fabricmc.v1rucovsdemons.main;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.command.argument.ItemStackArgument;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.EmptyMapItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.LiteralText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Position;
import java.util.function.Predicate;

public class altarGuiDescription extends SyncedGuiDescription {
    private static final int inventorySize = 1;
    private BlockPos Pos;
    private ScreenHandlerContext context;

    public altarGuiDescription(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context){
        super(main.ALTAR_SCREEN,syncId, playerInventory, getBlockInventory(context, inventorySize),getBlockPropertyDelegate(context));
        this.context = context;
        WGridPanel root = new WGridPanel();
        setRootPanel(root);

        root.setSize(170,200);
        root.setInsets(Insets.ROOT_PANEL);

        WItemSlot itemSlot = WItemSlot.of(blockInventory, 0);
        root.add(itemSlot, 4, 1);

        WTabPanel tabPanel = new WTabPanel();
        tabPanel.setSize(30,30);
        WGridPanel gridPanel = new WGridPanel();

        tabPanel.add(gridPanel,tab->tab.icon(new ItemIcon(Items.NETHER_STAR)).title(new LiteralText("test")).tooltip(new LiteralText("подсказка")));

        root.add(this.createPlayerInventoryPanel(), 0, 6);
        root.add(tabPanel,-3,0);
        root.validate(this);
    }

    @Override
    public void onSlotClick(int slotNumber, int button, SlotActionType action, PlayerEntity player) {
        super.onSlotClick(slotNumber, button, action, player);
    }

    @Override
    public void close(PlayerEntity player) {
        //super.close(player);
        //this.context.run((world, pos) -> {
            //this.inventory(player, this.blockInventory);
        //});
    }
}