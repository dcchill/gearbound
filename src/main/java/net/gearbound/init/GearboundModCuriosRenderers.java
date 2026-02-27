package net.gearbound.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import net.gearbound.client.renderer.BrownBrassBackpackCuriosRenderer;

public class GearboundModCuriosRenderers {
	public static void registerRenderers(FMLClientSetupEvent event) {
		CuriosRendererRegistry.register(GearboundModItems.WHITE_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.LIGHT_GRAY_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.GRAY_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.BLACK_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.BROWN_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.RED_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.ORANGE_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.YELLOW_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.LIME_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.GREEN_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.CYAN_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.LIGHT_BLUE_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.BLUE_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.PURPLE_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.MAGENTA_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.PINK_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
	}
}
