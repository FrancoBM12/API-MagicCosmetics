package com.francobm.magicosmetics.utils;

public class MCNotInstalledException extends UnsupportedOperationException {
    public MCNotInstalledException() {
        super("Error: Magic Cosmetics is not installed, please install it to use this API.");
    }
}
