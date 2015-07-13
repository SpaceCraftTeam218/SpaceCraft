package com.SpaceCraftTeam.SpaceCraft.block;

import com.SpaceCraftTeam.SpaceCraft.creativetab.CreativeTab;
import com.SpaceCraftTeam.SpaceCraft.init.ModBlocks;
import com.SpaceCraftTeam.SpaceCraft.reference.Textures;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityWindmillBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockWindmillBase extends BlockContainer{

    public static float pixel = 1F/16F;

    public BlockWindmillBase() {
        super(Material.iron);
        this.setBlockName("BlockWindmillGround");
        this.setCreativeTab(CreativeTab.SpaceCraftTab);
        this.setBlockBounds(0, 0, 0, 1, (1F/16F)*14, 1);
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
    public TileEntity createNewTileEntity(World world, int p_149915_2_) {
        return new TileEntityWindmillBase();
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z){

        if(world.getBlockMetadata(x,y,z) == 0) setBlockBounds(pixel*0, pixel*0, pixel*0,pixel*16, pixel * 14, pixel*16);
        if(world.getBlockMetadata(x,y,z) == 1) setBlockBounds(pixel*0, pixel*0, pixel*0, pixel * 8, pixel * 14, pixel * 8);
        if(world.getBlockMetadata(x,y,z) == 2) setBlockBounds(pixel*0, pixel*0, pixel*0, pixel * 8, pixel * 14, pixel * 16);
        if(world.getBlockMetadata(x,y,z) == 3) setBlockBounds(pixel*0, pixel*0, pixel * 8, pixel * 8, pixel * 14, pixel * 16);
        if(world.getBlockMetadata(x,y,z) == 4) setBlockBounds(pixel*0, pixel*0, pixel * 0, pixel * 16, pixel * 14, pixel * 8);
        if(world.getBlockMetadata(x,y,z) == 5) setBlockBounds(pixel*0, pixel*0, pixel * 0, pixel * 16, pixel * 14, pixel * 16);
        if(world.getBlockMetadata(x,y,z) == 6) setBlockBounds(pixel*0, pixel*0, pixel * 8, pixel * 16, pixel * 14, pixel * 16);
        if(world.getBlockMetadata(x,y,z) == 7) setBlockBounds(pixel * 8, pixel*0, pixel*0, pixel * 16, pixel * 14, pixel * 8);
        if(world.getBlockMetadata(x,y,z) == 8) setBlockBounds(pixel * 8, pixel, pixel*0, pixel * 16, pixel * 14, pixel * 16);
        if(world.getBlockMetadata(x,y,z) == 9) setBlockBounds(pixel * 8, pixel*0, pixel * 8, pixel * 16, pixel * 14, pixel * 16);

        return AxisAlignedBB.getBoundingBox(x+this.minX, y+this.minY,z+minZ,x+this.maxX, y+this.maxY,z+this.maxZ);
    }

    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z){

        if(world.getBlockMetadata(x,y,z) == 0) setBlockBounds(pixel*0, pixel*0, pixel*0,pixel*16, pixel * 14, pixel*16);
        if(world.getBlockMetadata(x,y,z) == 1) setBlockBounds(pixel*0, pixel*0, pixel*0, pixel * 8, pixel * 14, pixel * 8);
        if(world.getBlockMetadata(x,y,z) == 2) setBlockBounds(pixel*0, pixel*0, pixel*0, pixel * 8, pixel * 14, pixel * 16);
        if(world.getBlockMetadata(x,y,z) == 3) setBlockBounds(pixel*0, pixel*0, pixel * 8, pixel * 8, pixel * 14, pixel * 16);
        if(world.getBlockMetadata(x,y,z) == 4) setBlockBounds(pixel*0, pixel*0, pixel * 0, pixel * 16, pixel * 14, pixel * 8);
        if(world.getBlockMetadata(x,y,z) == 5) setBlockBounds(pixel*0, pixel*0, pixel * 0, pixel * 16, pixel * 14, pixel * 16);
        if(world.getBlockMetadata(x,y,z) == 6) setBlockBounds(pixel*0, pixel*0, pixel * 8, pixel * 16, pixel * 14, pixel * 16);
        if(world.getBlockMetadata(x,y,z) == 7) setBlockBounds(pixel * 8, pixel*0, pixel*0, pixel * 16, pixel * 14, pixel * 8);
        if(world.getBlockMetadata(x,y,z) == 8) setBlockBounds(pixel * 8, pixel, pixel*0, pixel * 16, pixel * 14, pixel * 16);
        if(world.getBlockMetadata(x,y,z) == 9) setBlockBounds(pixel * 8, pixel*0, pixel * 8, pixel * 16, pixel * 14, pixel * 16);

        return AxisAlignedBB.getBoundingBox(x+this.minX, y+this.minY,z+minZ,x+this.maxX, y+this.maxY,z+this.maxZ);

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
                                if(currentCheckStructure && !world.getBlock(x1+x2-x3, y1+y3, z1+z2-z3).equals(ModBlocks.blockWindmillBase)){
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



}
