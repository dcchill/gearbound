package net.gearbound.world.inventory;

import net.neoforged.neoforge.items.wrapper.InvWrapper;
import net.neoforged.neoforge.items.SlotItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.gearbound.init.GearboundModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class BrassBackpackGUIMenu extends AbstractContainerMenu implements GearboundModMenus.MenuAccessor {

    public final Level world;
    public final Player entity;

    private static final TagKey<net.minecraft.world.item.Item> BACKPACK_TAG =
            TagKey.create(
                    Registries.ITEM,
                    ResourceLocation.fromNamespaceAndPath("gearbound", "backpacks")
            );

    private ContainerLevelAccess access = ContainerLevelAccess.NULL;
    private IItemHandler internal;
    private final Map<Integer, Slot> customSlots = new HashMap<>();

    private boolean bound = false;
    private Supplier<Boolean> boundItemMatcher = null;
    private Entity boundEntity = null;
    private BlockEntity boundBlockEntity = null;

    private ItemStack boundStack = ItemStack.EMPTY;

    public BrassBackpackGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
        super(GearboundModMenus.BRASS_BACKPACK_GUI.get(), id);

        this.entity = inv.player;
        this.world = inv.player.level();
        this.internal = new ItemStackHandler(36);

        BlockPos pos = null;

        if (extraData != null) {
            pos = extraData.readBlockPos();
            access = ContainerLevelAccess.create(world, pos);
        }

        // ===============================
        // Binding Logic
        // ===============================

        if (pos != null) {

            // Bound to item
            if (extraData.readableBytes() == 1) {

                byte hand = extraData.readByte();

                ItemStack stack = hand == 0
                        ? entity.getMainHandItem()
                        : entity.getOffhandItem();

                this.boundStack = stack;

                this.boundItemMatcher = () ->
                        stack == (hand == 0
                                ? entity.getMainHandItem()
                                : entity.getOffhandItem());

                this.internal = new ItemStackHandler(36);
                this.bound = true;

                loadFromItem(stack);
            }

            // Bound to entity
            else if (extraData.readableBytes() > 1) {

                extraData.readByte();
                boundEntity = world.getEntity(extraData.readVarInt());

                if (boundEntity != null) {
                    IItemHandler cap = boundEntity.getCapability(Capabilities.ItemHandler.ENTITY);
                    if (cap != null) {
                        this.internal = cap;
                        this.bound = true;
                    }
                }
            }

            // Bound to block
            else {

                boundBlockEntity = world.getBlockEntity(pos);

                if (boundBlockEntity instanceof BaseContainerBlockEntity base) {
                    this.internal = new InvWrapper(base);
                    this.bound = true;
                }
            }
        }

        // ===============================
        // Backpack Slots (36)
        // ===============================

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 9; col++) {

                int index = col + row * 9;
                int xPos = 8 + col * 18;
                int yPos = 8 + row * 18;

                this.customSlots.put(index, this.addSlot(
                        new SlotItemHandler(internal, index, xPos, yPos) {
                            @Override
                            public boolean mayPlace(ItemStack stack) {
                                return !stack.is(BACKPACK_TAG);
                            }
                        }
                ));
            }
        }

        // ===============================
        // Player Inventory
        // ===============================

        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlot(new Slot(inv,
                        col + (row + 1) * 9,
                        8 + col * 18,
                        106 + row * 18));
            }
        }

        // Hotbar
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new Slot(inv,
                    col,
                    8 + col * 18,
                    163));
        }
    }

    // ===============================
    // Persistence
    // ===============================

    private void loadFromItem(ItemStack stack) {

        var customData = stack.get(net.minecraft.core.component.DataComponents.CUSTOM_DATA);

        if (customData != null && internal instanceof ItemStackHandler handler) {
            handler.deserializeNBT(world.registryAccess(), customData.copyTag());
        }
    }

    private void saveToItem() {

        if (!boundStack.isEmpty() && internal instanceof ItemStackHandler handler) {

            var tag = handler.serializeNBT(world.registryAccess());

            boundStack.set(
                    net.minecraft.core.component.DataComponents.CUSTOM_DATA,
                    CustomData.of(tag)
            );
        }
    }

    // ===============================
    // Validity
    // ===============================

    @Override
    public boolean stillValid(Player player) {

        if (bound) {

            if (boundItemMatcher != null)
                return boundItemMatcher.get();

            else if (boundBlockEntity != null)
                return AbstractContainerMenu.stillValid(
                        access,
                        player,
                        boundBlockEntity.getBlockState().getBlock()
                );

            else if (boundEntity != null)
                return boundEntity.isAlive();
        }

        return true;
    }

    // ===============================
    // Quick Move
    // ===============================

    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {

        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);

        if (slot != null && slot.hasItem()) {

            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();

            if (index < 36) {
                if (!this.moveItemStackTo(itemstack1, 36, this.slots.size(), true))
                    return ItemStack.EMPTY;
            } else if (!this.moveItemStackTo(itemstack1, 0, 36, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty())
                slot.setByPlayer(ItemStack.EMPTY);
            else
                slot.setChanged();
        }

        return itemstack;
    }

    // ===============================
    // On Close
    // ===============================

    @Override
    public void removed(Player playerIn) {

        super.removed(playerIn);

        if (bound && !boundStack.isEmpty()) {
            saveToItem();
            return;
        }

        if (!bound && playerIn instanceof ServerPlayer serverPlayer) {

            for (int i = 0; i < internal.getSlots(); ++i) {

                ItemStack stack = internal.getStackInSlot(i);

                if (!stack.isEmpty()) {

                    playerIn.getInventory().placeItemBackInInventory(stack);

                    if (internal instanceof IItemHandlerModifiable ihm)
                        ihm.setStackInSlot(i, ItemStack.EMPTY);
                }
            }
        }
    }

    @Override
    public Map<Integer, Slot> getSlots() {
        return Collections.unmodifiableMap(customSlots);
    }

    @Override
    public Map<String, Object> getMenuState() {
        return Collections.emptyMap();
    }
}