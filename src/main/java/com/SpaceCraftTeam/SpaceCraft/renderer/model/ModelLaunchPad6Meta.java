package com.SpaceCraftTeam.SpaceCraft.renderer.model;

import com.SpaceCraftTeam.SpaceCraft.reference.Models;
import net.minecraft.client.model.ModelBase;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class ModelLaunchPad6Meta extends ModelBase {

    public IModelCustom modelLaunchPad;

    public ModelLaunchPad6Meta() {
        modelLaunchPad = AdvancedModelLoader.loadModel(Models.MODELLAUNCHPAD6META);
    }

    public void render()
    {
        modelLaunchPad.renderAll();
    }
}
