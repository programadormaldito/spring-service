package cl.fernando.CapaServicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.fernando.CapaServicio.model.Alumno;
import cl.fernando.CapaServicio.repository.AlumnoRepository;
import cl.fernando.CapaServicio.repository.CursoRepository;

@Service
public class AlumnoService {
     @Autowired
    private AlumnoRepository alumnoRepository;
    @Autowired
    private CursoRepository cursoRepository;

    public String registrarAlumno(Alumno alumno) {
        if (alumnoRepository.findById(alumno.getRut()).isPresent()) {
            return "El alumno con RUT " + alumno.getRut() + " ya existe.";
        }

        alumnoRepository.save(alumno);
        return "Alumno registrado exitosamente.";
    }

    public List<Alumno> listar() {
        return alumnoRepository.findAll();
    }

    
}
