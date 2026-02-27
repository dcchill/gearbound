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
	public static final DeferredItem<Item> WHITE_BRASS_BACKPACK = block(GearboundModBlocks.WHITE_BRASS_BACKPACK);
	public static final DeferredItem<Item> LIGHT_GRAY_BRASS_BACKPACK = block(GearboundModBlocks.LIGHT_GRAY_BRASS_BACKPACK);
	public static final DeferredItem<Item> GRAY_BRASS_BACKPACK = block(GearboundModBlocks.GRAY_BRASS_BACKPACK);
	public static final DeferredItem<Item> BLACK_BRASS_BACKPACK = block(GearboundModBlocks.BLACK_BRASS_BACKPACK);
	public static final DeferredItem<Item> BROWN_BRASS_BACKPACK = block(GearboundModBlocks.BROWN_BRASS_BACKPACK);
	public static final DeferredItem<Item> RED_BRASS_BACKPACK = block(GearboundModBlocks.RED_BRASS_BACKPACK);
	public static final DeferredItem<Item> ORANGE_BRASS_BACKPACK = block(GearboundModBlocks.ORANGE_BRASS_BACKPACK);
	public static final DeferredItem<Item> YELLOW_BRASS_BACKPACK = block(GearboundModBlocks.YELLOW_BRASS_BACKPACK);
	public static final DeferredItem<Item> LIME_BRASS_BACKPACK = block(GearboundModBlocks.LIME_BRASS_BACKPACK);
	public static final DeferredItem<Item> GREEN_BRASS_BACKPACK = block(GearboundModBlocks.GREEN_BRASS_BACKPACK);
	public static final DeferredItem<Item> CYAN_BRASS_BACKPACK = block(GearboundModBlocks.CYAN_BRASS_BACKPACK);
	public static final DeferredItem<Item> LIGHT_BLUE_BRASS_BACKPACK = block(GearboundModBlocks.LIGHT_BLUE_BRASS_BACKPACK);
	public static final DeferredItem<Item> BLUE_BRASS_BACKPACK = block(GearboundModBlocks.BLUE_BRASS_BACKPACK);
	public static final DeferredItem<Item> PURPLE_BRASS_BACKPACK = block(GearboundModBlocks.PURPLE_BRASS_BACKPACK);
	public static final DeferredItem<Item> MAGENTA_BRASS_BACKPACK = block(GearboundModBlocks.MAGENTA_BRASS_BACKPACK);
	public static final DeferredItem<Item> PINK_BRASS_BACKPACK = block(GearboundModBlocks.PINK_BRASS_BACKPACK);
	public static final DeferredItem<Item> WHITE_BRASS_BACKPACK_ITEM = REGISTRY.register("white_brass_backpack_item", WhiteBrassBackpackItemItem::new);
	public static final DeferredItem<Item> LIGHT_GRAY_BRASS_BACKPACK_ITEM = REGISTRY.register("light_gray_brass_backpack_item", LightGrayBrassBackpackItemItem::new);
	public static final DeferredItem<Item> GRAY_BRASS_BACKPACK_ITEM = REGISTRY.register("gray_brass_backpack_item", GrayBrassBackpackItemItem::new);
	public static final DeferredItem<Item> BLACK_BRASS_BACKPACK_ITEM = REGISTRY.register("black_brass_backpack_item", BlackBrassBackpackItemItem::new);
	public static final DeferredItem<Item> BROWN_BRASS_BACKPACK_ITEM = REGISTRY.register("brown_brass_backpack_item", BrownBrassBackpackItemItem::new);
	public static final DeferredItem<Item> RED_BRASS_BACKPACK_ITEM = REGISTRY.register("red_brass_backpack_item", RedBrassBackpackItemItem::new);
	public static final DeferredItem<Item> ORANGE_BRASS_BACKPACK_ITEM = REGISTRY.register("orange_brass_backpack_item", OrangeBrassBackpackItemItem::new);
	public static final DeferredItem<Item> YELLOW_BRASS_BACKPACK_ITEM = REGISTRY.register("yellow_brass_backpack_item", YellowBrassBackpackItemItem::new);
	public static final DeferredItem<Item> LIME_BRASS_BACKPACK_ITEM = REGISTRY.register("lime_brass_backpack_item", LimeBrassBackpackItemItem::new);
	public static final DeferredItem<Item> GREEN_BRASS_BACKPACK_ITEM = REGISTRY.register("green_brass_backpack_item", GreenBrassBackpackItemItem::new);
	public static final DeferredItem<Item> CYAN_BRASS_BACKPACK_ITEM = REGISTRY.register("cyan_brass_backpack_item", CyanBrassBackpackItemItem::new);
	public static final DeferredItem<Item> LIGHT_BLUE_BRASS_BACKPACK_ITEM = REGISTRY.register("light_blue_brass_backpack_item", LightBlueBrassBackpackItemItem::new);
	public static final DeferredItem<Item> BLUE_BRASS_BACKPACK_ITEM = REGISTRY.register("blue_brass_backpack_item", BlueBrassBackpackItemItem::new);
	public static final DeferredItem<Item> PURPLE_BRASS_BACKPACK_ITEM = REGISTRY.register("purple_brass_backpack_item", PurpleBrassBackpackItemItem::new);
	public static final DeferredItem<Item> MAGENTA_BRASS_BACKPACK_ITEM = REGISTRY.register("magenta_brass_backpack_item", MagentaBrassBackpackItemItem::new);
	public static final DeferredItem<Item> PINK_BRASS_BACKPACK_ITEM = REGISTRY.register("pink_brass_backpack_item", PinkBrassBackpackItemItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}