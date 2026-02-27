/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gearbound.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.gearbound.item.BrownBrassBackpackItemItem;
import net.gearbound.GearboundMod;

public class GearboundModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(GearboundMod.MODID);
	public static final DeferredItem<Item> BROWN_BRASS_BACKPACK = block(GearboundModBlocks.BROWN_BRASS_BACKPACK);
	public static final DeferredItem<Item> BROWN_BRASS_BACKPACK_ITEM = REGISTRY.register("brown_brass_backpack_item", BrownBrassBackpackItemItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}