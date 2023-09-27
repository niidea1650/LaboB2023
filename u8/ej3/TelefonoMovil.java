package u8.ej3;

public class TelefonoMovil implements Menasje{
    private int numeroSerie;
    private String fabricante;
    private String modelo;
    private Compania compania;
    private int numeroCelular;

    public TelefonoMovil(int numeroSerie, String fabricante, String modelo, Compania compania, int numeroCelular) {
        this.numeroSerie = numeroSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.compania = compania;
        this.numeroCelular = numeroCelular;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    @Override
    public void enviarMensaje() {

    }
}