package com.SpaceCraftTeam.SpaceCraft.init;

import com.SpaceCraftTeam.SpaceCraft.block.*;
import com.SpaceCraftTeam.SpaceCraft.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {

    public static final Block blockWindmill = new BlockWindmill();
    public static final Block blockWindmillBase = new BlockWindmillBase();

    public static final Block blockLaunchPad = new BlockLaunchPad();


    public static final Block blockCopperWire = new BlockCopperWire();
    public static final Block blockTinWire = new BlockTinWire();


    public static final Block blockBasicCrusher = new BlockBasicCrusher();
    public static final Block blockClassicCrusher = new BlockClassicCrusher();
    public static final Block blockAdvancedCrusher = new BlockAdvancedCrusher();
    public static final Block blockBasicFurnace = new BlockBasicFurnace();
    public static final Block blockClassicFurnace = new BlockClassicFurnace();
    public static final Block blockAdvancedFurnace = new BlockAdvancedFurnace();


    public static void init() {

        GameRegistry.registerBlock(blockWindmill, Names.Blocks.WINDMILL);
        GameRegistry.registerBlock(blockWindmillBase, Names.Blocks.WINDMILLBASE);

        GameRegistry.registerBlock(blockLaunchPad, Names.Blocks.LAUNCHPAD);


        GameRegistry.registerBlock(blockCopperWire, Names.Blocks.COPPERWIRE);
        GameRegistry.registerBlock(blockTinWire, Names.Blocks.TINWIRE);


        GameRegistry.registerBlock(blockBasicCrusher, Names.Blocks.BASICCRUSHER);
        GameRegistry.registerBlock(blockClassicCrusher, Names.Blocks.CLASSICCRUSHER);
        GameRegistry.registerBlock(blockAdvancedCrusher, Names.Blocks.ADVANCEDCRUSHER);
        GameRegistry.registerBlock(blockBasicFurnace, Names.Blocks.BASICFURNACE);
        GameRegistry.registerBlock(blockClassicFurnace, Names.Blocks.CLASSICFURNACE);
        GameRegistry.registerBlock(blockAdvancedFurnace, Names.Blocks.ADVANCEDFURNACE);

    }

}
