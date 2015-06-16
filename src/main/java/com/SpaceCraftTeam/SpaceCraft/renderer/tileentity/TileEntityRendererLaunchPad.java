package com.SpaceCraftTeam.SpaceCraft.renderer.tileentity;

import com.SpaceCraftTeam.SpaceCraft.reference.Textures;
import com.SpaceCraftTeam.SpaceCraft.renderer.model.*;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class TileEntityRendererLaunchPad extends TileEntitySpecialRenderer {

    private static float pixel = 1F/16F;

    private final ModelLaunchPad0Meta model0Meta = new ModelLaunchPad0Meta();
    private final ModelLaunchPad1Meta model1Meta = new ModelLaunchPad1Meta();
    private final ModelLaunchPad2Meta model2Meta = new ModelLaunchPad2Meta();
    private final ModelLaunchPad3Meta model3Meta = new ModelLaunchPad3Meta();
    private final ModelLaunchPad4Meta model4Meta = new ModelLaunchPad4Meta();
    private final ModelLaunchPad5Meta model5Meta = new ModelLaunchPad5Meta();
    private final ModelLaunchPad6Meta model6Meta = new ModelLaunchPad6Meta();
    private final ModelLaunchPad7Meta model7Meta = new ModelLaunchPad7Meta();
    private final ModelLaunchPad8Meta model8Meta = new ModelLaunchPad8Meta();
    private final ModelLaunchPad9Meta model9Meta = new ModelLaunchPad9Meta();


    @Override
    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {


        GL11.glPushMatrix();
        GL11.glTranslatef((float)x, (float)y, (float)z);
        GL11.glTranslated(0.5,pixel*6,0.5);
        GL11.glScaled(0.5,0.5,0.5);

        GL11.glDisable(GL11.GL_LIGHTING);
        if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 0){
            this.bindTexture(Textures.Model.LAUNCHPAD0META);
            model0Meta.render();
        }

        if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 1){

            GL11.glTranslated(-0.5,0,-0.5);
            this.bindTexture(Textures.Model.LAUNCHPAD1META);
            model1Meta.render();
        }

        if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 2){
            GL11.glRotated(90.0,0,1,0);
            GL11.glTranslated(0,0,-0.5);
            this.bindTexture(Textures.Model.LAUNCHPAD2META);
            model2Meta.render();
        }


        if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 3){
            GL11.glTranslated(-0.5,0,0.5);
            this.bindTexture(Textures.Model.LAUNCHPAD3META);
            model3Meta.render();
        }
        if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 4){
            GL11.glRotated(90.0,0,1,0);
            GL11.glTranslated(0.5,0,0);
            this.bindTexture(Textures.Model.LAUNCHPAD4META);
            model4Meta.render();
        }

        if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 5){
            this.bindTexture(Textures.Model.LAUNCHPAD5META);
            model5Meta.render();
        }
        if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 6){
            GL11.glRotated(90.0,0,1,0);
            GL11.glTranslated(-0.5,0,0);
            this.bindTexture(Textures.Model.LAUNCHPAD6META);
            model6Meta.render();
        }
        if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 7){
            GL11.glTranslated(0.5,0,-0.5);
            this.bindTexture(Textures.Model.LAUNCHPAD7META);
            model7Meta.render();
        }
        if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 8){
            GL11.glRotated(90.0,0,1,0);
            GL11.glRotated(180,0,1,0);
            GL11.glTranslated(0,0,-0.5);
            this.bindTexture(Textures.Model.LAUNCHPAD8META);
            model8Meta.render();
        }
        if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 9){
            GL11.glTranslated(0.5,0,0.5);
            this.bindTexture(Textures.Model.LAUNCHPAD9META);
            model9Meta.render();
        }




        GL11.glPopMatrix();

    }


}
