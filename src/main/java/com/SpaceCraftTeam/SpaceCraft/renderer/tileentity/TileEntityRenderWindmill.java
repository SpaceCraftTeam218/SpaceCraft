package com.SpaceCraftTeam.SpaceCraft.renderer.tileentity;

import com.SpaceCraftTeam.SpaceCraft.init.ModBlocks;
import com.SpaceCraftTeam.SpaceCraft.reference.Textures;
import com.jacat.WindmillMod.block.tileentity.TileEntityWindmill;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class TileEntityRenderWindmill extends TileEntitySpecialRenderer {

	private final ResourceLocation textureStone = new ResourceLocation("textures/blocks/stone.png");

	
	
	private int textureWidth = 32;
	private int textureHeight = 32;
	
	public float pixel = 1F/16F;
	public float pixelW = 1F/textureWidth;
	public float pixelH = 1F/textureHeight;

	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {

		int x1 = tileentity.xCoord;
		int y1 = tileentity.yCoord;
		int z1 = tileentity.zCoord;

		while(tileentity.getWorldObj().getBlockMetadata(x1, y1, z1) < 7 && tileentity.getWorldObj().getBlock(x1, y1, z1).equals(ModBlocks.blockWindmill)){
			y1++;
		}


		int direction = tileentity.getWorldObj().getBlockMetadata(x1, y1, z1)-8;
		int metadata = tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord);
		
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x, (float)y, (float)z);

		GL11.glTranslatef(0.5F, 0, 0.5F);
		GL11.glRotatef(direction*90, 0, 1, 0);
		GL11.glTranslatef(-0.5F, 0, -0.5F);

		GL11.glDisable(GL11.GL_LIGHTING);

		Tessellator tess = Tessellator.instance;
		this.bindTexture(Textures.Model.Windmill);
		tess.startDrawingQuads();
		{
			if(metadata > 0 && metadata < 7){
				tess.addVertexWithUV(4*pixel, 0, 1-4*pixel, pixelW*8, pixelH*1);
				tess.addVertexWithUV(4*pixel, 1, 1-4*pixel, pixelW*8, pixelH*0);
				tess.addVertexWithUV(4*pixel, 1, 4*pixel, pixelW*0, pixelH*0);
				tess.addVertexWithUV(4*pixel, 0, 4*pixel, pixelW*0, pixelH*1);
				
				tess.addVertexWithUV(1-4*pixel, 0, 1-4*pixel, pixelW*8, pixelH*1);
				tess.addVertexWithUV(1-4*pixel, 1, 1-4*pixel, pixelW*8, pixelH*0);
				tess.addVertexWithUV(4*pixel, 1, 1-4*pixel, pixelW*0, pixelH*0);
				tess.addVertexWithUV(4*pixel, 0, 1-4*pixel, pixelW*0, pixelH*1);
				
				tess.addVertexWithUV(4*pixel, 0, 4*pixel, pixelW*8, pixelH*1);
				tess.addVertexWithUV(4*pixel, 1, 4*pixel, pixelW*8, pixelH*0);
				tess.addVertexWithUV(1-4*pixel, 1, 4*pixel, pixelW*0, pixelH*0);
				tess.addVertexWithUV(1-4*pixel, 0, 4*pixel, pixelW*0, pixelH*1);
				
				tess.addVertexWithUV(1-4*pixel, 0, 4*pixel, pixelW*8, pixelH*1);
				tess.addVertexWithUV(1-4*pixel, 1, 4*pixel, pixelW*8, pixelH*0);
				tess.addVertexWithUV(1-4*pixel, 1, 1-4*pixel, pixelW*0, pixelH*0);
				tess.addVertexWithUV(1-4*pixel, 0, 1-4*pixel, pixelW*0, pixelH*1);
			}
			
		
			
			if(metadata > 7) {
				this.bindTexture(textureStone);
				tess.addVertexWithUV(1,1,1,1,1);
				tess.addVertexWithUV(1,1,0,1,0);
				tess.addVertexWithUV(0,1,0,0,0);
				tess.addVertexWithUV(0,1,1,0,1);

				tess.addVertexWithUV(0,0,1,0,0);
				tess.addVertexWithUV(0,0,0,0,1);
				tess.addVertexWithUV(1,0,0,1,1);
				tess.addVertexWithUV(1,0,1,1,0);

				tess.addVertexWithUV(1,0,1,1,1);
				tess.addVertexWithUV(1,1,1,1,0);
				tess.addVertexWithUV(0,1,1,0,0);
				tess.addVertexWithUV(0,0,1,0,1);

				tess.addVertexWithUV(1,0,0,1,0);
				tess.addVertexWithUV(0,0,0,0,0);
				tess.addVertexWithUV(0,1,0,0,1);
				tess.addVertexWithUV(1,1,0,1,1);

				tess.addVertexWithUV(1,0,0,1,1);
				tess.addVertexWithUV(1,1,0,1,0);
				tess.addVertexWithUV(1,1,1,0,0);
				tess.addVertexWithUV(1,0,1,0,1);

				tess.addVertexWithUV(0,0,0,1,1);
				tess.addVertexWithUV(0,0,1,0,1);
				tess.addVertexWithUV(0,1,1,0,0);
				tess.addVertexWithUV(0,1,0,1,0);

			}
			
		}
		tess.draw();

		if(metadata > 7)drawRotor(tileentity);


		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}

	private void drawRotor(TileEntity tileentity) {
		
		TileEntityWindmill windmill = (TileEntityWindmill) tileentity.getWorldObj().getTileEntity(tileentity.xCoord, tileentity.yCoord, tileentity.zCoord);
		
		GL11.glTranslatef(0, 0.5F, 0.5F);
		GL11.glRotatef(windmill.rotation, 1, 0, 0);
		GL11.glTranslatef(0, -0.5F, -0.5F);
		
		GL11.glDisable(GL11.GL_LIGHTING);
		
		Tessellator tess = Tessellator.instance;
		this.bindTexture(Textures.Model.WindmillBaseMeta0);
		tess.startDrawingQuads();
		{
			
			tess.addVertexWithUV(-2*pixel, 0.5F+1*pixel, 1*pixel+0.5F, 9*pixelW, 1*pixelH);
			tess.addVertexWithUV(-2*pixel, 2.5F,  1*pixel+0.5F, 9*pixelW, 0*pixelH);
			tess.addVertexWithUV(-2*pixel, 2.5F,  -1*pixel+0.5F, 8*pixelW, 0*pixelH);
			tess.addVertexWithUV(-2*pixel, 0.5F+1*pixel,  -1*pixel+0.5F, 8*pixelW, 1*pixelH);

			tess.addVertexWithUV(-2*pixel, -1.5F, 1*pixel+0.5F, 9*pixelW, 1*pixelH);
			tess.addVertexWithUV(-2*pixel, 0.5F-1*pixel,  1*pixel+0.5F, 9*pixelW, 0*pixelH);
			tess.addVertexWithUV(-2*pixel, 0.5F-1*pixel,  -1*pixel+0.5F, 8*pixelW, 0*pixelH);
			tess.addVertexWithUV(-2*pixel, -1.5F,  -1*pixel+0.5F, 8*pixelW, 1*pixelH);

			tess.addVertexWithUV(-2*pixel, 0.5F-1*pixel, 2.5F, 9*pixelW, 1*pixelH);
			tess.addVertexWithUV(-2*pixel, 0.5F+1*pixel,  2.5F, 9*pixelW, 0*pixelH);
			tess.addVertexWithUV(-2*pixel, 0.5F+1*pixel,  0.5F+1*pixel, 8*pixelW, 0*pixelH);
			tess.addVertexWithUV(-2*pixel, 0.5F-1*pixel,  0.5F+1*pixel, 8*pixelW, 1*pixelH);

			tess.addVertexWithUV(-2*pixel, 0.5F-1*pixel, 0.5F-1*pixel, 9*pixelW, 1*pixelH);
			tess.addVertexWithUV(-2*pixel, 0.5F+1*pixel,  0.5F-1*pixel, 9*pixelW, 0*pixelH);
			tess.addVertexWithUV(-2*pixel, 0.5F+1*pixel,  -1.5F, 8*pixelW, 0*pixelH);
			tess.addVertexWithUV(-2*pixel, 0.5F-1*pixel,  -1.5F, 8*pixelW, 1*pixelH);

            //BackSide

            tess.addVertexWithUV(-2*pixel, 0.5F+1*pixel,  -1*pixel+0.5F, 8*pixelW, 1*pixelH);
            tess.addVertexWithUV(-2*pixel, 2.5F,  -1*pixel+0.5F, 8*pixelW, 0*pixelH);
            tess.addVertexWithUV(-2*pixel, 2.5F,  1*pixel+0.5F, 9*pixelW, 0*pixelH);
            tess.addVertexWithUV(-2*pixel, 0.5F+1*pixel, 1*pixel+0.5F, 9*pixelW, 1*pixelH);

            tess.addVertexWithUV(-2*pixel, -1.5F,  -1*pixel+0.5F, 8*pixelW, 1*pixelH);
            tess.addVertexWithUV(-2*pixel, 0.5F-1*pixel,  -1*pixel+0.5F, 8*pixelW, 0*pixelH);
            tess.addVertexWithUV(-2*pixel, 0.5F-1*pixel,  1*pixel+0.5F, 9*pixelW, 0*pixelH);
            tess.addVertexWithUV(-2*pixel, -1.5F, 1*pixel+0.5F, 9*pixelW, 1*pixelH);

            tess.addVertexWithUV(-2*pixel, 0.5F-1*pixel,  0.5F+1*pixel, 8*pixelW, 1*pixelH);
            tess.addVertexWithUV(-2*pixel, 0.5F+1*pixel,  0.5F+1*pixel, 8*pixelW, 0*pixelH);
            tess.addVertexWithUV(-2*pixel, 0.5F+1*pixel,  2.5F, 9*pixelW, 0*pixelH);
            tess.addVertexWithUV(-2*pixel, 0.5F-1*pixel, 2.5F, 9*pixelW, 1*pixelH);

            tess.addVertexWithUV(-2*pixel, 0.5F-1*pixel,  -1.5F, 8*pixelW, 1*pixelH);
            tess.addVertexWithUV(-2*pixel, 0.5F+1*pixel,  -1.5F, 8*pixelW, 0*pixelH);
            tess.addVertexWithUV(-2*pixel, 0.5F-1*pixel, 0.5F-1*pixel, 9*pixelW, 1*pixelH);
            tess.addVertexWithUV(-2*pixel, 0.5F+1*pixel,  0.5F-1*pixel, 9*pixelW, 0*pixelH);

		}
		tess.draw();

        this.bindTexture(Textures.Model.WindmillBlock);
        tess.startDrawingQuads();
        {
            tess.addVertexWithUV(-2*pixel, 7*pixel, 9*pixel, 6*(1F/10), 6*(1F/10));
            tess.addVertexWithUV(-2*pixel, 9*pixel, 9*pixel, 6*(1F/10), 4*(1F/10));
            tess.addVertexWithUV(-2*pixel, 9*pixel, 7*pixel, 4*(1F/10), 4*(1F/10));
            tess.addVertexWithUV(-2*pixel, 7*pixel, 7*pixel, 4*(1F/10), 6*(1F/10));

            tess.addVertexWithUV(-2*pixel, 7*pixel, 7*pixel, 6*(1F/10), 6*(1F/10));
            tess.addVertexWithUV(-2*pixel, 9*pixel, 7*pixel, 6*(1F/10), 4*(1F/10));
            tess.addVertexWithUV(0*pixel, 9*pixel, 7*pixel, 4*(1F/10), 4*(1F/10));
            tess.addVertexWithUV(0*pixel, 7*pixel, 7*pixel, 4*(1F/10), 6*(1F/10));

            tess.addVertexWithUV(0*pixel, 7*pixel, 9*pixel, 6*(1F/10), 4*(1F/10));
            tess.addVertexWithUV(0*pixel, 9*pixel, 9*pixel, 6*(1F/10), 6*(1F/10));
            tess.addVertexWithUV(-2*pixel, 9*pixel, 9*pixel, 4*(1F/10), 6*(1F/10));
            tess.addVertexWithUV(-2*pixel, 7*pixel, 9*pixel, 4*(1F/10), 4*(1F/10));

            tess.addVertexWithUV(0*pixel, 9*pixel, 9*pixel, 4*(1F/10), 4*(1F/10));
            tess.addVertexWithUV(0*pixel, 9*pixel, 7*pixel, 4*(1F/10), 6*(1F/10));
            tess.addVertexWithUV(-2*pixel, 9*pixel, 7*pixel, 6*(1F/10), 6*(1F/10));
            tess.addVertexWithUV(-2*pixel, 9*pixel, 9*pixel, 6*(1F/10), 4*(1F/10));

            tess.addVertexWithUV(-2*pixel, 7*pixel, 9*pixel, 4*(1F/10), 4*(1F/10));
            tess.addVertexWithUV(-2*pixel, 7*pixel, 7*pixel, 4*(1F/10), 6*(1F/10));
            tess.addVertexWithUV(0*pixel, 7*pixel, 7*pixel, 6*(1F/10), 6*(1F/10));
            tess.addVertexWithUV(0*pixel, 7*pixel, 9*pixel, 6*(1F/10), 4*(1F/10));


        }

        tess.draw();

		GL11.glEnable(GL11.GL_LIGHTING); 
	}
	
	
}
