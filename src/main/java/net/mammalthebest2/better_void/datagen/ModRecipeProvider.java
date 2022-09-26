package net.mammalthebest2.better_void.datagen;

import net.mammalthebest2.better_void.block.ModBlocks;
import net.mammalthebest2.better_void.datagen.custom.VoidInfusingRecipeBuilder;
import net.mammalthebest2.better_void.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.BlastingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.lwjgl.system.CallbackI;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(ModBlocks.VOID_DOOR.get())
                .define('D', ModBlocks.VOID_PLANKS.get())
                .pattern("DD ")
                .pattern("DD ")
                .pattern("DD ")
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

        ShapedRecipeBuilder.shaped(ModItems.VOID_STAFF.get())
                .define('D', ModBlocks.VOID_BLOCK.get())
                .define('O', ModBlocks.VOID_ORE.get())
                .define('I', ModItems.VOID_INGOT.get())
                .pattern("ODO")
                .pattern("OIO")
                .pattern(" I ")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.VOID_STAIRS.get())
                .define('D', ModBlocks.VOID_PLANKS.get())
                .pattern("D  ")
                .pattern("DD ")
                .pattern("DDD")
                .unlockedBy("has_void_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.VOID_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.VOID_SLAB.get())
                .define('D', ModBlocks.VOID_PLANKS.get())
                .pattern("DDD")
                .unlockedBy("has_void_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.VOID_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.VOID_WALL.get())
                .define('D', ModBlocks.VOID_BLOCK.get())
                .pattern("DDD")
                .pattern("DDD")
                .unlockedBy("has_void_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.VOID_BLOCK.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(ModBlocks.VOID_BUTTON.get())
                .requires(ModBlocks.VOID_PLANKS.get())
                .unlockedBy("has_void_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.VOID_PLANKS.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.VOID_PRESSURE_PLATE.get())
                .define('D', ModBlocks.VOID_PLANKS.get())
                .pattern("DD")
                .unlockedBy("has_void_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.VOID_PLANKS.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.VOID_INFUSER.get())
                .define('O', ModBlocks.VOID_ORE.get())
                .define('F', ModItems.VOID_FRAGMENT.get())
                .pattern("FFF")
                .pattern("FOF")
                .pattern("FFF")
                .unlockedBy("has_void_fragment", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_FRAGMENT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.VOID_STEAK.get())
                .define('I', ModItems.VOID_INGOT.get())
                .define('B', Items.BEEF)
                .pattern("III")
                .pattern("IBI")
                .pattern("III")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.VOID_INGOT.get()), ModItems.VOID_BURNER.get(), 1, 500)
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.VOID_SWORD.get())
                .define('I', ModItems.VOID_INGOT.get())
                .define('S', Items.STICK)
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" S ")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.VOID_PICKAXE.get())
                .define('I', ModItems.VOID_INGOT.get())
                .define('S', Items.STICK)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.VOID_HOE.get())
                .define('I', ModItems.VOID_INGOT.get())
                .define('S', Items.STICK)
                .pattern("II ")
                .pattern(" S ")
                .pattern(" S ")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.VOID_AXE.get())
                .define('I', ModItems.VOID_INGOT.get())
                .define('S', Items.STICK)
                .pattern("II ")
                .pattern("IS ")
                .pattern(" S ")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.VOID_SHOVEL.get())
                .define('I', ModItems.VOID_INGOT.get())
                .define('S', Items.STICK)
                .pattern(" I ")
                .pattern(" S ")
                .pattern(" S ")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.VOID_HELMET.get())
                .define('I', ModItems.VOID_INGOT.get())
                .pattern("III")
                .pattern("I I")
                .pattern("   ")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.VOID_CHESTPLATE.get())
                .define('I', ModItems.VOID_INGOT.get())
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.VOID_LEGGINGS.get())
                .define('I', ModItems.VOID_INGOT.get())
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.VOID_BOOTS.get())
                .define('I', ModItems.VOID_INGOT.get())
                .pattern("   ")
                .pattern("I I")
                .pattern("I I")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.VOID_MUSIC_DISC.get())
                .define('I', ModItems.VOID_FRAGMENT.get())
                .define('D', Items.MUSIC_DISC_CHIRP)
                .pattern("III")
                .pattern("IDI")
                .pattern("III")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.EARTH_INFUSED_VOID_HELMET.get())
                .define('I', ModItems.EARTH_INFUSED_VOID_INGOT.get())
                .pattern("III")
                .pattern("I I")
                .pattern("   ")
                .unlockedBy("has_earth_infused_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.EARTH_INFUSED_VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.EARTH_INFUSED_VOID_LEGGINGS.get())
                .define('I', ModItems.EARTH_INFUSED_VOID_INGOT.get())
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .unlockedBy("has_earth_infused_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.EARTH_INFUSED_VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.EARTH_INFUSED_VOID_BOOTS.get())
                .define('I', ModItems.EARTH_INFUSED_VOID_INGOT.get())
                .pattern("   ")
                .pattern("I I")
                .pattern("I I")
                .unlockedBy("has_earth_infused_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.EARTH_INFUSED_VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.WATER_INFUSED_VOID_HELMET.get())
                .define('I', ModItems.WATER_INFUSED_VOID_INGOT.get())
                .pattern("III")
                .pattern("I I")
                .pattern("   ")
                .unlockedBy("has_water_infused_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WATER_INFUSED_VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.WATER_INFUSED_VOID_CHESTPLATE.get())
                .define('I', ModItems.WATER_INFUSED_VOID_INGOT.get())
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .unlockedBy("has_water_infused_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WATER_INFUSED_VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.WATER_INFUSED_VOID_LEGGINGS.get())
                .define('I', ModItems.WATER_INFUSED_VOID_INGOT.get())
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .unlockedBy("has_water_infused_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WATER_INFUSED_VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.WATER_INFUSED_VOID_BOOTS.get())
                .define('I', ModItems.WATER_INFUSED_VOID_INGOT.get())
                .pattern("   ")
                .pattern("I I")
                .pattern("I I")
                .unlockedBy("has_water_infused_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WATER_INFUSED_VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.LAVA_INFUSED_VOID_HELMET.get())
                .define('I', ModItems.LAVA_INFUSED_VOID_INGOT.get())
                .pattern("III")
                .pattern("I I")
                .pattern("   ")
                .unlockedBy("has_lava_infused_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LAVA_INFUSED_VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.LAVA_INFUSED_VOID_CHESTPLATE.get())
                .define('I', ModItems.LAVA_INFUSED_VOID_INGOT.get())
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .unlockedBy("has_lava_infused_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LAVA_INFUSED_VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.LAVA_INFUSED_VOID_LEGGINGS.get())
                .define('I', ModItems.LAVA_INFUSED_VOID_INGOT.get())
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .unlockedBy("has_lava_infused_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LAVA_INFUSED_VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.LAVA_INFUSED_VOID_BOOTS.get())
                .define('I', ModItems.LAVA_INFUSED_VOID_INGOT.get())
                .pattern("   ")
                .pattern("I I")
                .pattern("I I")
                .unlockedBy("has_lava_infused_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LAVA_INFUSED_VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.WATER_INFUSED_VOID_INGOT.get())
                .define('W', Items.WATER_BUCKET)
                .define('I', ModItems.VOID_INGOT.get())
                .pattern(" W ")
                .pattern("WIW")
                .pattern(" W ")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.EARTH_INFUSED_VOID_INGOT.get())
                .define('G', Blocks.GRASS_BLOCK)
                .define('I', ModItems.VOID_INGOT.get())
                .pattern(" G ")
                .pattern("GIG")
                .pattern(" G ")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.LAVA_INFUSED_VOID_INGOT.get())
                .define('L', Items.LAVA_BUCKET)
                .define('I', ModItems.VOID_INGOT.get())
                .pattern(" L ")
                .pattern("LIL")
                .pattern(" L ")
                .unlockedBy("has_void_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_INGOT.get()).build()))
                .save(pFinishedRecipeConsumer);

        new VoidInfusingRecipeBuilder(ModItems.VOID_FRAGMENT.get(), ModItems.VOID_INGOT.get(), 1)
                .unlockedBy("has_void_fragment", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.VOID_FRAGMENT.get()).build()));

    }
}