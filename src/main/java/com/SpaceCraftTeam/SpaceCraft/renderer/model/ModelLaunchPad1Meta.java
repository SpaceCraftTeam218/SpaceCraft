package com.SpaceCraftTeam.SpaceCraft.renderer.model;

import com.SpaceCraftTeam.SpaceCraft.reference.Models;
import net.minecraft.client.model.ModelBase;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

/**
 * Created by jalle_000 on 6/14/2015.
 */
public class ModelLaunchPad1Meta extends ModelBase {

    public IModelCustom modelLaunchPad;

    public ModelLaunchPad1Meta() {
        modelLaunchPad = AdvancedModelLoader.loadModel(Models.MODELLAUNCHPAD1META);
    }

    public void render()
    {
        modelLaunchPad.renderAll();
    }
}
