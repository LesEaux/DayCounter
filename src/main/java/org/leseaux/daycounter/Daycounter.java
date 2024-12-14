package org.leseaux.daycounter;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.MinecraftServer;

public class Daycounter implements ModInitializer {
    private int days = 0;

    @Override
    public void onInitialize() {
        ServerTickEvents.END_SERVER_TICK.register(this::onServerTick);
    }

    private void onServerTick(MinecraftServer server){
        long time = server.getOverworld().getTime();
        int currentDay = (int) (time / 24000);
        if (currentDay != days){
            days = currentDay;
            System.out.println("Day " + days);
        }
    }

}
