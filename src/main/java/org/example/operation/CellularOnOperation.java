package org.example.operation;

import org.example.singleton.CellularSingleton;

public class CellularOnOperation extends HardwareOperation {

    public CellularOnOperation() {
        super("cellular");
    }

    @Override
    public boolean canExecute() {
        return true;
    }

    @Override
    public boolean execute() {
        var cellular = CellularSingleton.getInstance();
        if (cellular.isOn) {
            System.out.println("Cellular is already on");
            return true;
        }

        System.out.println("Turning Cellular on...");
        cellular.isOn = true;
        return true;

    }
}
