package org.example;

import java.util.List;

public class Routine {

    private final List<Operation> operations;

    public Routine(List<Operation> operations) {
        this.operations = operations;
    }

    public void triggerRoutine() {
        for (Operation operation : operations) {
            // this can also be achieved by breaking the loop
            // if canExecute() returns false instead of throwing an exception
            try{
                if (operation.canExecute()) {
                    operation.execute();
                }
            } catch (OperationException e) {
                System.out.println(e.getMessage());
                break;
            }

        }
    }
}
