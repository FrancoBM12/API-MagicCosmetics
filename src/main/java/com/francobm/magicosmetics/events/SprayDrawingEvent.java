package com.francobm.magicosmetics.events;

import com.francobm.magicosmetics.api.SprayKeys;
import com.francobm.magicosmetics.utils.MCNotInstalledException;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * Event called when a player is drawing a spray.
 */
public class SprayDrawingEvent extends PlayerEvent implements Cancellable {

    public SprayDrawingEvent(Player player, Block sprayedBlock, SprayKeys key) {
        super(player);
        throw new MCNotInstalledException();
    }

    /**
     * Gets the key of the spray being drawn.
     *
     * @return the key of the spray being drawn.
     */
    public SprayKeys getKey() {
        throw new MCNotInstalledException();
    }

    /**
     * Gets the block being sprayed.
     *
     * @return the block being sprayed.
     */
    public Block getSprayedBlock() {
        throw new MCNotInstalledException();
    }

    @Override
    public HandlerList getHandlers() {
        throw new MCNotInstalledException();
    }

    public static HandlerList getHandlerList() {
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
