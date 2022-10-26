package com.k42un0k0.poopmod.item;

import com.k42un0k0.poopmod.PoopMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class PoopItemGroup {
    public static final ItemGroup TAB = new ItemGroup(PoopMod.MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.ROTTEN_FLESH);
//            return new ItemStack(PoopItems.TITANIUM_INGOT.get());
        }
    };
}
