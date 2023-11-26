package com.francobm.magicosmetics.cache.cosmetics;

import org.bukkit.inventory.ItemStack;

public interface CosmeticInventory {
    ItemStack changeItem(ItemStack originalItem);
    void leftItem();

    ItemStack leftItemAndGet();

    ItemStack getCurrentItemSaved();
}
