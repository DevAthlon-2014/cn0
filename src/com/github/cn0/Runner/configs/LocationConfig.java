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
    @Path("location.world")
    public static String world;


    @Getter
    @Path("location.rg-low.x")
    public static double rgLowX;

    @Getter
    @Path("location.rg-low.y")
    public static double rgLowY;

    @Getter
    @Path("location.rg-low.z")
    public static double rgLowZ;

    @Getter
    @Path("location.rg-high.x")
    public static double rgHighX;

    @Getter
    @Path("location.rg-high.y")
    public static double rgHighY;

    @Getter
    @Path("location.rg-high.z")
    public static double rgHighZ;

/*

    @Getter
    @Path("location.start.x")
    public static double startX;

    @Getter
    @Path("location.start.y")
    public static double startY;

    @Getter
    @Path("location.start.z")
    public static double startZ;

    @Getter
    @Path("location.start.yaw")
    public static double startYaw;

    @Getter
    @Path("location.start.pitch")
    public static double startPitch;


    @Getter
    @Path("location.end.x")
    public static double endX;

    @Getter
    @Path("location.end.y")
    public static double endY;

    @Getter
    @Path("location.end.z")
    public static double endZ;

    @Getter
    @Path("location.end.yaw")
    public static double endYaw;

    @Getter
    @Path("location.end.pitch")
    public static double endPitch;
*/
    @Getter public static Location rgLow = new Location(Bukkit.getWorld(getWorld()), getRgLowX(), getRgLowY(), getRgLowZ());
    @Getter public static Location rgHigh = new Location(Bukkit.getWorld(getWorld()), getRgHighX(), getRgHighY(), getRgHighZ());
    //@Getter public static Location start = new Location(Bukkit.getWorld(getWorld()), getStartX(), getStartY(), getStartZ(), (float) getStartYaw(), (float) getStartPitch());
    //@Getter public static Location end = new Location(Bukkit.getWorld(getWorld()), getEndX(), getEndY(), getEndZ(), (float) getEndYaw(), (float) getEndPitch());

}
