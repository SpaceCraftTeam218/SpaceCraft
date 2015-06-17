package com.SpaceCraftTeam.SpaceCraft.gui;

import com.SpaceCraftTeam.SpaceCraft.SpaceCraft;
import com.SpaceCraftTeam.SpaceCraft.container.ContainerLaunchPad;
import com.SpaceCraftTeam.SpaceCraft.reference.Reference;
import com.SpaceCraftTeam.SpaceCraft.reference.Textures;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityLaunchPad;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiLaunchPad extends GuiContainer{

    private TileEntityLaunchPad launchPad;

    public GuiLaunchPad(InventoryPlayer inventoryplayer, TileEntityLaunchPad launchPad) {
        super(new ContainerLaunchPad(inventoryplayer, launchPad));

        this.launchPad = launchPad;

        this.xSize = 176;
        this.ySize = 166;

    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float var1 , int var2, int var3) {
        Minecraft.getMinecraft().getTextureManager().bindTexture(Textures.Gui.LAUNCHPAD);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }

}
