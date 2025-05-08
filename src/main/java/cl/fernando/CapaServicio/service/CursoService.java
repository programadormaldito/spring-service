package cl.fernando.CapaServicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.fernando.CapaServicio.model.Curso;
import cl.fernando.CapaServicio.repository.CursoRepository;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public String almacenar(Curso curso) {
        cursoRepository.save(curso);
        return "Curso almacenado correctamente";
    }

    public List<Curso> listar() {
        return cursoRepository.findAll();
    }
}
