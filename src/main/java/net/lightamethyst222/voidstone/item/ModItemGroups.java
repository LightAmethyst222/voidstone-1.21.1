
package net.lightamethyst222.voidstone.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lightamethyst222.voidstone.Voidstone;
import net.lightamethyst222.voidstone.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    //change the display block to deep voidstone bricks once I have that texture and model.

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Voidstone.MOD_ID, "voidstone_creative_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.VOIDSTONE))
                    .displayName(Text.translatable("itemgroup.voidstone.voidstone_creative_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.COMPRESSED_DEEPSLATE);
                        entries.add(ModBlocks.VOIDSTONE);
                        entries.add(ModItems.VOID_OPAL);
                    }).build());


    public static void registerItemGroups() {
        Voidstone.LOGGER.info("Registering Item Groups for " + Voidstone.MOD_ID);
    }
}
