package com.tomlongridge.pealrecords.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomlongridge.pealrecords.service.TowerService;
import com.tomlongridge.pealrecords.service.exceptions.EntityNotFoundException;
import com.tomlongridge.pealrecords.web.api.Tower;

@RestController
@RequestMapping("/towers")
public class TowerController {
    
    @Autowired
    private TowerService towerService;
    
    @Autowired
    private ConversionService converter;

    @RequestMapping("/{id}")
    public Tower getTower(@PathVariable final Long id) throws EntityNotFoundException {
        Tower tower = converter.convert(towerService.get(id), Tower.class);
        tower.add(ControllerLinkBuilder.linkTo(TowerController.class).slash(tower.getID()).withSelfRel());
        return tower;
    }
    
}
