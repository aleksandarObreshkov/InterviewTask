package org.example.operation;

public abstract class HardwareOperation extends Operation {

    private final String componentId;

    protected HardwareOperation(String componentId) {
        this.componentId = componentId;
    }

    public String getComponentId() {
        return componentId;
    }
}
