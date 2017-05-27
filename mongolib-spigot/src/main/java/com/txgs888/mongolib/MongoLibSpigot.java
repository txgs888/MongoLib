package com.txgs888.mongolib;

import org.bukkit.plugin.java.JavaPlugin;

public final class MongoLibSpigot extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("enable.");
    }

    @Override
    public void onDisable() {
        getLogger().info("disable.");
    }
}
