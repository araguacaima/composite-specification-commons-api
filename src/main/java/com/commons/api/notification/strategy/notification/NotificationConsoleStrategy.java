package com.commons.api.notification.strategy.notification;

import com.commons.api.util.format.string.ToString;

public class NotificationConsoleStrategy extends AbstractNotificationStrategy {

    public NotificationConsoleStrategy(boolean evaluateAllTerms)
            throws Exception {
        super(evaluateAllTerms);
    }

    public NotificationConsoleStrategy()
            throws Exception {
        this(false);
    }

    @Override
    public void notifyMessage(Object texto) throws Throwable {
        System.out.println("NotificationConsoleStrategy | Notification message: " + texto);
    }

    @Override
    public void notifyEntity(Object entity) throws Throwable {
        System.out.println("NotificationConsoleStrategy | Notification entity: " + ToString.doStandartFormat(entity));
    }
}