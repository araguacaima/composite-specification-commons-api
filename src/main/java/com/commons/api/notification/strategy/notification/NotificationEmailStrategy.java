package com.commons.api.notification.strategy.notification;


import com.commons.api.util.format.string.ToString;


public class NotificationEmailStrategy  extends AbstractNotificationStrategy  {


    public NotificationEmailStrategy(boolean evaluateAllTerms)
            throws Exception {
        super(evaluateAllTerms);

    }

    public NotificationEmailStrategy()
            throws Exception {
        this(false);
    }




    @Override
    public void notifyMessage(Object texto)throws Throwable {
        //TODO send email with a specific message
        System.out.println("NotificationEmailStrategy | Notification message: " + texto);
    }

    @Override
    public void notifyEntity(Object entity)throws Throwable {
        //TODO use the entity to build and send an email
        System.out.println("NotificationEmailStrategy | Notification entity: " + ToString.doStandartFormat(entity));
    }
}
