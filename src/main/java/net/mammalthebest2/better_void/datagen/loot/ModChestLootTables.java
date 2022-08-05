package net.mammalthebest2.better_void.datagen.loot;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.mammalthebest2.better_void.item.BetterVoidCreativeTab;
import net.mammalthebest2.better_void.item.ModItems;
import net.minecraft.data.loot.ChestLoot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.function.BiConsumer;

public class ModChestLootTables extends ChestLoot {

    private static final ResourceLocation CUSTOM_CHEST_LOOT =
            new ResourceLocation(BetterVoidMain.MOD_ID,"chests/custom_chest_loot");

    @Override
    public void accept(BiConsumer<ResourceLocation, LootTable.Builder> p_124363_) {
        p_124363_.accept(CUSTOM_CHEST_LOOT, LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(2.0F, 8.0F))
                .add(LootItem.lootTableItem(ModItems.VOID_INGOT.get()).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(ModItems.VOID_FRAGMENT.get()).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                .add(LootItem.lootTableItem(Items.BRAIN_CORAL).setWeight(10).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))));


    }
}
