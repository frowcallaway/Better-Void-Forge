package net.mammalthebest2.better_void.datagen;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.mammalthebest2.better_void.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, BetterVoidMain.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.VOID_INGOT.get());
        simpleItem(ModItems.VOID_FRAGMENT.get());
        simpleItem(ModItems.VOID_BOOTS.get());
        simpleItem(ModItems.VOID_CHESTPLATE.get());
        simpleItem(ModItems.VOID_BURNER.get());

        simpleItem(ModItems.VOID_STEAK.get());
        simpleItem(ModItems.VOID_HELMET.get());
        simpleItem(ModItems.VOID_LEGGINGS.get());
        simpleItem(ModItems.VOID_MUSIC_DISC.get());

        handheldItem(ModItems.VOID_SHOVEL.get());
        handheldItem(ModItems.VOID_AXE.get());
        handheldItem(ModItems.VOID_SWORD.get());
        handheldItem(ModItems.VOID_PICKAXE.get());
        handheldItem(ModItems.VOID_HOE.get());
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BetterVoidMain.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(BetterVoidMain.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }
}
