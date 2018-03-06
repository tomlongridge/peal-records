package com.tomlongridge.pealrecords.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomlongridge.pealrecords.dao.PealRepository;
import com.tomlongridge.pealrecords.domain.Peal;

@RestController
public class PealController {
    
    @Autowired
    private PealRepository pealRepo;

    @RequestMapping("/peals/{id}")
    @Transactional
    public Peal getPeal(@PathVariable final Long id) {        
        return pealRepo.findById(id).get();
    }
    
}
