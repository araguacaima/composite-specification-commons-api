package com.commons.api.notification.strategy.notification;

import com.commons.api.util.format.string.ToString;



public class NotificationDBStrategy  extends AbstractNotificationStrategy {

    public NotificationDBStrategy(boolean evaluateAllTerms)
            throws Exception {
        super(evaluateAllTerms);
    }

    public NotificationDBStrategy()
            throws Exception {
        this(false);
    }


    @Override
    public void notifyMessage(Object texto)throws Throwable {
        //TODO persist to db a specific message
        System.out.println("NotificationDBStrategy | Notification message: " + texto);
    }

    @Override
    public void notifyEntity(Object entity)throws Throwable {
        //TODO persist to db the object
        System.out.println("NotificationDBStrategy | Notification entity: " + ToString.doStandartFormat(entity));
    }
}
