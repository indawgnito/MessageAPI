package org.indawgnito.messageapi;

import org.bukkit.plugin.java.JavaPlugin;

public class MessageAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("MessageAPI has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("MessageAPI has been disabled!");
    }
}