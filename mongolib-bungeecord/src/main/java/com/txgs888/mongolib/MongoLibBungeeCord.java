package com.txgs888.mongolib;

import net.md_5.bungee.api.plugin.Plugin;

public final class MongoLibBungeeCord extends Plugin {

    @Override
    public void onEnable() {
        getLogger().info("enable.");
    }

    @Override
    public void onDisable() {
        getLogger().info("disable.");
    }
}
