package org.example;

import java.util.UUID;

public abstract class Operation {

    private final UUID id = UUID.randomUUID();

    public UUID getId() {
        return this.id;
    }

    public abstract boolean canExecute();
    public abstract void execute();
}
