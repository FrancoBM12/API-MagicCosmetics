package com.francobm.magicosmetics.cache.cosmetics;

import com.francobm.magicosmetics.api.Cosmetic;
import com.francobm.magicosmetics.utils.MCNotInstalledException;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class WStick extends Cosmetic implements CosmeticInventory {

    public boolean isOverlaps() {
        throw new MCNotInstalledException();
    }

    /**
     * Combine the item provided with the cosmetic item to combine them into a single item.
     * @param originalItem - Combine this item with the cosmetic to attach it to the player's offhand slot.
     * @return Returns the item you have stored in the cosmetic or null if you have none.
     */
    @Override
    public ItemStack changeItem(ItemStack originalItem) {
        throw new MCNotInstalledException();
    }

    /**
     * This method is used when the player wants to take his offhand item out of the offhand cosmetic and separate them.
     * The offhand item will be placed on the player's cursor and will cause the cosmetician to lose the data of the offhand item.
     * Warning: This method will make you get the real offhand item so if you make it disappear or something like that the player will lose his real offhand item.
     */
    @Override
    public void leftItem() {
        throw new MCNotInstalledException();
    }

    /**
     * This method is used when the player wants to take his offhand item out of the offhand cosmetic and separate them.
     * In this case the item will not be placed on the player's cursor, but you will get it directly and the offhand cosmetic will lose all the data of the offhand item.
     * Warning: This method will make you get the real offhand item so if you make it disappear or something like that the player will lose his real offhand item.
     * @return {@link ItemStack Offhand Item}
     */
    @Override
    public ItemStack leftItemAndGet() {
        throw new MCNotInstalledException();
    }

    /**
     * This method obtains the item being saved, in this case the player's actual offhand.
     * It is not a clone so if you try to modify it, it will also be modified in the saved item.
     * @return {@link ItemStack Offhand Item saved}
     */
    @Override
    public ItemStack getCurrentItemSaved() {
        throw new MCNotInstalledException();
    }

    /**
     * It will hide the cosmetic from the selected player.
     * @param player - target
     */
    @Override
    public void hide(Player player) {
        throw new MCNotInstalledException();
    }

    /**
     * Will show the cosmetic to the selected player.
     * @param player - target
     */
    @Override
    public void show(Player player) {
        throw new MCNotInstalledException();
    }

    public void spawn(Player player) {
        throw new MCNotInstalledException();
    }
}
