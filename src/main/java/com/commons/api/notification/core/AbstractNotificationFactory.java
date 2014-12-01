package com.commons.api.notification.core;

import org.commons.util.SpecificationMap;
import org.commons.util.SpecificationMapUtil;

import java.util.Map;

public abstract class AbstractNotificationFactory implements NotificationFactoryInterface {

    private static AbstractNotificationFactory instance;
    private static AbstractNotificationFactory instanceNotification;
    public static final String NOTIFICATION = "NOTIFICATION";
    protected Long applicationID;

    protected static SpecificationMap notificationSpecificationMap;

    protected static void init(Map map) {
        notificationSpecificationMap =
                SpecificationMapUtil.getInstance(map, NotificationFactory.class, true);
    }

    protected AbstractNotificationFactory(Long applicationID) {
        this.applicationID = applicationID;
    }

    protected AbstractNotificationFactory() {
    }

    public static AbstractNotificationFactory getInstance(Long applicationID) {
        return getInstance(NOTIFICATION, applicationID);
    }

    public static AbstractNotificationFactory getInstance(String notificationType, Long applicationID) {
        if (NOTIFICATION.equals(notificationType)) {
            if (instanceNotification == null) {
                instanceNotification = new NotificationFactory(applicationID);
            }
            instance = instanceNotification;
        }

        return instance;
    }

    public static AbstractNotificationFactory getInstance(String notificationType, Long applicationID, boolean forceRenew) {
        if (instanceNotification == null || forceRenew) {
            instanceNotification = getInstance(notificationType, applicationID);
        }
        return instanceNotification;
    }

    public abstract void notifyMessage(Object texto);


    public abstract void notifyEntity(Object entity);

}
