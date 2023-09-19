package u5.tres;

import java.util.Date;

public abstract class Personas {
    private String nombre;

    private String apellido;
    private int telefono;
    private Date fecha;
    private int DNI;

    public Personas(String nombre, String apellido, int telefono, Date fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fecha = fecha;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
