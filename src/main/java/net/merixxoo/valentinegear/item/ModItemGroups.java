package net.merixxoo.valentinegear.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.merixxoo.valentinegear.ValentineGear;
import net.merixxoo.valentinegear.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup VALENTINE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ValentineGear.MOD_ID, "valentine"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.valentine"))
                    .icon(() -> new ItemStack(ModItems.VALENTINE_INGOT)).entries((displayContext, entries) -> {

                        entries.add(ModItems.VALENTINE_PICKAXE);
                        entries.add(ModItems.VALENTINE_AXE);
                        entries.add(ModItems.VALENTINE_SHOVEL);
                        entries.add(ModItems.VALENTINE_HOE);
                        entries.add(ModItems.VALENTINE_SWORD);

                        entries.add(ModItems.VALENTINE_HELMET);
                        entries.add(ModItems.VALENTINE_CHESTPLATE);
                        entries.add(ModItems.VALENTINE_LEGGINGS);
                        entries.add(ModItems.VALENTINE_BOOTS);

                        entries.add(ModItems.VALENTINE_SHARD);
                        entries.add(ModItems.VALENTINE_INGOT);

                        entries.add(ModBlocks.VALENTINE_BLOCK);

                        entries.add(ModBlocks.VALENTINE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_VALENTINE_ORE);


                    }).build());
    public static void registerItemGroups() {
        ValentineGear.LOGGER.info("Registering Item Groups for "+ValentineGear.MOD_ID);

    }

}
