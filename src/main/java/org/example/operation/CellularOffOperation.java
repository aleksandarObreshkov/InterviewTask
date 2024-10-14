package org.example.operation;

import org.example.singleton.CellularSingleton;

public class CellularOffOperation extends HardwareOperation {

    public CellularOffOperation() {
        super("cellular");
    }

    @Override
    public boolean canExecute() {
        return true;
    }

    @Override
    public boolean execute() {
        var cellular = CellularSingleton.getInstance();
        if (!cellular.isOn) {
            System.out.println("Cellular is already off");
            return true;
        }

        System.out.println("Turning Cellular off...");
        cellular.isOn = false;
        return true;

    }
}
