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
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATE_GEARBOUND_MENU = REGISTRY.register("create_gearbound_menu",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gearbound.create_gearbound_menu")).icon(() -> new ItemStack(GearboundModBlocks.BROWN_BRASS_BACKPACK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GearboundModBlocks.BROWN_BRASS_BACKPACK.get().asItem());
			}).build());
}