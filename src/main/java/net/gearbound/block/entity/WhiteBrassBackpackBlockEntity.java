package net.gearbound.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import net.gearbound.init.GearboundModBlockEntities;

public class WhiteBrassBackpackBlockEntity extends BrownBrassBackpackBlockEntity {
	public WhiteBrassBackpackBlockEntity(BlockPos position, BlockState state) {
		super(GearboundModBlockEntities.WHITE_BRASS_BACKPACK.get(), position, state);
	}
}
