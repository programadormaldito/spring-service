package cl.fernando.CapaServicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.fernando.CapaServicio.model.Curso;
import cl.fernando.CapaServicio.service.CursoService;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @PostMapping
    public String almacenar(@RequestBody Curso curso) {
        return cursoService.almacenar(curso);
    }

    @GetMapping
    public List<Curso> listar() {
        return cursoService.listar();
    }
}
