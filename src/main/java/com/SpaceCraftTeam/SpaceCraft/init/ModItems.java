package com.SpaceCraftTeam.SpaceCraft.init;

import com.SpaceCraftTeam.SpaceCraft.SpaceCraft;
import com.SpaceCraftTeam.SpaceCraft.creativetab.CreativeTab;
import com.SpaceCraftTeam.SpaceCraft.item.ItemWindmill;
import com.SpaceCraftTeam.SpaceCraft.item.armor.ItemTinArmor;
import com.SpaceCraftTeam.SpaceCraft.item.weapons.ItemSmallBomb;
import com.SpaceCraftTeam.SpaceCraft.reference.Names;
import com.SpaceCraftTeam.SpaceCraft.reference.Textures;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ModItems {

    public static final Item itemWindmill = new ItemWindmill();

    public static final Item itemTinHelmet = new ItemTinArmor(ItemArmor.ArmorMaterial.IRON, SpaceCraft.proxy.addArmor("TinArmor"), 0).setUnlocalizedName(Names.Armor.TINHELMET).setCreativeTab(CreativeTab.SpaceCraftTab).setTextureName(Textures.Items.TinHelmet);
    public static final Item itemTinPlate = new ItemTinArmor(ItemArmor.ArmorMaterial.IRON, SpaceCraft.proxy.addArmor("TinArmor"), 1).setUnlocalizedName(Names.Armor.TINPLATE).setCreativeTab(CreativeTab.SpaceCraftTab).setTextureName(Textures.Items.TinPlate);
    public static final Item itemTinPants = new ItemTinArmor(ItemArmor.ArmorMaterial.IRON, SpaceCraft.proxy.addArmor("TinArmor"), 2).setUnlocalizedName(Names.Armor.TINPANTS).setCreativeTab(CreativeTab.SpaceCraftTab).setTextureName(Textures.Items.TinPants);
    public static final Item itemTinBoots = new ItemTinArmor(ItemArmor.ArmorMaterial.IRON, SpaceCraft.proxy.addArmor("TinArmor"), 3).setUnlocalizedName(Names.Armor.TINBOOTS).setCreativeTab(CreativeTab.SpaceCraftTab).setTextureName(Textures.Items.TinBoots);

    public static final Item itemSmallBomb = new ItemSmallBomb().setUnlocalizedName(Names.Weapons.SMALLBOMB).setCreativeTab(CreativeTab.SpaceCraftTab);

    public static void init() {

        GameRegistry.registerItem(itemWindmill, Names.Items.WINDMILL);

        GameRegistry.registerItem(itemTinHelmet, Names.Armor.TINHELMET);
        GameRegistry.registerItem(itemTinPlate, Names.Armor.TINPLATE);
        GameRegistry.registerItem(itemTinPants, Names.Armor.TINPANTS);
        GameRegistry.registerItem(itemTinBoots, Names.Armor.TINBOOTS);

        GameRegistry.registerItem(itemSmallBomb,Names.Weapons.SMALLBOMB);

    }

}
