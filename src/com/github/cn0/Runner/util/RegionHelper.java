package com.github.cn0.Runner.util;

import org.bukkit.Location;

/**
 * @author Zeno
 */
public class RegionHelper {

    int xLow;
    int yLow;
    int zLow;
    int xHigh;
    int yHigh;
    int zHigh;

    /**
     * RegionHelper helps scanning region for commandblocks
     * @param loc1 reference location 1
     * @param loc2 reference location 2
     */
    public RegionHelper(Location loc1, Location loc2) {
        this.xLow = Math.min(loc1.getBlockX(), loc2.getBlockX());
        this.yLow = Math.min(loc1.getBlockY(), loc2.getBlockY());
        this.zLow = Math.min(loc1.getBlockZ(), loc2.getBlockZ());
        this.xHigh = Math.max(loc1.getBlockX(), loc2.getBlockX());
        this.yHigh = Math.max(loc1.getBlockY(), loc2.getBlockY());
        this.zHigh = Math.max(loc1.getBlockZ(), loc2.getBlockZ());
    }

}
