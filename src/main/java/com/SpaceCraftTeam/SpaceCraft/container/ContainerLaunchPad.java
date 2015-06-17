package com.SpaceCraftTeam.SpaceCraft.container;

import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityLaunchPad;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;


public class ContainerLaunchPad extends Container {


    private TileEntityLaunchPad launchPad;

    public ContainerLaunchPad(InventoryPlayer inventoryplayer, TileEntityLaunchPad launchPad) {
        this.launchPad = launchPad;

        this.addSlotToContainer(new Slot(launchPad, 0, 55, 35));
        this.addSlotToContainer(new Slot(launchPad, 1, 105, 35));

        for (int i = 0; i < 9; i++) {
            this.addSlotToContainer(new Slot(inventoryplayer, i, 8 + i * 18, 142));
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlotToContainer(new Slot(inventoryplayer, 9 + j + i * 9, 8 + 18 * j, 84 + i * 18));
            }
        }
    }
    public boolean canInteractWith(EntityPlayer var1) {
        return true;
    }

}
