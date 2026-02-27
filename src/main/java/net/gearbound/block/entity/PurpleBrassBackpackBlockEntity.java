package net.gearbound.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import net.gearbound.init.GearboundModBlockEntities;

public class PurpleBrassBackpackBlockEntity extends BrownBrassBackpackBlockEntity {
	public PurpleBrassBackpackBlockEntity(BlockPos position, BlockState state) {
		super(GearboundModBlockEntities.PURPLE_BRASS_BACKPACK.get(), position, state);
	}
}
