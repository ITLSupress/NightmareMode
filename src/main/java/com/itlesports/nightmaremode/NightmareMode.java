package com.itlesports.nightmaremode;

import btw.AddonHandler;
import btw.BTWAddon;

public class NightmareMode extends BTWAddon {
    private static NightmareMode instance;

    private NightmareMode() {
        super("Nightmare Mode", "0.1.0", "Nm");
    }

    @Override
    public void initialize() {
        AddonHandler.logMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");
    }

    public static NightmareMode getInstance() {
        if (instance == null)
            instance = new NightmareMode();
        return instance;
    }
}
