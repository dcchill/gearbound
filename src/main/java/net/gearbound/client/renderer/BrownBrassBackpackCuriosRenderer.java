package net.gearbound.client.renderer;

import top.theillusivec4.curios.api.client.ICurioRenderer;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.gearbound.client.model.Modelbackpack;

import java.util.Map;
import java.util.Collections;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BrownBrassBackpackCuriosRenderer implements ICurioRenderer {
	private static final ResourceLocation TEXTURE = ResourceLocation.parse("gearbound:textures/entities/backpack_e_texture.png");
	private final HumanoidModel<LivingEntity> humanoidModel;

	public BrownBrassBackpackCuriosRenderer() {
		ModelPart bakedRoot = Minecraft.getInstance().getEntityModels().bakeLayer(Modelbackpack.LAYER_LOCATION);
		ModelPart backpackBody = resolveBackpackBody(bakedRoot);

		this.humanoidModel = new HumanoidModel<>(new ModelPart(Collections.emptyList(),
				Map.of("hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body", backpackBody, "left_arm",
						new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()),
						"right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
	}

	private static ModelPart resolveBackpackBody(ModelPart root) {
		if (root.hasChild("backpack"))
			return root.getChild("backpack");
		if (root.hasChild("bb_main"))
			return root.getChild("bb_main");
		if (root.hasChild("bone"))
			return root.getChild("bone");
		return root;
	}

	@Override
	public <T extends LivingEntity, M extends EntityModel<T>> void render(ItemStack stack, SlotContext slotContext, PoseStack matrixStack, RenderLayerParent<T, M> renderLayerParent, MultiBufferSource renderTypeBuffer, int light, float limbSwing,
			float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
		LivingEntity entity = slotContext.entity();
		ICurioRenderer.followHeadRotations(entity, this.humanoidModel.head);
		ICurioRenderer.followBodyRotations(entity, this.humanoidModel);
		this.humanoidModel.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
		VertexConsumer vertexconsumer = ItemRenderer.getArmorFoilBuffer(renderTypeBuffer, RenderType.entityTranslucent(TEXTURE), stack.hasFoil());
		this.humanoidModel.renderToBuffer(matrixStack, vertexconsumer, light, OverlayTexture.NO_OVERLAY);
	}
}
