package Personal;

import Personal.util.Materia;
import Personal.util.Validation;
import Servicios.Database;

import java.util.ArrayList;
import java.util.Scanner;

public class Profesor extends Persona{

    protected static int id = 0;
    protected ArrayList<String> carreras  = new ArrayList<>();
    protected Materia materiasEnseña;

    public Profesor(
            String nombre,
            String apellido,
            String password,
            String fecha_nacimiento,
            String telefono,
            ArrayList<String> carreras,
            Materia materiasEnseña,
            Validation hasValidation
        ) {
        super(nombre, apellido, password,fecha_nacimiento, telefono, hasValidation);
        this.setCarreras(carreras);
        this.setMateriasEnseña(materiasEnseña);
        this.setHasValidation(hasValidation);
        this.setId();
    }

    @Override
    public String toString() {
        return "\nProfesor\n" +
                "  nombre = " + this.getNombre() + '\n' +
                "  apellido = " + this.getApellido() + '\n' +
                "  edad = " + this.getEdad() + '\n' +
                "  Carreras = " + this.getCarreras() + '\n' +
                "  Materias = " + this.getMateriasEnseña() + '\n' +
                "  fechaNacimiento = " + this.getFechaNacimiento() + '\n' +
                "  telefono = " + this.getTelefono() + '\n';
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id++;
    }

    public ArrayList<String> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<String> carreras) {
        this.carreras = carreras;
    }

    public Materia getMateriasEnseña() {
        return materiasEnseña;
    }

    public void setMateriasEnseña(Materia materiasEnseña) {
        this.materiasEnseña = materiasEnseña;
    }

    public void setNotes(int op, Materia mat, Scanner sc) {
        if (op >= 1 && op <= Database.getEstudiantes().size()) {
            System.out.println(mat);
            setCalificaciones(mat, sc);
        } else {
            System.out.println("Escoja una opcion correcta\n");
        }
    }

    private static void setCalificaciones (Materia mat, Scanner sc) {
        double cal;
        System.out.println("Ingrese calificacion 1 parcial");
        cal = sc.nextInt();
        mat.getCalificaciones().clear();
        mat.getCalificaciones().add(0, cal);
        System.out.println("Ingrese calificacion 2 parcial");
        cal = sc.nextInt();
        mat.getCalificaciones().add(1, cal);
        System.out.println("Ingrese calificacion recuperacion");
        cal = sc.nextInt();
        mat.getCalificaciones().add(2, cal);
        System.out.println("Ingrese calificacion nota final");
        cal = sc.nextInt();
        mat.getCalificaciones().add(3, cal);
    }

    public void consultNotes(int op, Estudiante est, Materia mat) {
        if (op >= 1 && op <= Database.getEstudiantes().size()) {
            if (mat.getCalificaciones().size() > 1) {
                System.out.println(
                        "\nEstudiante\n" +
                                "  nombre = " + est.getNombre() + '\n' +
                                "  apellido = " + est.getApellido() + '\n' +
                                "  fecha de nacimiento = " + est.getFechaNacimiento() + '\n' +
                                "  telefono = " + est.getTelefono() + '\n' +
                                "  carrera = " + est.getCarrera() + '\n' +
                                "  fecha de inicio = " + est.getFechaInicioSemestre() + '\n' +
                                "  Fecha de finalizacion = " + est.getFechaFinalizacionSemestre() + '\n' +
                                "  Semestre = " + est.getSemestre() + '\n' +
                                "Materia: " + mat.getNombreMateria() + "\n" +
                                "Primer parcial: " + mat.getCalificaciones().get(0) + "\n" +
                                "Segundo parcial: " + mat.getCalificaciones().get(1) + "\n" +
                                "Recuperacion: " + mat.getCalificaciones().get(2) + "\n" +
                                "Nota final: " + mat.getCalificaciones().get(3) + "\n"
                );
            } else {
                System.out.println("Este alumno aun no tiene calificaciones subidas\n");
            }
        } else {
            System.out.println("Escoja una opcion correcta\n");
        }
    }

    public void validNote(int op, Estudiante est) {
        if (op >= 1 && op <= Database.getEstudiantes().size()) {
            est.setHasNote(true);
            System.out.println("Las notas de " + est.getApellido() + " han sido guardadas.\n");
        } else {
            System.out.println("Escoja una opcion correcta\n");
        }
    }
}

