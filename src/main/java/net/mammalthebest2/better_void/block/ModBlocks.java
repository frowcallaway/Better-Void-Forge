package net.mammalthebest2.better_void.block;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.mammalthebest2.better_void.block.custom.ModFlammableRotatedPillarBlock;
import net.mammalthebest2.better_void.block.custom.VoidBlock;
import net.mammalthebest2.better_void.block.custom.VoidInfuser;
import net.mammalthebest2.better_void.item.ModItems;
import net.mammalthebest2.better_void.item.BetterVoidCreativeTab;
import net.mammalthebest2.better_void.world.feature.tree.VoidTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

/**
 * Some blocks are not from the Block class like this one:
 * {@link VoidBlock}
 */

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCK =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BetterVoidMain.MOD_ID);

    public static void register(IEventBus eventBus){
        BLOCK.register(eventBus);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                       new Item.Properties().tab(tab)));
    }

    private static <T extends Block> RegistryObject<T> registerBlock (String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn  = BLOCK.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    public static final RegistryObject<Block> VOID_BLOCK = registerBlock("void_block",
            () -> new VoidBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL).requiresCorrectToolForDrops().strength(9f)), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> VOID_ORE = registerBlock("void_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(9f)), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> VOID_STAIRS = registerBlock("void_stairs",
            () -> new StairBlock(() -> ModBlocks.VOID_BLOCK.get().defaultBlockState() ,BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(9f)), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> VOID_SLAB = registerBlock("void_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(9f)), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> VOID_FENCE = registerBlock("void_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(9f)), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> VOID_FENCE_GATE = registerBlock("void_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(9f)), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> VOID_WALL = registerBlock("void_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(9f)), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> VOID_BUTTON = registerBlock("void_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(9f).noCollission()), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> VOID_PRESSURE_PLATE = registerBlock("void_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(9f)), BetterVoidCreativeTab.better_void);
    public static final RegistryObject<Block> VOID_TRAPDOOR = registerBlock("void_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().noOcclusion()), BetterVoidCreativeTab.better_void);
    public static final RegistryObject<Block> VOID_DOOR = registerBlock("void_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.HEAVY_METAL)), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> VOID_LOG = registerBlock("void_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> VOID_WOOD = registerBlock("void_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> VOID_PLANKS = registerBlock("void_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> STRIPPED_VOID_LOG = registerBlock("stripped_void_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> STRIPPED_VOID_WOOD = registerBlock("stripped_void_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> VOID_LEAVES = registerBlock("void_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }
            }, BetterVoidCreativeTab.better_void);
    public static final RegistryObject<Block> VOID_SAPLING = registerBlock("void_sapling",
            () -> new SaplingBlock(new VoidTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> VOID_INFUSER = registerBlock("void_infuser",
            () -> new VoidInfuser(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> ENDSTONE_VOID_ORE = registerBlock("endstone_void_ore",
            () -> new VoidInfuser(BlockBehaviour.Properties.of(Material.STONE)), BetterVoidCreativeTab.better_void);

    public static final RegistryObject<Block> NETHERRACK_VOID_ORE = registerBlock("netherrack_void_ore",
            () -> new VoidInfuser(BlockBehaviour.Properties.of(Material.STONE)), BetterVoidCreativeTab.better_void);



}

