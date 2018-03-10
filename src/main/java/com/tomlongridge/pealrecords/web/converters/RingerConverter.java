package com.tomlongridge.pealrecords.web.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.tomlongridge.pealrecords.web.api.Ringer;
import com.tomlongridge.pealrecords.web.api.Tower;

@Component
public class RingerConverter extends AutoRegisteredConverter<com.tomlongridge.pealrecords.service.domain.Ringer, Ringer>
    implements Converter<com.tomlongridge.pealrecords.service.domain.Ringer, Ringer> {

    @Autowired
    private ConversionService converter;
    
    @Override
    public Ringer convert(com.tomlongridge.pealrecords.service.domain.Ringer source) {
        
        final Ringer target = new Ringer();
        
        target.setID(source.getId());
        target.setForename(source.getForename());
        target.setMiddleInitials(source.getMiddleInitials());
        target.setSurname(source.getSurname());
        target.setHomeTower(converter.convert(source.getHomeTower(), Tower.class));
        
        return target;
        
    }

}
