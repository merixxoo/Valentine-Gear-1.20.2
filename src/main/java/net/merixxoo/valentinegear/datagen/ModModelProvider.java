package net.merixxoo.valentinegear.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.merixxoo.valentinegear.block.ModBlocks;
import net.merixxoo.valentinegear.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VALENTINE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VALENTINE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_VALENTINE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.VALENTINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.VALENTINE_SHARD, Models.GENERATED);

        itemModelGenerator.register(ModItems.VALENTINE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VALENTINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VALENTINE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VALENTINE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.VALENTINE_SWORD, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VALENTINE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VALENTINE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VALENTINE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.VALENTINE_BOOTS));

    }
}
