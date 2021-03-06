package com.SpaceCraftTeam.SpaceCraft.renderer.model;

import com.SpaceCraftTeam.SpaceCraft.reference.Models;
import net.minecraft.client.model.ModelBase;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class ModelLaunchPad9Meta extends ModelBase {

    public IModelCustom modelLaunchPad;

    public ModelLaunchPad9Meta() {
        modelLaunchPad = AdvancedModelLoader.loadModel(Models.MODELLAUNCHPAD9META);
    }

    public void render()
    {
        modelLaunchPad.renderAll();
    }
}
