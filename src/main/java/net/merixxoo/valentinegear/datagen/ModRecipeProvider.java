package net.merixxoo.valentinegear.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.merixxoo.valentinegear.block.ModBlocks;
import net.merixxoo.valentinegear.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;




public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> VALENTINE_BLASTABLES = List.of(ModBlocks.VALENTINE_ORE,
            ModBlocks.DEEPSLATE_VALENTINE_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerBlasting(exporter,VALENTINE_BLASTABLES, RecipeCategory.MISC, ModItems.VALENTINE_SHARD,
                3,600, "VALENTINE_shard");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.VALENTINE_INGOT, 1)
                .input(ModItems.VALENTINE_SHARD)
                .input(ModItems.VALENTINE_SHARD)
                .input(ModItems.VALENTINE_SHARD)
                .input(ModItems.VALENTINE_SHARD)
                .input(Items.NETHERITE_INGOT)
                .input(Items.NETHERITE_INGOT)
                .input(Items.NETHERITE_INGOT)
                .input(Items.NETHERITE_INGOT)
                .group("valentine_ingot")
                .criterion(RecipeProvider.hasItem(ModItems.VALENTINE_SHARD),RecipeProvider.conditionsFromItem(ModItems.VALENTINE_SHARD))
                .offerTo(exporter, RecipeProvider.convertBetween(ModItems.VALENTINE_INGOT, ModItems.VALENTINE_SHARD));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.VALENTINE_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VALENTINE_BLOCK);


        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_PICKAXE),
                Ingredient.ofItems(ModItems.VALENTINE_INGOT), RecipeCategory.TOOLS, ModItems.VALENTINE_PICKAXE)
                .criterion("has_netherite_ingot", RecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.VALENTINE_PICKAXE) + "_smithing");

                SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_AXE),
                Ingredient.ofItems(ModItems.VALENTINE_INGOT), RecipeCategory.TOOLS, ModItems.VALENTINE_AXE)
                .criterion("has_netherite_ingot", RecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.VALENTINE_AXE) + "_smithing");

                SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_SHOVEL),
                Ingredient.ofItems(ModItems.VALENTINE_INGOT), RecipeCategory.TOOLS, ModItems.VALENTINE_SHOVEL)
                .criterion("has_netherite_ingot", RecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.VALENTINE_SHOVEL) + "_smithing");

                SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_HOE),
                Ingredient.ofItems(ModItems.VALENTINE_INGOT), RecipeCategory.TOOLS, ModItems.VALENTINE_HOE)
                .criterion("has_netherite_ingot", RecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.VALENTINE_HOE) + "_smithing");

                SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_SWORD),
                Ingredient.ofItems(ModItems.VALENTINE_INGOT), RecipeCategory.TOOLS, ModItems.VALENTINE_SWORD)
                .criterion("has_netherite_ingot", RecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.VALENTINE_SWORD) + "_smithing");

                SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_HELMET),
                Ingredient.ofItems(ModItems.VALENTINE_INGOT), RecipeCategory.MISC, ModItems.VALENTINE_HELMET)
                .criterion("has_netherite_ingot", RecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.VALENTINE_HELMET) + "_smithing");

                SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_CHESTPLATE),
                Ingredient.ofItems(ModItems.VALENTINE_INGOT), RecipeCategory.TOOLS, ModItems.VALENTINE_CHESTPLATE)
                .criterion("has_netherite_ingot", RecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.VALENTINE_CHESTPLATE) + "_smithing");

                SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_LEGGINGS),
                Ingredient.ofItems(ModItems.VALENTINE_INGOT), RecipeCategory.TOOLS, ModItems.VALENTINE_LEGGINGS)
                .criterion("has_netherite_ingot", RecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.VALENTINE_LEGGINGS) + "_smithing");

                SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                Ingredient.ofItems(Items.NETHERITE_BOOTS),
                Ingredient.ofItems(ModItems.VALENTINE_INGOT), RecipeCategory.MISC, ModItems.VALENTINE_BOOTS)
                .criterion("has_netherite_ingot", RecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT))
                .offerTo(exporter, RecipeProvider.getItemPath(ModItems.VALENTINE_BOOTS) + "_smithing");

    }
}