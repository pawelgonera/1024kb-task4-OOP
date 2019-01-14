package pl._1024kb.task06.exception;

import java.util.function.Supplier;

public class NotPositiveNumberException extends Exception {
    public NotPositiveNumberException() {
    }

    public NotPositiveNumberException(String message) {
        super(message);
    }

}
