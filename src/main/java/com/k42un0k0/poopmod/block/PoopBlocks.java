package com.k42un0k0.poopmod.block;

import com.k42un0k0.poopmod.PoopMod;
import net.minecraft.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Collection;

public class PoopBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            PoopMod.MOD_ID);

    public static Collection<RegistryObject<Block>> getEntries() {
        return BLOCKS.getEntries();
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
