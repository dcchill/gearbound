package net.gearbound.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import net.gearbound.client.renderer.BrownBrassBackpackCuriosRenderer;

public class GearboundModCuriosRenderers {
	public static void registerRenderers(FMLClientSetupEvent event) {
		CuriosRendererRegistry.register(GearboundModItems.BROWN_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
	}
}