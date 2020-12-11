package Personal;

import Personal.util.Materia;
import Personal.util.Validation;
import Servicios.Database;

import java.util.ArrayList;

public class Estudiante extends Persona{

    protected static int idBase = 1;
    protected String carrera;
    protected String semestre;
    protected String fechaInicioSemestre;
    protected String fechaFinalizacionSemestre;
    protected ArrayList<Materia> materiasSemestre = new ArrayList<>();
    protected boolean hasNote = false;

    public Estudiante(String nombre,
               String apellido,
               String password,
               String fecha_nacimiento,
               String telefono,
               String carrera,
               String semestre,
               String fechaInicioSemestre,
               String fechaFinalizacionSemestre,
               ArrayList<Materia> materiasSemestre,
               Validation hasValidation
        ) {
        super(nombre, apellido, password, fecha_nacimiento, telefono, hasValidation);
        this.setCarrera(carrera);
        this.setSemestre(semestre);
        this.setFechaInicioSemestre(fechaInicioSemestre);
        this.setFechaFinalizacionSemestre(fechaFinalizacionSemestre);
        this.setMateriasSemestre(materiasSemestre);
        this.setHasValidation(hasValidation);
        this.setId();
    }

    @Override
    public String toString() {
        return "\nEstudiante\n" +
                "  nombre = " + this.getNombre() + '\n' +
                "  apellido = " + this.getApellido() + '\n' +
                "  fecha de nacimiento = " + this.getFechaNacimiento() + '\n' +
                "  telefono = " + this.getTelefono() + '\n' +
                "  carrera = " + this.getCarrera() + '\n' +
                "  fecha de inicio = " + this.getFechaInicioSemestre() + '\n' +
                "  Fecha de finalizacion = " + this.getFechaFinalizacionSemestre() + '\n' +
                "  Semestre = " + this.getSemestre() + '\n' +
                "  Materias = " + this.getMateriasSemestre() + '\n';
    }

    public void setId() {
        this.id = idBase++;
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
        this.setTime(fechaInicioSemestre);
        this.fechaInicioSemestre = setTime;
    }

    public String getFechaFinalizacionSemestre() {
        return fechaFinalizacionSemestre;
    }

    public void setFechaFinalizacionSemestre(String fechaFinalizacionSemestre) {
        this.setTime(fechaInicioSemestre);
        this.fechaFinalizacionSemestre = setTime;
    }

    public ArrayList<Materia> getMateriasSemestre() {
        return materiasSemestre;
    }

    public void setMateriasSemestre(ArrayList<Materia> materiasSemestre) {
        this.materiasSemestre = materiasSemestre;
    }

    public boolean isHasNote() {
        return hasNote;
    }

    public void setHasNote(boolean hasNote) {
        this.hasNote = hasNote;
    }

    public void printNotes(Estudiante est) {
        System.out.println(Database.getEstudiante(est.getId() - 1));
    }

}
