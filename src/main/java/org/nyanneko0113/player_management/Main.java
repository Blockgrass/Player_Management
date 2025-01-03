package org.nyanneko0113.player_management;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    public static Main getInstance() {
        return getPlugin(Main.class);
    }

}
