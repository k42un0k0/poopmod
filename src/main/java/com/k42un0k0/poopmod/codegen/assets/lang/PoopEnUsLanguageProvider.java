package com.k42un0k0.poopmod.codegen.assets.lang;

import com.k42un0k0.poopmod.item.PoopItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class PoopEnUsLanguageProvider extends LanguageProvider {
    public PoopEnUsLanguageProvider(DataGenerator gen, String modId) {
        super(gen, modId, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(PoopItems.POOP_BLOCK.get(),"Big Poop");
        add(PoopItems.POOP_SPAWN_EGG.get(),"Poop Spawn Egg");
    }
}
