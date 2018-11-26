package ictgradschool.industry.exceptions.arraysandexceptions;

public class IndexTooLowException extends Exception{
    public IndexTooLowException() {
    }

    public IndexTooLowException(String message) {
        super(message);
    }

    public IndexTooLowException(String message, Throwable cause) {
        super(message, cause);
    }

    public IndexTooLowException(Throwable cause) {
        super(cause);
    }

    public IndexTooLowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
