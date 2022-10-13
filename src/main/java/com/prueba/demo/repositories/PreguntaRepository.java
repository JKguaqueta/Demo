package com.prueba.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.demo.models.PreguntaModel;

@Repository
public interface PreguntaRepository extends CrudRepository<PreguntaModel, Long> {
    
}