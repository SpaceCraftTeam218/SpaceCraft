package com.SpaceCraftTeam.SpaceCraft.block;

import com.SpaceCraftTeam.SpaceCraft.creativetab.CreativeTab;
import com.SpaceCraftTeam.SpaceCraft.reference.Names;
import com.SpaceCraftTeam.SpaceCraft.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockBasicCrusher extends Block {


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


    @Override
    public void registerBlockIcons(IIconRegister icon) {
        Bottom = icon.registerIcon(Reference.LOWERCASE_MOD_ID + ":Bottom");
        Top = icon.registerIcon(Reference.LOWERCASE_MOD_ID + ":Top");
        Front = icon.registerIcon(Reference.LOWERCASE_MOD_ID + ":Front");
        Back = icon.registerIcon(Reference.LOWERCASE_MOD_ID + ":Back");
        Left = icon.registerIcon(Reference.LOWERCASE_MOD_ID + ":Left");
        Right = icon.registerIcon(Reference.LOWERCASE_MOD_ID + ":Right");
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
