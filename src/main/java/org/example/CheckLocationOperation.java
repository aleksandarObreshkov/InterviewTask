package org.example;

import java.util.Random;
import java.util.Scanner;

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
        Scanner in = new Scanner(System.in);
        System.out.println("Is user in the defined perimeter? (y/n)");
        String input = in.nextLine();
        return input.equalsIgnoreCase("y");
    }

    @Override
    public boolean askForPermissions() {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you grant permissions to the Routine to access Location? (y/n)");
        String input = in.nextLine();
        return input.equalsIgnoreCase("y");
    }
}
