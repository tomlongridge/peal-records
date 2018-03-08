package com.tomlongridge.pealrecords.web.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.tomlongridge.pealrecords.web.api.Method;
import com.tomlongridge.pealrecords.web.api.PealMethod;

@Component
public class PealMethodConverter extends AutoRegisteredConverter<com.tomlongridge.pealrecords.service.domain.PealMethod, PealMethod>
    implements Converter<com.tomlongridge.pealrecords.service.domain.PealMethod, PealMethod> {
    
    @Autowired
    private ConversionService converter;
    
    @Override
    public PealMethod convert(com.tomlongridge.pealrecords.service.domain.PealMethod source) {
        
        final PealMethod target = new PealMethod();
        
        target.setChanges(source.getChanges());
        target.setMethod(converter.convert(source.getMethod(), Method.class));
        
        return target;
        
    }

}
