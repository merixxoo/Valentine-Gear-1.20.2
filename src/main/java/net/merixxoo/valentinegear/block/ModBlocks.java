package net.merixxoo.valentinegear.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.merixxoo.valentinegear.ValentineGear;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block VALENTINE_BLOCK =registerBlock("valentine_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block VALENTINE_ORE =registerBlock("valentine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block DEEPSLATE_VALENTINE_ORE =registerBlock("deepslate_valentine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ValentineGear.MOD_ID,name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ValentineGear.MOD_ID,name),
                new BlockItem(block, new FabricItemSettings()));
    }
    private static void addItemsToBuildingItemGroup(FabricItemGroupEntries entries) {
        entries.add(VALENTINE_ORE);
        entries.add(DEEPSLATE_VALENTINE_ORE);
        entries.add(VALENTINE_BLOCK);
    }
    public static void registerModBlocks() {
        ValentineGear.LOGGER.info("Registering ModBlocks for "+ValentineGear.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addItemsToBuildingItemGroup);
    }
}