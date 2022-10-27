package com.k42un0k0.poopmod.entity.render;

import com.k42un0k0.poopmod.PoopMod;
import com.k42un0k0.poopmod.entity.custom.PoopEntity;
import com.k42un0k0.poopmod.entity.model.PoopModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class PoopRenderer extends MobRenderer<PoopEntity, PoopModel<PoopEntity>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(PoopMod.MOD_ID, "textures/entity/poop.png");

    public PoopRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new PoopModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getTextureLocation(PoopEntity entity) {
        return TEXTURE;
    }
}
