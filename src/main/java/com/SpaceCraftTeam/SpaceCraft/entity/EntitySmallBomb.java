package com.SpaceCraftTeam.SpaceCraft.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySmallBomb extends EntityThrowable{


    public EntitySmallBomb(World world) {
        super(world);
    }

    public EntitySmallBomb(World world, EntityLivingBase entity) {
        super(world, entity);
    }

    @Override
    protected void onImpact(MovingObjectPosition p_70184_1_) {
        for(int i = 0; i<10; i++){
            this.worldObj.spawnParticle("flame",this.posX,this.posY,this.posZ,0.9F,0.9F,0.9F);
        }

        if(!this.worldObj.isRemote){
            this.setDead();
            if(!this.worldObj.isRemote){
                this.worldObj.createExplosion((Entity) null,this.posX,this.posY,this.posZ,2.4F,true);
            }
        }
    }
}
