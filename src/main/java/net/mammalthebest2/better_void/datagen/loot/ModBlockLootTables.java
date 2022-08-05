package net.mammalthebest2.better_void.datagen.loot;

import net.mammalthebest2.better_void.block.ModBlocks;
import net.mammalthebest2.better_void.datagen.ModItemModelProvider;
import net.mammalthebest2.better_void.item.ModItems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        this.dropSelf(ModBlocks.VOID_BLOCK.get());
        this.dropSelf(ModBlocks.VOID_DOOR.get());
        this.dropSelf(ModBlocks.VOID_INFUSER.get());
        this.dropSelf(ModBlocks.VOID_LEAVES.get());
        this.dropSelf(ModBlocks.VOID_FENCE.get());
        this.dropSelf(ModBlocks.VOID_PLANKS.get());
        this.dropSelf(ModBlocks.VOID_BUTTON.get());
        this.dropSelf(ModBlocks.VOID_LOG.get());
        this.dropSelf(ModBlocks.VOID_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.STRIPPED_VOID_LOG.get());
        this.dropSelf(ModBlocks.VOID_SAPLING.get());
        this.dropSelf(ModBlocks.VOID_STAIRS.get());
        this.dropSelf(ModBlocks.VOID_SLAB.get());
        this.dropSelf(ModBlocks.VOID_TRAPDOOR.get());
        this.dropSelf(ModBlocks.VOID_WALL.get());
        this.dropSelf(ModBlocks.VOID_FENCE_GATE.get());
        this.dropSelf(ModBlocks.VOID_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_VOID_WOOD.get());

        this.add(ModBlocks.VOID_ORE.get(),
                (block) -> createOreDrop(ModBlocks.VOID_ORE.get(), ModItems.VOID_FRAGMENT.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCK.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
