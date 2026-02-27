package net.gearbound.init;

import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import net.gearbound.client.renderer.YellowBrassBackpackCuriosRenderer;
import net.gearbound.client.renderer.WhiteBrassBackpackCuriosRenderer;
import net.gearbound.client.renderer.RedBrassBackpackCuriosRenderer;
import net.gearbound.client.renderer.PurpleBrassBackpackCuriosRenderer;
import net.gearbound.client.renderer.PinkBrassBackpackCuriosRenderer;
import net.gearbound.client.renderer.OrangeBrassBackpackCuriosRenderer;
import net.gearbound.client.renderer.MagentaBrassBackpackCuriosRenderer;
import net.gearbound.client.renderer.LimeBrassBackpackCuriosRenderer;
import net.gearbound.client.renderer.LightGrayBrassBackpackCuriosRenderer;
import net.gearbound.client.renderer.LightBlueBrassBackpackCuriosRenderer;
import net.gearbound.client.renderer.GreenBrassBackpackCuriosRenderer;
import net.gearbound.client.renderer.GrayBrassBackpackCuriosRenderer;
import net.gearbound.client.renderer.CyanBrassBackpackCuriosRenderer;
import net.gearbound.client.renderer.BrownBrassBackpackCuriosRenderer;
import net.gearbound.client.renderer.BlueBrassBackpackCuriosRenderer;
import net.gearbound.client.renderer.BlackBrassBackpackCuriosRenderer;

public class GearboundModCuriosRenderers {
	public static void registerRenderers(FMLClientSetupEvent event) {
		CuriosRendererRegistry.register(GearboundModItems.WHITE_BRASS_BACKPACK_ITEM.get(), WhiteBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.LIGHT_GRAY_BRASS_BACKPACK_ITEM.get(), LightGrayBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.GRAY_BRASS_BACKPACK_ITEM.get(), GrayBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.BLACK_BRASS_BACKPACK_ITEM.get(), BlackBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.BROWN_BRASS_BACKPACK_ITEM.get(), BrownBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.RED_BRASS_BACKPACK_ITEM.get(), RedBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.ORANGE_BRASS_BACKPACK_ITEM.get(), OrangeBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.YELLOW_BRASS_BACKPACK_ITEM.get(), YellowBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.LIME_BRASS_BACKPACK_ITEM.get(), LimeBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.GREEN_BRASS_BACKPACK_ITEM.get(), GreenBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.CYAN_BRASS_BACKPACK_ITEM.get(), CyanBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.LIGHT_BLUE_BRASS_BACKPACK_ITEM.get(), LightBlueBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.BLUE_BRASS_BACKPACK_ITEM.get(), BlueBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.PURPLE_BRASS_BACKPACK_ITEM.get(), PurpleBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.MAGENTA_BRASS_BACKPACK_ITEM.get(), MagentaBrassBackpackCuriosRenderer::new);
		CuriosRendererRegistry.register(GearboundModItems.PINK_BRASS_BACKPACK_ITEM.get(), PinkBrassBackpackCuriosRenderer::new);
	}
}