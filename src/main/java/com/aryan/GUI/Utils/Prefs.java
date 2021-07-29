package com.aryan.GUI.Utils;

import java.util.prefs.Preferences;

public class Prefs {
    Preferences prefs = Preferences.userNodeForPackage(com.aryan.GUI.Screens.LoginScreen.class);

    final String key = "key";

    public void setPref(String value){
        prefs.put(key, value);
    }

    public String getPref(){
        return prefs.get(key, "Random");
    }
}
