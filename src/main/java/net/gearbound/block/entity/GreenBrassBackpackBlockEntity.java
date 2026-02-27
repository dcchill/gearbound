package net.gearbound.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import net.gearbound.init.GearboundModBlockEntities;

public class GreenBrassBackpackBlockEntity extends BrownBrassBackpackBlockEntity {
	public GreenBrassBackpackBlockEntity(BlockPos position, BlockState state) {
		super(GearboundModBlockEntities.GREEN_BRASS_BACKPACK.get(), position, state);
	}
}
