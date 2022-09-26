package net.mammalthebest2.better_void.datagen;

import net.mammalthebest2.better_void.block.ModBlocks;
import net.mammalthebest2.better_void.effect.ModEffects;
import net.mammalthebest2.better_void.enchantment.ModEnchantments;
import net.mammalthebest2.better_void.item.BetterVoidCreativeTab;
import net.mammalthebest2.better_void.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }

    @Override
    protected void addTranslations() {
        // Item translations
        addItem(ModItems.EARTH_INFUSED_VOID_BOOTS, "Earth Infused Void Boots");
        addItem(ModItems.EARTH_INFUSED_VOID_CHESTPLATE, "Earth Infused Void Chestplate");
        addItem(ModItems.EARTH_INFUSED_VOID_LEGGINGS, "Earth Infused Void Leggings");
        addItem(ModItems.EARTH_INFUSED_VOID_HELMET, "Earth Infused Void Helmet");

        addItem(ModItems.WATER_INFUSED_VOID_BOOTS, "Water Infused Void Boots");
        addItem(ModItems.WATER_INFUSED_VOID_CHESTPLATE, "Water Infused Void Chestplate");
        addItem(ModItems.WATER_INFUSED_VOID_LEGGINGS, "Water Infused Void Leggings");
        addItem(ModItems.WATER_INFUSED_VOID_HELMET, "Water Infused Void Helmet");

        addItem(ModItems.LAVA_INFUSED_VOID_BOOTS, "Lava Infused Void Boots");
        addItem(ModItems.LAVA_INFUSED_VOID_CHESTPLATE, "Lava Infused Void Chestplate");
        addItem(ModItems.LAVA_INFUSED_VOID_LEGGINGS, "Lava Infused Void Leggings");
        addItem(ModItems.LAVA_INFUSED_VOID_HELMET, "Lava Infused Void Helmet");

        addItem(ModItems.VOID_BOOTS, "Void Boots");
        addItem(ModItems.VOID_CHESTPLATE, "Void Chestplate");
        addItem(ModItems.VOID_LEGGINGS, "Void Leggings");
        addItem(ModItems.VOID_HELMET, "Void Helmet");

        addItem(ModItems.VOID_AXE, "Void Axe");
        addItem(ModItems.VOID_HOE, "Void Hoe");
        addItem(ModItems.VOID_PICKAXE, "Void Pickaxe");
        addItem(ModItems.VOID_SHOVEL, "Void Shovel");
        addItem(ModItems.VOID_SWORD, "Void Sword");

        addItem(ModItems.VOID_STAFF, "Void Staff");
        addItem(ModItems.VOID_STEAK, "Void Steak");
        addItem(ModItems.VOID_BURNER, "Void Burner");
        addItem(ModItems.VOID_FRAGMENT, "Void Fragment");
        addItem(ModItems.VOID_INGOT, "Void Ingot");
        addItem(ModItems.EARTH_INFUSED_VOID_INGOT, "Earth Infused Void Ingot");
        addItem(ModItems.WATER_INFUSED_VOID_INGOT, "Water Infused Void Ingot");
        addItem(ModItems.LAVA_INFUSED_VOID_INGOT, "Lava Infused Void Ingot");
        addItem(ModItems.VOID_MUSIC_DISC, "Void Music Disc");

        // Block translations
        addBlock(ModBlocks.ENDSTONE_VOID_ORE, "Endstone Void Ore");
        addBlock(ModBlocks.NETHERRACK_VOID_ORE, "Netherrack Void Ore");
        addBlock(ModBlocks.VOID_BLOCK, "Void Block");
        addBlock(ModBlocks.VOID_ORE, "Void Ore");
        addBlock(ModBlocks.VOID_PLANKS, "Void Ore");

        addBlock(ModBlocks.VOID_BUTTON, "Void Button");
        addBlock(ModBlocks.VOID_DOOR, "Void Door");
        addBlock(ModBlocks.VOID_FENCE, "Void Fence");
        addBlock(ModBlocks.VOID_FENCE_GATE, "Void Fence Gate");
        addBlock(ModBlocks.VOID_PRESSURE_PLATE, "Void Pressure Plate");
        addBlock(ModBlocks.VOID_TRAPDOOR, "Void Trapdoor");
        addBlock(ModBlocks.VOID_SLAB, "Void Slab");
        addBlock(ModBlocks.VOID_STAIRS, "Void Stairs");
        addBlock(ModBlocks.VOID_WALL, "Void Wall");

        addBlock(ModBlocks.VOID_LOG, "Void Log");
        addBlock(ModBlocks.VOID_WOOD, "Void Wood");
        addBlock(ModBlocks.VOID_LEAVES, "Void Leaves");
        addBlock(ModBlocks.VOID_SAPLING, "Void Sapling");
        addBlock(ModBlocks.STRIPPED_VOID_WOOD, "Stripped Void Wood");
        addBlock(ModBlocks.STRIPPED_VOID_LOG, "Stripped Void Log");
        addBlock(ModBlocks.VOID_INFUSER, "Void Infuser");

        // Enchantment
        addEnchantment(ModEnchantments.DEATH_THREAT, "Death Threat");
        // Effect
        addEffect(ModEffects.TRAUMATISED, "Traumatised");
        add(ModItems.PLAYER_SPAWN_EGG.get(), "Spawn Player");
        add("itemGroup.elemental_void_ingots_tab", "Elemental Void Ingots");
        add("itemGroup.better_void_tab", "Better Void");
        add("item.better_void.void_music_disc.desc", "ChewieCatt - Why?!");
        add("item.minecraft.potion.effect.potion_of_traumatised", "Traumatised Potion");
        add("item.minecraft.splash_potion.effect.potion_of_traumatised", "Splash Potion Of Traumatised");
        add("item.minecraft.lingering_potion.effect.potion_of_traumatised", "Lingering Potion of Traumatised");
        add("item.minecraft.tipped_arrow.effect.potion_of_traumatised", "Tipped Arrow of Traumatised");
    }
}
