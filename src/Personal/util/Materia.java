package Personal.util;

import java.util.ArrayList;

public class Materia {

    private String nombreMateria;
    private int materiaId;
    private String semestre;
    private int carreraId;
    private ArrayList<Double> calificaciones = new ArrayList<>();

    public Materia(
            String nombreMateria,
            int materiaId,
            String semestre,
            int carreraId
    ) {
        this.setNombreMateria(nombreMateria);
        this.setMateriaId(materiaId);
        this.setSemestre(semestre);
        this.setCarreraId(carreraId);
    }

    public Materia(
            String nombreMateria,
            int materiaId,
            String semestre,
            int carreraId,
            ArrayList<Double> calificaciones
    ) {
        this.setNombreMateria(nombreMateria);
        this.setMateriaId(materiaId);
        this.setSemestre(semestre);
        this.setCarreraId(carreraId);
        this.setCalificaciones(calificaciones);
    }

    @Override
    public String toString() {
        return "\nMateria\n" +
                "  nombreMateria = " + this.getNombreMateria() + '\n' +
                "  materiaId = " + this.getMateriaId() + '\n' +
                "  semestre = " + this.getSemestre() + '\n' +
                "  carreraId = " + this.getCarreraId() + '\n' +
                "  calificaciones = " + this.getCalificaciones() + '\n';
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(int materiaId) {
        this.materiaId = materiaId;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getCarreraId() {
        return carreraId;
    }

    public void setCarreraId(int carreraId) {
        this.carreraId = carreraId;
    }

    public ArrayList<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }
}
