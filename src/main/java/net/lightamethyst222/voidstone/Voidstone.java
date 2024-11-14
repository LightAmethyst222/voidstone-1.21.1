package net.lightamethyst222.voidstone;

import net.fabricmc.api.ModInitializer;

import net.lightamethyst222.voidstone.block.ModBlocks;
import net.lightamethyst222.voidstone.item.ModItemGroups;
import net.lightamethyst222.voidstone.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Voidstone implements ModInitializer {
	public static final String MOD_ID = "voidstone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}