package com.francobm.magicosmetics.cache.cosmetics;

import com.francobm.magicosmetics.api.Cosmetic;
import com.francobm.magicosmetics.utils.MCNotInstalledException;
import org.bukkit.inventory.ItemStack;

public class Hat extends Cosmetic implements CosmeticInventory {

    public boolean isOverlaps() {
        throw new MCNotInstalledException();
    }

    public double getOffSetY() {
        throw new MCNotInstalledException();
    }

    public void setHideCompletely() {
        throw new MCNotInstalledException();
    }

    /**
     * Combine the item provided with the cosmetic item to combine them into a single item.
     * @param originalItem - Combine this item with the cosmetic to attach it to the player's helmet slot.
     */
    @Override
    public void changeItem(ItemStack originalItem) {
        throw new MCNotInstalledException();
    }

    /**
     * This method is used when the player wants to take his helmet out of the hat and separate them.
     * The helmet item will be placed on the player's cursor and will cause the cosmetician to lose the data of the helmet item.
     * Warning: This method will make you get the real helmet so if you make it disappear or something like that the player will lose his real helmet.
     */
    @Override
    public void leftItem() {
        throw new MCNotInstalledException();
    }

    /**
     * This method is used when the player wants to take his helmet out of the hat and separate them.
     * In this case the item will not be placed on the player's cursor, but you will get it directly and the hat will lose all the data of the helmet item.
     * Warning: This method will make you get the real helmet so if you make it disappear or something like that the player will lose his real helmet.
     * @return {@link ItemStack Helmet Item}
     */
    @Override
    public ItemStack leftItemAndGet() {
        throw new MCNotInstalledException();
    }

    /**
     * This method obtains the item being saved, in this case the player's actual helmet.
     * It is not a clone so if you try to modify it, it will also be modified in the saved item.
     * @return {@link ItemStack Helmet Item saved}
     */
    @Override
    public ItemStack getCurrentItemSaved() {
        throw new MCNotInstalledException();
    }
}
