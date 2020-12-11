package Personal.util;

public enum Carreras {
    CM("Ciencias medicas",0),
    CQ("Ciencias Qumicas",1),
    O("Odontología",2),
    EF("Educación Física, Deportes y Recreación",3),
    CEA("Ciencias Económicas y Administrativas",4),
    F("Filosofía, Letras y Ciencias de la Educación",5),
    A("Arquitectura, Diseño y Urbanismo",6),
    II("Ingeniería Industrial",7),
    CMF("Ciencias Matemáticas y Físicas",8),
    IQ("Ingeniería Química",9),
    CE("Ciencias Económicas",10),
    CP("Ciencias Psicológicas",11),
    J("Jurisprudencia, Ciencias Sociales y Políticas",12),
    CS("Comunicación Social",13),
    CN("Ciencias Naturales",14),
    CA("Ciencias Agrarias",15),
    V("Medicina Veterinaria y Zootecnia",16),
    CD("Ciencias para el Desarrollo",17);

    private String nombreCarrera;
    private int id;

    private Carreras (String nombreCarrera, int id) {
        this.setNombreCarrera(nombreCarrera);
        this.setId(id);
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
}
