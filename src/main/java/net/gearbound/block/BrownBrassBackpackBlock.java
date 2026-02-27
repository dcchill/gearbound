package net.gearbound.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.Containers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;

import net.gearbound.block.entity.BrownBrassBackpackBlockEntity;

public class BrownBrassBackpackBlock extends Block implements EntityBlock {

    public BrownBrassBackpackBlock() {
        super(BlockBehaviour.Properties.of()
                .sound(SoundType.WOOL)
                .strength(0.75f, 8f)
                .noOcclusion()
                .isRedstoneConductor((bs, br, bp) -> false));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world,
                               BlockPos pos, CollisionContext context) {
        return Shapes.or(
                box(3, 0, 5, 13, 6, 11),
                box(4, 6, 6, 12, 12, 11),
                box(2, 1, 6, 14, 4, 10),
                box(4, 0, 4, 12, 4, 5)
        );
    }

    // Open when placed
    @Override
    public InteractionResult useWithoutItem(BlockState state, Level world,
                                            BlockPos pos, Player player,
                                            BlockHitResult hit) {

        if (player.isShiftKeyDown()) {
            return InteractionResult.PASS;
        }

        if (!world.isClientSide && player instanceof ServerPlayer serverPlayer) {
            serverPlayer.openMenu(state.getMenuProvider(world, pos), pos);
        }

        return InteractionResult.sidedSuccess(world.isClientSide);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new BrownBrassBackpackBlockEntity(pos, state);
    }

    @Override
    public MenuProvider getMenuProvider(BlockState state, Level world,
                                        BlockPos pos) {
        BlockEntity be = world.getBlockEntity(pos);
        return be instanceof MenuProvider provider ? provider : null;
    }

    // Shulker-style drop
@Override
public void onRemove(BlockState state, Level world,
                     BlockPos pos, BlockState newState,
                     boolean isMoving) {

    if (!state.is(newState.getBlock())) {

        BlockEntity be = world.getBlockEntity(pos);

        if (!world.isClientSide && be instanceof BrownBrassBackpackBlockEntity backpack) {

            ItemStack stack = new ItemStack(this);

            backpack.saveToItem(stack, world.registryAccess());

            Containers.dropItemStack(
                    world,
                    pos.getX() + 0.5,
                    pos.getY() + 0.5,
                    pos.getZ() + 0.5,
                    stack
            );
        }

        // IMPORTANT: Remove block entity AFTER drop
        super.onRemove(state, world, pos, newState, isMoving);
    }
}

	@Override
	public void setPlacedBy(Level level,
	                        BlockPos pos,
	                        BlockState state,
	                        @Nullable LivingEntity placer,
	                        ItemStack stack) {
	
	    if (level.isClientSide()) return;
	
	    BlockEntity be = level.getBlockEntity(pos);
	
	    if (be instanceof BrownBrassBackpackBlockEntity backpack) {
	
	        var customData = stack.get(net.minecraft.core.component.DataComponents.CUSTOM_DATA);
	
	        if (customData != null) {
	            backpack.loadAdditional(customData.copyTag(), level.registryAccess());
	        }
	    }
	}

    @Override
    public boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }
@Override
public java.util.List<ItemStack> getDrops(BlockState state,
                                          net.minecraft.world.level.storage.loot.LootParams.Builder builder) {
    return java.util.Collections.emptyList();
}
    @Override
    public int getAnalogOutputSignal(BlockState state, Level world,
                                     BlockPos pos) {

        BlockEntity be = world.getBlockEntity(pos);

        if (be instanceof BrownBrassBackpackBlockEntity backpack)
            return AbstractContainerMenu.getRedstoneSignalFromContainer(backpack);

        return 0;
    }
}