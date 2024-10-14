package org.example;

import org.example.operation.CellularOffOperation;
import org.example.operation.CellularOnOperation;
import org.example.operation.CheckLocationOperation;
import org.example.operation.WifiOffOperation;
import org.example.operation.WifiOnOperation;
import org.example.singleton.CellularSingleton;
import org.example.singleton.WifiSingleton;

public class Main {
    public static void main(String[] args) {

        System.out.println("Wifi is: "+WifiSingleton.getInstance().isOn);
        System.out.println("Cellular is: "+ CellularSingleton.getInstance().isOn);

        CheckLocationOperation location = new CheckLocationOperation();
        WifiOnOperation wifiOn = new WifiOnOperation();
        WifiOffOperation wifiOff = new WifiOffOperation();
        CellularOnOperation cellOn = new CellularOnOperation();
        CellularOffOperation cellOff = new CellularOffOperation();

        Routine atLocationRoutine = new Routine(wifiOn, null, new Routine(cellOff, null, null));
        Routine outsideLocationRoutine = new Routine(wifiOff, new Routine(cellOn, null, null), null);

        Routine main = new Routine(location, outsideLocationRoutine, atLocationRoutine);
        main.triggerRoutine();

        System.out.println("Wifi is: "+WifiSingleton.getInstance().isOn);
        System.out.println("Cellular is: "+CellularSingleton.getInstance().isOn);

        main.triggerRoutine();

        System.out.println("Wifi is: "+WifiSingleton.getInstance().isOn);
        System.out.println("Cellular is: "+CellularSingleton.getInstance().isOn);

    }
}