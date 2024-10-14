package org.example;

import org.example.operation.Operation;

public class Routine {

    private final Operation currentOperation;
    private final Routine left;
    private final Routine right;

    public Routine(Operation currentOperation, Routine left, Routine right) {
        this.currentOperation = currentOperation;
        this.left = left;
        this.right = right;
    }

    public void triggerRoutine() {
        if (currentOperation.canExecute()) {
            boolean result = currentOperation.execute();
            if (result) {
                if (right != null) {
                    right.triggerRoutine();
                }
                return;
            }
            if (left != null) {
                left.triggerRoutine();
            }
        }
    }
}
