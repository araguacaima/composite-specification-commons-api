package com.commons.api.exception.exception;

import com.commons.api.exception.core.ApplicationException;


public class NotificationApplicationException extends ApplicationException{
    private static final long serialVersionUID = -5176954494788697406L;


    /**
     * Constructs a new throwable with the specified detail message.
     *
     * @param message
     */
    public NotificationApplicationException(String message) {
        super(message);
    }

    /**
     * Constructs a new throwable with the specified detail message.
     *
     * @param cause
     */
    public NotificationApplicationException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new throwable with the specified detail message.
     *
     * @param message
     */
    public NotificationApplicationException(String message, boolean printStackTrace) {
        super(message, printStackTrace);
    }

    /**
     * Constructs a new throwable with the specified detail message and cause.
     *
     * @param message
     * @param cause
     */
    public NotificationApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new throwable with the specified detail message and cause.
     *
     * @param message
     * @param cause
     */
    public NotificationApplicationException(String message, Throwable cause, boolean printStackTrace) {
        super(message, cause, printStackTrace);
    }
}
