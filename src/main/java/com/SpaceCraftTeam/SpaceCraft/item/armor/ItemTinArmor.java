package com.SpaceCraftTeam.SpaceCraft.item.armor;

import com.SpaceCraftTeam.SpaceCraft.init.ModItems;
import com.SpaceCraftTeam.SpaceCraft.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;


public class ItemTinArmor extends ItemArmor {

    public ItemTinArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if(stack.getItem() == ModItems.itemTinHelmet || stack.getItem() ==ModItems.itemTinPlate || stack.getItem() ==ModItems.itemTinBoots){
            return Reference.LOWERCASE_MOD_ID + ":textures/armor/TinArmor1.png";
        }else if(stack.getItem() == ModItems.itemTinPants){
            return Reference.LOWERCASE_MOD_ID + ":textures/armor/TinArmor2.png";
        }else {
            return null;
        }
    }
}
