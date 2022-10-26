package com.k42un0k0.poopmod.block;

import com.k42un0k0.poopmod.PoopMod;
import com.k42un0k0.poopmod.block.custom.PoopBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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


    public static RegistryObject<Block> POOP_BLOCK = BLOCKS.register("poop_block",
            () -> new PoopBlock(AbstractBlock.Properties.copy(Blocks.SLIME_BLOCK)));

}
