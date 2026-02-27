package net.gearbound.event;

import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;

import io.netty.buffer.Unpooled;

import net.gearbound.init.GearboundModItems;
import net.gearbound.world.inventory.BrassBackpackGUIMenu;

public class BackpackItemUseHandler {

    public static void register() {
        NeoForge.EVENT_BUS.addListener(BackpackItemUseHandler::onRightClickItem);
    }

    private static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {

        Player player = event.getEntity();
        ItemStack stack = event.getItemStack();

        if (stack.getItem() != GearboundModItems.BROWN_BRASS_BACKPACK.get()) {
            return;
        }

        if (player.isShiftKeyDown()) {
            return; // allow placement
        }

        if (!player.level().isClientSide() && player instanceof ServerPlayer serverPlayer) {

            FriendlyByteBuf buf = new FriendlyByteBuf(Unpooled.buffer());

            buf.writeBlockPos(player.blockPosition());
            buf.writeByte(event.getHand() == InteractionHand.MAIN_HAND ? 0 : 1);

            serverPlayer.openMenu(new MenuProvider() {

                @Override
                public Component getDisplayName() {
                    return Component.literal("Brown Brass Backpack");
                }

                @Override
                public AbstractContainerMenu createMenu(int id,
                                                        Inventory inventory,
                                                        Player player) {
                    return new BrassBackpackGUIMenu(id, inventory, buf);
                }
            });

            event.setCanceled(true);
        }
    }
}