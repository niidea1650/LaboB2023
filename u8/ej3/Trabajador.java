package u8.ej3;

import java.time.LocalDate;

public class Trabajador extends Persona implements Menasje{
    private int cuil;
    private int sueldo;
    private int direccion;
    public Trabajador(String nombre, String apellido, int dni, LocalDate fechaNac, int cuil, int sueldo, int direccnion) {
        super(nombre, apellido, dni, fechaNac);
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.direccion = direccnion;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }


    @Override
    public void enviarMensaje() {

    }
}