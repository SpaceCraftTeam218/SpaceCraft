package com.SpaceCraftTeam.SpaceCraft.block;

import com.SpaceCraftTeam.SpaceCraft.creativetab.CreativeTab;
import com.SpaceCraftTeam.SpaceCraft.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockClassicFurnace extends Block {

    public BlockClassicFurnace() {
        super(Material.rock);
        this.setBlockName(Names.Blocks.CLASSICFURNACE);
        this.setCreativeTab(CreativeTab.SpaceCraftTab);

    }
}
