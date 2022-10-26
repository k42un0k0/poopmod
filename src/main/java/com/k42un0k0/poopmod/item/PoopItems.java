package com.k42un0k0.poopmod.item;

import com.k42un0k0.poopmod.PoopMod;
import com.k42un0k0.poopmod.block.PoopBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class PoopItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            PoopMod.MOD_ID);

    private static Item.Properties defaultProperties() {
        return new Item.Properties().tab(PoopItemGroup.TAB);
    }

    private static RegistryObject<Item> registerBlockItem(String name, RegistryObject<Block> blockRegistryObject) {
        return ITEMS.register(name, () ->
                new BlockItem(blockRegistryObject.get(), defaultProperties()));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static RegistryObject<Item> POOP_BLOCK = ITEMS.register("poop_block",
            () -> new BlockItem(PoopBlocks.POOP_BLOCK.get(),
                    defaultProperties().food(new Food.Builder().effect(() -> new EffectInstance(Effects.HARM, 200),
                            1f).build())));

}
