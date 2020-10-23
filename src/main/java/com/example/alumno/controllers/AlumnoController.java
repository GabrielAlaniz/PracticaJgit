package com.example.alumno.controllers;


import com.example.alumno.entities.Alumno;
import com.example.alumno.services.AlumnoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/alumnos")
public class AlumnoController extends BaseControllerImpl<Alumno, AlumnoServiceImpl> {
}
