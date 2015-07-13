package com.SpaceCraftTeam.SpaceCraft.init;

import com.SpaceCraftTeam.SpaceCraft.item.ItemWindmill;
import com.SpaceCraftTeam.SpaceCraft.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {

    public static final Item itemWindmill = new ItemWindmill();

    public static void init() {

        GameRegistry.registerItem(itemWindmill, Names.Items.WINDMILL);

    }

}
