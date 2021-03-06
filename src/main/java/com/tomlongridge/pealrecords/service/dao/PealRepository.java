package com.tomlongridge.pealrecords.service.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomlongridge.pealrecords.service.domain.Peal;

@Repository
public interface PealRepository extends CrudRepository<Peal, Long> {

    
    
}
