package com.francobm.magicosmetics.cache;

import com.francobm.magicosmetics.api.Cosmetic;
import com.francobm.magicosmetics.api.CosmeticType;
import com.francobm.magicosmetics.utils.MCNotInstalledException;
import org.bukkit.OfflinePlayer;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class PlayerData {

    /**
     * Get the player's cosmetics
     * @param player the player
     * @return the player's cosmetics
     */
    public static PlayerData getPlayer(OfflinePlayer player){
        throw new MCNotInstalledException();
    }

    /**
     * @return the cosmetic hat of the player
     */
    public Cosmetic getHat() {
        throw new MCNotInstalledException();
    }

    /**
     * @return the cosmetic backpack of the player
     */
    public Cosmetic getBag() {
        throw new MCNotInstalledException();
    }

    /**
     *
     * @return the cosmetic off_hand of the player
     */
    public Cosmetic getWStick() {
        throw new MCNotInstalledException();
    }

    /**
     *
     * @return the cosmetic balloon of the player
     */
    public Cosmetic getBalloon() {
        throw new MCNotInstalledException();
    }

    /**
     *
     * @return the cosmetic spray of the player
     */
    public Cosmetic getSpray() {
        throw new MCNotInstalledException();
    }

    /**
     *
     * this method removes the cosmetic from the player's cosmetics
     * @param cosmeticId the cosmetic id
     */
    public void removeCosmetic(String cosmeticId){
        throw new MCNotInstalledException();
    }

    /**
     * this method sets any type of cosmetic to the player.
     * @param cosmetic the cosmetic to set
     */
    public void setCosmetic(Cosmetic cosmetic){
        throw new MCNotInstalledException();
    }

    /**
     * @return the player UUID
     */
    public UUID getUniqueId() {
        throw new MCNotInstalledException();
    }

    /**
     * @return the offline player of this player data
     */
    public OfflinePlayer getOfflinePlayer() {
        throw new MCNotInstalledException();
    }

    /**
     * This is used when permissions are disabled.
     * @return the player's cosmetics.
     */
    public Map<String, Cosmetic> getCosmetics() {
        throw new MCNotInstalledException();
    }

    /**
     * This is used when permissions are enabled.
     * @return the player's cosmetics.
     */
    public List<Cosmetic> getCosmeticsPerm() {
        throw new MCNotInstalledException();
    }

    /**
     * @param id the cosmetic id
     * @return the cosmetic with the id
     */
    public Cosmetic getCosmeticById(String id) {
        throw new MCNotInstalledException();
    }

    /**
     * @param cosmetic the cosmetic to add
     */
    public void addCosmetic(Cosmetic cosmetic){
        throw new MCNotInstalledException();
    }

    /**
     * unequip the cosmetic from the player
     * @param id the cosmetic id
     */
    public void removeEquip(String id){
        throw new MCNotInstalledException();
    }

    /**
     * unequips the cosmetic type from the player
     * @param cosmeticType the cosmetic type
     */
    public void removeEquip(CosmeticType cosmeticType){
        throw new MCNotInstalledException();
    }

    /**
     * get the cosmetic equipped with all its properties
     * @param cosmeticType the cosmetic type
     */

    public Cosmetic getEquip(CosmeticType cosmeticType){
        throw new MCNotInstalledException();
    }

    /**
     * @return if the player is in zone
     */
    public boolean isZone() {
        throw new MCNotInstalledException();
    }

    /**
     *
     * @return how many cosmetics the player is equipped with.
     */
    public int getEquippedCount(){
        throw new MCNotInstalledException();
    }

    /**
     * @return the player's cosmetics in use.
     */
    public Set<Cosmetic> cosmeticsInUse(){
        throw new MCNotInstalledException();
    }

    /**
     * hide the player's cosmetics.
     */
    public void hideAllCosmetics() {
        throw new MCNotInstalledException();
    }

    /**
     * show the player's cosmetics.
     */
    public void showAllCosmetics() {
        throw new MCNotInstalledException();
    }
}
