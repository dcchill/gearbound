package net.gearbound.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import net.gearbound.init.GearboundModBlockEntities;

public class GrayBrassBackpackBlockEntity extends BrownBrassBackpackBlockEntity {
	public GrayBrassBackpackBlockEntity(BlockPos position, BlockState state) {
		super(GearboundModBlockEntities.GRAY_BRASS_BACKPACK.get(), position, state);
	}
}
