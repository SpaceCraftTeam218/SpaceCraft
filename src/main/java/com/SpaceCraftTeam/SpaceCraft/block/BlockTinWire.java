package com.SpaceCraftTeam.SpaceCraft.block;

import com.SpaceCraftTeam.SpaceCraft.creativetab.CreativeTab;
import com.SpaceCraftTeam.SpaceCraft.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockTinWire extends Block {

    public BlockTinWire() {
        super(Material.cloth);
        this.setBlockName(Names.Blocks.TINWIRE);
        this.setBlockBounds(0,0.3F,0.3F,1,0.6F,0.6F);
        this.setCreativeTab(CreativeTab.SpaceCraftTab);
    }



    public boolean isOpaqueCube(){
        return false;
    }

    public boolean renderAsNormalBlock(){return false;}

}
