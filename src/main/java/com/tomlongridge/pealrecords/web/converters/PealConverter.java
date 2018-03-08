package com.tomlongridge.pealrecords.web.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.tomlongridge.pealrecords.web.api.Peal;
import com.tomlongridge.pealrecords.web.api.PealMethod;
import com.tomlongridge.pealrecords.web.api.Tower;

@Component
public class PealConverter extends AutoRegisteredConverter<com.tomlongridge.pealrecords.service.domain.Peal, Peal>
    implements Converter<com.tomlongridge.pealrecords.service.domain.Peal, Peal> {
    
    @Autowired
    private ConversionService converter;
    
    @Override
    public Peal convert(com.tomlongridge.pealrecords.service.domain.Peal source) {
        
        final Peal target = new Peal();
        
        target.setId(source.getId());
        target.setDateRung(source.getDateRung());
        target.setChanges(source.getChanges());
        target.setTower(converter.convert(source.getTower(), Tower.class));
        source.getMethods().forEach(m -> target.getMethods().add(converter.convert(m, PealMethod.class)));
        
        return target;
        
    }

}
