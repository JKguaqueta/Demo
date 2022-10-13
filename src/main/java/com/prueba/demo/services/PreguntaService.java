package com.prueba.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.demo.models.PreguntaModel;
import com.prueba.demo.repositories.PreguntaRepository;

@Service
public class PreguntaService {
    
    @Autowired
    private PreguntaRepository preguntaRepository;

    public ArrayList<PreguntaModel> obtenerPreguntas(){
        return (ArrayList<PreguntaModel>) preguntaRepository.findAll();
    }

    public PreguntaModel guardarPregunta(PreguntaModel pregunta){
        return preguntaRepository.save(pregunta);
    }

}
