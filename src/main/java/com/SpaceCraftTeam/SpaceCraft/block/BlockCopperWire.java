package com.SpaceCraftTeam.SpaceCraft.block;

import com.SpaceCraftTeam.SpaceCraft.creativetab.CreativeTab;
import com.SpaceCraftTeam.SpaceCraft.reference.Names;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityCopperWire;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockCopperWire extends BlockContainer{

    public BlockCopperWire() {
        super(Material.ground);
        this.setBlockName(Names.Blocks.COPPERWIRE);
        float pixel = 1F/16F;
        this.setBlockBounds(11*pixel/2, 11*pixel/2, 11*pixel/2, 1-11*pixel/2,1-11*pixel/2,1-11*pixel/2);
        this.useNeighborBrightness=true;
        this.setCreativeTab(CreativeTab.SpaceCraftTab);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        float pixel = 1F/16F;
        TileEntityCopperWire copperWire = (TileEntityCopperWire) world.getTileEntity(x,y,z);

        if(copperWire != null) {
            float minX = 11*pixel/2-(copperWire.connections[5]!= null?(11*pixel/2):0);
            float maxX = 1- 11*pixel/2+(copperWire.connections[3]!= null?(11*pixel/2):0);

            float minY = 11*pixel/2-(copperWire.connections[1]!= null?(11*pixel/2):0);
            float maxY = 1- 11*pixel/2+(copperWire.connections[0]!= null?(11*pixel/2):0);

            float minZ = 11*pixel/2-(copperWire.connections[2]!= null?(11*pixel/2):0);
            float maxZ = 1- 11*pixel/2+(copperWire.connections[4]!= null?(11*pixel/2):0);

            this.setBlockBounds(minX,minY, minZ, maxX, maxY, maxZ);
        }
        return AxisAlignedBB.getBoundingBox(x+this.minX,y+this.minY,z+this.minZ, x+this.maxX,y+this.maxY,z+this.maxZ);
    }

    @Override
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
        float pixel = 1F/16F;
        TileEntityCopperWire copperWire = (TileEntityCopperWire) world.getTileEntity(x,y,z);

        if(copperWire != null) {
            float minX = 11*pixel/2-(copperWire.connections[5]!= null?(11*pixel/2):0);
            float maxX = 1- 11*pixel/2+(copperWire.connections[3]!= null?(11*pixel/2):0);

            float minY = 11*pixel/2-(copperWire.connections[1]!= null?(11*pixel/2):0);
            float maxY = 1- 11*pixel/2+(copperWire.connections[0]!= null?(11*pixel/2):0);

            float minZ = 11*pixel/2-(copperWire.connections[2]!= null?(11*pixel/2):0);
            float maxZ = 1- 11*pixel/2+(copperWire.connections[4]!= null?(11*pixel/2):0);

            this.setBlockBounds(minX,minY, minZ, maxX, maxY, maxZ);
        }
        return AxisAlignedBB.getBoundingBox(x+this.minX,y+this.minY,z+this.minZ, x+this.maxX,y+this.maxY,z+this.maxZ);
    }



        public int getRenderType(){
        return -1;
    }

    public boolean isOpaqueCube(){
        return false;
    }

    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityCopperWire();
    }
}
