package Personal.util;

import Personal.Conserje;

public enum Turno {
    SECRETARIO("mañana", "tarde"),
    CONSERJE("mañana", "tarde", "noche");

    private String mañana;
    private String tarde;
    private String noche;

    Turno (String mañana, String tarde) {
        this.setMañana(mañana);
        this.setTarde(tarde);
    }

    Turno (String mañana, String tarde, String noche) {
        this.setMañana(mañana);
        this.setTarde(tarde);
        this.setNoche(noche);
    }

    public String getMañana() {
        return mañana;
    }

    public void setMañana(String mañana) {
        this.mañana = mañana;
    }

    public String getTarde() {
        return tarde;
    }

    public void setTarde(String tarde) {
        this.tarde = tarde;
    }

    public String getNoche() {
        return noche;
    }

    public void setNoche(String noche) {
        this.noche = noche;
    }
}
