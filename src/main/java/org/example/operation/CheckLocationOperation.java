package org.example.operation;

import org.example.Permissions;
import org.example.error.OperationException;

import java.util.Scanner;

import static java.lang.String.format;

public class CheckLocationOperation extends SoftwareOperation implements Permissions {

    public CheckLocationOperation() {
        super("Google Maps");
    }

    @Override
    public boolean canExecute() {
        if (askForPermissions()) {
            System.out.printf("User has granted permissions to %s%n", getAppId());
            return true;
        }
        throw new OperationException(format("User has denied permissions to %s%n", getAppId()));
    }

    @Override
    public boolean execute() {
        if (isInPerimeter()) {
            System.out.println("User is in the defined perimeter");
            return true;
        }
        return false;
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
        System.out.printf("Do you grant permissions to %s to access Location? (y/n)\n", getAppId());
        String input = in.nextLine();
        return input.equalsIgnoreCase("y");
    }
}
