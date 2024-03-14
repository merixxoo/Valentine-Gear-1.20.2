package net.merixxoo.valentinegear;


import net.fabricmc.api.ModInitializer;

import net.merixxoo.valentinegear.block.ModBlocks;
import net.merixxoo.valentinegear.item.ModItemGroups;
import net.merixxoo.valentinegear.item.ModItems;
import net.merixxoo.valentinegear.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValentineGear implements ModInitializer {

	public static final String MOD_ID = "valentinegear";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
	}
}