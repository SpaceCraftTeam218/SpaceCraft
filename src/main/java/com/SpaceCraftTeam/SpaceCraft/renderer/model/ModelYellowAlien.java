package com.SpaceCraftTeam.SpaceCraft.renderer.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelYellowAlien extends ModelBase
{
    //fields
    ModelRenderer body;
    ModelRenderer Foot1;
    ModelRenderer Foot2;

    public ModelYellowAlien()
    {
        textureWidth = 64;
        textureHeight = 32;

        body = new ModelRenderer(this, 0, 0);
        body.addBox(-2F, 0F, -2F, 5, 5, 4);
        body.setRotationPoint(0F, 16F, 0F);
        body.setTextureSize(64, 32);
        body.mirror = true;
        setRotation(body, 0F, 0F, 0F);
        Foot1 = new ModelRenderer(this, 0, 12);
        Foot1.addBox(-1F, 0F, -1F, 2, 3, 2);
        Foot1.setRotationPoint(-1F, 21F, 0F);
        Foot1.setTextureSize(64, 32);
        Foot1.mirror = true;
        setRotation(Foot1, 0F, 0F, 0F);
        Foot2 = new ModelRenderer(this, 13, 12);
        Foot2.addBox(1F, 0F, -1F, 2, 3, 2);
        Foot2.setRotationPoint(0F, 21F, 0F);
        Foot2.setTextureSize(64, 32);
        Foot2.mirror = true;
        setRotation(Foot2, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5,entity);
        body.render(f5);
        Foot1.render(f5);
        Foot2.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5,entity);
        this.body.rotateAngleX = f4 / (180F / (float)Math.PI);
        this.body.rotateAngleY = f3 / (180F / (float)Math.PI);

        this.Foot1.rotateAngleX = MathHelper.cos(f*0.6662F) * 1.4F * f1;
        this.Foot2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    }

}
