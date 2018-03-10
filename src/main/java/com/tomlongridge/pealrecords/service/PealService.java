package com.tomlongridge.pealrecords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomlongridge.pealrecords.service.dao.PealRepository;
import com.tomlongridge.pealrecords.service.domain.Peal;
import com.tomlongridge.pealrecords.service.exceptions.EntityNotFoundException;

@Service
public class PealService {
    
    @Autowired
    private PealRepository pealRepo;

    public Peal get(final Long id) throws EntityNotFoundException {
        return pealRepo.findById(id).orElseThrow(() -> new EntityNotFoundException(Peal.class));
    }
    
}
