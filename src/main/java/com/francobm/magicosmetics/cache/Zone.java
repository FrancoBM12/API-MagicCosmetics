package com.francobm.magicosmetics.cache;

import com.francobm.magicosmetics.utils.MCNotInstalledException;
import org.bukkit.Location;
import org.bukkit.block.Block;

public class Zone {


    /**
     * The spray location of the zone.
     *
     * @return org.bukkit.Location
     */
    public Location getSprayLoc() {
        throw new MCNotInstalledException();
    }

    /**
     * @param id - the id of the zone.
     * @return com.francobm.magicosmetics.cache.Zone
     */
    public static Zone getZone(String id) {
        throw new MCNotInstalledException();
    }

    /**
     * @param block - The block where the player is
     * @return true if the player is within this zone.
     */
    public boolean isInZone(Block block) {
        throw new MCNotInstalledException();
    }

    /**
     * @return true if the zone is active
     */
    public boolean isActive() {
        throw new MCNotInstalledException();
    }

    /**
     * @return id of the zone.
     */
    public String getId() {
        throw new MCNotInstalledException();
    }

    /**
     * @return The entrance location of the zone.
     */
    public Location getEnter() {
        throw new MCNotInstalledException();
    }

    /**
     * @return The exit location of the zone.
     */
    public Location getExit() {
        throw new MCNotInstalledException();
    }

    /**
     * @return The location of the NPC in the zone.
     */
    public Location getNpc() {
        throw new MCNotInstalledException();
    }

    /**
     * @return The location of the balloon in the zone.
     */
    public Location getBalloon() {
        throw new MCNotInstalledException();
    }

    /**
     * @return The name of the zone (not equal to the id)
     */
    public String getName() {
        throw new MCNotInstalledException();
    }
}
