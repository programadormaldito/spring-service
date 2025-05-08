package cl.fernando.CapaServicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cl.fernando.CapaServicio.model.Alumno;
import cl.fernando.CapaServicio.repository.AlumnoRepository;

public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    public String almacenar(Alumno alumno) {
        alumnoRepository.save(alumno);
        return "Alumno almacenado correctamente";
    }

    public List<Alumno> listar() {
        return alumnoRepository.findAll();
    }
}
