package com.prueba.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.demo.models.EstudianteModel;
import com.prueba.demo.repositories.EstudianteRepository;

@Service
public class EstudianteService {
    
    @Autowired
    private EstudianteRepository estudianteRepository;

    public ArrayList<EstudianteModel> obtenerEstudiantes(){
        return (ArrayList<EstudianteModel>) estudianteRepository.findAll();
    }

    public EstudianteModel guardarEstudiante(EstudianteModel estudiante){
        return estudianteRepository.save(estudiante);
    }
}
