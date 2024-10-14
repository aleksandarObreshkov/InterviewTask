package org.example.error;

public class OperationException extends RuntimeException {
    public OperationException(String message) {
        super(message);
    }
}
