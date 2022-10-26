package com.k42un0k0.poopmod.codegen.data;


import com.google.common.collect.ImmutableList;
import com.k42un0k0.poopmod.block.PoopBlocks;
import com.mojang.datafixers.util.Pair;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.ValidationTracker;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class PoopLootTableProvider extends LootTableProvider {

    public PoopLootTableProvider(DataGenerator gen) {
        super(gen);
    }

    @Override
    protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        return ImmutableList.of(Pair.of(ExampleModLootTables::new, LootParameterSets.BLOCK));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
    }

    private static class ExampleModLootTables extends BlockLootTables {
        @Override
        protected Iterable<Block> getKnownBlocks() {
            return PoopBlocks.getEntries().stream().map(RegistryObject::get).collect(Collectors.toList());
        }

        @Override
        protected void addTables() {
        }
    }

}
