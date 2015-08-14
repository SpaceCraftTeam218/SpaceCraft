package com.SpaceCraftTeam.SpaceCraft.handler;

import com.SpaceCraftTeam.SpaceCraft.SpaceCraft;
import com.SpaceCraftTeam.SpaceCraft.container.ContainerBasicCrusher;
import com.SpaceCraftTeam.SpaceCraft.container.ContainerLaunchPad;
import com.SpaceCraftTeam.SpaceCraft.gui.GuiBasicCrusher;
import com.SpaceCraftTeam.SpaceCraft.gui.GuiLaunchPad;
import com.SpaceCraftTeam.SpaceCraft.reference.GUIs;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityBasicCrusher;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityLaunchPad;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class SpaceCraftGuiHandler implements IGuiHandler{

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer entityPlayer, World world, int x, int y, int z) {
        TileEntity tileentity = world.getTileEntity(x, y, z);

        if(ID == GUIs.LAUNCHPAD.ordinal() && world.getBlockMetadata(x,y,z) != 0){
            TileEntityLaunchPad tileEntityLaunchPad = (TileEntityLaunchPad) world.getTileEntity(x,y,z);
            return new ContainerLaunchPad(entityPlayer.inventory, tileEntityLaunchPad);
        }
        if(ID == GUIs.BasicCrusher.ordinal()){
            TileEntityBasicCrusher tileEntityBasicCrusher = (TileEntityBasicCrusher) world.getTileEntity(x,y,z);
            return new ContainerBasicCrusher(entityPlayer.inventory, tileEntityBasicCrusher);
        }


        return null;

    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer entityPlayer, World world, int x, int y, int z) {

        if(ID == GUIs.LAUNCHPAD.ordinal() && world.getBlockMetadata(x,y,z) != 0){
            TileEntityLaunchPad tileEntityLaunchPad = (TileEntityLaunchPad) world.getTileEntity(x,y,z);
            return new GuiLaunchPad(entityPlayer.inventory, tileEntityLaunchPad);
        }
        if(ID == GUIs.BasicCrusher.ordinal()){
            TileEntityBasicCrusher tileEntityBasicCrusher = (TileEntityBasicCrusher) world.getTileEntity(x,y,z);
            return new GuiBasicCrusher(entityPlayer.inventory, tileEntityBasicCrusher);
        }

        return null;
    }


}
