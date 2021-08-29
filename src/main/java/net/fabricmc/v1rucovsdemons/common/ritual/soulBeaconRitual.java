package net.fabricmc.v1rucovsdemons.common.ritual;

import net.fabricmc.v1rucovsdemons.common.blockEntity.altarEntity;
import net.fabricmc.v1rucovsdemons.common.entity.ghostEntity;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.ClientPlayerTickable;
import net.minecraft.entity.mob.VexEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.LiteralText;
import net.minecraft.util.collection.DefaultedList;

import java.util.Random;

public class soulBeaconRitual extends ritual implements ClientPlayerTickable{
    public soulBeaconRitual(){
        super();
        components.set(0,new ItemStack(Items.WITHER_SKELETON_SKULL));
        components.set(1,new ItemStack(Items.ROTTEN_FLESH));
        components.set(2,new ItemStack(Items.ROTTEN_FLESH));
        components.set(3,new ItemStack(Items.ROTTEN_FLESH));
        components.set(4,new ItemStack(Items.BONE));
        components.set(5,new ItemStack(Items.BONE));
    }

    @Override
    public void Invoke(altarEntity entity, PlayerEntity player) {
        var world = entity.getWorld();
        if(world.getTimeOfDay()>=12000 && world.getTimeOfDay()<=24000){
            this.entity = entity;
            this.world = world;
            this.player = player;
            player.sendMessage(new LiteralText("Soul beacon ritual started."),true);
            tick();
        }
        else player.sendMessage(new LiteralText("This ritual requires night time."),true);
    }

    @Override
    public void tick() {
        var ent = (altarEntity) entity;
        ent.IsCraftingMode = true;
        if(world.getTimeOfDay()<=24000){
            System.out.println("ГГ");
        }
        else{
            player.sendMessage(new LiteralText("Ritual ended."),true);
            ent.getItems().clear();
            ent.IsCraftingMode = false;
        }
    }

    @Override
    public boolean compareIngredients(DefaultedList<ItemStack> items) {
        boolean equals = true;
        for (int i =0; i<6;i++) {
            if(items.get(i).getItem() == components.get(i).getItem()) continue;
            else {
                equals = false;
                break;
            }
        }
        return equals;
    }
}
