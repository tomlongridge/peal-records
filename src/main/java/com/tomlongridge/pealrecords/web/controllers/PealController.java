package com.tomlongridge.pealrecords.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomlongridge.pealrecords.service.PealService;
import com.tomlongridge.pealrecords.service.exceptions.EntityNotFoundException;
import com.tomlongridge.pealrecords.web.api.Peal;

@RestController
@RequestMapping("/peals")
public class PealController {
    
    @Autowired
    private PealService pealService;
    
    @Autowired
    private ConversionService converter;

    @RequestMapping("/{id}")
    public Peal getPeal(@PathVariable final Long id) throws EntityNotFoundException {
        Peal peal = converter.convert(pealService.get(id), Peal.class);
        peal.add(ControllerLinkBuilder.linkTo(PealController.class).slash(peal.getID()).withSelfRel());
        peal.getTower().add(ControllerLinkBuilder.linkTo(TowerController.class).slash(peal.getTower().getID()).withSelfRel());
        return peal;
    }
    
}
