package com.francobm.magicosmetics.api;

import com.francobm.magicosmetics.utils.MCNotInstalledException;
import org.bukkit.Color;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * MagicAPI is a class that provides a simple way to access MagicCosmetics.
 */
public class MagicAPI {
    /**
     * Check if the player has unlocked the cosmetic.
     * @param player The player to check.
     * @param cosmeticId The cosmetic id to check.
     * @return True if the player has unlocked the cosmetic.
     */
    public static boolean hasCosmetic(Player player, String cosmeticId){
        throw new MCNotInstalledException();
    }

    /**
     * Check if an entity has a cosmetic of a certain type
     * @param entity The entity to check
     * @param cosmeticId The cosmetic id to check
     * @return True if the entity has the cosmetic, false otherwise
     */
    public static boolean hasEquipCosmetic(Entity entity, String cosmeticId){
        throw new MCNotInstalledException();
    }

    /**
     * Check if a player has a cosmetic of a certain type
     * @param player The player to check
     * @param cosmeticType The type of cosmetic to check
     * @return True if the player has a cosmetic of the given type
     */
    public static boolean hasEquipCosmetic(Player player, CosmeticType cosmeticType){
        throw new MCNotInstalledException();
    }

    /**
     * Equip a cosmetic with the id, the color and necessarily a player.
     * @param player The player to equip the cosmetic.
     * @param cosmeticId The id of the cosmetic.
     * @param color The color of the cosmetic.
     * @param force If it is true, it equips you with the cosmetic even if it is not unlocked.
     */
    public static void EquipCosmetic(Player player, String cosmeticId, String color, boolean force){
        throw new MCNotInstalledException();
    }

    /**
     * Equip a cosmetic with the id and color to an entity
     * @param entity the entity to equip the cosmetic to
     * @param cosmeticId the id of the cosmetic to equip
     * @param colorHex the color of the cosmetic to equip
     */
    public static void EquipCosmetic(Entity entity, String cosmeticId, String colorHex){
        throw new MCNotInstalledException();
    }

    /**
     * Equip a cosmetic with the id and color to an entity
     * @param entity the entity to equip the cosmetic to
     * @param cosmeticId the id of the cosmetic to equip
     * @param color the bukkit color of the cosmetic to equip
     */
    public static void EquipCosmetic(Entity entity, String cosmeticId, Color color){
        throw new MCNotInstalledException();
    }

    /**
     * Unequips a player with the selected type of cosmetic.
     * @param player The player to unequip the cosmetic.
     * @param cosmeticType The type of cosmetic to unequip.
     * @implNote You can also use {@link com.francobm.magicosmetics.cache.PlayerData#removeEquip(String)} or {@link com.francobm.magicosmetics.cache.PlayerData#removeEquip(CosmeticType)}.
     */
    public static void UnEquipCosmetic(Player player, CosmeticType cosmeticType){
        throw new MCNotInstalledException();
    }

    /**
     *
     * @param entity The entity target.
     * @param cosmeticType The cosmetic type.
     *
     */
    public static void UnEquipCosmetic(Entity entity, CosmeticType cosmeticType){
        throw new MCNotInstalledException();
    }

    /**
     * Completely removes the entity from the registry and its cosmetics.
     * @param entityUniqueId The entity target uniqueId.
     *
     */
    public static void RemoveEntityCosmetics(UUID entityUniqueId) {
        throw new MCNotInstalledException();
    }

    /**
     * @param id The cosmetic id
     * @return the cosmetic item if it exists.
     * @Deprecated use {@link Cosmetic#getItemStack()} or {@link Cosmetic#getItemColor()} or {@link Cosmetic#getItemColor(Player)} instead.
     */
    @Deprecated
    public static ItemStack getCosmeticItem(String id){
        throw new MCNotInstalledException();
    }

    /**
     * @param name The player name
     * @param type The cosmetic type
     * @return the cosmetic id if it exists Otherwise it will return null.
     */
    public static String getCosmeticId(String name, String type){
        throw new MCNotInstalledException();
    }

    /**
     * @param name The player name
     * @param type The cosmetic type
     * @return The cosmetic equipped with all its properties or null.
     */
    public static ItemStack getEquipped(String name, String type){
        throw new MCNotInstalledException();
    }

    /**
     * @param offlinePlayer The offline player
     * @param cosmeticType The cosmetic type
     * @return The cosmetic equipped with all its properties or null.
     */
    public static ItemStack getEquipped(OfflinePlayer offlinePlayer, CosmeticType cosmeticType){
        throw new MCNotInstalledException();
    }

    /**
     * @param player The player
     * @param cosmeticType The cosmetic type
     * @return the number of types of cosmetics available for the player.
     */
    public static int getPlayerCosmeticsAvailable(Player player, CosmeticType cosmeticType){
        throw new MCNotInstalledException();
    }

    /**
     * @param player The player
     * @return true if it has been possible to paint the block that the player is looking at.
     */
    public static boolean spray(Player player) {
        throw new MCNotInstalledException();
    }

    /**
     *
     * @param item The item to check
     * @param colorHex The color hex to check
     * @return true if the item has been tinted.
     */
    public static boolean tintItem(ItemStack item, String colorHex){
        throw new MCNotInstalledException();
    }

    /**
     *
     * @param player The player
     * @return the amount of cosmetics available from the player.
     */
    public static int getPlayerAllCosmeticsAvailable(Player player){
        throw new MCNotInstalledException();
    }

    /**
     *
     * @param cosmeticType The cosmetic type
     * @return the amount of type cosmetics available from the server.
     */
    public static int getServerCosmeticsAvailable(CosmeticType cosmeticType){
        throw new MCNotInstalledException();
    }

    /**
     *
     * @return the amount of cosmetics available from the server.
     */
    public static int getServerAllCosmeticsAvailable(){
        throw new MCNotInstalledException();
    }

    /**
     *
     * @return cosmetics registered on the server in one set
     */
    public static Set<Cosmetic> getCosmetics() {
        throw new MCNotInstalledException();
    }

    /**
     *
     * @param cosmeticType The type of cosmetic you want to return to you
     * @return a set with cosmetics of the specified type regardless of whether they are hidden in the menu.
     */
    public static Set<Cosmetic> getCosmeticsByType(CosmeticType cosmeticType) {
        throw new MCNotInstalledException();
    }

    /**
     *
     * @param cosmeticType The type of cosmetic you want to return to you
     * @return a set with the cosmetics of the specified type, unlike {@link MagicAPI#getCosmeticsByType(CosmeticType)} these returns only the cosmetics that are not hidden in the menu.
     */
    public static Set<Cosmetic> getCosmeticsHideByType(CosmeticType cosmeticType){
        throw new MCNotInstalledException();
    }
}
