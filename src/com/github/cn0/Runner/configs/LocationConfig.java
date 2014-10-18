package com.github.cn0.Runner.configs;

import com.github.cn0.Runner.annotations.Path;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.Location;

/**
 * @author Zeno
 */
public class LocationConfig {

    @Getter
    @Path("locations.world")
    public static String world;


    @Getter
    @Path("locations.rg-low.x")
    public static int rgLowX;

    @Getter
    @Path("locations.rg-low.y")
    public static int rgLowY;

    @Getter
    @Path("locations.rg-low.z")
    public static int rgLowZ;

    @Getter
    @Path("locations.rg-high.x")
    public static int rgHighX;

    @Getter
    @Path("locations.rg-high.y")
    public static int rgHighY;

    @Getter
    @Path("locations.rg-high.z")
    public static int rgHighZ;

/*

    @Getter
    @Path("locations.start.x")
    public static double startX;

    @Getter
    @Path("locations.start.y")
    public static double startY;

    @Getter
    @Path("locations.start.z")
    public static double startZ;

    @Getter
    @Path("locations.start.yaw")
    public static double startYaw;

    @Getter
    @Path("locations.start.pitch")
    public static double startPitch;


    @Getter
    @Path("locations.end.x")
    public static double endX;

    @Getter
    @Path("locations.end.y")
    public static double endY;

    @Getter
    @Path("locations.end.z")
    public static double endZ;

    @Getter
    @Path("locations.end.yaw")
    public static double endYaw;

    @Getter
    @Path("locations.end.pitch")
    public static double endPitch;
*/
    @Getter public static Location rgLow = new Location(Bukkit.getWorld(getWorld()), getRgLowX(), getRgLowY(), getRgLowZ());
    @Getter public static Location rgHigh = new Location(Bukkit.getWorld(getWorld()), getRgHighX(), getRgHighY(), getRgHighZ());
    //@Getter public static Location start = new Location(Bukkit.getWorld(getWorld()), getStartX(), getStartY(), getStartZ(), (float) getStartYaw(), (float) getStartPitch());
    //@Getter public static Location end = new Location(Bukkit.getWorld(getWorld()), getEndX(), getEndY(), getEndZ(), (float) getEndYaw(), (float) getEndPitch());

}
