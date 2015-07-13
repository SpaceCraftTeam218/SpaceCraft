package com.SpaceCraftTeam.SpaceCraft.renderer.tileentity;

import com.SpaceCraftTeam.SpaceCraft.init.ModBlocks;
import com.SpaceCraftTeam.SpaceCraft.reference.Textures;
import org.lwjgl.opengl.GL11;


import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;


public class TileEntityRenderWindmillBase extends TileEntitySpecialRenderer {


    private int textureWidth = 32;
    private int textureHeight = 32;

    public static float pixel = 1F/16F;

    public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {

        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glTranslatef((float) x, (float) y, (float) z);

        Tessellator tess = Tessellator.instance;
        this.bindTexture(Textures.Model.LAUNCHPAD0META);
        tess.startDrawingQuads();
        {

            if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 0){
                tess.addVertexWithUV(1, pixel*14, 1, 1F/textureWidth*(8+16), 1F/textureHeight*(8+16));
                tess.addVertexWithUV(1, pixel*14, 0, 1F/textureWidth*(8+16), 1F/textureHeight*8);
                tess.addVertexWithUV(0, pixel*14, 0, 1F/textureWidth*8, 1F/textureHeight*8);
                tess.addVertexWithUV(0, pixel*14, 1, 1F/textureWidth*8, 1F/textureHeight*(8+16));

                tess.addVertexWithUV(0, 0, 1, 1F/textureWidth*(8), 1F/textureHeight*(8));
                tess.addVertexWithUV(0, 0, 0, 1F/textureWidth*(8), 1F/textureHeight*(8+16));
                tess.addVertexWithUV(1, 0, 0, 1F/textureWidth*(8+16), 1F/textureHeight*(8+16));
                tess.addVertexWithUV(1, 0, 1, 1F/textureWidth*(8+16), 1F/textureHeight*(8));

                tess.addVertexWithUV(1, pixel*0, 1, 1F/textureWidth*(8+16), 1F/textureHeight*(8+16));
                tess.addVertexWithUV(1, pixel*14, 1, 1F/textureWidth*(8+16), 1F/textureHeight*(8));
                tess.addVertexWithUV(0, pixel*14, 1, 1F/textureWidth*(8), 1F/textureHeight*(8));
                tess.addVertexWithUV(0, pixel*0, 1, 1F/textureWidth*(8), 1F/textureHeight*(8+16));

                tess.addVertexWithUV(1, pixel*0, 0, 1F/textureWidth*(8+16), 1F/textureHeight*(8));
                tess.addVertexWithUV(0, pixel*0, 0, 1F/textureWidth*(8), 1F/textureHeight*(8));
                tess.addVertexWithUV(0, pixel*14, 0, 1F/textureWidth*(8), 1F/textureHeight*(8+14));
                tess.addVertexWithUV(1, pixel*14, 0, 1F/textureWidth*(8+16), 1F/textureHeight*(8+14));

                tess.addVertexWithUV(1, pixel*0, 0, 1F/textureWidth*(8+16), 1F/textureHeight*(8+14));
                tess.addVertexWithUV(1, pixel*14, 0, 1F/textureWidth*(8+16), 1F/textureHeight*(8));
                tess.addVertexWithUV(1, pixel*14, 1, 1F/textureWidth*(8), 1F/textureHeight*(8));
                tess.addVertexWithUV(1, pixel*0, 1, 1F/textureWidth*(8), 1F/textureHeight*(8+14));

                tess.addVertexWithUV(0, pixel*0, 0, 1F/textureWidth*(8+16), 1F/textureHeight*(8+16));
                tess.addVertexWithUV(0, pixel*0, 1, 1F/textureWidth*(8), 1F/textureHeight*8);
                tess.addVertexWithUV(0, pixel*14, 1, 1F/textureWidth*(8), 1F/textureHeight*8);
                tess.addVertexWithUV(0, pixel*14, 0, 1F/textureWidth*(8+16), 1F/textureHeight*(8+16));

            }

            if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 1){
                //top
                tess.addVertexWithUV(0.5, pixel*14, 0.5, 1F/textureWidth*(32), 1F/textureHeight*(32));
                tess.addVertexWithUV(0.5, pixel*14, 0, 1F/textureWidth*(32), 1F/textureHeight*(8+16));
                tess.addVertexWithUV(0, pixel*14, 0, 1F/textureWidth*(8+16), 1F/textureHeight*(8+16));
                tess.addVertexWithUV(0, pixel*14, 0.5, 1F/textureWidth*(8+16), 1F/textureHeight*(32));

                tess.addVertexWithUV(0.5, pixel*0, 0.5, 1F/textureWidth*(32), 1F/textureHeight*(16));
                tess.addVertexWithUV(0.5, pixel*14, 0.5, 1F/textureWidth*(32), 1F/textureHeight*(0));
                tess.addVertexWithUV(0, pixel*14, 0.5, 1F/textureWidth*(8+16), 1F/textureHeight*(0));
                tess.addVertexWithUV(0, pixel*0, 0.5, 1F/textureWidth*(8+16), 1F/textureHeight*(16));

                tess.addVertexWithUV(0.5, pixel*0, 0, 1F/textureWidth*(8), 1F/textureHeight*(16));
                tess.addVertexWithUV(0.5, pixel*14, 0, 1F/textureWidth*(8), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*14, 0.5, 1F/textureWidth*(0), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*0, 0.5, 1F/textureWidth*(0), 1F/textureHeight*(16));


            }

