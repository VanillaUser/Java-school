package Personal.util;

public enum Materias {

    MATERIA1("Matematicas",1,"primero"),
    MATERIA2("Ingles",2,"primero"),
    MATERIA3("Computacion",3,"primero"),
    MATERIA4("Lenguaje",4,"primero"),
    MATERIA5("Metodologia de la investigacion",5,"primero"),
    MATERIA6("Contabilidad",6,"primero");


    private String nombreMateria;
    private int materiaId;
    private String Semestre;

    Materias(String nombreMateria, int materiaId, String semestre) {
        this.nombreMateria = nombreMateria;
        this.materiaId = materiaId;
        Semestre = semestre;
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
        return Semestre;
    }

    public void setSemestre(String semestre) {
        Semestre = semestre;
    }
}
