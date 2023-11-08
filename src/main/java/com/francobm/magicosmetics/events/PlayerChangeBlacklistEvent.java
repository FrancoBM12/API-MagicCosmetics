package com.francobm.magicosmetics.events;

import com.francobm.magicosmetics.utils.MCNotInstalledException;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 *  The event is called when the player enters or leaves a world within the blacklist.
 */
public class PlayerChangeBlacklistEvent extends PlayerEvent {

    public PlayerChangeBlacklistEvent(Player player, boolean isInWorldBlacklist) {
        super(player);
    }

    public boolean isInWorldBlacklist() {
        throw new MCNotInstalledException();
    }
    @Override
    public HandlerList getHandlers() {
        throw  new MCNotInstalledException();
    }

    public static HandlerList getHandlerList() {
        throw  new MCNotInstalledException();
    }
}
