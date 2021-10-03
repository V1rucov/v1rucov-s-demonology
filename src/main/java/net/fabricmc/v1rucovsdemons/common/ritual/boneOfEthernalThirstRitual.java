package net.fabricmc.v1rucovsdemons.common.ritual;
import net.fabricmc.v1rucovsdemons.common.ritual.*;
import net.fabricmc.v1rucovsdemons.init.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.collection.DefaultedList;

public class boneOfEthernalThirstRitual extends ritual{
    public boneOfEthernalThirstRitual(){
        components.set(0,new ItemStack(Items.BONE));
    }
    @Override
    public DefaultedList<ItemStack> getComponents() {
        return components;
    }

    @Override
    public ActionResult Invoke(PlayerEntity player, BlockEntity blockEntity) {
        //if()
        return ActionResult.SUCCESS;
    }

    @Override
    public boolean CheckConditions(PlayerEntity player, BlockEntity blockEntity) {
        if(blockEntity.getWorld().getTimeOfDay() >= 11000 && blockEntity.getWorld().getTimeOfDay() <= 13000)
            return true;
        player.sendMessage(new LiteralText("This ritual must be started only at sunset."),false);
        return false;
    }
}
