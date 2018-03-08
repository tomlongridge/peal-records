package com.tomlongridge.pealrecords.web.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.tomlongridge.pealrecords.web.api.Method;

@Component
public class MethodConverter extends AutoRegisteredConverter<com.tomlongridge.pealrecords.service.domain.Method, Method>
    implements Converter<com.tomlongridge.pealrecords.service.domain.Method, Method> {
    
    @Override
    public Method convert(com.tomlongridge.pealrecords.service.domain.Method source) {
        
        final Method target = new Method();
        
        target.setId(source.getId());
        target.setName(source.getName());
        
        return target;
        
    }

}
