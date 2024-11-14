package net.lightamethyst222.voidstone.item;

import net.lightamethyst222.voidstone.Voidstone;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item VOID_OPAL = registerItem("void_opal", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Voidstone.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Voidstone.LOGGER.info("Registering Mod Items for " + Voidstone.MOD_ID);
    }
}
