package com.k42un0k0.poopmod.util;

import com.k42un0k0.poopmod.PoopMod;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistryEntry;

import java.util.Objects;

public class Resource {
    public static String keys(String... keys) {
        return String.join(".", keys);
    }

    public static String name(ForgeRegistryEntry<?> entry) {
        return Objects.requireNonNull(entry.getRegistryName()).toString();
    }

    public static String path(ForgeRegistryEntry<?> entry) {
        return Objects.requireNonNull(entry.getRegistryName()).getPath();
    }

    public static ResourceLocation extend(ResourceLocation rl, String suffix) {
        return new ResourceLocation(rl.getNamespace(), rl.getPath() + suffix);
    }

    public static ResourceLocation replace(ResourceLocation rl, String target, String replacement) {
        return new ResourceLocation(rl.getNamespace(), rl.getPath().replace(target, replacement));
    }

    public static ResourceLocation modLoc(String path) {
        return new ResourceLocation(PoopMod.MOD_ID, path);
    }

    public static ResourceLocation mcLoc(String path) {
        return new ResourceLocation("minecraft", path);
    }
}
