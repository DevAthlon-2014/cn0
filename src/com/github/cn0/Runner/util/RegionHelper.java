package com.github.cn0.Runner.util;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.CommandBlock;

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

    World world;

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
        this.world = loc1.getWorld();
    }

    public void checkCommandBlocks() {
        for(int x = xLow; x < xHigh; x++) {
            for(int y = yLow; y < yHigh; y++) {
                for(int z = zLow; z < zHigh; z++) {
                    Block block = world.getBlockAt(x,y,z);
                    if(block.getState() instanceof CommandBlock) {
                        CommandBlock cmdBlock = (CommandBlock) block.getState();
                        try {
                            block.setTypeId(Integer.parseInt(StringHelper.getArgs(cmdBlock.getCommand()).get(0)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}
