package com.example.alumno.services;

import com.example.alumno.entities.Alumno;
import com.example.alumno.repositories.AlumnoRepository;
import com.example.alumno.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AlumnoServiceImpl extends BaseServiceImpl<Alumno, Long> implements AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    public AlumnoServiceImpl(BaseRepository<Alumno, Long> baseRepository){
        super(baseRepository);
    }
}
