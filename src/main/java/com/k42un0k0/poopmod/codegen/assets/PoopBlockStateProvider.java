package com.k42un0k0.poopmod.codegen.assets;

import com.k42un0k0.poopmod.block.PoopBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class PoopBlockStateProvider extends BlockStateProvider {
    public PoopBlockStateProvider(DataGenerator gen, String modId, ExistingFileHelper exFileHelper) {
        super(gen, modId, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        withExistingModel(PoopBlocks.POOP_BLOCK.get());
    }

    private void withExistingModel(Block block){
        ModelFile model = models().getExistingFile(block.getRegistryName());
        simpleBlock(block,model);
    }



}
