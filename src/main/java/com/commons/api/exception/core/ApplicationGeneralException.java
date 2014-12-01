package com.commons.api.exception.core;

import com.commons.util.throwable.EnvironmentThrowableInfo;

import java.util.Calendar;
import java.util.Date;


public abstract class ApplicationGeneralException extends Throwable {

    private static final long serialVersionUID = -4176197311797600886L;

    public static final String PRINT_STACK_TRACE = "PRINT_STACK_TRACE";

    protected EnvironmentThrowableInfo environmentThrowableInfo;

    protected Date occurenceDateAndTime;

    protected ApplicationGeneralException() {
        super();
        occurenceDateAndTime = Calendar.getInstance().getTime();
    }

    protected ApplicationGeneralException(Throwable throwable) {
        super(throwable);
        occurenceDateAndTime = Calendar.getInstance().getTime();
    }

    protected ApplicationGeneralException(String message) {
        super(message);
        environmentThrowableInfo = new EnvironmentThrowableInfo(this);
    }

    protected ApplicationGeneralException(String message, Throwable throwable) {
        super(message, throwable);
        environmentThrowableInfo = new EnvironmentThrowableInfo(this);
    }

    public EnvironmentThrowableInfo getEnvironmentThrowableInfo() {
        return environmentThrowableInfo;
    }

    public Date getOccurenceDateAndTime() {
        return occurenceDateAndTime;
    }
}
