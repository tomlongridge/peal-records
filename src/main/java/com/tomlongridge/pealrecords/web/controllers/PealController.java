package com.tomlongridge.pealrecords.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomlongridge.pealrecords.service.dao.PealRepository;
import com.tomlongridge.pealrecords.web.api.Peal;

@RestController
public class PealController {
    
    @Autowired
    private PealRepository pealRepo;
    
    @Autowired
    private ConversionService converter;

    @RequestMapping("/peals/{id}")
    @Transactional
    public Peal getPeal(@PathVariable final Long id) {
        
        return converter.convert(pealRepo.findById(id).get(), Peal.class);
    }
    
}
