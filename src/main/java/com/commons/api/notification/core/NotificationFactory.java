package com.commons.api.notification.core;

import com.commons.api.exception.exception.NotificationApplicationException;
import com.commons.api.util.CompositeSpecificationConstants;
import org.commons.specification.Specification;

import java.util.HashMap;
import java.util.Map;


public class NotificationFactory extends AbstractNotificationFactory {

    private static final Map map = new HashMap();


    public NotificationFactory(Long applicationID) {
        super(applicationID);
    }

    public NotificationFactory(Long applicationID, Map map) {
        super(applicationID);
        init(map);
    }

    public void notifyMessage(Object message) {
        Specification notificationSpecification = notificationSpecificationMap.getSpecificationFromMethod("notifyMessage");
        try {
            map.put(CompositeSpecificationConstants.APPLICATION_ID_KEY, applicationID);
            map.put(CompositeSpecificationConstants.METHOD, "notifyMessage");
            notificationSpecification.isSatisfiedBy(message, map);
        } catch (NullPointerException e) {
            String exceptionNessage =
                    "No se ha configurado una especificación para el método notifyMessage y la clase " + this
                            .getClass();
            new NotificationApplicationException(exceptionNessage);
        } catch (Exception e) {
            new NotificationApplicationException(e);

        }
    }

    @Override
    public void notifyEntity(Object entity) {
        Specification notificationSpecification = notificationSpecificationMap.getSpecificationFromMethod("notifyEntity");
        try {
            map.put(CompositeSpecificationConstants.APPLICATION_ID_KEY, applicationID);
            map.put(CompositeSpecificationConstants.METHOD, "notifyEntity");
            notificationSpecification.isSatisfiedBy(entity, map);
        } catch (NullPointerException e) {
            String exceptionNessage =
                    "No se ha configurado una especificación válida para el método notifyEntity y la clase " + this
                            .getClass();
            new NotificationApplicationException(exceptionNessage);
        } catch (Exception e) {
            new NotificationApplicationException(e);

        }
    }


}
