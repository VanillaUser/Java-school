package Personal;

import Personal.util.Validation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected int id;
    protected String password;
    protected int edad;
    protected String fechaNacimiento;
    protected String telefono;
    protected String setTime;
    protected int setDiffYear;
    protected Validation hasValidation;

    Persona (
            String nombre,
            String apellido,
            String password,
            String fecha_nacimiento,
            String telefono,
            Validation hasValidation
        ) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setPassword(password);
        this.setFechaNacimiento(fecha_nacimiento);
        this.setTelefono(telefono);
        this.setEdad();
        this.setHasValidation(hasValidation);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public abstract void setId();

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() { return edad; }

    public void setEdad() {
        this.setDiffYear();
        this.edad = setDiffYear;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.setTime(fechaNacimiento);
        this.fechaNacimiento = setTime;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Validation getHasValidation() {
        return hasValidation;
    }

    public void setHasValidation(Validation hasValidation) {
        this.hasValidation = hasValidation;
    }

    // Tiempo
    protected void setTime(String time){
        SimpleDateFormat objSDF = new SimpleDateFormat("MM-dd-yyyy");
        try {
            Date date = objSDF.parse(time);
            this.setTime = objSDF.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    protected void setDiffYear () {
        SimpleDateFormat objSDF = new SimpleDateFormat("MM-dd-yyyy");
        try {
            Date date = new Date();
            LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int actualYear  = localDate.getYear();
            Date fNacimiento = objSDF.parse(fechaNacimiento);
            localDate = fNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int ingressYear = localDate.getYear();
            this.setDiffYear = actualYear - ingressYear;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
