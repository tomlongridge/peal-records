package com.tomlongridge.pealrecords.web.converters;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.GenericConversionService;

/**
 * Registers extending classes with the ConversionService allowing nested
 * converters.
 *  
 * @author Tom
 *
 * @param <S> the source type
 * @param <T> the target type
 */
public abstract class AutoRegisteredConverter<S, T> implements Converter<S, T> {
    
    @Autowired
    private ConversionService conversionService;
 
    @PostConstruct
    private void register() {
        if (conversionService instanceof GenericConversionService) {
            ((GenericConversionService) conversionService).addConverter(this);
        }
    }
}