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
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BROWN_BRASS_BACKPACK = register("brown_brass_backpack", BrownBrassBackpackBlockEntity::new,
			GearboundModBlocks.WHITE_BRASS_BACKPACK,
			GearboundModBlocks.ORANGE_BRASS_BACKPACK,
			GearboundModBlocks.MAGENTA_BRASS_BACKPACK,
			GearboundModBlocks.LIGHT_BLUE_BRASS_BACKPACK,
			GearboundModBlocks.YELLOW_BRASS_BACKPACK,
			GearboundModBlocks.LIME_BRASS_BACKPACK,
			GearboundModBlocks.PINK_BRASS_BACKPACK,
			GearboundModBlocks.GRAY_BRASS_BACKPACK,
			GearboundModBlocks.LIGHT_GRAY_BRASS_BACKPACK,
			GearboundModBlocks.CYAN_BRASS_BACKPACK,
			GearboundModBlocks.PURPLE_BRASS_BACKPACK,
			GearboundModBlocks.BLUE_BRASS_BACKPACK,
			GearboundModBlocks.BROWN_BRASS_BACKPACK,
			GearboundModBlocks.GREEN_BRASS_BACKPACK,
			GearboundModBlocks.RED_BRASS_BACKPACK,
			GearboundModBlocks.BLACK_BRASS_BACKPACK);


	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, BlockEntityType.BlockEntitySupplier<?> supplier, DeferredHolder<Block, Block>... blocks) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, java.util.Arrays.stream(blocks).map(DeferredHolder::get).toArray(Block[]::new)).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BROWN_BRASS_BACKPACK.get(), (blockEntity, side) -> new SidedInvWrapper((WorldlyContainer) blockEntity, side));
	}
}
