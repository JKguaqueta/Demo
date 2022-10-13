package com.prueba.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.demo.models.ExamenModel;

@Repository
public interface ExamenRepository extends CrudRepository<ExamenModel, Long> {
    
}
