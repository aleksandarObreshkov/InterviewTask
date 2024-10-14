package org.example.singleton;

public class CellularSingleton {
    public boolean isOn;
    private static CellularSingleton instance;
    private CellularSingleton() {
        this.isOn = true;
    }

    public static CellularSingleton getInstance() {
        if (instance == null) {
            instance = new CellularSingleton();
        }
        return instance;
    }
}
