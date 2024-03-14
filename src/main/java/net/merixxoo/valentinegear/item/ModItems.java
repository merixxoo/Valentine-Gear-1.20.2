package net.merixxoo.valentinegear.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.merixxoo.valentinegear.ValentineGear;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item VALENTINE_SHARD = registerItem("valentine_shard", new Item(new FabricItemSettings()));
    public static final Item VALENTINE_INGOT = registerItem("valentine_ingot", new Item(new FabricItemSettings()));

    public static final Item VALENTINE_PICKAXE = registerItem("valentine_pickaxe",
            new PickaxeItem(ModToolMaterial.VALENTINE,0,-2.8f, new FabricItemSettings()));
    public static final Item VALENTINE_AXE = registerItem("valentine_axe",
            new AxeItem(ModToolMaterial.VALENTINE,6,-2.7f, new FabricItemSettings()));
    public static final Item VALENTINE_SHOVEL = registerItem("valentine_shovel",
            new ShovelItem(ModToolMaterial.VALENTINE,-1,-2.8f, new FabricItemSettings()));
    public static final Item VALENTINE_HOE = registerItem("valentine_hoe",
            new HoeItem(ModToolMaterial.VALENTINE,-3,-2.8f, new FabricItemSettings()));
    public static final Item VALENTINE_SWORD = registerItem("valentine_sword",
            new SwordItem(ModToolMaterial.VALENTINE,4,0f, new FabricItemSettings()));

    public static final Item VALENTINE_HELMET = registerItem("valentine_helmet",
            new ArmorItem(ModArmorMaterials.VALENTINE,ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item VALENTINE_CHESTPLATE = registerItem("valentine_chestplate",
            new ArmorItem(ModArmorMaterials.VALENTINE,ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item VALENTINE_LEGGINGS = registerItem("valentine_leggings",
            new ArmorItem(ModArmorMaterials.VALENTINE,ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item VALENTINE_BOOTS = registerItem("valentine_boots",
            new ArmorItem(ModArmorMaterials.VALENTINE,ArmorItem.Type.BOOTS, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(VALENTINE_SHARD);
        entries.add(VALENTINE_INGOT);
    }
    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(VALENTINE_SWORD);
        entries.add(VALENTINE_HELMET);
        entries.add(VALENTINE_CHESTPLATE);
        entries.add(VALENTINE_LEGGINGS);
        entries.add(VALENTINE_BOOTS);
    }
    private static void addItemsToToolsItemGroup(FabricItemGroupEntries entries) {
        entries.add(VALENTINE_PICKAXE);
        entries.add(VALENTINE_AXE);
        entries.add(VALENTINE_SHOVEL);
        entries.add(VALENTINE_HOE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ValentineGear.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ValentineGear.LOGGER.info("Registering Mod Items for " + ValentineGear.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsItemGroup);

    }
}
