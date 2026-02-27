package net.gearbound.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import io.netty.buffer.Unpooled;

import net.gearbound.world.inventory.BrassBackpackGUIMenu;

public class BrownBrassBackpackItemItem extends BlockItem {
	private final String displayName;

	public BrownBrassBackpackItemItem(Block block, String displayName) {
		super(block, new Properties().stacksTo(1));
		this.displayName = displayName;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		ItemStack stack = player.getItemInHand(hand);

		if (player.isShiftKeyDown())
			return InteractionResultHolder.pass(stack);

		if (!level.isClientSide() && player instanceof ServerPlayer serverPlayer) {
			serverPlayer.openMenu(new MenuProvider() {
				@Override
				public Component getDisplayName() {
					return Component.literal(displayName);
				}

				@Override
				public AbstractContainerMenu createMenu(int id, Inventory inventory, Player menuPlayer) {
					FriendlyByteBuf buf = new FriendlyByteBuf(Unpooled.buffer());
					buf.writeBlockPos(menuPlayer.blockPosition());
					buf.writeByte(hand == InteractionHand.MAIN_HAND ? 0 : 1);
					return new BrassBackpackGUIMenu(id, inventory, buf);
				}
			});
		}

		return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		if (context.getPlayer() == null)
			return super.useOn(context);

		if (!context.getPlayer().isShiftKeyDown())
			return InteractionResult.PASS;

		return super.useOn(context);
	}
}
