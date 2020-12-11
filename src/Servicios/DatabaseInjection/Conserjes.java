package Servicios.DatabaseInjection;

import Personal.util.Turno;
import Personal.util.Validation;
import Servicios.Database;

public enum Conserjes {
    CONSERJE1("Eduardo",
            "Palacios",
            "1234",
            "15-11-1970",
            "0996538851",
            "11-01-2020",
            Turno.CONSERJE.getMañana(),
            Validation.CON
    );

    protected String nombre;
    protected String apellido;
    protected String password;
    protected String fechaNacimiento;
    protected String telefono;
    protected String carrera;
    protected String fechaIngreso;
    protected String horario;
    protected Validation hasValidation;

    Conserjes(String nombre,
                String apellido,
                String password,
                String fechaNacimiento,
                String telefono,
                String FechaIngreso,
                String horario,
                Validation hasValidation
    ) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setPassword(password);
        this.setFechaNacimiento(fechaNacimiento);
        this.setTelefono(telefono);
        this.setCarrera();
        this.setFechaIngreso(FechaIngreso);
        this.setHorario(horario);
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera() {
        this.carrera = Database.getCarreraNombre(8);
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Validation getHasValidation() {
        return hasValidation;
    }

    public void setHasValidation(Validation hasValidation) {
        this.hasValidation = hasValidation;
    }
}
