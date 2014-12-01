package com.commons.api.exception.core;

import org.commons.specification.Specification;
import org.commons.util.SpecificationMap;
import org.commons.util.SpecificationMapUtil;

import java.util.HashMap;
import java.util.Map;


public abstract class ApplicationError extends ApplicationGeneralException {

    private static final long serialVersionUID = -1587941335706964097L;
    private static Specification applicationErrorSpecification;

    public static void init(Map properties){
        SpecificationMap specificationMap =
                SpecificationMapUtil.getInstance(properties, ApplicationError.class);
        applicationErrorSpecification = specificationMap.getSpecificationFromMethod("ApplicationError");
    }

    public ApplicationError(Map map) {
        init(map);
    }

    public ApplicationError(String message) {
        this(message, true);
    }

    public ApplicationError(String message, boolean printStackTrace) {
        super(message);
        Map map = new HashMap();
        map.put(PRINT_STACK_TRACE, (printStackTrace) ? Boolean.TRUE : Boolean.FALSE);
        try {
            applicationErrorSpecification.isSatisfiedBy(this, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ApplicationError(String message, Throwable throwable) {
        this(message, throwable, true);
    }

    public ApplicationError(String message, Throwable throwable, boolean printStackTrace) {
        super(message, throwable);
        Map map = new HashMap();
        map.put(PRINT_STACK_TRACE, (printStackTrace) ? Boolean.TRUE : Boolean.FALSE);
        try {
            applicationErrorSpecification.isSatisfiedBy(this, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Constructs a new throwable with the specified detail message.
     *
     * @param cause
     */
    public ApplicationError(Throwable cause) {
        this(cause, true);
    }

    /**
     * Constructs a new throwable with the specified detail message.
     *
     * @param cause
     */
    public ApplicationError(Throwable cause, boolean printStackTrace) {
        super(cause);
        Map map = new HashMap();
        map.put(PRINT_STACK_TRACE, (printStackTrace) ? Boolean.TRUE : Boolean.FALSE);
        try {
            applicationErrorSpecification.isSatisfiedBy(this, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
