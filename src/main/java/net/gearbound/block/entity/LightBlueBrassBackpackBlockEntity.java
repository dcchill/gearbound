package net.gearbound.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

import net.gearbound.init.GearboundModBlockEntities;

public class LightBlueBrassBackpackBlockEntity extends BrownBrassBackpackBlockEntity {
	public LightBlueBrassBackpackBlockEntity(BlockPos position, BlockState state) {
		super(GearboundModBlockEntities.LIGHT_BLUE_BRASS_BACKPACK.get(), position, state);
	}
}
