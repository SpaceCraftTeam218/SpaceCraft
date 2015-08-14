package com.SpaceCraftTeam.SpaceCraft.block;

import com.SpaceCraftTeam.SpaceCraft.SpaceCraft;
import com.SpaceCraftTeam.SpaceCraft.creativetab.CreativeTab;
import com.SpaceCraftTeam.SpaceCraft.reference.GUIs;
import com.SpaceCraftTeam.SpaceCraft.reference.Names;
import com.SpaceCraftTeam.SpaceCraft.reference.Reference;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityBasicCrusher;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityLaunchPad;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockBasicCrusher extends BlockContainer{


    public IIcon Bottom;
    public IIcon Top;
    public IIcon Front;
    public IIcon Back;
    public IIcon Left;
    public IIcon Right;

    public BlockBasicCrusher() {
        super(Material.rock);
        this.setBlockName(Names.Blocks.BASICCRUSHER);
        this.setCreativeTab(CreativeTab.SpaceCraftTab);
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
        if(!world.isRemote){
            FMLNetworkHandler.openGui(player, SpaceCraft.Instance, GUIs.BasicCrusher.ordinal(), world, x, y, z);
        }

        return true;
    }

    @Override
    public void registerBlockIcons(IIconRegister icon) {
        Bottom = icon.registerIcon(Reference.LOWERCASE_MOD_ID + ":BasicCrusherBottom");
        Top = icon.registerIcon(Reference.LOWERCASE_MOD_ID + ":BasicCrusherTop");
        Front = icon.registerIcon(Reference.LOWERCASE_MOD_ID + ":BasicCrusherFront");
        Back = icon.registerIcon(Reference.LOWERCASE_MOD_ID + ":BasicCrusherBack");
        Left = icon.registerIcon(Reference.LOWERCASE_MOD_ID + ":BasicCrusherLeft");
        Right = icon.registerIcon(Reference.LOWERCASE_MOD_ID + ":BasicCrusherRight");
    }

    @Override
    public TileEntity createNewTileEntity(World world, int par1) {
        return new TileEntityBasicCrusher();
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        if(side == 0){
            return Bottom;
        }else if(side == 1){
            return Top;
        }else if(side == 2){
            return Front;
        }else if(side == 3){
            return Back;
        }else if(side == 4){
            return Left;
        }else if(side == 5){
            return Right;
        }
        return null;
    }
}
