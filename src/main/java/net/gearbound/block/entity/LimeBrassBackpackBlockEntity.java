package net.gearbound.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import net.gearbound.init.GearboundModBlockEntities;

public class LimeBrassBackpackBlockEntity extends BrownBrassBackpackBlockEntity {
	public LimeBrassBackpackBlockEntity(BlockPos position, BlockState state) {
		super(GearboundModBlockEntities.LIME_BRASS_BACKPACK.get(), position, state);
	}
}