            if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 2){
                //top
                tess.addVertexWithUV(0.5, pixel*14, 1, 1F/textureWidth*(32), 1F/textureHeight*(8+16));
                tess.addVertexWithUV(0.5, pixel*14, 0, 1F/textureWidth*(32), 1F/textureHeight*(8));
                tess.addVertexWithUV(0, pixel*14, 0, 1F/textureWidth*(8+16), 1F/textureHeight*(8));
                tess.addVertexWithUV(0, pixel*14, 1, 1F/textureWidth*(8+16), 1F/textureHeight*(8+16));

                tess.addVertexWithUV(0.5, pixel*0, 0, 1F/textureWidth*(8+16), 1F/textureHeight*(16));
                tess.addVertexWithUV(0.5, pixel*14, 0, 1F/textureWidth*(8+16), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*14, 1, 1F/textureWidth*(8), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*0, 1, 1F/textureWidth*(8), 1F/textureHeight*(16));

            }


            if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 3){
                //top
                tess.addVertexWithUV(0.5, pixel*14, 1, 1F/textureWidth*(32), 1F/textureHeight*(8));
                tess.addVertexWithUV(0.5, pixel*14, 0.5, 1F/textureWidth*(32), 1F/textureHeight*(0));
                tess.addVertexWithUV(0, pixel*14, 0.5, 1F/textureWidth*(8+16), 1F/textureHeight*(0));
                tess.addVertexWithUV(0, pixel*14, 1, 1F/textureWidth*(8+16), 1F/textureHeight*(8));

                tess.addVertexWithUV(0.5, pixel*0, 0.5, 1F/textureWidth*(32), 1F/textureHeight*(16));
                tess.addVertexWithUV(0.5, pixel*14, 0.5, 1F/textureWidth*(32), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*14, 1, 1F/textureWidth*(8+16), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*0, 1, 1F/textureWidth*(8+16), 1F/textureHeight*(16));

                tess.addVertexWithUV(0, pixel*0, 0.5, 1F/textureWidth*(8), 1F/textureHeight*(16));
                tess.addVertexWithUV(0, pixel*14, 0.5, 1F/textureWidth*(8), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*14, 0.5, 1F/textureWidth*(0), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*0, 0.5, 1F/textureWidth*(0), 1F/textureHeight*(16));


            }
            if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 4){
                //top
                tess.addVertexWithUV(1, pixel*14, 0.5, 1F/textureWidth*(8+16), 1F/textureHeight*(32));
                tess.addVertexWithUV(1, pixel*14, 0, 1F/textureWidth*(8+16), 1F/textureHeight*(8+16));
                tess.addVertexWithUV(0, pixel*14, 0, 1F/textureWidth*(8), 1F/textureHeight*(8+16));
                tess.addVertexWithUV(0, pixel*14, 0.5, 1F/textureWidth*(8), 1F/textureHeight*(32));

                tess.addVertexWithUV(1, pixel*0, 0.5, 1F/textureWidth*(8+16), 1F/textureHeight*(16));
                tess.addVertexWithUV(1, pixel*14, 0.5, 1F/textureWidth*(8+16), 1F/textureHeight*(0));
                tess.addVertexWithUV(0, pixel*14, 0.5, 1F/textureWidth*(8), 1F/textureHeight*(0));
                tess.addVertexWithUV(0, pixel*0, 0.5, 1F/textureWidth*(8), 1F/textureHeight*(16));


            }

            if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 5){
                tess.addVertexWithUV(1, pixel*14, 1, 1F/textureWidth*(8+16), 1F/textureHeight*(8+16));
                tess.addVertexWithUV(1, pixel*14, 0, 1F/textureWidth*(8+16), 1F/textureHeight*8);
                tess.addVertexWithUV(0, pixel*14, 0, 1F/textureWidth*8, 1F/textureHeight*8);
                tess.addVertexWithUV(0, pixel*14, 1, 1F/textureWidth*8, 1F/textureHeight*(8+16));

            }
            if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 6){
                //top
                tess.addVertexWithUV(1, pixel*14, 1, 1F/textureWidth*(8+16), 1F/textureHeight*(8));
                tess.addVertexWithUV(1, pixel*14, 0.5, 1F/textureWidth*(8+16), 1F/textureHeight*(0));
                tess.addVertexWithUV(0, pixel*14, 0.5, 1F/textureWidth*(8), 1F/textureHeight*(0));
                tess.addVertexWithUV(0, pixel*14, 1, 1F/textureWidth*(8), 1F/textureHeight*(8));

                tess.addVertexWithUV(0, pixel*0, 0.5, 1F/textureWidth*(8+16), 1F/textureHeight*(16));
                tess.addVertexWithUV(0, pixel*14, 0.5, 1F/textureWidth*(8+16), 1F/textureHeight*(0));
                tess.addVertexWithUV(1, pixel*14, 0.5, 1F/textureWidth*(8), 1F/textureHeight*(0));
                tess.addVertexWithUV(1, pixel*0, 0.5, 1F/textureWidth*(8), 1F/textureHeight*(16));


            }
            if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 7){
                //top
                tess.addVertexWithUV(1, pixel*14, 0.5, 1F/textureWidth*(8), 1F/textureHeight*(32));
                tess.addVertexWithUV(1, pixel*14, 0, 1F/textureWidth*(8), 1F/textureHeight*(8+16));
                tess.addVertexWithUV(0.5, pixel*14, 0, 1F/textureWidth*(0), 1F/textureHeight*(8+16));
                tess.addVertexWithUV(0.5, pixel*14, 0.5, 1F/textureWidth*(0), 1F/textureHeight*(32));

                tess.addVertexWithUV(1, pixel*0, 0.5, 1F/textureWidth*(8), 1F/textureHeight*(16));
                tess.addVertexWithUV(1, pixel*14, 0.5, 1F/textureWidth*(8), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*14, 0.5, 1F/textureWidth*(0), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*0, 0.5, 1F/textureWidth*(0), 1F/textureHeight*(16));

                tess.addVertexWithUV(0.5, pixel*0, 0.5, 1F/textureWidth*(32), 1F/textureHeight*(16));
                tess.addVertexWithUV(0.5, pixel*14, 0.5, 1F/textureWidth*(32), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*14, 0, 1F/textureWidth*(8+16), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*0, 0, 1F/textureWidth*(8+16), 1F/textureHeight*(16));


            }
            if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 8){
                //top
                tess.addVertexWithUV(1, pixel*14, 1, 1F/textureWidth*(8), 1F/textureHeight*(8+16));
                tess.addVertexWithUV(1, pixel*14, 0, 1F/textureWidth*(8), 1F/textureHeight*(8));
                tess.addVertexWithUV(0.5, pixel*14, 0, 1F/textureWidth*(0), 1F/textureHeight*(8));
                tess.addVertexWithUV(0.5, pixel*14, 1, 1F/textureWidth*(0), 1F/textureHeight*(8+16));

                tess.addVertexWithUV(0.5, pixel*0, 1, 1F/textureWidth*(8+16), 1F/textureHeight*(16));
                tess.addVertexWithUV(0.5, pixel*14, 1, 1F/textureWidth*(8+16), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*14, 0, 1F/textureWidth*(8), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*0, 0, 1F/textureWidth*(8), 1F/textureHeight*(16));

            }
            if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 9){
                //top
                tess.addVertexWithUV(1, pixel*14, 1, 1F/textureWidth*(8), 1F/textureHeight*(8));
                tess.addVertexWithUV(1, pixel*14, 0.5, 1F/textureWidth*(8), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*14, 0.5, 1F/textureWidth*(0), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*14, 1, 1F/textureWidth*(0), 1F/textureHeight*(8));

                tess.addVertexWithUV(0.5, pixel*0, 1, 1F/textureWidth*(8), 1F/textureHeight*(16));
                tess.addVertexWithUV(0.5, pixel*14, 1, 1F/textureWidth*(8), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*14, 0.5, 1F/textureWidth*(0), 1F/textureHeight*(0));
                tess.addVertexWithUV(0.5, pixel*0, 0.5, 1F/textureWidth*(0), 1F/textureHeight*(16));

                tess.addVertexWithUV(0.5, pixel*0, 0.5, 1F/textureWidth*(32), 1F/textureHeight*(16));
                tess.addVertexWithUV(0.5, pixel*14, 0.5, 1F/textureWidth*(32), 1F/textureHeight*(0));
                tess.addVertexWithUV(1, pixel*14, 0.5, 1F/textureWidth*(8+16), 1F/textureHeight*(0));
                tess.addVertexWithUV(1, pixel*0, 0.5, 1F/textureWidth*(8+16), 1F/textureHeight*(16));
            }
        }
        tess.draw();


        this.bindTexture(Textures.Model.LAUNCHPAD0META);
        tess.startDrawingQuads();
        {

            if(tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord) == 5){
                if(tileentity.getWorldObj().getBlock(tileentity.xCoord, tileentity.yCoord+1, tileentity.zCoord).equals(ModBlocks.blockWindmill)){

                    tess.addVertexWithUV(pixel*13,pixel*16,pixel*13,1,1);
                    tess.addVertexWithUV(pixel*13,pixel*16,pixel*3,1,0);
                    tess.addVertexWithUV(pixel*3,pixel*16,pixel*3,0,0);
                    tess.addVertexWithUV(pixel*3,pixel*16,pixel*13,0,1);

                    tess.addVertexWithUV(pixel*13,pixel*14,pixel*13,1,1F/10F*2);
                    tess.addVertexWithUV(pixel*13,pixel*16,pixel*13,1,0);
                    tess.addVertexWithUV(pixel*3,pixel*16,pixel*13,0,0);
                    tess.addVertexWithUV(pixel*3,pixel*14,pixel*13,0,1F/10F*2);

                    tess.addVertexWithUV(pixel*3,pixel*14,pixel*3,1,1F/10F*2);
                    tess.addVertexWithUV(pixel*3,pixel*16,pixel*3,1,0);
                    tess.addVertexWithUV(pixel*13,pixel*16,pixel*3,0,0);
                    tess.addVertexWithUV(pixel*13,pixel*14,pixel*3,0,1F/10F*2);

                    tess.addVertexWithUV(pixel*13,pixel*14,pixel*3,1,1F/10F*2);
                    tess.addVertexWithUV(pixel*13,pixel*16,pixel*3,1,0);
                    tess.addVertexWithUV(pixel*13,pixel*16,pixel*13,0,0);
                    tess.addVertexWithUV(pixel*13,pixel*14,pixel*13,0,1F/10F*2);

                    tess.addVertexWithUV(pixel*3,pixel*14,pixel*13,1,1F/10F*2);
                    tess.addVertexWithUV(pixel*3,pixel*16,pixel*13,1,0);
                    tess.addVertexWithUV(pixel*3,pixel*16,pixel*3,0,0);
                    tess.addVertexWithUV(pixel*3,pixel*14,pixel*3,0,1F/10F*2);

                }
            }

        }
        tess.draw();

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();

    }

}
