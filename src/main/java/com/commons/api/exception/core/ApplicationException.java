package com.commons.api.exception.core;

import org.commons.specification.Specification;
import org.commons.util.SpecificationMap;
import org.commons.util.SpecificationMapUtil;

import java.util.HashMap;
import java.util.Map;


public abstract class ApplicationException extends ApplicationGeneralException {

    private static final long serialVersionUID = 7130057512143958940L;

    private static Specification applicationExceptionSpecification;

    public static void init(Map properties) {
        SpecificationMap specificationMap = SpecificationMapUtil.getInstance(properties,
                ApplicationException.class);
        applicationExceptionSpecification = specificationMap.getSpecificationFromMethod("ApplicationException");
    }


    public ApplicationException(Map map) {
        init(map);
    }

    /**
     * Constructs a new throwable with the specified detail message.
     *
     * @param message
     */
    public ApplicationException(String message) {
        this(message, true);
    }

    /**
     * Constructs a new throwable with the specified detail message.
     *
     * @param message
     */
    public ApplicationException(String message, boolean printStackTrace) {
        super(message);
        Map map = new HashMap();
        map.put(PRINT_STACK_TRACE, (printStackTrace) ? Boolean.TRUE : Boolean.FALSE);
        try {
            applicationExceptionSpecification.isSatisfiedBy(this, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Constructs a new throwable with the specified detail message and cause.
     *
     * @param message
     * @param cause
     */
    public ApplicationException(String message, Throwable cause) {
        this(message, cause, true);
    }

    /**
     * Constructs a new throwable with the specified detail message and cause.
     *
     * @param message
     * @param cause
     */
    public ApplicationException(String message, Throwable cause, boolean printStackTrace) {
        super(message, cause);
        Map map = new HashMap();
        map.put(PRINT_STACK_TRACE, (printStackTrace) ? Boolean.TRUE : Boolean.FALSE);
        try {
            applicationExceptionSpecification.isSatisfiedBy(this, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Constructs a new throwable with the specified detail message.
     *
     * @param cause
     */
    public ApplicationException(Throwable cause) {
        this(cause, true);
    }

    /**
     * Constructs a new throwable with the specified detail message.
     *
     * @param cause
     */
    public ApplicationException(Throwable cause, boolean printStackTrace) {
        super(cause);
        Map map = new HashMap();
        map.put(PRINT_STACK_TRACE, (printStackTrace) ? Boolean.TRUE : Boolean.FALSE);
        try {
            applicationExceptionSpecification.isSatisfiedBy(this, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
