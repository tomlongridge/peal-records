package com.tomlongridge.pealrecords.web.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.tomlongridge.pealrecords.web.api.PealRinger;
import com.tomlongridge.pealrecords.web.api.Ringer;

@Component
public class PealRingerConverter extends AutoRegisteredConverter<com.tomlongridge.pealrecords.service.domain.PealRinger, PealRinger>
    implements Converter<com.tomlongridge.pealrecords.service.domain.PealRinger, PealRinger> {
    
    @Autowired
    private ConversionService converter;
    
    @Override
    public PealRinger convert(com.tomlongridge.pealrecords.service.domain.PealRinger source) {
        
        final PealRinger target = new PealRinger();
        
        target.setBell(source.getBell());
        target.setRinger(converter.convert(source.getRinger(), Ringer.class));
        
        return target;
        
    }

}
