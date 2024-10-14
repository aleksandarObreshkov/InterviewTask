package org.example;

import java.util.Scanner;

public class ToggleWifi extends HardwareOperation implements Permissions {

    public ToggleWifi() {
        super("wifi");
    }

    @Override
    public boolean canExecute() {
        return true;
    }

    @Override
    public void execute() {
        var wifi = WifiSingleton.getInstance();
        if (wifi.isOn) {
            System.out.println("Turning Wifi OFF...");
            wifi.isOn = false;
            return;
        }
        System.out.println("Turning Wifi ON...");
        wifi.isOn = true;
    }

    @Override
    public boolean askForPermissions() {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you grant permissions to the Routine to access WiFi? (y/n)");
        String input = in.nextLine();
        return input.equalsIgnoreCase("y");
    }
}
