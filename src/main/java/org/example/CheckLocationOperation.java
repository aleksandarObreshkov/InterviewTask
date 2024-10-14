package org.example;

import java.util.Random;

public class CheckLocationOperation extends SoftwareOperation implements Permissions {

    private final Random random = new Random();

    @Override
    public boolean canExecute() {
        if (askForPermissions()) {
            System.out.println("User has granted permissions");
            return true;
        }
        throw new OperationException("User has denied permissions");
    }

    @Override
    public void execute() {
        if (isInPerimeter()) {
            System.out.println("User is in the defined perimeter");
            return;
        }
        throw new OperationException("User is not in the defined perimeter");
    }

    private boolean isInPerimeter() {
        return true;
        //return this.random.nextBoolean();
    }

    @Override
    public boolean askForPermissions() {
        return true;
        //return this.random.nextBoolean();
    }
}
