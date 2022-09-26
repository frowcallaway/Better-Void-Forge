package net.mammalthebest2.better_void.item;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.mammalthebest2.better_void.entity.ModEntityTypes;
import net.mammalthebest2.better_void.item.custom.VoidBurnerItem;
import net.mammalthebest2.better_void.item.custom.VoidStaff;
import net.mammalthebest2.better_void.item.custom.WitheringSwordItem;
import net.mammalthebest2.better_void.sound.ModSounds;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // DEFERRED REGISTER
    // 18 USAGES?!
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterVoidMain.MOD_ID);
    // 10 USAGES?!
    public static final RegistryObject<Item> VOID_INGOT = ITEMS.register("void_ingot",
            () -> new Item(new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID).fireResistant()));

    public static final RegistryObject<Item> VOID_FRAGMENT = ITEMS.register("void_fragment",
            () -> new Item(new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID).fireResistant()));

    public static final RegistryObject<Item> VOID_STAFF = ITEMS.register("void_staff",
            () -> new VoidStaff(new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID).stacksTo(1)));

    public static final RegistryObject<Item> VOID_STEAK = ITEMS.register("void_steak",
            () -> new Item(new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID).food(ModFoods.VOID_STEAK)));

    public static final RegistryObject<Item> VOID_BURNER = ITEMS.register("void_burner",
            () -> new VoidBurnerItem(new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID)));

    public static final RegistryObject<Item> VOID_SWORD = ITEMS.register("void_sword",
            () -> new WitheringSwordItem(ModTiers.EXTREME_VOID, 8,4.0f,
                    new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID)));

    public static final RegistryObject<Item> VOID_PICKAXE = ITEMS.register("void_pickaxe",
            () -> new PickaxeItem(ModTiers.EXTREME_VOID, 3,5f,
                    new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID)));

    public static final RegistryObject<Item> VOID_AXE = ITEMS.register("void_axe",
            () -> new AxeItem(ModTiers.EXTREME_VOID, 2,4f,
                    new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID)));

    public static final RegistryObject<Item> VOID_HOE = ITEMS.register("void_hoe",
            () -> new HoeItem(ModTiers.EXTREME_VOID, 0,0f,
                    new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID)));

    public static final RegistryObject<Item> VOID_SHOVEL = ITEMS.register("void_shovel",
            () -> new ShovelItem(ModTiers.EXTREME_VOID, 0,0f,
                    new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID)));

    public static final RegistryObject<Item> VOID_HELMET = ITEMS.register("void_helmet",
            () -> new ArmorItem(ModArmorMaterials.EXTREME_VOID, EquipmentSlot.HEAD,
                    new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID)));

    public static final RegistryObject<Item> VOID_CHESTPLATE= ITEMS.register("void_chestplate",
            () -> new ArmorItem(ModArmorMaterials.EXTREME_VOID, EquipmentSlot.CHEST,
                    new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID)));

    public static final RegistryObject<Item> VOID_LEGGINGS= ITEMS.register("void_leggings",
            () -> new ArmorItem(ModArmorMaterials.EXTREME_VOID, EquipmentSlot.LEGS,
                    new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID)));

    public static final RegistryObject<Item> VOID_BOOTS= ITEMS.register("void_boots",
            () -> new ArmorItem(ModArmorMaterials.EXTREME_VOID, EquipmentSlot.FEET,
                    new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID)));

    public static final RegistryObject<Item> VOID_MUSIC_DISC = ITEMS.register("void_music_disc",
            () -> new RecordItem(6, ModSounds.AMONG_US_MUSIC,
                    new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID).stacksTo(16)));

    public static final RegistryObject<Item> PLAYER_SPAWN_EGG = ITEMS.register("player_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.PLAYER, 15504197, 15506501,
                    new Item.Properties().tab(BetterVoidCreativeTab.BETTER_VOID).stacksTo(16)));

    public static final RegistryObject<Item> LAVA_INFUSED_VOID_INGOT = ITEMS.register("lava_infused_void_ingot",
            () -> new Item(new Item.Properties().tab(BetterVoidCreativeTab.ELEMENTAL_VOID_INGOTS).fireResistant()));

    public static final RegistryObject<Item> WATER_INFUSED_VOID_INGOT = ITEMS.register("water_infused_void_ingot",
            () -> new Item(new Item.Properties().tab(BetterVoidCreativeTab.ELEMENTAL_VOID_INGOTS).fireResistant()));

    public static final RegistryObject<Item> EARTH_INFUSED_VOID_INGOT = ITEMS.register("earth_infused_void_ingot",
            () -> new Item(new Item.Properties().tab(BetterVoidCreativeTab.ELEMENTAL_VOID_INGOTS).fireResistant()));

    public static final RegistryObject<Item> EARTH_INFUSED_VOID_HELMET = ITEMS.register("earth_infused_void_helmet",
            () -> new ArmorItem(ModArmorMaterials.EARTH_INFUSED_VOID, EquipmentSlot.HEAD,
                    new Item.Properties().tab(BetterVoidCreativeTab.ELEMENTAL_VOID_INGOTS)));

    public static final RegistryObject<Item> EARTH_INFUSED_VOID_CHESTPLATE = ITEMS.register("earth_infused_void_chestplate",
            () -> new ArmorItem(ModArmorMaterials.EARTH_INFUSED_VOID, EquipmentSlot.CHEST,
                    new Item.Properties().tab(BetterVoidCreativeTab.ELEMENTAL_VOID_INGOTS)));

    public static final RegistryObject<Item> EARTH_INFUSED_VOID_LEGGINGS= ITEMS.register("earth_infused_void_leggings",
            () -> new ArmorItem(ModArmorMaterials.EARTH_INFUSED_VOID, EquipmentSlot.LEGS,
                    new Item.Properties().tab(BetterVoidCreativeTab.ELEMENTAL_VOID_INGOTS)));

    public static final RegistryObject<Item> EARTH_INFUSED_VOID_BOOTS= ITEMS.register("earth_infused_void_boots",
            () -> new ArmorItem(ModArmorMaterials.EARTH_INFUSED_VOID, EquipmentSlot.FEET,
                    new Item.Properties().tab(BetterVoidCreativeTab.ELEMENTAL_VOID_INGOTS)));


    public static final RegistryObject<Item> WATER_INFUSED_VOID_HELMET = ITEMS.register("water_infused_void_helmet",
            () -> new ArmorItem(ModArmorMaterials.WATER_INFUSED_VOID, EquipmentSlot.HEAD,
                    new Item.Properties().tab(BetterVoidCreativeTab.ELEMENTAL_VOID_INGOTS)));

    public static final RegistryObject<Item> WATER_INFUSED_VOID_CHESTPLATE = ITEMS.register("water_infused_void_chestplate",
            () -> new ArmorItem(ModArmorMaterials.WATER_INFUSED_VOID, EquipmentSlot.CHEST,
                    new Item.Properties().tab(BetterVoidCreativeTab.ELEMENTAL_VOID_INGOTS)));

    public static final RegistryObject<Item> WATER_INFUSED_VOID_LEGGINGS= ITEMS.register("water_infused_void_leggings",
            () -> new ArmorItem(ModArmorMaterials.WATER_INFUSED_VOID, EquipmentSlot.LEGS,
                    new Item.Properties().tab(BetterVoidCreativeTab.ELEMENTAL_VOID_INGOTS)));

    public static final RegistryObject<Item> WATER_INFUSED_VOID_BOOTS= ITEMS.register("water_infused_void_boots",
            () -> new ArmorItem(ModArmorMaterials.WATER_INFUSED_VOID, EquipmentSlot.FEET,
                    new Item.Properties().tab(BetterVoidCreativeTab.ELEMENTAL_VOID_INGOTS)));

    public static final RegistryObject<Item> LAVA_INFUSED_VOID_HELMET = ITEMS.register("lava_infused_void_helmet",
            () -> new ArmorItem(ModArmorMaterials.LAVA_INFUSED_VOID, EquipmentSlot.HEAD,
                    new Item.Properties().tab(BetterVoidCreativeTab.ELEMENTAL_VOID_INGOTS)));

    public static final RegistryObject<Item> LAVA_INFUSED_VOID_CHESTPLATE = ITEMS.register("lava_infused_void_chestplate",
            () -> new ArmorItem(ModArmorMaterials.LAVA_INFUSED_VOID, EquipmentSlot.CHEST,
                    new Item.Properties().tab(BetterVoidCreativeTab.ELEMENTAL_VOID_INGOTS)));

    public static final RegistryObject<Item> LAVA_INFUSED_VOID_LEGGINGS= ITEMS.register("lava_infused_void_leggings",
            () -> new ArmorItem(ModArmorMaterials.LAVA_INFUSED_VOID, EquipmentSlot.LEGS,
                    new Item.Properties().tab(BetterVoidCreativeTab.ELEMENTAL_VOID_INGOTS)));

    public static final RegistryObject<Item> LAVA_INFUSED_VOID_BOOTS= ITEMS.register("lava_infused_void_boots",
            () -> new ArmorItem(ModArmorMaterials.LAVA_INFUSED_VOID, EquipmentSlot.FEET,
                    new Item.Properties().tab(BetterVoidCreativeTab.ELEMENTAL_VOID_INGOTS)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
