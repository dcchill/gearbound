package net.gearbound.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import net.gearbound.init.GearboundModBlockEntities;

public class MagentaBrassBackpackBlockEntity extends BrownBrassBackpackBlockEntity {
	public MagentaBrassBackpackBlockEntity(BlockPos position, BlockState state) {
		super(GearboundModBlockEntities.MAGENTA_BRASS_BACKPACK.get(), position, state);
	}
}
