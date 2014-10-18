package com.github.cn0.Runner;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Zeno
 */
public class Main extends JavaPlugin {

    @Getter public Main instance;

    @Override
    public void onEnable() {

        this.getLogger().info("Enabling Runner...");

        this.getLogger().info("Creating new instance of main class...");
        this.instance = this;
        this.getLogger().info("Created new instance of main class.");
    }

}
