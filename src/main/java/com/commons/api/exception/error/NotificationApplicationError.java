package com.commons.api.exception.error;

import com.commons.api.exception.core.ApplicationError;


public class NotificationApplicationError extends ApplicationError {
    private static final long serialVersionUID = -7603502484625426683L;

    public NotificationApplicationError(String message, boolean printStackTrace) {
        super(message, printStackTrace);
    }

    public NotificationApplicationError(String message, Throwable throwable, boolean printStackTrace) {
        super(message, throwable, printStackTrace);
    }

    /**
     * Constructs a new throwable with the specified detail message.
     *
     * @param cause
     */
    public NotificationApplicationError(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new throwable with the specified detail message.
     *
     * @param message
     */

    public NotificationApplicationError(String message) {
        super(message);
    }

    /**
     * Constructs a new throwable with the specified detail message and cause.
     *
     * @param message
     * @param cause
     */
    public NotificationApplicationError(String message, Throwable cause) {
        super(message, cause);
    }


}
