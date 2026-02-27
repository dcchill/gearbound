/*
*    MCreator note: This file will be REGENERATED on each build.
*/
package net.gearbound.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.gearbound.block.BrownBrassBackpackBlock;
import net.gearbound.GearboundMod;

public class GearboundModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(GearboundMod.MODID);
	public static final DeferredBlock<Block> BROWN_BRASS_BACKPACK = REGISTRY.register("brown_brass_backpack", BrownBrassBackpackBlock::new);
	// Start of user code block custom blocks
	public static final DeferredBlock<Block> WHITE_BRASS_BACKPACK = registerBackpack("white_brass_backpack", () -> GearboundModItems.WHITE_BRASS_BACKPACK_ITEM.get());
	public static final DeferredBlock<Block> ORANGE_BRASS_BACKPACK = registerBackpack("orange_brass_backpack", () -> GearboundModItems.ORANGE_BRASS_BACKPACK_ITEM.get());
	public static final DeferredBlock<Block> MAGENTA_BRASS_BACKPACK = registerBackpack("magenta_brass_backpack", () -> GearboundModItems.MAGENTA_BRASS_BACKPACK_ITEM.get());
	public static final DeferredBlock<Block> LIGHT_BLUE_BRASS_BACKPACK = registerBackpack("light_blue_brass_backpack", () -> GearboundModItems.LIGHT_BLUE_BRASS_BACKPACK_ITEM.get());
	public static final DeferredBlock<Block> YELLOW_BRASS_BACKPACK = registerBackpack("yellow_brass_backpack", () -> GearboundModItems.YELLOW_BRASS_BACKPACK_ITEM.get());
	public static final DeferredBlock<Block> LIME_BRASS_BACKPACK = registerBackpack("lime_brass_backpack", () -> GearboundModItems.LIME_BRASS_BACKPACK_ITEM.get());
	public static final DeferredBlock<Block> PINK_BRASS_BACKPACK = registerBackpack("pink_brass_backpack", () -> GearboundModItems.PINK_BRASS_BACKPACK_ITEM.get());
	public static final DeferredBlock<Block> GRAY_BRASS_BACKPACK = registerBackpack("gray_brass_backpack", () -> GearboundModItems.GRAY_BRASS_BACKPACK_ITEM.get());
	public static final DeferredBlock<Block> LIGHT_GRAY_BRASS_BACKPACK = registerBackpack("light_gray_brass_backpack", () -> GearboundModItems.LIGHT_GRAY_BRASS_BACKPACK_ITEM.get());
	public static final DeferredBlock<Block> CYAN_BRASS_BACKPACK = registerBackpack("cyan_brass_backpack", () -> GearboundModItems.CYAN_BRASS_BACKPACK_ITEM.get());
	public static final DeferredBlock<Block> PURPLE_BRASS_BACKPACK = registerBackpack("purple_brass_backpack", () -> GearboundModItems.PURPLE_BRASS_BACKPACK_ITEM.get());
	public static final DeferredBlock<Block> BLUE_BRASS_BACKPACK = registerBackpack("blue_brass_backpack", () -> GearboundModItems.BLUE_BRASS_BACKPACK_ITEM.get());
	public static final DeferredBlock<Block> BROWN_BRASS_BACKPACK = registerBackpack("brown_brass_backpack", () -> GearboundModItems.BROWN_BRASS_BACKPACK_ITEM.get());
	public static final DeferredBlock<Block> GREEN_BRASS_BACKPACK = registerBackpack("green_brass_backpack", () -> GearboundModItems.GREEN_BRASS_BACKPACK_ITEM.get());
	public static final DeferredBlock<Block> RED_BRASS_BACKPACK = registerBackpack("red_brass_backpack", () -> GearboundModItems.RED_BRASS_BACKPACK_ITEM.get());
	public static final DeferredBlock<Block> BLACK_BRASS_BACKPACK = registerBackpack("black_brass_backpack", () -> GearboundModItems.BLACK_BRASS_BACKPACK_ITEM.get());
	// End of user code block custom blocks
}