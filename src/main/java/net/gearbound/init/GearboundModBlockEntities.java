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
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BROWN_BRASS_BACKPACK = register("brown_brass_backpack", GearboundModBlocks.BROWN_BRASS_BACKPACK, BrownBrassBackpackBlockEntity::new);

	// Start of user code block custom block entities
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> WHITE_BRASS_BACKPACK = register("white_brass_backpack", GearboundModBlocks.WHITE_BRASS_BACKPACK,
			(pos, state) -> new BrownBrassBackpackBlockEntity(WHITE_BRASS_BACKPACK.get(), pos, state));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> LIGHT_GRAY_BRASS_BACKPACK = register("light_gray_brass_backpack", GearboundModBlocks.LIGHT_GRAY_BRASS_BACKPACK,
			(pos, state) -> new BrownBrassBackpackBlockEntity(LIGHT_GRAY_BRASS_BACKPACK.get(), pos, state));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GRAY_BRASS_BACKPACK = register("gray_brass_backpack", GearboundModBlocks.GRAY_BRASS_BACKPACK,
			(pos, state) -> new BrownBrassBackpackBlockEntity(GRAY_BRASS_BACKPACK.get(), pos, state));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BLACK_BRASS_BACKPACK = register("black_brass_backpack", GearboundModBlocks.BLACK_BRASS_BACKPACK,
			(pos, state) -> new BrownBrassBackpackBlockEntity(BLACK_BRASS_BACKPACK.get(), pos, state));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> RED_BRASS_BACKPACK = register("red_brass_backpack", GearboundModBlocks.RED_BRASS_BACKPACK,
			(pos, state) -> new BrownBrassBackpackBlockEntity(RED_BRASS_BACKPACK.get(), pos, state));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ORANGE_BRASS_BACKPACK = register("orange_brass_backpack", GearboundModBlocks.ORANGE_BRASS_BACKPACK,
			(pos, state) -> new BrownBrassBackpackBlockEntity(ORANGE_BRASS_BACKPACK.get(), pos, state));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> YELLOW_BRASS_BACKPACK = register("yellow_brass_backpack", GearboundModBlocks.YELLOW_BRASS_BACKPACK,
			(pos, state) -> new BrownBrassBackpackBlockEntity(YELLOW_BRASS_BACKPACK.get(), pos, state));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> LIME_BRASS_BACKPACK = register("lime_brass_backpack", GearboundModBlocks.LIME_BRASS_BACKPACK,
			(pos, state) -> new BrownBrassBackpackBlockEntity(LIME_BRASS_BACKPACK.get(), pos, state));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GREEN_BRASS_BACKPACK = register("green_brass_backpack", GearboundModBlocks.GREEN_BRASS_BACKPACK,
			(pos, state) -> new BrownBrassBackpackBlockEntity(GREEN_BRASS_BACKPACK.get(), pos, state));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> CYAN_BRASS_BACKPACK = register("cyan_brass_backpack", GearboundModBlocks.CYAN_BRASS_BACKPACK,
			(pos, state) -> new BrownBrassBackpackBlockEntity(CYAN_BRASS_BACKPACK.get(), pos, state));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> LIGHT_BLUE_BRASS_BACKPACK = register("light_blue_brass_backpack", GearboundModBlocks.LIGHT_BLUE_BRASS_BACKPACK,
			(pos, state) -> new BrownBrassBackpackBlockEntity(LIGHT_BLUE_BRASS_BACKPACK.get(), pos, state));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BLUE_BRASS_BACKPACK = register("blue_brass_backpack", GearboundModBlocks.BLUE_BRASS_BACKPACK,
			(pos, state) -> new BrownBrassBackpackBlockEntity(BLUE_BRASS_BACKPACK.get(), pos, state));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> PURPLE_BRASS_BACKPACK = register("purple_brass_backpack", GearboundModBlocks.PURPLE_BRASS_BACKPACK,
			(pos, state) -> new BrownBrassBackpackBlockEntity(PURPLE_BRASS_BACKPACK.get(), pos, state));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> MAGENTA_BRASS_BACKPACK = register("magenta_brass_backpack", GearboundModBlocks.MAGENTA_BRASS_BACKPACK,
			(pos, state) -> new BrownBrassBackpackBlockEntity(MAGENTA_BRASS_BACKPACK.get(), pos, state));
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> PINK_BRASS_BACKPACK = register("pink_brass_backpack", GearboundModBlocks.PINK_BRASS_BACKPACK,
			(pos, state) -> new BrownBrassBackpackBlockEntity(PINK_BRASS_BACKPACK.get(), pos, state));
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BROWN_BRASS_BACKPACK.get(), (blockEntity, side) -> new SidedInvWrapper((WorldlyContainer) blockEntity, side));
	}
}