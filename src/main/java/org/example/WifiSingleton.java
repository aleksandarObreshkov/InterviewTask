package org.example;

public class WifiSingleton {
    public boolean isOn;
    private static WifiSingleton instance;
    private WifiSingleton() {
        this.isOn = false;
    }

    public static WifiSingleton getInstance() {
        if (instance == null) {
            instance = new WifiSingleton();
        }
        return instance;
    }
}
