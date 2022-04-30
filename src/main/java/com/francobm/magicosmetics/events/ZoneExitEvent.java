package com.francobm.magicosmetics.events;

import com.francobm.magicosmetics.utils.MCNotInstalledException;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * Event called when a player exits a zone.
 */
public class ZoneExitEvent extends PlayerEvent implements Cancellable {

    public ZoneExitEvent(Player player, Object zone, Reason reason) {
        super(player);
        throw new MCNotInstalledException();
    }

    @Override
    public HandlerList getHandlers() {
        throw new MCNotInstalledException();
    }

    public static HandlerList getHandlerList() {
        throw new MCNotInstalledException();
    }

    public Reason getReason() {
        throw new MCNotInstalledException();
    }

    @Override
    public boolean isCancelled() {
        throw new MCNotInstalledException();
    }

    @Override
    public void setCancelled(boolean cancel) {
        throw new MCNotInstalledException();
    }
}
