package com.SpaceCraftTeam.SpaceCraft;

import com.SpaceCraftTeam.SpaceCraft.init.ModBlocks;
import com.SpaceCraftTeam.SpaceCraft.init.ModItems;
import com.SpaceCraftTeam.SpaceCraft.init.Recipes;
import com.SpaceCraftTeam.SpaceCraft.init.TileEntities;
import com.SpaceCraftTeam.SpaceCraft.network.PacketHandler;
import com.SpaceCraftTeam.SpaceCraft.proxy.IProxy;
import com.SpaceCraftTeam.SpaceCraft.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class SpaceCraft {

    @Mod.Instance(Reference.MOD_ID)
    public static SpaceCraft Instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        PacketHandler.init();

        ModItems.init();

        Recipes.init();

        ModBlocks.init();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

        TileEntities.init();

        proxy.initRenderingAndTextures();

        proxy.registerEventHandlers();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
