package com.SpaceCraftTeam.SpaceCraft.renderer.model;

import com.SpaceCraftTeam.SpaceCraft.reference.Models;
import net.minecraft.client.model.ModelBase;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

/**
 * Created by jalle_000 on 6/13/2015.
 */
public class ModelLaunchPad5Meta extends ModelBase{

    public IModelCustom modelLaunchPad;

    public ModelLaunchPad5Meta() {
        modelLaunchPad = AdvancedModelLoader.loadModel(Models.MODELLAUNCHPAD5META);
    }

    public void render()
    {
        modelLaunchPad.renderAll();
    }

}
