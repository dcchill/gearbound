package net.gearbound.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import net.gearbound.init.GearboundModBlockEntities;

public class BlackBrassBackpackBlockEntity extends BrownBrassBackpackBlockEntity {
	public BlackBrassBackpackBlockEntity(BlockPos position, BlockState state) {
		super(GearboundModBlockEntities.BLACK_BRASS_BACKPACK.get(), position, state);
	}
}
