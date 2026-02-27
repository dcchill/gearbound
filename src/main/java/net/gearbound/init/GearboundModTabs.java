/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gearbound.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.gearbound.GearboundMod;

public class GearboundModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GearboundMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATE_GEARBOUND_MENU = REGISTRY.register("create_gearbound_menu", () -> CreativeModeTab.builder().title(Component.translatable("item_group.gearbound.create_gearbound_menu"))
			.icon(() -> new ItemStack(GearboundModBlocks.BROWN_BRASS_BACKPACK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GearboundModBlocks.WHITE_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.WHITE_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModBlocks.LIGHT_GRAY_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.LIGHT_GRAY_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModBlocks.GRAY_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.GRAY_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModBlocks.BLACK_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.BLACK_BRASS_BACKPACK_ITEM.get());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATE_GEARBOUND_MENU = REGISTRY.register("create_gearbound_menu",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gearbound.create_gearbound_menu")).icon(() -> new ItemStack(GearboundModBlocks.BROWN_BRASS_BACKPACK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GearboundModBlocks.WHITE_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModBlocks.LIGHT_GRAY_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModBlocks.GRAY_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModBlocks.BLACK_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModBlocks.BROWN_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModBlocks.RED_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModBlocks.ORANGE_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModBlocks.YELLOW_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModBlocks.LIME_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModBlocks.GREEN_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModBlocks.CYAN_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModBlocks.LIGHT_BLUE_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModBlocks.BLUE_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModBlocks.PURPLE_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModBlocks.MAGENTA_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModBlocks.PINK_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.WHITE_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModItems.LIGHT_GRAY_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModItems.GRAY_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModItems.BLACK_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModItems.BROWN_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModBlocks.RED_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.RED_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModBlocks.ORANGE_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.ORANGE_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModBlocks.YELLOW_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.YELLOW_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModBlocks.LIME_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.LIME_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModBlocks.GREEN_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.GREEN_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModBlocks.CYAN_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.CYAN_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModBlocks.LIGHT_BLUE_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.LIGHT_BLUE_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModBlocks.BLUE_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.BLUE_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModBlocks.PURPLE_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.PURPLE_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModBlocks.MAGENTA_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.MAGENTA_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModBlocks.PINK_BRASS_BACKPACK.get().asItem());
				tabData.accept(GearboundModItems.RED_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModItems.ORANGE_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModItems.YELLOW_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModItems.LIME_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModItems.GREEN_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModItems.CYAN_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModItems.LIGHT_BLUE_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModItems.BLUE_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModItems.PURPLE_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModItems.MAGENTA_BRASS_BACKPACK_ITEM.get());
				tabData.accept(GearboundModItems.PINK_BRASS_BACKPACK_ITEM.get());
			}).build());
}
