package Personal.util;

import java.util.ArrayList;

public class Carrera {

    protected String nombreCarrera;
    protected int id;
    protected ArrayList<Materia> materias= new ArrayList<>();


    public Carrera(String nombreCarrera,
                   int id,
                   ArrayList<Materia> materias
        ) {
        this.setNombreCarrera(nombreCarrera);
        this.setId(id);
        this.setMaterias(materias);
    }

    @Override
    public String toString() {
        return "\nCarrera\n" +
                "  nombreCarrera = " + this.getNombreCarrera() + '\n' +
                "  id = " + this.getId()+ '\n';
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
}
