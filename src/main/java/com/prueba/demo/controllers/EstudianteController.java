package com.prueba.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.prueba.demo.models.EstudianteModel;
import com.prueba.demo.services.EstudianteService;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    
    @Autowired
    EstudianteService estudianteService;

    @GetMapping()
    public ArrayList<EstudianteModel> obtenerEstudiante(){
        return estudianteService.obtenerEstudiantes();
    }

    @PostMapping()
    public EstudianteModel guardarEstudiante(@RequestBody EstudianteModel estudiante){
        return this.estudianteService.guardarEstudiante(estudiante);
    }
}
