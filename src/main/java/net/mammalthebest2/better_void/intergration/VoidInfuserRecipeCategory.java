package net.mammalthebest2.better_void.intergration;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.mammalthebest2.better_void.BetterVoidMain;
import net.mammalthebest2.better_void.block.ModBlocks;
import net.mammalthebest2.better_void.recipe.VoidInfuserRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;

public class VoidInfuserRecipeCategory implements IRecipeCategory<VoidInfuserRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(BetterVoidMain.MOD_ID, "void_infusing");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(BetterVoidMain.MOD_ID, "textures/gui/void_infuser_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public VoidInfuserRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(ModBlocks.VOID_INFUSER.get()));
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends VoidInfuserRecipe> getRecipeClass() {
        return VoidInfuserRecipe.class;
    }


    @Override
    public Component getTitle() {
        return new TextComponent("Void Infuser");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull VoidInfuserRecipe recipe, @Nonnull IFocusGroup focusGroup) {
        builder.addSlot(RecipeIngredientRole.INPUT, 34, 40).addIngredients(Ingredient.of((Items.POTION).getDefaultInstance()));
        builder.addSlot(RecipeIngredientRole.INPUT, 57, 18).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 103, 18).addIngredients(Ingredient.of(Items.BLAZE_POWDER));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStack(recipe.getResultItem());
    }
}

