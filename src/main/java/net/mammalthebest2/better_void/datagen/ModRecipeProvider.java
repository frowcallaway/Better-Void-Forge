package net.mammalthebest2.better_void.datagen;

import net.mammalthebest2.better_void.block.ModBlocks;
import net.mammalthebest2.better_void.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(ModBlocks.VOID_DOOR.get())
                .define('D', ModBlocks.VOID_PLANKS.get())
                .pattern("DD")
                .pattern("DD")
                .pattern("DD")
                .unlockedBy("has_void_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.VOID_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModItems.VOID_INGOT.get())
                .requires(ModBlocks.VOID_BLOCK.get())
                .unlockedBy("has_void_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.VOID_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.VOID_BLOCK.get())
                .define('D', ModItems.VOID_INGOT.get())
                .pattern("DDD")
                .pattern("DDD")
                .pattern("DDD")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.VOID_STEAK.get())
                .define('E', Items.COOKED_BEEF)
                .define('D', ModItems.VOID_INGOT.get())
                .pattern("DDD")
                .pattern("DED")
                .pattern("DDD")
                .unlockedBy("has_cooked_beef", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COOKED_BEEF).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.VOID_SLAB.get())
                .define('D', ModItems.VOID_INGOT.get())
                .pattern("   ")
                .pattern("DDD")
                .pattern("   ")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.VOID_STAIRS.get())
                .define('D', ModItems.VOID_INGOT.get())
                .pattern("D  ")
                .pattern("DD ")
                .pattern("DDD")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.VOID_SWORD.get())
                .define('D', ModItems.VOID_INGOT.get())
                .define('#', Items.STICK)
                .pattern(" D ")
                .pattern(" D ")
                .pattern(" # ")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.VOID_FENCE_GATE.get())
                .define('D', ModBlocks.VOID_BLOCK.get())
                .define('#', Items.STICK)
                .pattern("D#D")
                .pattern("D#D")
                .pattern("   ")
                .unlockedBy("has_void_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);
    }
}
