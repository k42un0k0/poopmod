package com.k42un0k0.poopmod.entity;

import com.k42un0k0.poopmod.PoopMod;
import com.k42un0k0.poopmod.entity.custom.PoopEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PoopEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, PoopMod.MOD_ID);

    public static final RegistryObject<EntityType<PoopEntity>> POOP = ENTITY_TYPES.register("poop",
            ()->EntityType.Builder.of(PoopEntity::new, EntityClassification.MISC).sized(1f,3f)
                    .build(new ResourceLocation(PoopMod.MOD_ID,"poop").toString()));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
