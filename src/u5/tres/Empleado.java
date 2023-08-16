package u5.tres;

import java.util.Date;

public class Empleado extends Personas {
    private int dni;
    private String pais;


    public Empleado(String nombre, String apellido, int telefono, Date fecha) {
        super(nombre, apellido, telefono, fecha);
    }


}