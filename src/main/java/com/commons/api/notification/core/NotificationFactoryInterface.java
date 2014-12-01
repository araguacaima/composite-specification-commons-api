package com.commons.api.notification.core;

public interface NotificationFactoryInterface {

    public void notifyMessage(Object texto) throws Throwable;

    public void notifyEntity(Object entity) throws Throwable;

}
