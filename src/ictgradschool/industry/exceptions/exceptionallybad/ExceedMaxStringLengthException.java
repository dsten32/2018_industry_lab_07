package ictgradschool.industry.exceptions.exceptionallybad;

public class ExceedMaxStringLengthException extends Exception {
    public ExceedMaxStringLengthException() {
    }

    public ExceedMaxStringLengthException(String message) {
        super(message);
    }

    public ExceedMaxStringLengthException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceedMaxStringLengthException(Throwable cause) {
        super(cause);
    }

    public ExceedMaxStringLengthException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
