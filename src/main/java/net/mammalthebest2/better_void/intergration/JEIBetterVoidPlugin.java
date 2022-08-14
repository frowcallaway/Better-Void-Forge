package net.mammalthebest2.better_void.intergration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.mammalthebest2.better_void.BetterVoidMain;
import net.mammalthebest2.better_void.recipe.VoidInfuserRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEIBetterVoidPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(BetterVoidMain.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(
                new VoidInfuserRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<VoidInfuserRecipe> recipes = rm.getAllRecipesFor(VoidInfuserRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(VoidInfuserRecipeCategory.UID, VoidInfuserRecipe.class), recipes);
    }
}
