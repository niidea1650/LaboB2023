package u5;

import java.util.Date;

public class Personas {
    protected String nombre;
    protected String apellido;
    protected int telefono;
    protected Date fecha;
    public Personas(String nombre, String apellido, int telefono, Date fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fecha = fecha;
    }
}
