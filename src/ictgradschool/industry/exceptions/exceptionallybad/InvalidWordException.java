package ictgradschool.industry.exceptions.exceptionallybad;

public class InvalidWordException extends Exception {
    public InvalidWordException() {
    }

    public InvalidWordException(String message) {
        super(message);
    }

    public InvalidWordException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidWordException(Throwable cause) {
        super(cause);
    }

    public InvalidWordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
