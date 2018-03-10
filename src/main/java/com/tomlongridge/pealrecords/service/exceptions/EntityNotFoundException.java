package com.tomlongridge.pealrecords.service.exceptions;

public class EntityNotFoundException extends Exception {

    private static final long serialVersionUID = -4906644983401847330L;
    
    public EntityNotFoundException(Class<?> clazz, String...args) {
        super(clazz.getSimpleName() + " not found");
    }

}
