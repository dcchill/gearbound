package net.gearbound.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import net.gearbound.init.GearboundModBlockEntities;

public class LightGrayBrassBackpackBlockEntity extends BrownBrassBackpackBlockEntity {
	public LightGrayBrassBackpackBlockEntity(BlockPos position, BlockState state) {
		super(GearboundModBlockEntities.LIGHT_GRAY_BRASS_BACKPACK.get(), position, state);
	}
}
