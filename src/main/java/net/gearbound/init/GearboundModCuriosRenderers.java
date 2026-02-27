package net.gearbound.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import net.gearbound.client.renderer.BrownBrassBackpackCuriosRenderer;

public class GearboundModCuriosRenderers {
	public static void registerRenderers(FMLClientSetupEvent event) {
		CuriosRendererRegistry.register(GearboundModItems.WHITE_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/white_backpack_e_texture.png"));
		CuriosRendererRegistry.register(GearboundModItems.ORANGE_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/orange_backpack_e_texture.png"));
		CuriosRendererRegistry.register(GearboundModItems.MAGENTA_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/magenta_backpack_e_texture.png"));
		CuriosRendererRegistry.register(GearboundModItems.LIGHT_BLUE_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/light_blue_backpack_e_texture.png"));
		CuriosRendererRegistry.register(GearboundModItems.YELLOW_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/yellow_backpack_e_texture.png"));
		CuriosRendererRegistry.register(GearboundModItems.LIME_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/lime_backpack_e_texture.png"));
		CuriosRendererRegistry.register(GearboundModItems.PINK_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/pink_backpack_e_texture.png"));
		CuriosRendererRegistry.register(GearboundModItems.GRAY_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/gray_backpack_e_texture.png"));
		CuriosRendererRegistry.register(GearboundModItems.LIGHT_GRAY_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/light_gray_backpack_e_texture.png"));
		CuriosRendererRegistry.register(GearboundModItems.CYAN_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/cyan_backpack_e_texture.png"));
		CuriosRendererRegistry.register(GearboundModItems.PURPLE_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/purple_backpack_e_texture.png"));
		CuriosRendererRegistry.register(GearboundModItems.BLUE_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/blue_backpack_e_texture.png"));
		CuriosRendererRegistry.register(GearboundModItems.BROWN_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/backpack_e_texture.png"));
		CuriosRendererRegistry.register(GearboundModItems.GREEN_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/green_backpack_e_texture.png"));
		CuriosRendererRegistry.register(GearboundModItems.RED_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/red_backpack_e_texture.png"));
		CuriosRendererRegistry.register(GearboundModItems.BLACK_BRASS_BACKPACK_ITEM.get(), () -> new BrownBrassBackpackCuriosRenderer("gearbound:textures/entities/black_backpack_e_texture.png"));
	}
}
