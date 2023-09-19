package repaso;

public class Partido {
    private Candidato candidato;
    private PASO nombre;

    public Partido(Candidato candidato, PASO nombre) {
        this.candidato = candidato;
        this.nombre = nombre;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public PASO getNombre() {
        return nombre;
    }

    public void setNombre(PASO nombre) {
        this.nombre = nombre;
    }
}
