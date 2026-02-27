/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gearbound.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.core.registries.BuiltInRegistries;

import net.gearbound.block.entity.BrownBrassBackpackBlockEntity;
import net.gearbound.GearboundMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class GearboundModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, GearboundMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BRASS_BACKPACK = REGISTRY.register("brass_backpack",
			() -> BlockEntityType.Builder.of(BrownBrassBackpackBlockEntity::new, GearboundModBlocks.WHITE_BRASS_BACKPACK.get(), GearboundModBlocks.LIGHT_GRAY_BRASS_BACKPACK.get(), GearboundModBlocks.GRAY_BRASS_BACKPACK.get(),
					GearboundModBlocks.BLACK_BRASS_BACKPACK.get(), GearboundModBlocks.BROWN_BRASS_BACKPACK.get(), GearboundModBlocks.RED_BRASS_BACKPACK.get(), GearboundModBlocks.ORANGE_BRASS_BACKPACK.get(),
					GearboundModBlocks.YELLOW_BRASS_BACKPACK.get(), GearboundModBlocks.LIME_BRASS_BACKPACK.get(), GearboundModBlocks.GREEN_BRASS_BACKPACK.get(), GearboundModBlocks.CYAN_BRASS_BACKPACK.get(),
					GearboundModBlocks.LIGHT_BLUE_BRASS_BACKPACK.get(), GearboundModBlocks.BLUE_BRASS_BACKPACK.get(), GearboundModBlocks.PURPLE_BRASS_BACKPACK.get(), GearboundModBlocks.MAGENTA_BRASS_BACKPACK.get(),
					GearboundModBlocks.PINK_BRASS_BACKPACK.get()).build(null));

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BRASS_BACKPACK.get(), (blockEntity, side) -> new SidedInvWrapper((WorldlyContainer) blockEntity, side));
	}
}
