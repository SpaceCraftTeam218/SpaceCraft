package com.SpaceCraftTeam.SpaceCraft.block;

import com.SpaceCraftTeam.SpaceCraft.SpaceCraft;
import com.SpaceCraftTeam.SpaceCraft.creativetab.CreativeTab;
import com.SpaceCraftTeam.SpaceCraft.init.ModBlocks;
import com.SpaceCraftTeam.SpaceCraft.reference.GUIs;
import com.SpaceCraftTeam.SpaceCraft.reference.Names;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityLaunchPad;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLaunchPad extends BlockContainer {

    public BlockLaunchPad() {
        super(Material.rock);
        this.setBlockName(Names.Blocks.LAUNCHPAD);
        this.setCreativeTab(CreativeTab.SpaceCraftTab);
    }

    private static float pixel = 1F / 16F;



    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {

        if (world.getBlockMetadata(x, y, z) == 0) {
            this.setBlockBounds(pixel * 0, pixel * 0, pixel * 0, 16 * pixel, 16 * pixel, 16 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 1) {
            this.setBlockBounds(pixel * 0, pixel * 0, pixel * 0, 8 * pixel, 12 * pixel, 8 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 2) {
            this.setBlockBounds(pixel * 0, pixel * 0, pixel * 0, 8 * pixel, 12 * pixel, 16 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 3) {
            this.setBlockBounds(pixel * 0, pixel * 0, pixel * 8, 8 * pixel, 12 * pixel, 16 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 4) {
            this.setBlockBounds(pixel * 0, pixel * 0, pixel * 0, 16 * pixel, 12 * pixel, 8 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 5) {
            this.setBlockBounds(pixel * 0, pixel * 0, pixel * 0, 16 * pixel, 12 * pixel, 16 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 6) {
            this.setBlockBounds(pixel * 0, pixel * 0, pixel * 8, 16 * pixel, 12 * pixel, 16 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 7) {
            this.setBlockBounds(pixel * 8, pixel * 0, pixel * 0, 16 * pixel, 12 * pixel, 8 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 8) {
            this.setBlockBounds(pixel * 8, pixel * 0, pixel * 0, 16 * pixel, 12 * pixel, 16 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 9) {
            this.setBlockBounds(pixel * 8, pixel * 0, pixel * 8, 16 * pixel, 12 * pixel, 16 * pixel);
        }

        return AxisAlignedBB.getBoundingBox(x+this.minX,y+this.minY,z+this.minZ, x+this.maxX,y+this.maxY,z+this.maxZ);

    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
        if(!world.isRemote){
            FMLNetworkHandler.openGui(player, SpaceCraft.Instance, GUIs.LAUNCHPAD.ordinal(), world, x, y, z);
            System.out.println("GUIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII  ::  " + world.getBlockMetadata(x,y,z));
        }

        return true;
    }

    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world , int x, int y, int z) {

        if (world.getBlockMetadata(x, y, z) == 0) {
            this.setBlockBounds(pixel * 0, pixel * 0, pixel * 0, 16 * pixel, 16 * pixel, 16 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 1) {
            this.setBlockBounds(pixel * 0, pixel * 0, pixel * 0, 8 * pixel, 12 * pixel, 8 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 2) {
            this.setBlockBounds(pixel * 0, pixel * 0, pixel * 0, 8 * pixel, 12 * pixel, 16 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 3) {
            this.setBlockBounds(pixel * 0, pixel * 0, pixel * 8, 8 * pixel, 12 * pixel, 16 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 4) {
            this.setBlockBounds(pixel * 0, pixel * 0, pixel * 0, 16 * pixel, 12 * pixel, 8 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 5) {
            this.setBlockBounds(pixel * 0, pixel * 0, pixel * 0, 16 * pixel, 12 * pixel, 16 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 6) {
            this.setBlockBounds(pixel * 0, pixel * 0, pixel * 8, 16 * pixel, 12 * pixel, 16 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 7) {
            this.setBlockBounds(pixel * 8, pixel * 0, pixel * 0, 16 * pixel, 12 * pixel, 8 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 8) {
            this.setBlockBounds(pixel * 8, pixel * 0, pixel * 0, 16 * pixel, 12 * pixel, 16 * pixel);
        } else if (world.getBlockMetadata(x, y, z) == 9) {
            this.setBlockBounds(pixel * 8, pixel * 0, pixel * 8, 16 * pixel, 12 * pixel, 16 * pixel);
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



    public void onNeighborBlockChange(World world, int x, int y, int z , Block neighborBlock){
        updateMutiBlockStructure(world,  x, y, z);
    }

    public void onBlockAdded(World world, int x, int y, int z){
        updateMutiBlockStructure(world,  x, y, z);
    }

    public void updateMutiBlockStructure(World world, int x, int y, int z){
        isMutiBlockStructure(world,  x, y, z);
    }

    public boolean isMutiBlockStructure(World world, int x1, int y1, int z1){
        boolean mStructure = false;
        boolean currentCheckStructure = true;


        for(int x2 = 0; x2 < 3; x2++){
            for(int z2 = 0; z2 < 3; z2++){
                if(!mStructure){
                    currentCheckStructure = true;

                    for(int x3 = 0; x3 < 3; x3++){
                        for(int y3 = 0; y3 < 1; y3++){
                            for(int z3 = 0; z3 < 3; z3++){
                                if(currentCheckStructure && !world.getBlock(x1+x2-x3, y1+y3, z1+z2-z3).equals(ModBlocks.blockLaunchPad)){
                                    currentCheckStructure = false;
                                }
                            }
                        }
                    }

                    if(currentCheckStructure){
                        for(int x3 = 0; x3 < 3; x3++){
                            for(int y3 = 0; y3 < 1; y3++){
                                for(int z3 = 0; z3 < 3; z3++){
                                    world.setBlockMetadataWithNotify(x1+x2-x3, y1+y3, z1+z2-z3, x3*3+z3+1, 2);
                                }
                            }
                        }
                    }
                }
                mStructure = currentCheckStructure;
            }
        }
        if(mStructure) return true;

        if(world.getBlockMetadata(x1, y1, z1) > 0) world.setBlockMetadataWithNotify(x1, y1, z1, 0, 3);

        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par1) {
        return new TileEntityLaunchPad();
    }

}
