package net.gearbound.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import net.gearbound.init.GearboundModBlockEntities;

public class RedBrassBackpackBlockEntity extends BrownBrassBackpackBlockEntity {
	public RedBrassBackpackBlockEntity(BlockPos position, BlockState state) {
		super(GearboundModBlockEntities.RED_BRASS_BACKPACK.get(), position, state);
	}
}
