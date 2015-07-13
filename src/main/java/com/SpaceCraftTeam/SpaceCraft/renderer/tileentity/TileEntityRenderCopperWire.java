package com.SpaceCraftTeam.SpaceCraft.renderer.tileentity;

import com.SpaceCraftTeam.SpaceCraft.reference.Textures;
import com.SpaceCraftTeam.SpaceCraft.tileenity.TileEntityCopperWire;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;

public class TileEntityRenderCopperWire extends TileEntitySpecialRenderer {

    boolean drawInside = true;


    float pixel = 1F/16F;
    float pixelW = 1F/32F;
    float pixelH = 1F/32F;

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
        GL11.glTranslated(x,y,z);
        GL11.glDisable(GL11.GL_LIGHTING);
        this.bindTexture(Textures.Model.COPPERWIRE);
        {
            TileEntityCopperWire pipe = (TileEntityCopperWire) tileEntity;

            if(!pipe.onlyOneOpposite(pipe.connections)){
                drawCore(tileEntity);
                for(int i = 0; i < pipe.connections.length; i++){
                    if(pipe.connections[i] != null){
                        drawConnector(pipe.connections[i]);
                    }
                }
            } else {
                for(int i = 0; i < pipe.connections.length; i++){
                    if(pipe.connections[i] != null){
                        drawStraight(pipe.connections[i]);
                        break;
                    }
                }
            }






        }
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glTranslated(-x,-y,-z);
    }

    public void drawStraight(ForgeDirection direction){

        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        {
            GL11.glTranslated(0.5,0.5,0.5);
            if(direction.equals(ForgeDirection.UP) || direction.equals(ForgeDirection.DOWN)){
                GL11.glRotated(0,1,0,0);
            }
            else if(direction.equals(ForgeDirection.SOUTH) || direction.equals(ForgeDirection.NORTH)){
                GL11.glRotated(90,1,0,0);
            }
            else if(direction.equals(ForgeDirection.EAST) || direction.equals(ForgeDirection.WEST)){
                GL11.glRotated(270,0,0,1);
            }
            GL11.glTranslated(-0.5,-0.5,-0.5);

            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 0, 1-11 * pixel / 2, pixelW *  5, pixelH * 5);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1, 1-11 * pixel / 2, pixelW * 10, pixelH * 5);
            tessellator.addVertexWithUV(    11 * pixel / 2, 1, 1-11 * pixel / 2, pixelW * 10, pixelH * 0);
            tessellator.addVertexWithUV(    11 * pixel / 2, 0, 1-11 * pixel / 2, pixelW *  5, pixelH * 0);

            tessellator.addVertexWithUV(    11 * pixel / 2, 0, 11 * pixel / 2, pixelW *  5, pixelH * 5);
            tessellator.addVertexWithUV(    11 * pixel / 2, 1, 11 * pixel / 2, pixelW * 10, pixelH * 5);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1, 11 * pixel / 2, pixelW * 10, pixelH * 0);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 0, 11 * pixel / 2, pixelW *  5, pixelH * 0);

            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 0,   11 * pixel / 2, pixelW *  5, pixelH * 5);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1,   11 * pixel / 2, pixelW * 10, pixelH * 5);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1, 1-11 * pixel / 2, pixelW * 10, pixelH * 0);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2, 0, 1-11 * pixel / 2, pixelW *  5, pixelH * 0);

            tessellator.addVertexWithUV(11 * pixel / 2, 0, 1-11 * pixel / 2, pixelW *  5, pixelH * 0);
            tessellator.addVertexWithUV(11 * pixel / 2, 1, 1-11 * pixel / 2, pixelW * 10, pixelH * 0);
            tessellator.addVertexWithUV(11 * pixel / 2, 1,   11 * pixel / 2, pixelW * 10, pixelH * 5);
            tessellator.addVertexWithUV(11 * pixel / 2, 0,   11 * pixel / 2, pixelW *  5, pixelH * 5);


            if(drawInside){

                tessellator.addVertexWithUV(    11 * pixel / 2,  0, 1-11 * pixel / 2, pixelW *  5, pixelH * 0);
                tessellator.addVertexWithUV(    11 * pixel / 2,  1, 1-11 * pixel / 2, pixelW * 10, pixelH * 0);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2,  1, 1-11 * pixel / 2, pixelW * 10, pixelH * 5);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2,  0, 1-11 * pixel / 2, pixelW *  5, pixelH * 5);

                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 0, 11 * pixel / 2, pixelW *  5, pixelH * 0);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1, 11 * pixel / 2, pixelW * 10, pixelH * 0);
                tessellator.addVertexWithUV(    11 * pixel / 2, 1, 11 * pixel / 2, pixelW * 10, pixelH * 5);
                tessellator.addVertexWithUV(    11 * pixel / 2, 0, 11 * pixel / 2, pixelW *  5, pixelH * 5);

                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 0, 1-11 * pixel / 2, pixelW *  5, pixelH * 0);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1, 1-11 * pixel / 2, pixelW * 10, pixelH * 0);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1,   11 * pixel / 2, pixelW * 10, pixelH * 5);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 0,   11 * pixel / 2, pixelW *  5, pixelH * 5);

                tessellator.addVertexWithUV(11 * pixel / 2, 0,   11 * pixel / 2, pixelW *  5, pixelH * 5);
                tessellator.addVertexWithUV(11 * pixel / 2, 1,   11 * pixel / 2, pixelW * 10, pixelH * 5);
                tessellator.addVertexWithUV(11 * pixel / 2, 1, 1-11 * pixel / 2, pixelW * 10, pixelH * 0);
                tessellator.addVertexWithUV(11 * pixel / 2, 0, 1-11 * pixel / 2, pixelW *  5, pixelH * 0);
            }


        }
        tessellator.draw();

        GL11.glTranslated(0.5,0.5,0.5);
        if(direction.equals(ForgeDirection.UP) || direction.equals(ForgeDirection.DOWN)){
            GL11.glRotated(0,1,0,0);
        }
        else if(direction.equals(ForgeDirection.SOUTH) || direction.equals(ForgeDirection.NORTH)){
            GL11.glRotated(-90,1,0,0);
        }
        else if(direction.equals(ForgeDirection.EAST) || direction.equals(ForgeDirection.WEST)){
            GL11.glRotated(-270,0,0,1);
        }
        GL11.glTranslated(-0.5,-0.5,-0.5);

    }



    public void drawConnector(ForgeDirection direction) {

        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        {
            GL11.glTranslated(0.5,0.5,0.5);
            if(direction.equals(ForgeDirection.UP)){
                GL11.glRotated(0,1,0,0);
            }
            else if(direction.equals(ForgeDirection.DOWN)){
                GL11.glRotated(180,1,0,0);
            }
            else if(direction.equals(ForgeDirection.NORTH)){
                GL11.glRotated(270,1,0,0);
            }
            else if(direction.equals(ForgeDirection.SOUTH)){
                GL11.glRotated(90,1,0,0);
            }
            else if(direction.equals(ForgeDirection.WEST)){
                GL11.glRotated(90,0,0,1);
            }
            else if(direction.equals(ForgeDirection.EAST)){
                GL11.glRotated(270,0,0,1);
            }
            GL11.glTranslated(-0.5,-0.5,-0.5);



            tessellator.addVertexWithUV(1 - 11 * pixel / 2,  1 - 11 * pixel / 2, 1-11 * pixel / 2, pixelW *  5, pixelH * 5);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2,                   1, 1-11 * pixel / 2, pixelW * 10, pixelH * 5);
            tessellator.addVertexWithUV(    11 * pixel / 2,                   1, 1-11 * pixel / 2, pixelW * 10, pixelH * 0);
            tessellator.addVertexWithUV(    11 * pixel / 2,  1 - 11 * pixel / 2, 1-11 * pixel / 2, pixelW *  5, pixelH * 0);

            tessellator.addVertexWithUV(    11 * pixel / 2,  1 - 11 * pixel / 2, 11 * pixel / 2, pixelW *  5, pixelH * 5);
            tessellator.addVertexWithUV(    11 * pixel / 2,                   1, 11 * pixel / 2, pixelW * 10, pixelH * 5);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2,                   1, 11 * pixel / 2, pixelW * 10, pixelH * 0);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2,  1 - 11 * pixel / 2, 11 * pixel / 2, pixelW *  5, pixelH * 0);

            tessellator.addVertexWithUV(1 - 11 * pixel / 2,  1 - 11 * pixel / 2,   11 * pixel / 2, pixelW *  5, pixelH * 5);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2,                   1,   11 * pixel / 2, pixelW * 10, pixelH * 5);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2,                   1, 1-11 * pixel / 2, pixelW * 10, pixelH * 0);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2,  1 - 11 * pixel / 2, 1-11 * pixel / 2, pixelW *  5, pixelH * 0);

            tessellator.addVertexWithUV(11 * pixel / 2,  1 - 11 * pixel / 2, 1-11 * pixel / 2, pixelW *  5, pixelH * 0);
            tessellator.addVertexWithUV(11 * pixel / 2,                   1, 1-11 * pixel / 2, pixelW * 10, pixelH * 0);
            tessellator.addVertexWithUV(11 * pixel / 2,                   1,   11 * pixel / 2, pixelW * 10, pixelH * 5);
            tessellator.addVertexWithUV(11 * pixel / 2,  1 - 11 * pixel / 2,   11 * pixel / 2, pixelW *  5, pixelH * 5);


            if(drawInside){

                tessellator.addVertexWithUV(    11 * pixel / 2,  1 - 11 * pixel / 2, 1-11 * pixel / 2, pixelW *  5, pixelH * 0);
                tessellator.addVertexWithUV(    11 * pixel / 2,                   1, 1-11 * pixel / 2, pixelW * 10, pixelH * 0);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2,                   1, 1-11 * pixel / 2, pixelW * 10, pixelH * 5);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2,  1 - 11 * pixel / 2, 1-11 * pixel / 2, pixelW *  5, pixelH * 5);

                tessellator.addVertexWithUV(1 - 11 * pixel / 2,  1 - 11 * pixel / 2, 11 * pixel / 2, pixelW *  5, pixelH * 0);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2,                   1, 11 * pixel / 2, pixelW * 10, pixelH * 0);
                tessellator.addVertexWithUV(    11 * pixel / 2,                   1, 11 * pixel / 2, pixelW * 10, pixelH * 5);
                tessellator.addVertexWithUV(    11 * pixel / 2,  1 - 11 * pixel / 2, 11 * pixel / 2, pixelW *  5, pixelH * 5);

                tessellator.addVertexWithUV(1 - 11 * pixel / 2,  1 - 11 * pixel / 2, 1-11 * pixel / 2, pixelW *  5, pixelH * 0);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2,                   1, 1-11 * pixel / 2, pixelW * 10, pixelH * 0);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2,                   1,   11 * pixel / 2, pixelW * 10, pixelH * 5);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2,  1 - 11 * pixel / 2,   11 * pixel / 2, pixelW *  5, pixelH * 5);

                tessellator.addVertexWithUV(11 * pixel / 2,  1 - 11 * pixel / 2,   11 * pixel / 2, pixelW *  5, pixelH * 5);
                tessellator.addVertexWithUV(11 * pixel / 2,                   1,   11 * pixel / 2, pixelW * 10, pixelH * 5);
                tessellator.addVertexWithUV(11 * pixel / 2,                   1, 1-11 * pixel / 2, pixelW * 10, pixelH * 0);
                tessellator.addVertexWithUV(11 * pixel / 2,  1 - 11 * pixel / 2, 1-11 * pixel / 2, pixelW *  5, pixelH * 0);
            }


        }
        tessellator.draw();

        GL11.glTranslated(0.5,0.5,0.5);
        if(direction.equals(ForgeDirection.UP)){
            GL11.glRotated(0,1,0,0);
        }
        else if(direction.equals(ForgeDirection.DOWN)){
            GL11.glRotated(-180,1,0,0);
        }
        else if(direction.equals(ForgeDirection.NORTH)){
            GL11.glRotated(-270,1,0,0);
        }
        else if(direction.equals(ForgeDirection.SOUTH)){
            GL11.glRotated(-90,1,0,0);
        }
        else if(direction.equals(ForgeDirection.WEST)){
            GL11.glRotated(-90,0,0,1);
        }
        else if(direction.equals(ForgeDirection.EAST)){
            GL11.glRotated(-270,0,0,1);
        }
        GL11.glTranslated(-0.5,-0.5,-0.5);

    }


    public void drawCore (TileEntity tileEntity) {
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        {
            //Outside

            tessellator.addVertexWithUV(1 - 11 * pixel / 2,      11 * pixel / 2, 1-11 * pixel / 2, pixelW * 5, pixelH * 5);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2,  1 - 11 * pixel / 2, 1-11 * pixel / 2, pixelW * 5, pixelH * 0);
            tessellator.addVertexWithUV(    11 * pixel / 2,  1 - 11 * pixel / 2, 1-11 * pixel / 2, pixelW * 0, pixelH * 0);
            tessellator.addVertexWithUV(    11 * pixel / 2,      11 * pixel / 2, 1-11 * pixel / 2, pixelW * 0, pixelH * 5);

            tessellator.addVertexWithUV(1 - 11 * pixel / 2,      11 * pixel / 2,   11 * pixel / 2, pixelW * 5, pixelH * 5);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2,  1 - 11 * pixel / 2,   11 * pixel / 2, pixelW * 5, pixelH * 0);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2,  1 - 11 * pixel / 2, 1-11 * pixel / 2, pixelW * 0, pixelH * 0);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2,      11 * pixel / 2, 1-11 * pixel / 2, pixelW * 0, pixelH * 5);

            tessellator.addVertexWithUV(    11 * pixel / 2,      11 * pixel / 2, 11 * pixel / 2, pixelW * 5, pixelH * 5);
            tessellator.addVertexWithUV(    11 * pixel / 2,  1 - 11 * pixel / 2, 11 * pixel / 2, pixelW * 5, pixelH * 0);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2,  1 - 11 * pixel / 2, 11 * pixel / 2, pixelW * 0, pixelH * 0);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2,      11 * pixel / 2, 11 * pixel / 2, pixelW * 0, pixelH * 5);

            tessellator.addVertexWithUV(11 * pixel / 2,      11 * pixel / 2, 1-11 * pixel / 2, pixelW * 5, pixelH * 5);
            tessellator.addVertexWithUV(11 * pixel / 2,  1 - 11 * pixel / 2, 1-11 * pixel / 2, pixelW * 5, pixelH * 0);
            tessellator.addVertexWithUV(11 * pixel / 2,  1 - 11 * pixel / 2,   11 * pixel / 2, pixelW * 0, pixelH * 0);
            tessellator.addVertexWithUV(11 * pixel / 2,      11 * pixel / 2,   11 * pixel / 2, pixelW * 0, pixelH * 5);

            tessellator.addVertexWithUV(1 - 11 * pixel / 2,  1 - 11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 5, pixelH * 5);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2,  1 - 11 * pixel / 2,     11 * pixel / 2, pixelW * 5, pixelH * 0);
            tessellator.addVertexWithUV(    11 * pixel / 2,  1 - 11 * pixel / 2,     11 * pixel / 2, pixelW * 0, pixelH * 0);
            tessellator.addVertexWithUV(    11 * pixel / 2,  1 - 11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 0, pixelH * 5);

            tessellator.addVertexWithUV(    11 * pixel / 2,  11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 0, pixelH * 5);
            tessellator.addVertexWithUV(    11 * pixel / 2,  11 * pixel / 2,     11 * pixel / 2, pixelW * 0, pixelH * 0);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2,  11 * pixel / 2,     11 * pixel / 2, pixelW * 5, pixelH * 0);
            tessellator.addVertexWithUV(1 - 11 * pixel / 2,  11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 5, pixelH * 5);


            if(drawInside) {
                //Inside

                tessellator.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 0, pixelH * 5);
                tessellator.addVertexWithUV(11 * pixel / 2, 1 - 11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 0, pixelH * 0);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1 - 11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 5, pixelH * 0);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 5, pixelH * 5);

                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 0, pixelH * 5);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1 - 11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 0, pixelH * 0);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1 - 11 * pixel / 2, 11 * pixel / 2, pixelW * 5, pixelH * 0);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, pixelW * 5, pixelH * 5);

                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, pixelW * 0, pixelH * 5);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1 - 11 * pixel / 2, 11 * pixel / 2, pixelW * 0, pixelH * 0);
                tessellator.addVertexWithUV(11 * pixel / 2, 1 - 11 * pixel / 2, 11 * pixel / 2, pixelW * 5, pixelH * 0);
                tessellator.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, pixelW * 5, pixelH * 5);

                tessellator.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, pixelW * 0, pixelH * 5);
                tessellator.addVertexWithUV(11 * pixel / 2, 1 - 11 * pixel / 2, 11 * pixel / 2, pixelW * 0, pixelH * 0);
                tessellator.addVertexWithUV(11 * pixel / 2, 1 - 11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 5, pixelH * 0);
                tessellator.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 5, pixelH * 5);

                tessellator.addVertexWithUV(11 * pixel / 2, 1 - 11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 0, pixelH * 5);
                tessellator.addVertexWithUV(11 * pixel / 2, 1 - 11 * pixel / 2, 11 * pixel / 2, pixelW * 0, pixelH * 0);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1 - 11 * pixel / 2, 11 * pixel / 2, pixelW * 5, pixelH * 0);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 1 - 11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 5, pixelH * 5);

                tessellator.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 0, pixelH * 5);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 11 * pixel / 2, 1 - 11 * pixel / 2, pixelW * 5, pixelH * 5);
                tessellator.addVertexWithUV(1 - 11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, pixelW * 5, pixelH * 0);
                tessellator.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, pixelW * 0, pixelH * 0);


            }


        }
        tessellator.draw();
    }




}