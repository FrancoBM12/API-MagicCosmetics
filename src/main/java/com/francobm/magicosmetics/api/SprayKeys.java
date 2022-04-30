package com.francobm.magicosmetics.api;

import com.francobm.magicosmetics.utils.MCNotInstalledException;

public enum SprayKeys {
    SHIFT_F,
    SHIFT_E,
    SHIFT_Q,
    SHIFT_LC,
    SHIFT_RC,
    SHIFT_JUMP,
    API;

    public boolean isKey(final SprayKeys key) {
        throw new MCNotInstalledException();
    }
}
