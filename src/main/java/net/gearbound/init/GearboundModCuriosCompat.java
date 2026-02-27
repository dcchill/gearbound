package net.gearbound.init;

import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.CuriosCapability;

import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class GearboundModCuriosCompat {
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		registerBackpack(event, GearboundModItems.WHITE_BRASS_BACKPACK_ITEM.get());
		registerBackpack(event, GearboundModItems.LIGHT_GRAY_BRASS_BACKPACK_ITEM.get());
		registerBackpack(event, GearboundModItems.GRAY_BRASS_BACKPACK_ITEM.get());
		registerBackpack(event, GearboundModItems.BLACK_BRASS_BACKPACK_ITEM.get());
		registerBackpack(event, GearboundModItems.BROWN_BRASS_BACKPACK_ITEM.get());
		registerBackpack(event, GearboundModItems.RED_BRASS_BACKPACK_ITEM.get());
		registerBackpack(event, GearboundModItems.ORANGE_BRASS_BACKPACK_ITEM.get());
		registerBackpack(event, GearboundModItems.YELLOW_BRASS_BACKPACK_ITEM.get());
		registerBackpack(event, GearboundModItems.LIME_BRASS_BACKPACK_ITEM.get());
		registerBackpack(event, GearboundModItems.GREEN_BRASS_BACKPACK_ITEM.get());
		registerBackpack(event, GearboundModItems.CYAN_BRASS_BACKPACK_ITEM.get());
		registerBackpack(event, GearboundModItems.LIGHT_BLUE_BRASS_BACKPACK_ITEM.get());
		registerBackpack(event, GearboundModItems.BLUE_BRASS_BACKPACK_ITEM.get());
		registerBackpack(event, GearboundModItems.PURPLE_BRASS_BACKPACK_ITEM.get());
		registerBackpack(event, GearboundModItems.MAGENTA_BRASS_BACKPACK_ITEM.get());
		registerBackpack(event, GearboundModItems.PINK_BRASS_BACKPACK_ITEM.get());
	}

	private static void registerBackpack(RegisterCapabilitiesEvent event, Item item) {
		event.registerItem(CuriosCapability.ITEM, (stack, context) -> new ICurio() {
			@Override
			public ItemStack getStack() {
				return stack;
			}
		}, item);
	}
}
