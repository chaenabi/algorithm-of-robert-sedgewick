package ch1.section3.orca;

public class NoElementException extends RuntimeException {
    public NoElementException() {
    }

    public NoElementException(String message) {
        super(message);
    }
}
