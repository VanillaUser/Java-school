package Interfaz;

import Personal.Estudiante;
import Personal.Profesor;
import Personal.Secretario;
import Personal.util.Materia;

import Servicios.Database;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static Scanner sc = new Scanner(System.in);
    private static int op;

    public static void mainMenu () {
        System.out.println(
                "Bienvenido al sistema de calificacion y consulta estudiantil\n" +

                "Por favor inicie sesion\n" +
                "Ingrese Apellido");
        String user = sc.next();
        System.out.println("Ingrese contraseña");
        String password = sc.next();
        validation(user, password);
    }

    private static void validation (String user, String password) {

            for (Profesor pro : Database.getProfesores()) {
                if (pro.getApellido().equals(user) && pro.getPassword().equals(password)) {
                    proMenu(pro);
                }
            }
            for (Estudiante est : Database.getEstudiantes()) {
                if (est.getApellido().equals(user) && est.getPassword().equals(password)) {
                    estMenu(est);
                }
            }
            for (Secretario sec : Database.getSecretarios()) {
                if (sec.getApellido().equals(user) && sec.getPassword().equals(password)) {
                    secMenu(sec);
                }
            }
            System.out.println("Usuario no encontrado\n");
            mainMenu();

    }
    private static void proMenu (Profesor pro) {
        System.out.println(
                "Escoja accion\n" +
                        "1. Ingresar\n" +
                        "2. Modificar\n" +
                        "3. Consultar\n" +
                        "4. Cierre de notas\n" +
                        "5. Cerrar sesion\n"
        );
        op = sc.nextInt();
            switch (op){
            case 1:
                System.out.println("Escoja un alumno para ingresar notas\n");
                for (Estudiante est : Database.getEstudiantes()) {
                    System.out.println(est.getId() + ". " + est.getNombre() + " " + est.getApellido());
                }
                op = sc.nextInt();
                Estudiante estudiante;
                Materia materia;
                estudiante = Database.getEstudiante(op - 1);
                materia = estudiante.getMateriasSemestre().get(pro.getMateriasEnseña().getMateriaId() - 1);
                pro.setNotes(op, materia, sc);
                proMenu(pro);
                break;
            case 2:
                System.out.println("Escoja un alumno para ingresar notas\n");
                for (Estudiante est : Database.getEstudiantes()) {
                    System.out.println(est.getId() + ". " + est.getNombre() + " " + est.getApellido());
                }
                op = sc.nextInt();
                estudiante = Database.getEstudiante(op - 1);
                materia = estudiante.getMateriasSemestre().get(pro.getMateriasEnseña().getMateriaId() - 1);
                pro.setNotes(op, materia, sc);
                proMenu(pro);
                break;
            case 3:
                System.out.println("Escoja un alumno para consultar notas\n");
                for (Estudiante est : Database.getEstudiantes()) {
                    System.out.println(est.getId() + ". " + est.getNombre() + " " + est.getApellido());
                }
                op = sc.nextInt();
                estudiante = Database.getEstudiante(op - 1);
                materia = estudiante.getMateriasSemestre().get(pro.getMateriasEnseña().getMateriaId() - 1);
                pro.consultNotes(op, estudiante, materia);
                proMenu(pro);
                break;
            case 4:
                System.out.println("Escoja un alunmo para para validar notas\n");
                for (Estudiante est : Database.getEstudiantes()) {
                    System.out.println(est.getId() + ". " + est.getNombre() + " " + est.getApellido());
                }
                op = sc.nextInt();
                estudiante = Database.getEstudiante(op - 1);
                pro.validNote(op, estudiante);
                proMenu(pro);
                break;
            case 5:
                System.out.println("Ud. ha cerrado sesion\n");
                mainMenu();
            default:
                System.out.println("Seleccione una opcion valida\n");
                proMenu(pro);
                break;
        }
    }
    private static void estMenu (Estudiante est) {
        System.out.println(
                "Escoja accion\n" +
                        "1. Consultar notas\n" +
                        "2. Cerrar sesion\n"
        );
        op = sc.nextInt();
        if (op == 1) {
            if (est.isHasNote()){
                    est.printNotes(est);
            } else {
                System.out.println("Aun no se han registrado sus notas en el sistema\n");
            }
            estMenu(est);
        } else if (op == 2) {
            System.out.println("Ud. ha cerrado sesion\n");
            mainMenu();
        }
        else {
            System.out.println("Escoja una opcion correcta\n");
        }
    }
    private static void secMenu (Secretario sec) {
        System.out.println(
                "Escoja accion\n" +
                        "1. Eliminar\n" +
                        "2. Consultar\n" +
                        "3. Registar cambios\n" +
                        "4. Cerrar sesion\n"
        );
        op = sc.nextInt();
        switch (op){
            case 1:
                System.out.println("Escoja un alumno para eliminar notas\n");
                for (Estudiante est : Database.getEstudiantes()) {
                    System.out.println(est.getId() + ". " + est.getNombre() + " " + est.getApellido());
                }
                op = sc.nextInt();
                Estudiante estudiante = Database.getEstudiante(op - 1);
                ArrayList<Materia> materias = estudiante.getMateriasSemestre();
                System.out.println("Escoja que id de materia a la cual se eliminaran todas sus notas\n");
                op = sc.nextInt();
                Materia materia = materias.get(op - 1);
                sec.deleteNotes(op, materia);
                secMenu(sec);
                break;
            case 2:
                System.out.println("Escoja un alumno para consultar notas\n");
                for (Estudiante est : Database.getEstudiantes()) {
                    System.out.println(est.getId() + ". " + est.getNombre() + " " + est.getApellido());
                }
                op = sc.nextInt();
                estudiante = Database.getEstudiante(op - 1);
                sec.consultNotes(op, estudiante);
                secMenu(sec);
                break;
            case 3:
                System.out.println("Escoja un alumno para registrar cambios\n");
                for (Estudiante est : Database.getEstudiantes()) {
                    System.out.println(est.getId() + ". " + est.getNombre() + " " + est.getApellido());
                }
                op = sc.nextInt();
                estudiante = Database.getEstudiante(op - 1);
                System.out.println(
                        "1. No hacer visibles las notas del estudiante\n" +
                                "2. Hacer visibles las notas del estudiante\n"
                );
                op = sc.nextInt();
                sec.changeStateStudent(op, estudiante);
                secMenu(sec);
                break;
            case 4:
                System.out.println("Ud. ha cerrado sesion\n");
                mainMenu();
            default:
                System.out.println("Seleccione una opcion valida\n");
                secMenu(sec);
                break;
        }
    }


}
