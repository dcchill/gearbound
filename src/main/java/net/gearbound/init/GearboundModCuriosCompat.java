package net.gearbound.init;

import top.theillusivec4.curios.api.CuriosCapability;
import top.theillusivec4.curios.api.type.capability.ICurio;

import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

import net.minecraft.world.item.ItemStack;

public class GearboundModCuriosCompat {
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}
		}, GearboundModItems.WHITE_BRASS_BACKPACK_ITEM.get(), GearboundModItems.LIGHT_GRAY_BRASS_BACKPACK_ITEM.get(), GearboundModItems.GRAY_BRASS_BACKPACK_ITEM.get(), GearboundModItems.BLACK_BRASS_BACKPACK_ITEM.get(),
				GearboundModItems.BROWN_BRASS_BACKPACK_ITEM.get(), GearboundModItems.RED_BRASS_BACKPACK_ITEM.get(), GearboundModItems.ORANGE_BRASS_BACKPACK_ITEM.get(), GearboundModItems.YELLOW_BRASS_BACKPACK_ITEM.get(),
				GearboundModItems.LIME_BRASS_BACKPACK_ITEM.get(), GearboundModItems.GREEN_BRASS_BACKPACK_ITEM.get(), GearboundModItems.CYAN_BRASS_BACKPACK_ITEM.get(), GearboundModItems.LIGHT_BLUE_BRASS_BACKPACK_ITEM.get(),
				GearboundModItems.BLUE_BRASS_BACKPACK_ITEM.get(), GearboundModItems.PURPLE_BRASS_BACKPACK_ITEM.get(), GearboundModItems.MAGENTA_BRASS_BACKPACK_ITEM.get(), GearboundModItems.PINK_BRASS_BACKPACK_ITEM.get());
	}
}
