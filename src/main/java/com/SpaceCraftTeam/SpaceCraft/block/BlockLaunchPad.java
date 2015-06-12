package com.SpaceCraftTeam.SpaceCraft.block;

import net.minecraft.block.material.Material;

public class BlockLaunchPad extends BlockSpaceCraft {

    public BlockLaunchPad() {
        super(Material.rock);
        this.setBlockName("BlockLaunchPad");
        this.setCreativeTab(WindmillMod.WindmillTab);
        this.setBlockTextureName();
        this.setBlockBounds(0, 0, 0, 1, (1F/16F)*14, 1);
    }

}
