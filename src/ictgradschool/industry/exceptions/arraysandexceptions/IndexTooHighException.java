package ictgradschool.industry.exceptions.arraysandexceptions;

public class IndexTooHighException extends Exception {
    public IndexTooHighException() {
    }

    public IndexTooHighException(String message) {
        super(message);
    }

    public IndexTooHighException(String message, Throwable cause) {
        super(message, cause);
    }

    public IndexTooHighException(Throwable cause) {
        super(cause);
    }

    public IndexTooHighException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
