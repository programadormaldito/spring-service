package cl.fernando.CapaServicio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.fernando.CapaServicio.model.Alumno;
import cl.fernando.CapaServicio.model.Curso;
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

    public String alumnoAsignarCurso(String rut, String sigla) {
        // OBTENEMOS ALUMNO Y CURSO
        if(!cursoRepository.existsById(sigla)) {
            return "El curso ingresado no fue encontrado";
        }

        if(!alumnoRepository.existsById(rut)) {
            return "El alumno ingresado no fue encontrado";
        }

        Curso curso = cursoRepository.findById(sigla).get();
        Alumno alumno = alumnoRepository.findById(rut).get();

        if(alumno.getCursos().contains(curso)) {
            return "El alumno ya se encuentra inscrito en el curso";
        } else {
            alumno.getCursos().add(curso);
            alumnoRepository.save(alumno);
            return "Alumno asignado al curso correctamente";
        }
    }
}
