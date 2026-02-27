package net.gearbound.block.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.ContainerHelper;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.NonNullList;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;

import net.gearbound.world.inventory.BrassBackpackGUIMenu;
import net.gearbound.init.GearboundModBlockEntities;

import javax.annotation.Nullable;

import java.util.stream.IntStream;
import java.util.Locale;
import java.util.function.Supplier;

import io.netty.buffer.Unpooled;

public class BrownBrassBackpackBlockEntity extends RandomizableContainerBlockEntity implements WorldlyContainer {
	private NonNullList<ItemStack> stacks = NonNullList.withSize(36, ItemStack.EMPTY);

	public BrownBrassBackpackBlockEntity(BlockPos position, BlockState state) {
		super(resolveType(state), position, state);
	}

	private static BlockEntityType<?> resolveType(BlockState state) {
		String blockPath = BuiltInRegistries.BLOCK.getKey(state.getBlock()).getPath().toUpperCase(Locale.ROOT);
		BlockEntityType<?> byColor = typeFromField(blockPath);
		if (byColor != null)
			return byColor;

		BlockEntityType<?> shared = typeFromField("BRASS_BACKPACK");
		if (shared != null)
			return shared;

		BlockEntityType<?> brown = typeFromField("BROWN_BRASS_BACKPACK");
		if (brown != null)
			return brown;

		throw new IllegalStateException("Unable to resolve block entity type for " + BuiltInRegistries.BLOCK.getKey(state.getBlock()));
	}

	private static BlockEntityType<?> typeFromField(String fieldName) {
		try {
			var field = GearboundModBlockEntities.class.getField(fieldName);
			Object holder = field.get(null);
			if (holder instanceof Supplier<?> supplier) {
				Object value = supplier.get();
				if (value instanceof BlockEntityType<?> type)
					return type;
			}
		} catch (ReflectiveOperationException ignored) {
		}
		return null;
	}

	@Override
	public void loadAdditional(CompoundTag compound, HolderLookup.Provider lookupProvider) {
		super.loadAdditional(compound, lookupProvider);
		if (!this.tryLoadLootTable(compound))
			this.stacks = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
		ContainerHelper.loadAllItems(compound, this.stacks, lookupProvider);
	}

	@Override
	public void saveAdditional(CompoundTag compound, HolderLookup.Provider lookupProvider) {
		super.saveAdditional(compound, lookupProvider);
		if (!this.trySaveLootTable(compound)) {
			ContainerHelper.saveAllItems(compound, this.stacks, lookupProvider);
		}
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag(HolderLookup.Provider lookupProvider) {
		return this.saveWithFullMetadata(lookupProvider);
	}

	@Override
	public int getContainerSize() {
		return stacks.size();
	}

	@Override
	public boolean isEmpty() {
		for (ItemStack itemstack : this.stacks)
			if (!itemstack.isEmpty())
				return false;
		return true;
	}

	@Override
	public Component getDefaultName() {
		return this.getBlockState().getBlock().getName();
	}

	@Override
	public AbstractContainerMenu createMenu(int id, Inventory inventory) {
		return new BrassBackpackGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(this.worldPosition));
	}

	@Override
	public Component getDisplayName() {
		return this.getBlockState().getBlock().getName();
	}

	@Override
	protected NonNullList<ItemStack> getItems() {
		return this.stacks;
	}

	@Override
	protected void setItems(NonNullList<ItemStack> stacks) {
		this.stacks = stacks;
	}

	@Override
	public boolean canPlaceItem(int index, ItemStack stack) {
		return true;
	}

	@Override
	public int[] getSlotsForFace(Direction side) {
		return IntStream.range(0, this.getContainerSize()).toArray();
	}

	@Override
	public boolean canPlaceItemThroughFace(int index, ItemStack itemstack, @Nullable Direction direction) {
		return this.canPlaceItem(index, itemstack);
	}

	@Override
	public boolean canTakeItemThroughFace(int index, ItemStack itemstack, Direction direction) {
		return true;
	}
}
