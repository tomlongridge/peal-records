package com.tomlongridge.pealrecords.web.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.tomlongridge.pealrecords.web.api.Country;

@Component
public class CountryConverter extends AutoRegisteredConverter<com.tomlongridge.pealrecords.service.domain.Country, Country>
    implements Converter<com.tomlongridge.pealrecords.service.domain.Country, Country> {
    
    @Override
    public Country convert(com.tomlongridge.pealrecords.service.domain.Country source) {
        
        final Country target = new Country();
        
        target.setID(source.getId());
        target.setName(source.getName());
        
        return target;
        
    }

}
