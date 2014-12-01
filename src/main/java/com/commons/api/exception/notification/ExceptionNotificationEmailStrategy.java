package com.commons.api.exception.notification;

import com.commons.api.exception.core.ApplicationGeneralException;
import com.commons.util.throwable.EnvironmentThrowableInfo;
import org.commons.specification.AbstractSpecification;

import java.util.Map;


public class ExceptionNotificationEmailStrategy extends AbstractSpecification {

    private static String remitente;
    private static String destinatario;
    private static String servidor_smtp;
    private static String port;
    private static String user;
    private static String password;

    public ExceptionNotificationEmailStrategy(boolean evaluateAllTerms)
            throws Exception {
        super(evaluateAllTerms);
    }

    public ExceptionNotificationEmailStrategy()
            throws Exception {
        this(false);
    }


    public boolean isSatisfiedBy(Object o, Map map)
            throws Exception {

        //TODO get email engine parameters from map

        ApplicationGeneralException exception = (ApplicationGeneralException) o;
        EnvironmentThrowableInfo environment = exception.getEnvironmentThrowableInfo();
        StringBuffer sb = new StringBuffer();
        sb.append("ExceptionNotificationConsoleStrategy | Exception message: Has occured an Exception of type '")
                .append(exception.getClass())
                .append("' from file: ")
                .append(environment.getFileName())
                .append(" within the class: ")
                .append(environment.getClassName())
                .append(" attempting to " + "execute" + " the method: ")
                .append(environment.getMethodName())
                .append(" on line number: ")
                .append(environment.getLineNumber())
                .append(". The related " + "message" + " of the original Exception is: ")
                .append(exception.getMessage());
        boolean printStackTrace = false;
        try {
            printStackTrace = ((Boolean) map.get(ApplicationGeneralException.PRINT_STACK_TRACE)).booleanValue();
        } catch (Throwable ignored) {
        }
        if (printStackTrace) {
            sb.append(". The full stackTrace is: ")
                    .append("\n")
                    .append(environment.getStackTrace().toString().replaceAll(",", "\n"));
        }

        //TODO send "sb.toString() to email"

        return true;
    }
}
