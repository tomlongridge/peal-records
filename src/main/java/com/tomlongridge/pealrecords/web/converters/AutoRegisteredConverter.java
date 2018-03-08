package com.tomlongridge.pealrecords.web.converters;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.GenericConversionService;

public abstract class AutoRegisteredConverter<S, T> implements Converter<S, T> {
    
    private ConversionService conversionService;
 
    public ConversionService getConversionService() {
        return conversionService;
    }
 
    @Autowired
    public void setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
 
    @SuppressWarnings("unused") // the IoC container will call @PostConstruct methods
    @PostConstruct
    private void register() {
        if (conversionService instanceof GenericConversionService) {
            ((GenericConversionService) conversionService).addConverter(this);
        }
    }
}