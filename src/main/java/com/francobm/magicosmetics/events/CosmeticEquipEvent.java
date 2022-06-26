package com.francobm.magicosmetics.events;

import com.francobm.magicosmetics.api.CosmeticType;
import com.francobm.magicosmetics.utils.MCNotInstalledException;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * Event called when player equip a cosmetic
 */
public class CosmeticEquipEvent extends PlayerEvent implements Cancellable {

    public CosmeticEquipEvent(Player player, Object cosmetic) {
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

    public CosmeticType getCosmeticType() {
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
