package net.gearbound.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import net.gearbound.init.GearboundModBlockEntities;

public class BlueBrassBackpackBlockEntity extends BrownBrassBackpackBlockEntity {
	public BlueBrassBackpackBlockEntity(BlockPos position, BlockState state) {
		super(GearboundModBlockEntities.BLUE_BRASS_BACKPACK.get(), position, state);
	}
}
