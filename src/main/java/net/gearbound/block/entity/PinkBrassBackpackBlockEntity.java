package net.gearbound.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import net.gearbound.init.GearboundModBlockEntities;

public class PinkBrassBackpackBlockEntity extends BrownBrassBackpackBlockEntity {
	public PinkBrassBackpackBlockEntity(BlockPos position, BlockState state) {
		super(GearboundModBlockEntities.PINK_BRASS_BACKPACK.get(), position, state);
	}
}
