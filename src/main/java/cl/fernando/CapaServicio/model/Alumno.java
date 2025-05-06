package cl.fernando.CapaServicio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alumno {
    @Id
    private String rut;
    private String mail;
    private String nombre;
    private String apellido;
    private String contrasena;

    public Alumno() {
        this.rut = "";
        this.mail = "";
        this.nombre = "";
        this.apellido = "";
        this.contrasena = "";
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
