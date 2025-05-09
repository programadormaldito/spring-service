package cl.fernando.CapaServicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.fernando.CapaServicio.model.Alumno;
import cl.fernando.CapaServicio.service.AlumnoService;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
    @Autowired 
    private AlumnoService alumnoService;

    @PostMapping
    public String almacenar(@RequestBody Alumno alumno) {
        return alumnoService.registrarAlumno(alumno);
    }

    @GetMapping
    public List<Alumno> listar() {
        return alumnoService.listar();
    }

    @PostMapping("/{rut}/asignar/{sigla}")
    public String alumnoAsignarCurso(@PathVariable String rut, @PathVariable String sigla) {
        return alumnoService.alumnoAsignarCurso(rut, sigla);
    }
}
