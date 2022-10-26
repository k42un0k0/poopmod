package com.k42un0k0.poopmod.codegen;

import com.k42un0k0.poopmod.codegen.assets.PoopBlockStateProvider;
import com.k42un0k0.poopmod.codegen.assets.PoopItemModelProvider;
import com.k42un0k0.poopmod.codegen.assets.lang.PoopEnUsLanguageProvider;
import com.k42un0k0.poopmod.codegen.assets.lang.PoopJaJpLanguageProvider;
import com.k42un0k0.poopmod.codegen.data.PoopLootTableProvider;
import com.k42un0k0.poopmod.codegen.data.PoopRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

import static com.k42un0k0.poopmod.PoopMod.MOD_ID;

public class PoopCodegen {

    protected static void registerProviders(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        if (event.includeClient()) {
            gen.addProvider(new PoopBlockStateProvider(gen, MOD_ID, event.getExistingFileHelper()));
            gen.addProvider(new PoopItemModelProvider(gen, MOD_ID, event.getExistingFileHelper()));
            gen.addProvider(new PoopEnUsLanguageProvider(gen, MOD_ID));
            gen.addProvider(new PoopJaJpLanguageProvider(gen, MOD_ID));
        }
        if (event.includeServer()) {
            gen.addProvider(new PoopRecipeProvider(gen));
            gen.addProvider(new PoopLootTableProvider(gen));
        }
    }

    public static void register(IEventBus eventBus) {
        eventBus.addListener(PoopCodegen::registerProviders);
    }
}
