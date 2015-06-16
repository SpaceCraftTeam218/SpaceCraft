package com.SpaceCraftTeam.SpaceCraft.init;

import com.SpaceCraftTeam.SpaceCraft.block.BlockLaunchPad;
import com.SpaceCraftTeam.SpaceCraft.block.BlockSpaceCraft;
import com.SpaceCraftTeam.SpaceCraft.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {

    public static final Block blockLaunchPad = new BlockLaunchPad();

    public static void init() {

        GameRegistry.registerBlock(blockLaunchPad, Names.Blocks.LAUNCHPAD);

    }

}
