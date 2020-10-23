package com.example.alumno.repositories;

import com.example.alumno.entities.Alumno;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends BaseRepository <Alumno, Long> {
}
