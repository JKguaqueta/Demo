package com.prueba.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.demo.models.ExamenModel;
import com.prueba.demo.repositories.ExamenRepository;

@Service
public class ExamenService {
    
    @Autowired
    private ExamenRepository examenRepository;

    public ArrayList<ExamenModel> obtenerExamenes(){
        return (ArrayList<ExamenModel>) examenRepository.findAll();
    }

    public ExamenModel guardarExamen(ExamenModel examen){
        return examenRepository.save(examen);
    }

}
