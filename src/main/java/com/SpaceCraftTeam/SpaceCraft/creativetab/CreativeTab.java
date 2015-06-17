package com.SpaceCraftTeam.SpaceCraft.creativetab;

import com.SpaceCraftTeam.SpaceCraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTab {

    public static final CreativeTabs SpaceCraftTab = new CreativeTabs(Reference.LOWERCASE_MOD_ID) {
        @Override
        public Item getTabIconItem(){
            return Items.apple;
        }
    };

}
