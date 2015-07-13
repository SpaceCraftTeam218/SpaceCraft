package com.SpaceCraftTeam.SpaceCraft.tileenity;

import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;


public class TileEntityCopperWire extends TileEntity {

    public ForgeDirection[] connections = new ForgeDirection[6];

    public TileEntityCopperWire() {

    }

    public void updateEntity(){
        this.updateConnections();
    }

    public void updateConnections() {
        if(this.worldObj.getTileEntity(xCoord,yCoord+1,zCoord) instanceof TileEntityCopperWire) connections[0] = ForgeDirection.UP;
        else connections[0] = null;
        if(this.worldObj.getTileEntity(xCoord,yCoord-1,zCoord) instanceof TileEntityCopperWire) connections[1] = ForgeDirection.DOWN;
        else connections[1] = null;
        if(this.worldObj.getTileEntity(xCoord,yCoord,zCoord-1) instanceof TileEntityCopperWire) connections[2] = ForgeDirection.NORTH;
        else connections[2] = null;
        if(this.worldObj.getTileEntity(xCoord+1,yCoord,zCoord) instanceof TileEntityCopperWire) connections[3] = ForgeDirection.EAST;
        else connections[3] = null;
        if(this.worldObj.getTileEntity(xCoord,yCoord,zCoord+1) instanceof TileEntityCopperWire) connections[4] = ForgeDirection.SOUTH;
        else connections[4] = null;
        if(this.worldObj.getTileEntity(xCoord-1, yCoord, zCoord) instanceof TileEntityCopperWire) connections[5] = ForgeDirection.WEST;
        else connections[5] = null;
    }

    public boolean onlyOneOpposite(ForgeDirection[] directions){
        ForgeDirection mainDirection = null;
        boolean isOpposite = false;

        for(int i = 0; i < directions.length; i++){

            if(mainDirection == null && directions[i] != null)mainDirection = directions[i];


            if(directions[i] != null && mainDirection != directions[i]){
                if(!isOpposite(mainDirection, directions[i])) return  false;
                else isOpposite = true;
            }
        }

        return isOpposite;
    }

    public boolean isOpposite(ForgeDirection firstDirection, ForgeDirection secondDirection){
        if((firstDirection.equals(ForgeDirection.NORTH) && secondDirection.equals(ForgeDirection.SOUTH)) || (firstDirection.equals(ForgeDirection.SOUTH )&& secondDirection.equals(ForgeDirection.NORTH))) return  true;
        if((firstDirection.equals(ForgeDirection.EAST) && secondDirection.equals(ForgeDirection.WEST)) || (firstDirection.equals(ForgeDirection.WEST )&& secondDirection.equals(ForgeDirection.EAST))) return true;
        if((firstDirection.equals(ForgeDirection.UP) && secondDirection.equals(ForgeDirection.DOWN)) || (firstDirection.equals(ForgeDirection.DOWN )&& secondDirection.equals(ForgeDirection.UP))) return  true;


        return false;
    }

}
