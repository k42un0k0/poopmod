package com.k42un0k0.poopmod.events;


import com.k42un0k0.poopmod.PoopMod;
import com.k42un0k0.poopmod.entity.PoopEntityTypes;
import com.k42un0k0.poopmod.entity.custom.PoopEntity;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PoopMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PoopEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(PoopEntityTypes.POOP.get(), PoopEntity.setCustomAttributes().build());
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
//        PoopSpawnEggItem.initSpawnEggs();
    }
}
