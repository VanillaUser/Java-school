package Servicios.DatabaseInjection;

import Personal.util.Materia;
import Personal.util.Validation;
import Servicios.Database;

import java.util.ArrayList;

public enum Profesores {
    PROFESOR1("Juan",
            "Vera",
            "1234",
            "15-03-1980",
            "0995635574",
            Database.getMateria(0),
            Validation.PRO
    ),
    PROFESOR2("Carlos",
            "Salcedo",
            "1234",
            "15-03-1969",
            "0986466437",
            Database.getMateria(1),
            Validation.PRO
    );

    protected String nombre;
    protected String apellido;
    protected String password;
    protected String fechaNacimiento;
    protected String telefono;
    protected ArrayList<String> carreras  = new ArrayList<String>();
    protected Materia materiasEnseña;
    protected Validation hasValidation;

    Profesores(String nombre,
                String apellido,
                String password,
                String fechaNacimiento,
                String telefono,
                Materia materiasEnseña,
                Validation hasValidation
    ) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setPassword(password);
        this.setFechaNacimiento(fechaNacimiento);
        this.setTelefono(telefono);
        this.setCarreras();
        this.setMateriasEnseña(materiasEnseña);
        this.setHasValidation(hasValidation);
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<String> getCarreras() {
        return carreras;
    }

    public void setCarreras() {
        this.carreras.add(Database.getCarreraNombre(8));
        this.carreras.add(Database.getCarreraNombre(6));
    }

    public Materia getMateriasEnseña() {
        return materiasEnseña;
    }

    public void setMateriasEnseña(Materia materiasEnseña) {
        this.materiasEnseña = materiasEnseña;
    }

    public Validation getHasValidation() {
        return hasValidation;
    }

    public void setHasValidation(Validation hasValidation) {
        this.hasValidation = hasValidation;
    }
}
