package com.SpaceCraftTeam.SpaceCraft.renderer.entity;

import com.SpaceCraftTeam.SpaceCraft.entity.EntityGreenAlien;
import com.SpaceCraftTeam.SpaceCraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderGreenAlien extends RenderLiving
{
    private static final ResourceLocation mobTextures = new ResourceLocation(Reference.LOWERCASE_MOD_ID + ":textures/entity/GreenAlien.png");
    private static final String __OBFID = "CL_00000984";

    public RenderGreenAlien(ModelBase p_i1253_1_, float p_i1253_2_)
    {
        super(p_i1253_1_, p_i1253_2_);
    }


    protected ResourceLocation getEntityTexture(EntityGreenAlien p_110775_1_)
    {
        return mobTextures;
    }


    protected ResourceLocation getEntityTexture(Entity p_110775_1_)
    {
        return this.getEntityTexture((EntityGreenAlien)p_110775_1_);
    }
}