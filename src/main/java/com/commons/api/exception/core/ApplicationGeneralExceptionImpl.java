package com.commons.api.exception.core;

import java.io.PrintStream;
import java.io.PrintWriter;


public class ApplicationGeneralExceptionImpl extends ApplicationGeneralException {
    private static final long serialVersionUID = -5229786083297322790L;


    public ApplicationGeneralExceptionImpl(String message, Throwable throwable) {
        super(message, throwable);
    }

    public ApplicationGeneralExceptionImpl(String message) {
        super(message);
    }

    public void printStackTrace() {

    }

    public void printStackTrace(PrintStream printStream) {

    }

    public void printStackTrace(PrintWriter printWriter) {

    }

    public StackTraceElement[] getStackTrace() {
        return new StackTraceElement[0];
    }

    public void setStackTrace(StackTraceElement[] stackTraceElements) {

    }

    public String getLocalizedMessage() {
        return null;
    }

    public String getMessage() {
        return null;
    }

    public String toString() {
        return null;
    }

    public Throwable fillInStackTrace() {
        return null;
    }

    public Throwable getCause() {
        return null;
    }

    public Throwable initCause(Throwable throwable) {
        return null;
    }


}
