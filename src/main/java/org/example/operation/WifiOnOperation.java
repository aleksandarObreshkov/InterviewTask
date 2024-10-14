package org.example.operation;

import org.example.Permissions;
import org.example.singleton.WifiSingleton;

import java.util.Scanner;

public class WifiOnOperation extends HardwareOperation implements Permissions {

    public WifiOnOperation() {
        super("wifi");
    }

    @Override
    public boolean askForPermissions() {
        Scanner in = new Scanner(System.in);
        System.out.printf("Do you grant permissions to the Routine to access %s? (y/n)%n", this.getComponentId());
        String input = in.nextLine();
        return input.equalsIgnoreCase("y");
    }

    @Override
    public boolean canExecute() {
        return askForPermissions();
    }

    @Override
    public boolean execute() {
        var wifi = WifiSingleton.getInstance();
        if (wifi.isOn) {
            System.out.println("WiFi is already on");
            return true;
        }

        System.out.println("Turning WiFi on...");
        wifi.isOn = true;
        return true;

    }
}
