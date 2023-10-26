package com.entertainment;

// CHECKED Exception, Because it extends Exception
public class InvalidBrandException extends Exception{
    public InvalidBrandException() {
    }

    public InvalidBrandException(String message) {
        super(message);
    }

    public InvalidBrandException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidBrandException(Throwable cause) {
        super(cause);
    }
}
