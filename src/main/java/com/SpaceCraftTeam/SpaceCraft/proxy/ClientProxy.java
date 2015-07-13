package com.SpaceCraftTeam.SpaceCraft.proxy;

import com.SpaceCraftTeam.SpaceCraft.reference.RenderIds;
import com.SpaceCraftTeam.SpaceCraft.renderer.tileentity.TileEntityRenderCopperWire;
import com.SpaceCraftTeam.SpaceCraft.renderer.tileentity.TileEntityRenderWindmill;
import com.SpaceCraftTeam.SpaceCraft.renderer.tileentity.TileEntityRenderWindmillBase;
import com.SpaceCraftTeam.SpaceCraft.renderer.tileentity.TileEntityRendererLaunchPad;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityCopperWire;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityLaunchPad;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityWindmillBase;
import com.jacat.WindmillMod.block.tileentity.TileEntityWindmill;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.entity.Render;

public class ClientProxy extends CommonProxy{

    @Override
    public ClientProxy getClientProxy() {
        return this;
    }

    @Override
    public void initRenderingAndTextures() {

        RenderIds.windmill = RenderingRegistry.getNextAvailableRenderId();
        RenderIds.windmillBase = RenderingRegistry.getNextAvailableRenderId();
        RenderIds.launchPad = RenderingRegistry.getNextAvailableRenderId();
        RenderIds.copperWire = RenderingRegistry.getNextAvailableRenderId();

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWindmill.class, new TileEntityRenderWindmill());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWindmillBase.class, new TileEntityRenderWindmillBase());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLaunchPad.class, new TileEntityRendererLaunchPad());

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCopperWire.class, new TileEntityRenderCopperWire());


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
