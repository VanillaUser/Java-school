package Servicios.DatabaseInjection;

import Personal.util.Materia;
import Personal.util.Validation;
import Servicios.Database;

import java.util.ArrayList;

public enum Estudiantes {

    ESTUDIANTE1("Manuel",
            "Lopez",
            "1234",
            "20-08-2000",
            "0994563278",
            Database.getCarreraNombre(8),
            "Primero",
            "01-07-2020",
            "20-11-2020",
            Validation.EST
            ),
    ESTUDIANTE2("Ana",
            "Campos",
            "1234",
            "20-08-2002",
            "0994446381",
            Database.getCarreraNombre(8),
            "Primero",
            "01-07-2020",
            "20-11-2020",
             Validation.EST
            );

    protected String nombre;
    protected String apellido;
    protected String password;
    protected String fechaNacimiento;
    protected String telefono;
    protected Validation hasValidation;
    protected String carrera;
    protected String semestre;
    protected String fechaInicioSemestre;
    protected String fechaFinalizacionSemestre;
    protected ArrayList<Materia> materiasSemestre = new ArrayList<Materia>();
    static int materiaId = 0;

    Estudiantes(String nombre,
                String apellido,
                String password,
                String fechaNacimiento,
                String telefono,
                String carrera,
                String semestre,
                String fechaInicioSemestre,
                String fechaFinalizacionSemestre,
                Validation hasValidation
    ) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setPassword(password);
        this.setFechaNacimiento(fechaNacimiento);
        this.setTelefono(telefono);
        this.setCarrera(carrera);
        this.setSemestre(semestre);
        this.setFechaInicioSemestre(fechaInicioSemestre);
        this.setFechaFinalizacionSemestre(fechaFinalizacionSemestre);
        this.setHasValidation(hasValidation);
        this.setMateriasSemestre();
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


    public Validation getHasValidation() {
        return hasValidation;
    }

    public void setHasValidation(Validation hasValidation) {
        this.hasValidation = hasValidation;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getFechaInicioSemestre() {
        return fechaInicioSemestre;
    }

    public void setFechaInicioSemestre(String fechaInicioSemestre) {
        this.fechaInicioSemestre = fechaInicioSemestre;
    }

    public String getFechaFinalizacionSemestre() {
        return fechaFinalizacionSemestre;
    }

    public void setFechaFinalizacionSemestre(String fechaFinalizacionSemestre) {
        this.fechaFinalizacionSemestre = fechaFinalizacionSemestre;
    }

    public ArrayList<Materia> getMateriasSemestre() {
        return materiasSemestre;
    }

    public void setMateriasSemestre() {
        Database.setMaterias();
        this.materiasSemestre = Database.getMaterias().get(materiaId++);
    }

}
