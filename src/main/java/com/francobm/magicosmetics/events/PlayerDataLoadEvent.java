package com.francobm.magicosmetics.events;

import com.francobm.magicosmetics.api.Cosmetic;
import com.francobm.magicosmetics.cache.PlayerData;
import com.francobm.magicosmetics.utils.MCNotInstalledException;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.Set;

/**
 *  The event is called when the player's data has just been loaded.
 *  This event is asynchronous
 */
public class PlayerDataLoadEvent extends Event {

    public PlayerDataLoadEvent(PlayerData playerData, Set<Cosmetic> equippedCosmetics){
        super(true);
        throw new MCNotInstalledException();
    }

    @Override
    public HandlerList getHandlers() {
        throw  new MCNotInstalledException();
    }

    public static HandlerList getHandlerList() {
        throw  new MCNotInstalledException();
    }

    /**
     * Player whose data has been uploaded
     * @return PlayerData
     */
    public PlayerData getPlayerData() {
        throw  new MCNotInstalledException();
    }

    /**
     * Cosmetics that have been loaded and are now being equipped to the player.
     * @return cosmetics being used by the player
     */
    public Set<Cosmetic> getEquippedCosmetics() {
        throw  new MCNotInstalledException();
    }
}
