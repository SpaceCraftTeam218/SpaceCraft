package com.SpaceCraftTeam.SpaceCraft.proxy;

import com.SpaceCraftTeam.SpaceCraft.entity.EntityGreenAlien;
import com.SpaceCraftTeam.SpaceCraft.entity.EntityRedAlien;
import com.SpaceCraftTeam.SpaceCraft.entity.EntitySmallBomb;
import com.SpaceCraftTeam.SpaceCraft.entity.EntityYellowAlien;
import com.SpaceCraftTeam.SpaceCraft.init.ModItems;
import com.SpaceCraftTeam.SpaceCraft.reference.RenderIds;
import com.SpaceCraftTeam.SpaceCraft.renderer.entity.RenderGreenAlien;
import com.SpaceCraftTeam.SpaceCraft.renderer.entity.RenderRedAlien;
import com.SpaceCraftTeam.SpaceCraft.renderer.entity.RenderYellowAlien;
import com.SpaceCraftTeam.SpaceCraft.renderer.model.ModelGreenAlien;
import com.SpaceCraftTeam.SpaceCraft.renderer.model.ModelRedAlien;
import com.SpaceCraftTeam.SpaceCraft.renderer.model.ModelYellowAlien;
import com.SpaceCraftTeam.SpaceCraft.renderer.tileentity.TileEntityRenderCopperWire;
import com.SpaceCraftTeam.SpaceCraft.renderer.tileentity.TileEntityRenderWindmill;
import com.SpaceCraftTeam.SpaceCraft.renderer.tileentity.TileEntityRenderWindmillBase;
import com.SpaceCraftTeam.SpaceCraft.renderer.tileentity.TileEntityRendererLaunchPad;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityCopperWire;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityLaunchPad;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityWindmill;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityWindmillBase;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelSnowMan;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderSnowball;

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


        RenderingRegistry.registerEntityRenderingHandler(EntityGreenAlien.class, new RenderGreenAlien(new ModelGreenAlien(),0));
        RenderingRegistry.registerEntityRenderingHandler(EntityYellowAlien.class, new RenderYellowAlien(new ModelYellowAlien(),0));
        RenderingRegistry.registerEntityRenderingHandler(EntityRedAlien.class, new RenderRedAlien(new ModelRedAlien(),0));

        RenderingRegistry.registerEntityRenderingHandler(EntitySmallBomb.class, new RenderSnowball(ModItems.itemSmallBomb));

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

    @Override
    public int addArmor(String armor) {
        return 0;
    }
}
