package com.SpaceCraftTeam.SpaceCraft.block;

import com.SpaceCraftTeam.SpaceCraft.SpaceCraft;
import com.SpaceCraftTeam.SpaceCraft.creativetab.CreativeTab;
import com.SpaceCraftTeam.SpaceCraft.init.ModBlocks;
import com.SpaceCraftTeam.SpaceCraft.reference.GUIs;
import com.SpaceCraftTeam.SpaceCraft.reference.Names;
import com.jacat.WindmillMod.block.tileentity.TileEntityWindmill;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockWindmill extends BlockContainer {


    public BlockWindmill() {
        super(Material.iron);
        this.setBlockName(Names.Blocks.WINDMILL);
        this.setCreativeTab(CreativeTab.SpaceCraftTab);
    }

    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, int x, int y, int z) {

        float pixel = 1F/16F;

        if(blockAccess.getBlockMetadata(x,y,z) < 7) this.setBlockBounds(4*pixel, 0, 4*pixel, 1-4*pixel, 1, 1-4*pixel);
        else this.setBlockBounds(0,0,0,1,1,1);
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

    public boolean  onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){

        if(!world.isRemote){
            FMLNetworkHandler.openGui(player, SpaceCraft.Instance, GUIs.WINDMILL.ordinal(), world, x,y,z);
        }

        return true;
    }

    public void breakBlock(World world, int x, int y, int z, Block block, int metadata){
        if(world.getBlock(x, y+1, z).equals(ModBlocks.blockWindmill)) world.setBlockToAir(x, y+1, z);
        if(world.getBlock(x, y-1, z).equals(ModBlocks.blockWindmill)) world.setBlockToAir(x, y-1, z);
    }









    @Override
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {

        return new TileEntityWindmill();

    }
}
