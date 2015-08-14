package com.SpaceCraftTeam.SpaceCraft.item.weapons;

import com.SpaceCraftTeam.SpaceCraft.entity.EntitySmallBomb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSmallBomb extends Item {

    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        if(!player.capabilities.isCreativeMode){
            --itemStack.stackSize;
        }
        world.playSoundAtEntity(player,"random.fizz",0.7F,0.8F);
        if(!world.isRemote){
            world.spawnEntityInWorld(new EntitySmallBomb(world,player));
        }
        return itemStack;
    }
}
