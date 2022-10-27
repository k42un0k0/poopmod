package com.k42un0k0.poopmod.codegen.assets;

import com.k42un0k0.poopmod.item.PoopItems;
import com.k42un0k0.poopmod.util.Resource;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class PoopItemModelProvider extends ItemModelProvider {
    public PoopItemModelProvider(DataGenerator gen, String modId, ExistingFileHelper existingFileHelper) {
        super(gen, modId, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(Resource.name(PoopItems.POOP_SPAWN_EGG.get()), "item/template_spawn_egg");
        withBlockParent(PoopItems.POOP_BLOCK.get());
    }

    private void withBlockParent(Item item) {
        ResourceLocation rl = Objects.requireNonNull(item.getRegistryName());
        withExistingParent(Resource.name(item), Resource.insert(rl, BLOCK_FOLDER + "/"));
    }

    private void simpleItem(Item item) {
        ResourceLocation name = Objects.requireNonNull(item.getRegistryName());
        singleTexture(name.getPath(), mcLoc(folder + "/generated"), "layer0",
                new ResourceLocation(name.getNamespace(), folder + "/" + name.getPath()));
    }
}
