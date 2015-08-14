package com.SpaceCraftTeam.SpaceCraft.gui;

import com.SpaceCraftTeam.SpaceCraft.SpaceCraft;
import com.SpaceCraftTeam.SpaceCraft.container.ContainerBasicCrusher;
import com.SpaceCraftTeam.SpaceCraft.container.ContainerLaunchPad;
import com.SpaceCraftTeam.SpaceCraft.reference.Reference;
import com.SpaceCraftTeam.SpaceCraft.reference.Textures;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityBasicCrusher;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityLaunchPad;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiBasicCrusher extends GuiContainer{

    private TileEntityBasicCrusher basicCrusher;

    public GuiBasicCrusher(InventoryPlayer inventoryplayer, TileEntityBasicCrusher basicCrusher) {
        super(new ContainerBasicCrusher(inventoryplayer, basicCrusher));

        this.basicCrusher = basicCrusher;

        this.xSize = 176;
        this.ySize = 166;

    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float var1 , int var2, int var3) {
        Minecraft.getMinecraft().getTextureManager().bindTexture(Textures.Gui.BASICCRUSHER);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }

}
