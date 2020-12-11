package Personal;

import Personal.util.Validation;

public class Conserje extends Persona{

    protected static int id = 0;
    protected String carrera;
    protected String fechaIngreso;
    protected int añosServicio;
    protected String horario;

    public Conserje(String nombre,
                    String apellido,
                    String password,
                    String fecha_nacimiento,
                    String telefono,
                    String carrera,
                    String fechaIngreso,
                    String horario,
                    Validation hasValidation
    ) {
        super(nombre, apellido, password,fecha_nacimiento, telefono, hasValidation);
        this.setCarrera(carrera);
        this.setFechaIngreso(fechaIngreso);
        this.setAñosServicio();
        this.setHorario(horario);
        this.setHasValidation(hasValidation);
        this.setId();
    }

    @Override
    public String toString() {
        return "\nConserje\n" +
                "  nombre = " + this.getNombre() + '\n' +
                "  apellido = " + this.getApellido() + '\n' +
                "  edad = " + this.getEdad() + '\n' +
                "  fechaNacimiento = " + this.getFechaNacimiento() + '\n' +
                "  carrera = " + this.getCarrera() + '\n' +
                "  fechaIngreso = " + this.getFechaIngreso() + '\n' +
                "  añosServicio = " + this.getAñosServicio() + '\n' +
                "  horario = " + this.getHorario() + '\n' +
                "  telefono = " + this.getTelefono() + '\n';
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id + 1;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.setTime(fechaIngreso);
        this.fechaIngreso = setTime;
    }

    public int getAñosServicio() { return añosServicio; }

    public void setAñosServicio() {
        this.setDiffYear();
        this.añosServicio = setDiffYear;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
