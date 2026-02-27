package net.gearbound.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import net.gearbound.init.GearboundModBlockEntities;

public class CyanBrassBackpackBlockEntity extends BrownBrassBackpackBlockEntity {
	public CyanBrassBackpackBlockEntity(BlockPos position, BlockState state) {
		super(GearboundModBlockEntities.CYAN_BRASS_BACKPACK.get(), position, state);
	}
}
