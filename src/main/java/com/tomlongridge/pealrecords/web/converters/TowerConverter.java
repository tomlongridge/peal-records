package com.tomlongridge.pealrecords.web.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.tomlongridge.pealrecords.web.api.County;
import com.tomlongridge.pealrecords.web.api.Tower;

@Component
public class TowerConverter extends AutoRegisteredConverter<com.tomlongridge.pealrecords.service.domain.Tower, Tower>
implements Converter<com.tomlongridge.pealrecords.service.domain.Tower, Tower> {
    
    @Autowired
    private ConversionService converter;
    
    @Override
    public Tower convert(com.tomlongridge.pealrecords.service.domain.Tower source) {
        
        final Tower target = new Tower();
        
        target.setID(source.getId());
        target.setDedication(source.getDedication());
        target.setArea(source.getArea());
        target.setTown(source.getTown());
        target.setCounty(converter.convert(source.getCounty(), County.class));
        
        return target;
        
    }

}
