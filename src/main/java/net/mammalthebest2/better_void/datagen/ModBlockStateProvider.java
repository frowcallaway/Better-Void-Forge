package net.mammalthebest2.better_void.datagen;

import net.mammalthebest2.better_void.BetterVoidMain;
import net.mammalthebest2.better_void.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProviderType;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Random;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, BetterVoidMain.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.VOID_BLOCK.get());
        simpleBlock(ModBlocks.VOID_ORE.get());
        simpleBlock(ModBlocks.VOID_LEAVES.get());
        simpleBlock(ModBlocks.VOID_PLANKS.get());

        buttonBlock((ButtonBlock) ModBlocks.VOID_BUTTON.get(), blockTexture(ModBlocks.VOID_BLOCK.get()));
        stairsBlock((StairBlock) ModBlocks.VOID_STAIRS.get(), blockTexture(ModBlocks.VOID_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.VOID_PRESSURE_PLATE.get(), blockTexture(ModBlocks.VOID_BLOCK.get()));
        fenceBlock((FenceBlock) ModBlocks.VOID_FENCE.get(), blockTexture(ModBlocks.VOID_BLOCK.get()));
        wallBlock((WallBlock) ModBlocks.VOID_WALL.get(), blockTexture(ModBlocks.VOID_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.VOID_SLAB.get(), blockTexture(ModBlocks.VOID_BLOCK.get()),
                blockTexture(ModBlocks.VOID_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.VOID_FENCE_GATE.get(), blockTexture(ModBlocks.VOID_BLOCK.get()));

        doorBlock((DoorBlock) ModBlocks.VOID_DOOR.get(), new ResourceLocation(BetterVoidMain.MOD_ID, "block/void_door_bottom"),
                new ResourceLocation(BetterVoidMain.MOD_ID, "block/void_door_top"));
        trapdoorBlock((TrapDoorBlock) ModBlocks.VOID_TRAPDOOR.get(), blockTexture(ModBlocks.VOID_TRAPDOOR.get()), true);

        logBlock((RotatedPillarBlock) ModBlocks.VOID_LOG.get());

        axisBlock((RotatedPillarBlock) ModBlocks.VOID_WOOD.get(), blockTexture(ModBlocks.VOID_LOG.get()), blockTexture(ModBlocks.VOID_LOG.get()));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_VOID_LOG.get(), new ResourceLocation(BetterVoidMain.MOD_ID, "block/stripped_void_log"),
                new ResourceLocation(BetterVoidMain.MOD_ID, "block/stripped_void_log_top"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_VOID_WOOD.get(), new ResourceLocation(BetterVoidMain.MOD_ID, "block/stripped_void_log"),
                new ResourceLocation(BetterVoidMain.MOD_ID, "block/stripped_void_log_top"));


    }
}
