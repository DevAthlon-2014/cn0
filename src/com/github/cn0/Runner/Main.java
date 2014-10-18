package com.github.cn0.Runner;

import com.github.cn0.Runner.configs.LocationConfig;
import com.github.cn0.Runner.util.ConfigAnnoReader;
import com.github.cn0.Runner.util.RegionHelper;
import com.github.cn0.Runner.util.StringHelper;
import lombok.Getter;
import org.bukkit.Bukkit;
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

        this.getLogger().info("Loading configs...");
        this.saveDefaultConfig();
        ConfigAnnoReader.initConfig(LocationConfig.class, this.getConfig());
        this.getLogger().info("Loaded configs...");

        System.out.println("Built String:");
        StringHelper.getArgs("ein zwei drei zeilen").stream().forEach(s -> System.out.println(s));

        new RegionHelper(LocationConfig.getRgLow(), LocationConfig.getRgHigh(), Bukkit.getWorld(LocationConfig.getWorld())).checkCommandBlocks();

    }

}
