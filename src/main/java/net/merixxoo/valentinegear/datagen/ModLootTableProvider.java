package net.merixxoo.valentinegear.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.merixxoo.valentinegear.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.VALENTINE_BLOCK);
        addDrop(ModBlocks.VALENTINE_ORE);
        addDrop(ModBlocks.DEEPSLATE_VALENTINE_ORE)
        ;
    }
}
