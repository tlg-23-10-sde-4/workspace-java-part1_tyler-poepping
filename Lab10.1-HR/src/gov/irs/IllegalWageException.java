package gov.irs;

public class IllegalWageException extends Exception {
    public IllegalWageException() {
    }

    public IllegalWageException(String message) {
        super(message);
        // DO SOMETHING CUSTOM THAT I WANT AS THE DEVELOPER
    }

    public IllegalWageException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalWageException(Throwable cause) {
        super(cause);
    }
}
