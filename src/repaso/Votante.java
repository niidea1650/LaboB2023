package repaso;

import u5.tres.Personas;

import java.util.Date;

public class Votante extends Personas {
    private boolean voto;

    public Votante(String nombre, String apellido, int telefono, Date fecha) {
        super(nombre, apellido, telefono, fecha);
    }

    public Votante(String nombre, String apellido, int telefono, Date fecha, boolean voto) {
        super(nombre, apellido, telefono, fecha);
        this.voto = voto;
    }

    public boolean isVoto() {
        return voto;
    }

    public void setVoto(boolean voto) {
        this.voto = voto;
    }
}
