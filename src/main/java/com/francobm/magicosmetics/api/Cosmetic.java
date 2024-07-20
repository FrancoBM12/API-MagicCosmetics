package com.francobm.magicosmetics.api;

import com.francobm.magicosmetics.utils.MCNotInstalledException;
import org.bukkit.Color;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public abstract class Cosmetic {

    /**
     * This method is used to clone the cosmetic with the id you will give it,
     * this is used to modify any other cosmetic you call with this method.
     * @param id the cosmetic id
     * @return the cosmetic with the given id
     */
    public static Cosmetic getCloneCosmetic(String id){
        throw new MCNotInstalledException();
    }

    /**
     * This method serves to obtain a registered cosmetic,
     *  you cannot try to change this cosmetic because,
     *  you will change it permanently and it will affect everyone.
     * @param id the cosmetic id
     * @return the cosmetic with the given id
     */
    public static Cosmetic getCosmetic(String id){
        throw new MCNotInstalledException();
    }

    /**
     * This method is used to obtain the cosmetic name.
     * @return the cosmetic name
     */
    public String getName() {
        throw new MCNotInstalledException();
    }

    /**
     * This method is used to obtain the cosmetic id.
     * @return the cosmetic id
     */
    public String getId() {
        throw new MCNotInstalledException();
    }

    /**
     * This method is used to obtain the cosmetic model data.
     * @return the cosmetic model data
     */
    public int getModelData() {
        throw new MCNotInstalledException();
    }

    /**
     * This method is used to obtain the cosmetic item.
     * @return the cosmetic item
     */
    public ItemStack getItemStack() {
        throw new MCNotInstalledException();
    }

    /**
     * This method is used to obtain the cosmetic type.
     * @return the cosmetic type
     */
    public CosmeticType getCosmeticType() {
        throw new MCNotInstalledException();
    }

    /**
     * this method is used to know if the cosmetic is colored.
     * @return true if the cosmetic is colored, false otherwise
     */
    public boolean isColored() {
        throw new MCNotInstalledException();
    }

    /**
     * This method is used to obtain the cosmetic color of org.bukkit.Color
     * @return the cosmetic color
     */
    public Color getColor() {
        throw new MCNotInstalledException();
    }

    /**
     * This method is used to set the cosmetic color of org.bukkit.Color
     * @param color the cosmetic color
     */
    public void setColor(Color color){
        throw new MCNotInstalledException();
    }

    /**
     * This method is used to obtain the cosmetic item with color.
     * @return the cosmetic item with color
     */
    public ItemStack getItemColor(){
        throw new MCNotInstalledException();
    }

    /**
     * This method is used to obtain the cosmetic item with color & player info.
     * Can be used for player heads.
     * @param player the player
     * @return the cosmetic item with color & player info
     */
    public ItemStack getItemColor(Player player) {
        throw new MCNotInstalledException();
    }

    /**
     * This method is used to obtain the cosmetic permission.
     * @return the cosmetic permission
     */
    public String getPermission() {
        throw new MCNotInstalledException();
    }

    /**
     * This method is used to set the default color of the cosmetic.
     * @param defaultColor the default color
     */
    public void setDefaultColor(boolean defaultColor){
        throw new MCNotInstalledException();
    }

    /**
     * This method is used to know if the cosmetic is default colored.
     * @return true if the cosmetic is default colored, false otherwise
     */
    public boolean isDefaultColor(){
        throw new MCNotInstalledException();
    }

    /**
     * This method is used to obtain the cosmetic hide in menu.
     * @return true if the cosmetic is hidden, false otherwise
     */
    public boolean isHideMenu() {
        throw new MCNotInstalledException();
    }

    /**
     * This method tells you if the cosmetic is hidden.
     * @return true if the cosmetic is hidden, false otherwise
     */
    public boolean isHideCosmetic() {
        throw new MCNotInstalledException();
    }

    /**
     * This method is used to set the cosmetic hide in game.
     * @param hideCosmetic the cosmetic hide in game
     */
    public void setHideCosmetic(boolean hideCosmetic) {
        throw new MCNotInstalledException();
    }

    /**
     * The cosmetic is provided to the selected entity.
     * @param lendEntity
     */
    public void setLendEntity(LivingEntity lendEntity) {
        throw new MCNotInstalledException();
    }

    /**
     * @return to the owner of the cosmetic
     */
    public Player getPlayer() {
        throw new MCNotInstalledException();
    }

    /**
     * @return the entity to which the cosmetic has been loaned.
     */
    public LivingEntity getLendEntity() {
        throw new MCNotInstalledException();
    }

    /**
     * It will hide the cosmetic from the selected player.
     * @param player - target
     */
    public abstract void hide(Player player);

    /**
     * Will show the cosmetic to the selected player.
     * @param player - target
     */
    public abstract void show(Player player);

    /**
     * It will spawn the cosmetic to the selected player
     * @param player - target
     */
    public abstract void spawn(Player player);
}
