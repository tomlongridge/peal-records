package com.tomlongridge.pealrecords.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomlongridge.pealrecords.domain.Peal;

@Repository
public interface PealRepository extends CrudRepository<Peal, Long> {

    
    
}
