package org.example.operation;

public abstract class SoftwareOperation extends Operation {
    private final String appId;

    protected SoftwareOperation(String appId) {
        this.appId = appId;
    }

    public String getAppId() {
        return appId;
    }
}
