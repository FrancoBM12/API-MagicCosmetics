package com.francobm.magicosmetics.api;

import com.francobm.magicosmetics.utils.MCNotInstalledException;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class MagicAPI {
    public static boolean hasCosmetic(Player player, String cosmeticId){
        throw new MCNotInstalledException();
    }

    public static boolean hasEquipCosmetic(Entity entity, String cosmeticId){
        throw new MCNotInstalledException();
    }

    public static boolean hasEquipCosmetic(Player player, CosmeticType cosmeticType){
        throw new MCNotInstalledException();
    }

    public static void EquipCosmetic(Player player, String cosmeticId, String color){
        throw new MCNotInstalledException();
    }

    public static void EquipCosmetic(Entity entity, String cosmeticId, String colorHex){
        throw new MCNotInstalledException();
    }

    public static void UnEquipCosmetic(Player player, CosmeticType cosmeticType){
        throw new MCNotInstalledException();
    }

    public static void UnEquipCosmetic(Entity entity, CosmeticType cosmeticType){
        throw new MCNotInstalledException();
    }

    public static ItemStack getCosmeticItem(String id){
        throw new MCNotInstalledException();
    }

    public static ItemStack getEquipped(String name, String type){
        throw new MCNotInstalledException();
    }

    public static int getPlayerCosmeticsAvailable(Player player, CosmeticType cosmeticType){
        throw new MCNotInstalledException();
    }

    public static int getPlayerAllCosmeticsAvailable(Player player){
        throw new MCNotInstalledException();
    }

    public static int getServerCosmeticsAvailable(CosmeticType cosmeticType){
        throw new MCNotInstalledException();
    }

    public static int getServerAllCosmeticsAvailable(){
        throw new MCNotInstalledException();
    }
}
