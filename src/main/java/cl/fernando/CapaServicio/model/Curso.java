package cl.fernando.CapaServicio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Curso {
    @Id
    private String sigla;
    private String nombre;

    public Curso() {
        this.sigla = "";
        this.nombre = "";
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
