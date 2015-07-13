package com.SpaceCraftTeam.SpaceCraft.block;

import com.SpaceCraftTeam.SpaceCraft.creativetab.CreativeTab;
import com.SpaceCraftTeam.SpaceCraft.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAdvancedCrusher extends Block {


    public BlockAdvancedCrusher() {
        super(Material.rock);
        this.setBlockName(Names.Blocks.ADVANCEDCRUSHER);
        this.setCreativeTab(CreativeTab.SpaceCraftTab);
    }
}
