package org.leseaux.daycounter.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;

public class DaycounterClient implements ClientModInitializer {
    private int days = 0;

    @Override
    public void onInitializeClient() {
        // Enregistrement de l'événement HUD avec un lambda pour éviter les incompatibilités de méthode
        HudRenderCallback.EVENT.register((context, tickDelta) -> this.renderDayCount(context));
    }

    private void renderDayCount(DrawContext context) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player != null && client.world != null) {
            // Calcul des jours survécus
            long time = client.world.getTimeOfDay();
            days = (int) (time / 24000);
            String text = "JOUR " + days;
            // Dessiner le texte sur l'écran
            context.drawText(client.textRenderer, text, (client.getWindow().getScaledWidth() - client.textRenderer.getWidth(text)) / 2, client.getWindow().getScaledHeight() - 70, 0xFFFFFF, false);
        }
    }
}
