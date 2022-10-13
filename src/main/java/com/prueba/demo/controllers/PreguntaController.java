package com.prueba.demo.controllers;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prueba.demo.models.PreguntaModel;
import com.prueba.demo.services.PreguntaService;

@RestController
@RequestMapping("/pregunta")
public class PreguntaController {
    
    @Autowired
    PreguntaService preguntaService;

    @GetMapping()
    public ArrayList<PreguntaModel> obtenerPreguntas(){
        return preguntaService.obtenerPreguntas();
    }

    @PostMapping()
    public PreguntaModel guardarPregunta(@RequestBody PreguntaModel pregunta){
        return this.preguntaService.guardarPregunta(pregunta);
    }

}