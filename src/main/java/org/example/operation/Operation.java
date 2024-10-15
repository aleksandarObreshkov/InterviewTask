package org.example.operation;

import java.util.UUID;

public abstract class Operation {

    private final UUID id = UUID.randomUUID();

    public abstract boolean canExecute();
    public abstract boolean execute();
}
