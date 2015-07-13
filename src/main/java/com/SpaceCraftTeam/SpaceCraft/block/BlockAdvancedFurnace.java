package com.SpaceCraftTeam.SpaceCraft.block;

import com.SpaceCraftTeam.SpaceCraft.creativetab.CreativeTab;
import com.SpaceCraftTeam.SpaceCraft.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAdvancedFurnace extends Block {

    public BlockAdvancedFurnace() {
        super(Material.rock);
        this.setBlockName(Names.Blocks.ADVANCEDFURNACE);
        this.setCreativeTab(CreativeTab.SpaceCraftTab);
    }

}
