package repaso;

import u5.tres.Personas;

import java.util.Date;

public class Candidato extends Personas {
    private String partido;
    private String lista;
    private int cantVotos;
    private PASO nombreP;

    public Candidato(String nombre, String apellido, int telefono, Date fecha) {
        super(nombre, apellido, telefono, fecha);
    }

    public Candidato(String nombre, String apellido, int telefono, Date fecha, String partido, String lista, int cantVotos, PASO nombreP) {
        super(nombre, apellido, telefono, fecha);
        this.partido = partido;
        this.lista = lista;
        this.cantVotos = cantVotos;
        this.nombreP = nombreP;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }

    public PASO getNombreP() {
        return nombreP;
    }

    public void setNombreP(PASO nombreP) {
        this.nombreP = nombreP;
    }
}