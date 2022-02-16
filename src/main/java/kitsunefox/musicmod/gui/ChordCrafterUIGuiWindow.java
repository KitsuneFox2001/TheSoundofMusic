
package kitsunefox.musicmod.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import kitsunefox.musicmod.MusicmodMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ChordCrafterUIGuiWindow extends ContainerScreen<ChordCrafterUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = ChordCrafterUIGui.guistate;

	public ChordCrafterUIGuiWindow(ChordCrafterUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 414;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("musicmod:textures/chord_crafter_ui.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("musicmod:textures/chord_crafter.png"));
		this.blit(ms, this.guiLeft + 0, this.guiTop + 0, 0, 0, 414, 166, 414, 166);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Chord Crafter", 180, 9, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 7, this.guiTop + 28, 30, 20, new StringTextComponent("C"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(0, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 38, this.guiTop + 28, 35, 20, new StringTextComponent("C#"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(1, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 74, this.guiTop + 28, 30, 20, new StringTextComponent("D"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(2, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 105, this.guiTop + 28, 35, 20, new StringTextComponent("D#"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(3, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 141, this.guiTop + 28, 30, 20, new StringTextComponent("E"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(4, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 172, this.guiTop + 28, 30, 20, new StringTextComponent("F"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(5, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 203, this.guiTop + 28, 35, 20, new StringTextComponent("F#"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(6, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 239, this.guiTop + 28, 30, 20, new StringTextComponent("G"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(7, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 270, this.guiTop + 28, 35, 20, new StringTextComponent("G#"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(8, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 306, this.guiTop + 28, 30, 20, new StringTextComponent("A"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(9, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 337, this.guiTop + 28, 35, 20, new StringTextComponent("A#"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(10, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 373, this.guiTop + 28, 30, 20, new StringTextComponent("B"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(11, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 216, this.guiTop + 55, 30, 20, new StringTextComponent("7"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(12, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 12, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 125, this.guiTop + 55, 40, 20, new StringTextComponent("Major"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(13, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 13, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 170, this.guiTop + 55, 40, 20, new StringTextComponent("Minor"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(14, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 14, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 252, this.guiTop + 55, 35, 20, new StringTextComponent("Craft!"), e -> {
			if (true) {
				MusicmodMod.PACKET_HANDLER.sendToServer(new ChordCrafterUIGui.ButtonPressedMessage(15, x, y, z));
				ChordCrafterUIGui.handleButtonAction(entity, 15, x, y, z);
			}
		}));
	}
}
