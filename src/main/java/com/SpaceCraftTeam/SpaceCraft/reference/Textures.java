package com.SpaceCraftTeam.SpaceCraft.reference;

import com.SpaceCraftTeam.SpaceCraft.util.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

public class Textures {

    public static final String RESOURCE_PREFIX = Reference.LOWERCASE_MOD_ID + ":";


    public static final class Items{
        private static final String ITEM_TEXTURE_LOCATION = "textures/items/";

        public static final String TinHelmet = (ITEM_TEXTURE_LOCATION + "TinHelmet.png");
        public static final String TinPlate = (ITEM_TEXTURE_LOCATION + "TinPlate.png");
        public static final String TinPants = (ITEM_TEXTURE_LOCATION + "TinPants.png");
        public static final String TinBoots = (ITEM_TEXTURE_LOCATION + "TinBoots.png");



    }

    public static final class Armor
    {

    }

    public static final class Model
    {
        private static final String MODEL_TEXTURE_LOCATION = "textures/models/";

        public static final ResourceLocation COPPERWIRE = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "CopperWire.png");

        public static final ResourceLocation Windmill = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "windmill.png");
        public static final ResourceLocation WindmillBlock = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "windmillBlock.png");

        public static final ResourceLocation WindmillBaseMeta0 = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "WindmillBaseMeta0.png");

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

        public static final ResourceLocation BASICCRUSHER = ResourceLocationHelper.getResourceLocation(GUI_TEXTURE_LOCATION + "BasicCrusherGui.png");


    }

}
