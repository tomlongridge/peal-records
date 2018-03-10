package com.tomlongridge.pealrecords.web.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.tomlongridge.pealrecords.web.api.Country;
import com.tomlongridge.pealrecords.web.api.County;

@Component
public class CountyConverter extends AutoRegisteredConverter<com.tomlongridge.pealrecords.service.domain.County, County>
    implements Converter<com.tomlongridge.pealrecords.service.domain.County, County> {
    
    @Autowired
    private ConversionService converter;
    
    @Override
    public County convert(com.tomlongridge.pealrecords.service.domain.County source) {
        
        final County target = new County();
        
        target.setID(source.getId());
        target.setName(source.getName());
        target.setCountry(converter.convert(source.getCountry(), Country.class));
        
        return target;
        
    }

}
