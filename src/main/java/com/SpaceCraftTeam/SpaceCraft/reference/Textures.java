package com.SpaceCraftTeam.SpaceCraft.reference;

import com.SpaceCraftTeam.SpaceCraft.util.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

public class Textures {

    public static final String RESOURCE_PREFIX = Reference.LOWERCASE_MOD_ID + ":";

    public static final class Armor
    {

    }

    public static final class Model
    {
        private static final String MODEL_TEXTURE_LOCATION = "textures/models/";
        public static final ResourceLocation LAUNCHPAD0META = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "ModelLaunchPad0Meta.png");
        public static final ResourceLocation LAUNCHPAD1META = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "ModelLaunchPad1Meta.png");
        public static final ResourceLocation LAUNCHPAD2META = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "ModelLaunchPad2Meta.png");
        public static final ResourceLocation LAUNCHPAD3META = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "ModelLaunchPad3Meta.png");
        public static final ResourceLocation LAUNCHPAD4META = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "ModelLaunchPad4Meta.png");
        public static final ResourceLocation LAUNCHPAD5META = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "ModelLaunchPad5Meta.png");
        public static final ResourceLocation LAUNCHPAD6META = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "ModelLaunchPad6Meta.png");
        public static final ResourceLocation LAUNCHPAD7META = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "ModelLaunchPad7Meta.png");
        public static final ResourceLocation LAUNCHPAD8META = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "ModelLaunchPad8Meta.png");
        public static final ResourceLocation LAUNCHPAD9META = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "ModelLaunchPad9Meta.png");
    }

    public static final class Gui
    {

        protected static final String GUI_TEXTURE_LOCATION = "textures/gui/";
        public static final ResourceLocation LAUNCHPAD = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "LaunchPadGui.png");

    }

}
