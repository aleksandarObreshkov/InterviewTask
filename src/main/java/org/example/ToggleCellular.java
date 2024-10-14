package org.example;

public class ToggleCellular extends HardwareOperation {

    public ToggleCellular() {
        super("cellular");
    }

    @Override
    public boolean canExecute() {
        return true;
    }

    @Override
    public void execute() {
        var cellular = CellularSingleton.getInstance();
        if (cellular.isOn) {
            System.out.println("Turning Cellular OFF...");
            cellular.isOn = false;
            return;
        }
        System.out.println("Turning Cellular ON...");
        cellular.isOn = true;
    }
}
