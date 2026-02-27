package net.gearbound.init;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;

import net.minecraft.world.WorldlyContainer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class GearboundModDyedBackpackHooks {
@SubscribeEvent
public static void registerCapabilities(RegisterCapabilitiesEvent event) {
    event.registerBlockEntity(
        Capabilities.ItemHandler.BLOCK,
        GearboundModBlockEntities.BROWN_BRASS_BACKPACK.get(),
        (blockEntity, side) -> new SidedInvWrapper((WorldlyContainer) blockEntity, side)
    );
}

	@SubscribeEvent
	public static void buildCreativeTab(BuildCreativeModeTabContentsEvent event) {
		if (!event.getTabKey().equals(GearboundModTabs.CREATE_GEARBOUND_MENU.getKey()))
			return;

		event.accept(GearboundModBlocks.WHITE_BRASS_BACKPACK.get().asItem());
		event.accept(GearboundModItems.WHITE_BRASS_BACKPACK_ITEM.get());
		event.accept(GearboundModBlocks.LIGHT_GRAY_BRASS_BACKPACK.get().asItem());
		event.accept(GearboundModItems.LIGHT_GRAY_BRASS_BACKPACK_ITEM.get());
		event.accept(GearboundModBlocks.GRAY_BRASS_BACKPACK.get().asItem());
		event.accept(GearboundModItems.GRAY_BRASS_BACKPACK_ITEM.get());
		event.accept(GearboundModBlocks.BLACK_BRASS_BACKPACK.get().asItem());
		event.accept(GearboundModItems.BLACK_BRASS_BACKPACK_ITEM.get());
		event.accept(GearboundModBlocks.RED_BRASS_BACKPACK.get().asItem());
		event.accept(GearboundModItems.RED_BRASS_BACKPACK_ITEM.get());
		event.accept(GearboundModBlocks.ORANGE_BRASS_BACKPACK.get().asItem());
		event.accept(GearboundModItems.ORANGE_BRASS_BACKPACK_ITEM.get());
		event.accept(GearboundModBlocks.YELLOW_BRASS_BACKPACK.get().asItem());
		event.accept(GearboundModItems.YELLOW_BRASS_BACKPACK_ITEM.get());
		event.accept(GearboundModBlocks.LIME_BRASS_BACKPACK.get().asItem());
		event.accept(GearboundModItems.LIME_BRASS_BACKPACK_ITEM.get());
		event.accept(GearboundModBlocks.GREEN_BRASS_BACKPACK.get().asItem());
		event.accept(GearboundModItems.GREEN_BRASS_BACKPACK_ITEM.get());
		event.accept(GearboundModBlocks.CYAN_BRASS_BACKPACK.get().asItem());
		event.accept(GearboundModItems.CYAN_BRASS_BACKPACK_ITEM.get());
		event.accept(GearboundModBlocks.LIGHT_BLUE_BRASS_BACKPACK.get().asItem());
		event.accept(GearboundModItems.LIGHT_BLUE_BRASS_BACKPACK_ITEM.get());
		event.accept(GearboundModBlocks.BLUE_BRASS_BACKPACK.get().asItem());
		event.accept(GearboundModItems.BLUE_BRASS_BACKPACK_ITEM.get());
		event.accept(GearboundModBlocks.PURPLE_BRASS_BACKPACK.get().asItem());
		event.accept(GearboundModItems.PURPLE_BRASS_BACKPACK_ITEM.get());
		event.accept(GearboundModBlocks.MAGENTA_BRASS_BACKPACK.get().asItem());
		event.accept(GearboundModItems.MAGENTA_BRASS_BACKPACK_ITEM.get());
		event.accept(GearboundModBlocks.PINK_BRASS_BACKPACK.get().asItem());
		event.accept(GearboundModItems.PINK_BRASS_BACKPACK_ITEM.get());
	}
}
