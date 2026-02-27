package net.gearbound.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import net.gearbound.init.GearboundModBlockEntities;

public class YellowBrassBackpackBlockEntity extends BrownBrassBackpackBlockEntity {
	public YellowBrassBackpackBlockEntity(BlockPos position, BlockState state) {
		super(GearboundModBlockEntities.YELLOW_BRASS_BACKPACK.get(), position, state);
	}
}
