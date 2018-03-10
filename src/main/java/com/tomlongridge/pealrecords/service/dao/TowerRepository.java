package com.tomlongridge.pealrecords.service.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tomlongridge.pealrecords.service.domain.Tower;

@Repository
public interface TowerRepository extends CrudRepository<Tower, Long> {

    
    
}
