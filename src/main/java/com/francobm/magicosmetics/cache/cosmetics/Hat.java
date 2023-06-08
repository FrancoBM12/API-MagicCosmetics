package com.francobm.magicosmetics.cache.cosmetics;

import com.francobm.magicosmetics.api.Cosmetic;
import com.francobm.magicosmetics.utils.MCNotInstalledException;

public class Hat extends Cosmetic {

    public boolean isOverlaps() {
        throw new MCNotInstalledException();
    }

    public double getOffSetY() {
        throw new MCNotInstalledException();
    }

    public void setHideCompletely() {
        throw new MCNotInstalledException();
    }
}
