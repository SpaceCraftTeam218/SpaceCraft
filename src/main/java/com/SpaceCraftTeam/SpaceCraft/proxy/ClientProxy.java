package com.SpaceCraftTeam.SpaceCraft.proxy;

import com.SpaceCraftTeam.SpaceCraft.reference.RenderIds;
import com.SpaceCraftTeam.SpaceCraft.renderer.tileentity.TileEntityRendererLaunchPad;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityLaunchPad;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

    @Override
    public ClientProxy getClientProxy() {
        return this;
    }

    @Override
    public void initRenderingAndTextures() {

        RenderIds.launchPad = RenderingRegistry.getNextAvailableRenderId();

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLaunchPad.class, new TileEntityRendererLaunchPad());

    }

    @Override
    public void registerKeybindings() {

    }

    @Override
    public void playSound(String soundName, float xCoord, float yCoord, float zCoord, float volume, float pitch) {

    }

    @Override
    public void spawnParticle(String particleName, double xCoord, double yCoord, double zCoord, double xVelocity, double yVelocity, double zVelocity) {

    }
}
