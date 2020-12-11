package Servicios.DatabaseInjection;

import Personal.util.Turno;
import Personal.util.Validation;
import Servicios.Database;

public enum Secretarios {
    SECRETARIOS1("Paco",
            "Gomez",
            "1234",
            "05-12-1975",
            "0995733651",
            "04-01-2010",
            Turno.SECRETARIO.getMañana(),
            Validation.SEC
    ),
    SECRETARIOS2("Paco",
            "Fuentes",
            "1234",
            "24-06-1980",
            "0994857336",
            "01-11-2006",
            Turno.SECRETARIO.getTarde(),
            Validation.SEC
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

    Secretarios(String nombre,
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
