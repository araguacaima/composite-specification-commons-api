package com.commons.api.notification.strategy.notification;

import com.commons.api.notification.core.NotificationFactoryInterface;
import com.commons.api.util.CompositeSpecificationConstants;
import com.commons.api.util.format.string.ToString;
import org.commons.specification.AbstractSpecification;

import java.util.Map;
import java.util.Properties;


public abstract class AbstractNotificationStrategy extends AbstractSpecification implements NotificationFactoryInterface {

    protected Properties properties;

    public AbstractNotificationStrategy(boolean evaluateAllTerms)
            throws Exception {
        super(evaluateAllTerms);
    }

    public AbstractNotificationStrategy()
            throws Exception {
        this(false);
    }

    public boolean isSatisfiedBy(Object o, Map map)
            throws Exception {
        boolean result;
        properties = (Properties) map.get(CompositeSpecificationConstants.PAYLOAD);
        String method = (String) map.get(CompositeSpecificationConstants.METHOD);
        try {
            if (method.equals("notifyMessage")) {
                notifyMessage(o);
                result = true;

            } else if (method.equals("notifyEntity")) {
                notifyEntity(o);
                result = true;

            } else {
                result = false;
            }
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            result = true;
        }
        return result;
    }


    @Override
    public abstract void notifyMessage(Object texto) throws Throwable;

    @Override
    public abstract void notifyEntity(Object entity) throws Throwable;
}