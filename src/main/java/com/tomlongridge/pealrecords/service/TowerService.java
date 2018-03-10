package com.tomlongridge.pealrecords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tomlongridge.pealrecords.service.dao.TowerRepository;
import com.tomlongridge.pealrecords.service.domain.Tower;
import com.tomlongridge.pealrecords.service.exceptions.EntityNotFoundException;

@Service
public class TowerService {
    
    @Autowired
    private TowerRepository towerRepo;

    public Tower get(final Long id) throws EntityNotFoundException {
        return towerRepo.findById(id).orElseThrow(() -> new EntityNotFoundException(Tower.class));
    }
    
}
