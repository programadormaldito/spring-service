package cl.fernando.CapaServicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.fernando.CapaServicio.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, String> {
    
}
