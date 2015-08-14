package com.SpaceCraftTeam.SpaceCraft.entity;

import com.SpaceCraftTeam.SpaceCraft.SpaceCraft;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;

public class SpaceCraftEntity {

    public static void mainRegistry(){
        registerEntity();
    }

    public static void registerEntity(){

        createEntity(EntityGreenAlien.class, "GreenAlien", 0x5FE241, 0x449E2D);
        createEntity(EntityYellowAlien.class, "YellowAlien", 0xFFF20A, 0xFFC20A);
        createEntity(EntityRedAlien.class, "RedAlien",0xFF1500, 0xC60D00);

        createEntity(EntitySmallBomb.class, "SmallBomb", 0x000000, 0x574D4D);

    }

    public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
        int randomId = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(entityClass,entityName,randomId);
        EntityRegistry.registerModEntity(entityClass,entityName,randomId, SpaceCraft.Instance, 32, 1, true);
        createEgg(randomId,solidColor,spotColor);
    }

    private static void createEgg(int randomId, int solidColor, int spotColor ) {
        EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
    }


}
