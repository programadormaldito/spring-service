package cl.fernando.CapaServicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.fernando.CapaServicio.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, String> {
    
}
