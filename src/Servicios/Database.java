package Servicios;

import Personal.Conserje;
import Personal.Estudiante;
import Personal.Profesor;
import Personal.Secretario;
import Personal.util.Carrera;
import Personal.util.Carreras;
import Personal.util.Materia;
import Personal.util.Materias;
import Servicios.DatabaseInjection.Conserjes;
import Servicios.DatabaseInjection.Estudiantes;
import Servicios.DatabaseInjection.Profesores;
import Servicios.DatabaseInjection.Secretarios;

import java.util.ArrayList;
import java.util.Arrays;

public class Database {

    static ArrayList<Carrera> carreras = new ArrayList<>();
    static ArrayList<ArrayList<Materia>> materiasCollection = new ArrayList<>();
    static ArrayList<Profesor> profesores = new ArrayList<>();
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    static ArrayList<Secretario> secretarios = new ArrayList<>();
    static ArrayList<Conserje> conserjes = new ArrayList<>();

    //    Metodos de Materia

    public static ArrayList<ArrayList<Materia>> getMaterias() {
        return materiasCollection;
    }
    public static void setMaterias() {
        ArrayList<Materia> materias = new ArrayList<>();
        Arrays.asList(Materias.values())
                .forEach(mat -> {
                    Materia mt = new Materia(
                            mat.getNombreMateria(),
                            mat.getMateriaId(),
                            mat.getSemestre(),
                            Carreras.CM.getId()
                            );
                            materias.add(mt);
                });
        materiasCollection.add(materias);
    }
    public static Materia getMateria (int id) {
        return materiasCollection.get(id).get(id);
    }
    public static String getMateriaNombre (int id) {
        return materiasCollection.get(id).get(id).getNombreMateria();
    }

    //    Metodos de carrera

    public static ArrayList<Carrera> getCarreras() {
        return carreras;
    }
    private static void setCarrera() {
        Arrays.asList(Carreras.values())
                .forEach(carrera -> {
                            Carrera cr = new Carrera(
                                    carrera.getNombreCarrera(),
                                    carrera.getId(),
                                    Database.getMaterias().get(0)
                            );
                            carreras.add(cr);
                        }
                );
    }
    public static Carrera getCarrera (int id) {
        return carreras.get(id);
    }
    public static String getCarreraNombre (int id) {
        return carreras.get(id).getNombreCarrera();
    }

    //    Metodos de Profesor

    public static ArrayList<Profesor> getProfesores() {
        return profesores;
    }
    public static Profesor getProfesor(int id) {
        return profesores.get(id);
    }

    private static void setProfesores() {
        Arrays.asList(Profesores.values())
                .forEach(pro -> {
                            Profesor newPro = new Profesor(
                                    pro.getNombre(),
                                    pro.getApellido(),
                                    pro.getPassword(),
                                    pro.getFechaNacimiento(),
                                    pro.getTelefono(),
                                    pro.getCarreras(),
                                    pro.getMateriasEnseña(),
                                    pro.getHasValidation()
                            );
                            profesores.add(newPro);
                        }
                );
    }

    //    Metodos de Estudiante

    public static ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public static Estudiante getEstudiante(int id) {
        return estudiantes.get(id);
    }
    public static String getEstudianteNombre (int id) {
        return estudiantes.get(id).getNombre();
    }

    private static void setEstudiantes() {
        Arrays.asList(Estudiantes.values())
                .forEach(est -> {
                            Estudiante newEst = new Estudiante(
                                    est.getNombre(),
                                    est.getApellido(),
                                    est.getPassword(),
                                    est.getFechaNacimiento(),
                                    est.getTelefono(),
                                    est.getCarrera(),
                                    est.getSemestre(),
                                    est.getFechaInicioSemestre(),
                                    est.getFechaFinalizacionSemestre(),
                                    est.getMateriasSemestre(),
                                    est.getHasValidation()
                            );
                            estudiantes.add(newEst);
                        }
                );
    }

    //    Metodos de Secretario

    public static ArrayList<Secretario> getSecretarios() {
        return secretarios;
    }

    private static void setSecretarios() {
        Arrays.asList(Secretarios.values())
                .forEach(sec -> {
                            Secretario newSec = new Secretario(
                                    sec.getNombre(),
                                    sec.getApellido(),
                                    sec.getPassword(),
                                    sec.getFechaNacimiento(),
                                    sec.getTelefono(),
                                    sec.getCarrera(),
                                    sec.getFechaIngreso(),
                                    sec.getHorario(),
                                    sec.getHasValidation()
                            );
                            secretarios.add(newSec);
                        }
                );
    }

    //    Metodos de Conserje

    public static ArrayList<Conserje> getConserjes() {
        return conserjes;
    }

    private static void setConserjes() {

        Arrays.asList(Conserjes.values())
                .forEach(con -> {
                            Conserje newCon = new Conserje(
                                    con.getNombre(),
                                    con.getApellido(),
                                    con.getPassword(),
                                    con.getFechaNacimiento(),
                                    con.getTelefono(),
                                    con.getCarrera(),
                                    con.getFechaIngreso(),
                                    con.getHorario(),
                                    con.getHasValidation()
                            );
                            conserjes.add(newCon);
                        }
                );
    }
    public static void initDatabase( ) {
        Database.setMaterias();
        Database.setCarrera();
        Database.setEstudiantes();
        Database.setProfesores();
        Database.setSecretarios();
        Database.setConserjes();
    }
}
