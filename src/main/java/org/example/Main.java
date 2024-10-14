package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CheckLocationOperation location = new CheckLocationOperation();
        ToggleWifi toggleWifi = new ToggleWifi();
        ToggleCellular toggleCellular = new ToggleCellular();

        Routine toggleWifiOnLocation = new Routine(List.of(location, toggleWifi, toggleCellular));

        toggleWifiOnLocation.triggerRoutine();

    }
}